package com.ph.wk.hello;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * this class is to initialize Hello.html
 */
public class Hello extends WebPage {

	public Hello(final PageParameters parameters) {
		//initialize Label mg
		add(new Label("mg", "Hello Wicket!!"));
		
		//create a textfield
		final TextField<String> username = new TextField<String>("username",
				Model.of(""));
		//create a form
		Form<?> form = new Form<Void>("userForm") {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			
			//submit button
			@Override
			protected void onSubmit() {
				final String user = username.getModelObject();
				PageParameters pageParameters = new PageParameters();
				pageParameters.add("username", user);
				setResponsePage(ResultPage.class, pageParameters);
			}

		};
		//add form and add textfield to form
		add(form);
		form.add(username);
	}

}
