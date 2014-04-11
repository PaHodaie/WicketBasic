package com.ph.wk;

import com.ph.wk.hello.Hello;

/**
 * central class for wicket web
 * 
 * @author Parviz
 *
 */
public class WebApplication extends org.apache.wicket.protocol.http.WebApplication {

	@Override
	public Class<Hello> getHomePage() {

		return Hello.class; // return first page
	}

}
