package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import model.AppModel;

public class AppModelTest {

	static AppModel mapModel1;

	@BeforeClass
	public static void setup() {
		mapModel1 = new AppModel();
		mapModel1.addItemToMap(1, "Thi");
		mapModel1.addItemToMap(2, "Aysha");
		mapModel1.addItemToMap(3, "Karishma");
		mapModel1.addItemToMap(4, "Harry");
	}

	@Test

	public void testContainsValue() {
		assertTrue(mapModel1.getHaktTeam().containsValue("Thi"));
	}

	@Test
	public void testMapExists() {
		assertEquals(mapModel1.getHaktTeam(), mapModel1.getHaktTeam());
	}

	@Test
	public void testAddMethodWorksPart1() {
		assertFalse(mapModel1.getHaktTeam().containsValue("Hello"));
	}

	@Test
	public void testAddMethodWorksPart2() {
		mapModel1.addItemToMap(5, "Hello");
		assertTrue(mapModel1.getHaktTeam().containsValue("Hello"));
	}

	@Test

	public void checkRetrives() {
		assertEquals("Aysha", mapModel1.getString(2));
	}

}
