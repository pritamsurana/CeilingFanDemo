package com.example.fandemo.services;

import com.example.fandemo.interfaces.FanState;

/**
 * Implementation class for the speed of the fan.
 * 
 * @author User
 *
 */
public class SpeedState implements FanState {
	// integer variable declaring the highest speed of the fan
	private static int HIGH = 3;
	// integer variable declaring the lowest speed of the fan
	private static int OFF = 0;
	// integer variable declaring the current speed of the fan
	private int currentSpeed;

	/**
	 * Default constructor setting the current speed to 0
	 */
	public SpeedState() {
		setCurrentSpeed(OFF);
	}

	/**
	 * Getter method for the current speed of the fan
	 * 
	 * @return currentSpeed
	 */
	public int getCurrentSpeed() {
		System.out.println("The current speed value is " + currentSpeed);
		return currentSpeed;
	}

	/**
	 * Setter method for the current speed of the fan
	 * 
	 * @param currentSpeed
	 */
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	/**
	 * This method checks for the current speed of the fan. If it is less than max
	 * speed 3, it will increment it. If it is the highest speed 3, it will reset it
	 * to 0
	 */
	@Override
	public void nextState() {
			System.out.println("The current speed of the fan before increment is " + currentSpeed);
			if (currentSpeed < HIGH) {
				currentSpeed++;
				System.out.println("The current speed of the fan after increment is " + currentSpeed);
			} else if (currentSpeed == HIGH) {
				System.out.println("The current speed of the fan when reached high is " + currentSpeed);
				currentSpeed = OFF;
				System.out.println("The current speed of the fan when reached high and set to 0 ");
			}
	}
}
