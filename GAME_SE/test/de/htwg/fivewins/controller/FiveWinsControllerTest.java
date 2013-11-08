package de.htwg.fivewins.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.fivewins.field.Field;

public class FiveWinsControllerTest {

	FiveWinsController controller;
	Field field1;
	String newLine = System.getProperty("line.separator");
	
	@Before
	public void setUp() throws Exception {
		field1  = new Field(1);
		controller = new FiveWinsController(field1);
	}

	@Test
	public void testGetStatus() {
		assertEquals("Welcome to HTWG Five Wins!", controller.getStatus());
	}
	
	@Test
	public void testSetValue() {
		controller.setValue(0, 0, "x");
		assertEquals("The cell 0 0 was successfully set", controller.getStatus());
		controller.setValue(0, 0, "x");
		assertEquals("The cell 0 0 is already set", controller.getStatus());
	}
	
	@Test
	public void testGetPlayerSign() {
		assertEquals("X",
				controller.getPlayerSign());
	}
	
	public void testGetFieldString() {
		assertEquals(" -"+newLine, controller.getFieldString());
	}
	
	public void testCountTurn() {
		assertEquals(1, controller.countTurn());
	}

}