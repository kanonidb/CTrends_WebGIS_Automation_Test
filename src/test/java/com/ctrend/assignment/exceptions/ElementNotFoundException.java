package com.ctrend.assignment.exceptions;

public class ElementNotFoundException extends Exception {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ElementNotFoundException(){
    }

    public ElementNotFoundException (String message){
        super(message);
    }
}
