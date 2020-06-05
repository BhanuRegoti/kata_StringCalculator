/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatorv1;

import java.util.Scanner;

/**
 *
 * @author bpreg
 */
public class StringCalculatorV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringCalculatorV1 s=new StringCalculatorV1();
        System.out.println(s.Add(input));   
    }
    public int Add(String string) {
        String[] numbers=string.split(",");
        if(isEmpty(string)){
            return 0;
        }else if(string.length()==1){
            return StringToInt(string);
        }else {
            return StringToInt(numbers[0])+StringToInt(numbers[1]);
        }    
    }
    private int StringToInt(String input){
        return Integer.parseInt(input);
    }
    private boolean isEmpty(String input){
    	return input.isEmpty();
    }
}