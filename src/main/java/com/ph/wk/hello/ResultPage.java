package com.ph.wk.hello;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * this class initializes RusultPage(html page) 
 * 
 * @author Parviz
 *
 */
public class ResultPage extends WebPage {
	
	public ResultPage(final PageParameters parameters) {
		//initialize Label mg_result
		add(new Label("mg_result", "Hello again!!"));

		String username = "";
		
		if(parameters.containsKey("username")){
			username = parameters.getString("username");
		}
		//initialize Label result
		add(new Label("result", "user: "+username));
		
		
	}

}
