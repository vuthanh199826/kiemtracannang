package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao");
        double height = sc.nextDouble();
        System.out.println("nhap can nang");
        double weight = sc.nextDouble();
        double bmi = weight/Math.pow(height,2);
        String interpretation;
        if(bmi<18.5){
            interpretation = "underweight";
        }else if(bmi<25.0){
            interpretation = "normal";
        }else if(bmi<30.0){
            interpretation ="overweight";
        }else {
            interpretation = "obese";
        }
        System.out.println(interpretation);



    }
}
