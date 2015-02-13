package za.ac.cput.ngosa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
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
        assertTrue( true );
    }

    Menu myMenu= new Menu();
    UserInput myInput= new UserInput();

    public void testChoice() {
        assertEquals(5, myMenu.choose());
    }

    public void testInput()
    {
        assertEquals(5,myInput.getCubic());
    }





}
