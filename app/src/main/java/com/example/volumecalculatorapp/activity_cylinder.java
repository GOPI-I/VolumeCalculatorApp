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

public class activity_cylinder extends AppCompatActivity {
    EditText editTextRadius, editTextHeight;
    TextView result;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);
        editTextRadius = findViewById(R.id.editTextRadiusCylinder);
        editTextHeight = findViewById(R.id.editTextHeightCylinder);
        result = findViewById(R.id.result_cylinder);
        calculateButton = findViewById(R.id.btnCalculateCylinder);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateVolume();
            }
        });


    }
    private void calculateVolume() {
        String radiusStr = editTextRadius.getText().toString();
        String heightStr = editTextHeight.getText().toString();

        if (!radiusStr.isEmpty() && !heightStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double height = Double.parseDouble(heightStr);
            double volume = Math.PI * radius * radius * height;
            result.setText("Volume: " + volume);
        } else {
            result.setText("Please enter valid values.");
        }
    }
}