/**
 * 
 */
package com.example.fandemo.junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.fandemo.services.CeilingFan;

/**Unit test case class to test all the conditions for the fan 
 * regarding the speed and the direction
 * @author User
 *
 */
class CeilingFanTest {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		
	}
	
	/**This test case checks for the current speed when changed from 0 to 1
	 * 
	 */
	@Test
	void increaseSpeedto1test() {
		CeilingFan cf = new CeilingFan();
		cf.increaseSpeed();
		assertEquals(1, cf.getCurrentSpeed());
	}

	
	/**This test case checks for the current speed changed to 2.
	 * The default speed of the fan is 0. Due to this the increaseSpeed 
	 * method need to be called twice since the method will increment 
	 * the speed by one.
	 * 
	 */
	@Test
	void increaseSpeedto2test() {
		CeilingFan cf = new CeilingFan();
		cf.increaseSpeed();
		cf.increaseSpeed();
		assertEquals(2, cf.getCurrentSpeed());
	}

	/**This method checks for the condition when the speed is changed to 3
	 * 
	 */
	@Test
	void increaseSpeedto3test() {
		CeilingFan cf = new CeilingFan();
		cf.increaseSpeed();
		cf.increaseSpeed();
		cf.increaseSpeed();
		assertEquals(3, cf.getCurrentSpeed());
	}
	
	/**This method checks for the condition when the fan speed is increased from 3.
	 * In this case, the speed of the fan should be set to 0 again
	 * 
	 */
	@Test
	void increaseSpeedto4test() {
		CeilingFan cf = new CeilingFan();
		cf.increaseSpeed();
		cf.increaseSpeed();
		cf.increaseSpeed();
		cf.increaseSpeed();
		assertEquals(0, cf.getCurrentSpeed());
	}
	
	/**This test method checks for the reverse direction condition 
	 * and verifies that the speed is retained in this case
	 * 
	 */
	@Test
	void reverseDirectionTest() {
		CeilingFan cf = new CeilingFan();
		cf.increaseSpeed();
		cf.increaseSpeed();
		cf.reverseDirection();
		assertEquals(2, cf.getCurrentSpeed());
		assertEquals(true, cf.isDirectionReverse());
	}
	
	/**This test method checks for the reverse condition twice and verifies that
	 * the speed is retained.
	 * 
	 */
	@Test
	void reverseDirection2Test() {
		CeilingFan cf = new CeilingFan();
		cf.increaseSpeed();
		cf.increaseSpeed();
		cf.reverseDirection();
		assertEquals(2, cf.getCurrentSpeed());
		assertEquals(true, cf.isDirectionReverse());
		cf.increaseSpeed();
		cf.reverseDirection();
		assertEquals(3, cf.getCurrentSpeed());
		assertEquals(false, cf.isDirectionReverse());
	}
}
