package com.codingstandard.examples.example_project;

import java.security.InvalidParameterException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	App m_app;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String area )
    {
        super( area );
        m_app = new App (20, 55);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int area = m_app.getArea();
    	assertEquals(1100, area);
    	
    }

    
    public void testSize() {
   	 m_app.setSize(3, 5);
   	int area = m_app.getArea();
   	assertEquals(10, area);
    }
    			
    public void testSizefails() {
    	try {
    	m_app.setSize(-1, 5);
    	fail();
    }catch (InvalidParameterException e) {
    }
}
}
