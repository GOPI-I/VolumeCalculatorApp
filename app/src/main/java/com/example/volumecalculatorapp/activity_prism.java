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

public class activity_prism extends AppCompatActivity {
    EditText editTextBase, editTextHeight;
    TextView result;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);

        editTextBase = findViewById(R.id.editTextBasePrism);
        editTextHeight = findViewById(R.id.editTextHeightPrism);
        result = findViewById(R.id.result_prism);
        calculateButton = findViewById(R.id.btnCalculatePrism);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateVolume();
            }
        });


    }
    private void calculateVolume() {
        String baseStr = editTextBase.getText().toString();
        String heightStr = editTextHeight.getText().toString();

        if (!baseStr.isEmpty() && !heightStr.isEmpty()) {
            double base = Double.parseDouble(baseStr);
            double height = Double.parseDouble(heightStr);
            double volume = base * height;
            result.setText("Volume: " + volume);
        } else {
            result.setText("Please enter valid values.");
        }
    }
}