package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void BMICalculateButton(View v) {
        EditText NameEditText = (EditText) findViewById(R.id.editTextPersonName);
        String Name = NameEditText.getText().toString();

        EditText HeightEditText = (EditText) findViewById(R.id.HeightEditTextNumberDecimal);
        String Height = HeightEditText.getText().toString();

        EditText WeightEditText = (EditText) findViewById(R.id.WeightEditTextNumberDecimal);
        String Weight = WeightEditText.getText().toString();

        Intent BMICalculatorIntent = new Intent(this, BMIResults.class);
        BMICalculatorIntent.putExtra("Name", Name);
        BMICalculatorIntent.putExtra("Height", Height);
        BMICalculatorIntent.putExtra("Weight", Weight);
        startActivity(BMICalculatorIntent);
    }

    protected void OnResume(){
        super.onResume();
        EditText ResumeNameText = (EditText) findViewById(R.id.editTextPersonName);
        ResumeNameText.setText("");

        EditText ResumeHeightText = (EditText) findViewById(R.id.HeightEditTextNumberDecimal);
        ResumeHeightText.setText("");

        EditText ResumeWeightText = (EditText) findViewById(R.id.WeightEditTextNumberDecimal);
        ResumeWeightText.setText("");

    }
}