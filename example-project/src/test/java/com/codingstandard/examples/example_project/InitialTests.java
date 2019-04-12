package com.codingstandard.examples.example_project;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.*;

public class InitialTests extends TestCase {
App m_app;

protected void setup() throws Exception {
	super.setUp();
	m_app = new App(20, 55);
}
	@Test
	public void testArea() {
		int area = m_app.getArea();
		assertEquals(1100,area);
		//fail("Not yet implemented");
	}

}