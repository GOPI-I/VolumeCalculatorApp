package com.example.volumecalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_cube extends AppCompatActivity {
    EditText editTextSide;
    TextView result;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube);
        editTextSide = findViewById(R.id.editTextCube);
        result = findViewById(R.id.result_cube);
        calculateButton = findViewById(R.id.btnCalculateCube);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateVolume();
            }
        });

    }
    private void calculateVolume() {
        String sideStr = editTextSide.getText().toString();

        if (!sideStr.isEmpty()) {
            double side = Double.parseDouble(sideStr);
            double volume = side * side * side;
            result.setText("Volume: " + volume);
        } else {
            result.setText("Please enter a valid value.");
        }
    }
}