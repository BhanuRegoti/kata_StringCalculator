/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatorv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bpreg
 */
public class StringCalculatorV1 {
    private int addCount=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringCalculatorV1 s=new StringCalculatorV1();
        System.out.println(s.Add(input));   
    }
    private String delimiter =",|\n";
    private void callCount(){
        addCount++;
    }
    public int Add(String string) throws Exception {
        callCount();
         String secondString;
        if(isEmpty(string)){
            return 0;
        }else if(string.length()==1){
            return StringToInt(string);
        }else if(string.startsWith("//")){
            String[] number=startsWithSlashesReturns(string);
            return getSum(number);
        } else{
            String[] numbers=string.split(delimiter);
            return getSum(numbers);
        }  
       
    }

    private String[] startsWithSlashesReturns(String string) {
        String secondString;
        int a=string.indexOf('/');
        System.out.println(a);
        String delimiter1= string.substring(a+2,a+3);
        secondString=string.substring(string.indexOf('\n')+1);
        secondString =secondString.replace(delimiter1, ",");
        String[] number=secondString.split(delimiter);
        return number;
    }
    private int StringToInt(String input){
        return Integer.parseInt(input);
    }
    private boolean isEmpty(String input){
    return input.isEmpty();
    }
    private int getSum(String[] input) throws Exception{
        int sum=0;
        negativeException(input);
        for(String i: input){
            if(Integer.parseInt(i)<0){
                throw new Exception("Negatives not allowed");
            }
        sum+=Integer.parseInt(i);
        }
        return sum;
    }
    
    private void negativeException(String[] numbers) throws RuntimeException {
        List negativeNumbers=new ArrayList();
        boolean exceptionFlag = false;
        for(String i:numbers){
            if(StringToInt(i)<0){
            negativeNumbers.add(StringToInt(i));
                exceptionFlag = true;
            }
        }
        if(exceptionFlag){
            throw new RuntimeException("Negatives not allowed "+negativeNumbers.toString());
        }
    }
    public int getCalledCount(){
        return addCount;
    }
}