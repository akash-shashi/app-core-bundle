/**
 * 
 */
package com.acc.test.cq;

import com.day.cq.wcm.api.Page;

/**
 * @author A.Shashi.Chaurasia
 * 
 */
public class HelloPerson {
	/**
	 * test-comment ******
	 */
	private Page personPage;
	public static final String PN_PERSON_NAME = "personName";

	public HelloPerson(Page personPage) {
		this.personPage = personPage;
	}
	/**
	 * This is method which is supposed to give 
	 * Hello message.
	 */
	public String getHelloMessage() {
		String personName = "";
		if(personPage.getProperties().get(PN_PERSON_NAME) != null){
			personName = personPage.getProperties().get(PN_PERSON_NAME)
			.toString();	
		}else{
			personName ="--empty--";
		}
		return personName;
	}

}
