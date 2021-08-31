package com.example.fandemo.main;

import com.example.fandemo.services.CeilingFan;

public class CeilingFanProjectMain {

	public static void main(String[] args) {
		CeilingFan cf = new CeilingFan();
		// Speed 0=>1
		cf.increaseSpeed();
		// Speed 1=>2
		cf.increaseSpeed();
		// reverse = true
		cf.reverseDirection();

		// Current speed to be 2
		cf.getCurrentSpeed();

		// Direction should be reversed
		cf.isDirectionReverse();

		// Speed 2=>3
		cf.increaseSpeed();
		// SPeed 3 => 0
		cf.increaseSpeed();

		// Current spped 0 - Fan OFF
		cf.getCurrentSpeed();

	}
}
