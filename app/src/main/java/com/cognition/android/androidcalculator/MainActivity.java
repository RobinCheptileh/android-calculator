package com.cognition.android.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText txtFirstNumber, txtSecondNumber;
    AppCompatButton btnAdd, btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        txtFirstNumber = findViewById(R.id.txtFirstNumber);
        txtSecondNumber = findViewById(R.id.txtSecondNumber);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumber = txtFirstNumber.getText().toString();
                String secondNumber = txtSecondNumber.getText().toString();

                if (!firstNumber.isEmpty()) {
                    if (!secondNumber.isEmpty()) {
                        int result = add(
                                Integer.parseInt(firstNumber),
                                Integer.parseInt(secondNumber)
                        );

                        Toast.makeText(
                                MainActivity.this,
                                String.format(Locale.ENGLISH, "The result is %d", result),
                                Toast.LENGTH_LONG
                        ).show();
                    } else {
                        Toast.makeText(
                                MainActivity.this,
                                "Enter second number",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            "Enter first number",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumber = txtFirstNumber.getText().toString();
                String secondNumber = txtSecondNumber.getText().toString();

                if (!firstNumber.isEmpty()) {
                    if (!secondNumber.isEmpty()) {
                        int result = subtract(
                                Integer.parseInt(firstNumber),
                                Integer.parseInt(secondNumber)
                        );

                        Toast.makeText(
                                MainActivity.this,
                                String.format(Locale.ENGLISH, "The result is %d", result),
                                Toast.LENGTH_LONG
                        ).show();
                    } else {
                        Toast.makeText(
                                MainActivity.this,
                                "Enter second number",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            "Enter first number",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });
    }

    private int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
