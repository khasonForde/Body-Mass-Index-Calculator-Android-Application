package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BMIResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i_results);
        Intent BMICalculatorIntent = getIntent();
        String Name = BMICalculatorIntent.getStringExtra("Name");
        String Height = BMICalculatorIntent.getStringExtra("Height");
        String Weight = BMICalculatorIntent.getStringExtra("Weight");

        float h = Float.parseFloat(Height);
        float w = Float.parseFloat(Weight);

        TextView Screen = (TextView) findViewById(R.id.textView);
        Screen.setText(Name + " " + Height + " " + Weight + "\n" + "BMI: " + BMI.CalculateBMI(h, w) + "\n" + "BMI Category: " + BMI.getBMICategory(BMI.CalculateBMI(h,w)));
    }
}