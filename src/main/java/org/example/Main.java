package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Units:");
        int units=s.nextInt();
        double amt;
        if(units<=100){
            amt=units*1.50;
        }else if(units<=200){
            amt=(100*1.50)+(units-100)*2.50;
        }else{
            amt=(100*1.50)+(100*2.50)+(units-200)*4.00;
        }
        System.out.println("Electricity Bill Amount: "+amt);
        s.close();
    }
}