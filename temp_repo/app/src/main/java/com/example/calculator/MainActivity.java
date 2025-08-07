package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String currentInput = "";
    private String operator = "";
    private double firstOperand = 0;
    private boolean isOperatorPressed = false;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        calculator = new Calculator();
        setupButtons();
    }

    private void setupButtons() {
        // 数字按钮
        int[] numberIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                          R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
        
        for (int i = 0; i < numberIds.length; i++) {
            final int number = i;
            findViewById(numberIds[i]).setOnClickListener(v -> onNumberClick(String.valueOf(number)));
        }

        // 运算符按钮
        findViewById(R.id.btnAdd).setOnClickListener(v -> onOperatorClick("+"));
        findViewById(R.id.btnSubtract).setOnClickListener(v -> onOperatorClick("-"));
        findViewById(R.id.btnMultiply).setOnClickListener(v -> onOperatorClick("×"));
        findViewById(R.id.btnDivide).setOnClickListener(v -> onOperatorClick("÷"));
        
        // 其他按钮
        findViewById(R.id.btnEquals).setOnClickListener(v -> onEqualsClick());
        findViewById(R.id.btnClear).setOnClickListener(v -> onClearClick());
        findViewById(R.id.btnDot).setOnClickListener(v -> onDotClick());
    }

    private void onNumberClick(String number) {
        if (isOperatorPressed) {
            currentInput = "";
            isOperatorPressed = false;
        }
        currentInput += number;
        display.setText(currentInput);
    }

    private void onOperatorClick(String op) {
        if (!currentInput.isEmpty()) {
            if (!operator.isEmpty() && !isOperatorPressed) {
                onEqualsClick();
            }
            firstOperand = Double.parseDouble(currentInput);
            operator = op;
            isOperatorPressed = true;
        }
    }

    private void onEqualsClick() {
        if (!operator.isEmpty() && !currentInput.isEmpty() && !isOperatorPressed) {
            double secondOperand = Double.parseDouble(currentInput);
            double result = 0;

            try {
                switch (operator) {
                    case "+":
                        result = calculator.add(firstOperand, secondOperand);
                        break;
                    case "-":
                        result = calculator.subtract(firstOperand, secondOperand);
                        break;
                    case "×":
                        result = calculator.multiply(firstOperand, secondOperand);
                        break;
                    case "÷":
                        result = calculator.divide(firstOperand, secondOperand);
                        break;
                }
            } catch (ArithmeticException e) {
                display.setText("错误");
                return;
            }

            currentInput = String.valueOf(result);
            if (result == (long) result) {
                currentInput = String.valueOf((long) result);
            }
            display.setText(currentInput);
            operator = "";
        }
    }

    private void onClearClick() {
        currentInput = "";
        operator = "";
        firstOperand = 0;
        isOperatorPressed = false;
        display.setText("0");
    }

    private void onDotClick() {
        if (isOperatorPressed) {
            currentInput = "";
            isOperatorPressed = false;
        }
        if (!currentInput.contains(".")) {
            if (currentInput.isEmpty()) {
                currentInput = "0";
            }
            currentInput += ".";
            display.setText(currentInput);
        }
    }
}