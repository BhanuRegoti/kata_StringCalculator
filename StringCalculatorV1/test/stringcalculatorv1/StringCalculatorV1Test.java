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
    
    public StringCalculatorV1Test() {
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
        StringCalculatorV1 instance =new StringCalculatorV1();
        assertEquals(0,instance.Add(""));
    }
    @Test
    public void singleValueReturn(){
        StringCalculatorV1 instance =new StringCalculatorV1();
        assertEquals(1,instance.Add("1"));
    }
    @Test
    public void commaDelimiterAddition(){
        StringCalculatorV1 instance= new StringCalculatorV1();
        assertEquals(3,instance.Add("1,2"));
    }
   }
