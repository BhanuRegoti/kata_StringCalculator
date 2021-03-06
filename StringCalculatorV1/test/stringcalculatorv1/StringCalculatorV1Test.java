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
    public void emptyStringReturnsZero() throws Exception {
        assertEquals(0,instance.Add(""));
    }
    @Test
    public void singleValueReturn() throws Exception{
        assertEquals(1,instance.Add("1"));
    }
    @Test
    public void commaDelimiterAddition() throws Exception{
        assertEquals(3,instance.Add("1,2"));
    }
    @Test
    public void multipleNumberAddition() throws Exception{
        assertEquals(8,instance.Add("1,2,5"));
    }
    @Test
    public void multipleDelimiters() throws Exception{
        assertEquals(6,instance.Add("1,2\n3"));
    }
    @Test
    public void delimiterSpecified() throws Exception{
        assertEquals(3,instance.Add("//;\n1;2"));
    }
    @Test(expected=Exception.class)
    public void negativeInputReturns() throws Exception{
    instance.Add("-1");
    }
    @Test
    public final void multipleNegativeNumbersExceptionMessage() throws Exception {
        try {
            instance.Add("1,-2,3,-4,5,6");
        } catch (Exception e) {
            assertEquals("Negatives not allowed [-2, -4]", e.getMessage());
        }    
    }
        @Test
    public final void callCountValue() throws Exception{
        instance.Add("1,2");
        instance.Add("");
        assertEquals(instance.getCalledCount(),2);
    }
    @Test
    public final void numberGreater1000() throws Exception{
        assertEquals(instance.Add("1001,20,10"),30);
    }
    @Test
    public final void delimiterLength() throws Exception{
        //System.out.println(instance.Add("//[**]\n1**2**3"));
        assertEquals(instance.Add("//[**]\n1**2**3"),6);
    }
        @Test
    public final void multipleDelimiterWithSingleCount() throws Exception{
        //System.out.println(instance.Add("//[**]\n1**2**3"));
        assertEquals(instance.Add("//[*][/]\n1*2/3"),6);
    }
        @Test
    public final void multipleDelimiterWithMultiCount() throws Exception{
        //System.out.println(instance.Add("//[**]\n1**2**3"));
        assertEquals(instance.Add("//[**][//]\n1**2//3"),6);
    }
   }
