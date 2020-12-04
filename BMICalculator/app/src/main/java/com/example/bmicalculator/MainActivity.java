package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calculateButton;
    RadioButton radioButtonMale;
    EditText ageTextInput;
    EditText heightTextInput;
    EditText weightTextInput;
    TextView resultTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        // selecting the default radio button
        radioButtonMale.performClick();
        setUpListeners();
    }

    private void setUpListeners() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void findViews() {
        calculateButton = findViewById(R.id.button_calculate);
        radioButtonMale = findViewById(R.id.radio_button_male);
        ageTextInput = findViewById(R.id.text_input_age);
        heightTextInput = findViewById(R.id.text_input_height);
        weightTextInput = findViewById(R.id.text_input_weight);
        resultTextInput = findViewById(R.id.text_input_result);
    }

    private void showToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }

    private boolean canCalculate() {
        return (ageTextInput.getText().toString().length() > 0 &&
                heightTextInput.getText().toString().length() > 0 &&
                weightTextInput.getText().toString().length() > 0);
    }

    private void setResult(String resultText) {
        resultTextInput.setText(resultText);
    }

    private void calculateBMI() {
        if (canCalculate()) {
            Float weight = Float.parseFloat(weightTextInput.getText().toString());
            Float height = Float.parseFloat(heightTextInput.getText().toString());

            Float result = weight / (height * height);
            setResult("Your BMI is " + result);
        } else {
            showToast("Please fill all the fields");
        }
    }
}