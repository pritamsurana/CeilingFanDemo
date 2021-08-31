package com.example.fandemo.services;

import com.example.fandemo.interfaces.FanState;

/**
 * Implementation class for Fan state implementing the direction of the fan.
 * 
 * @author Pritam
 *
 */
public class DirectionState implements FanState {
	// boolean variable to hold if the reverse direction chain is pulled.
	private boolean isReverse = false;

	/**
	 * Method implementation for reversing the direction of the fan when the chain
	 * is pulled.
	 */
	@Override
	public void nextState() {
		//To do - To output statements to be replaced with logging debug statements.
		System.out.println("The direction of the fan is " + isReverse);
		isReverse = !isReverse;
		System.out.println("The direction of the fan after reversing is " + isReverse);
	}

	public boolean isReverse() {
		return isReverse;
	}

	public void setReverse(boolean isReverse) {
		this.isReverse = isReverse;
	}

}
