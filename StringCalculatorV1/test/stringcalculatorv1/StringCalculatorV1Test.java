/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatorv1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bpreg
 */
public class StringCalculatorV1Test {
    private StringCalculatorV1 instance;
    public StringCalculatorV1Test() {
        instance = new StringCalculatorV1();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StringCalculatorV1.main(args);
        fail("The test case is a prototype.");
    }*/
@Test
    public void emptyStringReturnsZero() {
        assertEquals(0,instance.Add(""));
    }
    @Test
    public void singleValueReturn(){
        assertEquals(1,instance.Add("1"));
    }
    @Test
    public void commaDelimiterAddition(){
        assertEquals(3,instance.Add("1,2"));
    }
    @Test
    public void multipleNumberAddition(){
        assertEquals(8,instance.Add("1,2,5"));
    }
    @Test
    public void multipleDelimiters(){
        assertEquals(6,instance.Add("1,2\n3"));
    }
    @Test
    public void delimiterSpecified(){
        assertEquals(3,instance.Add("//;\n1;2"));
    }
   }
