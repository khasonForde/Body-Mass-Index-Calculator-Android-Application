package com.example.bmicalculator;

public class BMI {
    public static float CalculateBMI(float Height, float Weight) {
        float BMI = (Weight / (Height*Height) ) * 703;
        return BMI;
    }

    public static String getBMICategory(float BMI) {
        if (BMI <= 18.5) {
            return "Underweight";
        } else if (BMI > 18.5 && BMI <= 24.9) {
            return "Healthy";
        } else if (BMI >= 25 && BMI <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

}
