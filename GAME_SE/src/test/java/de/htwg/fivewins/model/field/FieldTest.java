package de.htwg.fivewins.model.field;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.fivewins.model.field.Field;

/*
 * @author max,manuel
 */
public class FieldTest {
	
	Field field1, field2, field3, field4;
	String newLine = System.getProperty("line.separator");
	
	@Before
	public void setUp()  {
		field1 = new Field(1);
		field2 = new Field(2);
		field3 = new Field(3);
	}

	@Test(expected=IllegalArgumentException.class)  
	public void testToBigNumberForFieldConstructor() {  
	   field4 = new Field(21);  
	}
	
	@Test
	public void testToString() {
		assertEquals(" -"+newLine, field1.toString());
		assertEquals(" - -"+newLine+" - -"+newLine, field2.toString());
	}
	
	@Test
	public void testGetCellValue() {
		assertEquals("-", field1.getCellValue(0, 0));
	}

	@Test
	public void testSetValue() {
		field1.setValue(0, 0, "x");
		assertEquals("x", field1.getCellValue(0, 0));
	}
	
	@Test
	public void testGetSize() {
		assertEquals(1, field1.getSize());
	}
	
	@Test
	public void testReset() {
		field1.setValue(0, 0, "X");
		field1.reset();
		assertEquals("-", field1.getCellValue(0, 0));
	}
	
	@Test
	public void testGetGameField() {
		field1.setValue(0, 0, "X");
		String[][] testGameField = field1.getGameField();
		assertEquals(field1.getCellValue(0, 0), testGameField[0][0]);
	}
}
