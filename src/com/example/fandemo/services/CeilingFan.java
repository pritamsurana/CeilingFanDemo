package com.example.fandemo.services;

/**
 * Class representing Ceiling Fan Class maintains speed and direction state.
 * 
 * @author Pritam
 *
 */
public class CeilingFan {
	// object for SpeedState indicating speed of the fan
	private SpeedState speedState;
	// object for DirectionState indicating direction of the fan
	private DirectionState directionState;

	/**
	 * Constructor of the class instantiating speed and direction state objects
	 * 
	 */
	public CeilingFan() {
		speedState = new SpeedState();
		directionState = new DirectionState();
	}

	/**
	 * This method calls the next state method on the interface which will check for
	 * the max speed. If max speed is reached, the speed is set to 0
	 * 
	 */
	public void increaseSpeed() {
		speedState.nextState();
	}

	/**
	 * This method checks for the direction of the fan and reverses it
	 * 
	 */
	public void reverseDirection() {
		directionState.nextState();
	}

	/**
	 * This method returns the current speed of the fan.
	 * 
	 * @return current speed
	 */
	public int getCurrentSpeed() {
		return speedState.getCurrentSpeed();
	}

	public boolean isDirectionReverse() {
		return directionState.isReverse();
	}

}
