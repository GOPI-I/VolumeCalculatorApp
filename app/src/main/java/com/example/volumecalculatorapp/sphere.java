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

public class sphere extends AppCompatActivity {
    TextView result;
    EditText sphereRadius;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere);

        result = findViewById(R.id.result);
        sphereRadius = findViewById(R.id.editTextsphere);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = sphereRadius.getText().toString();
                int r = Integer.parseInt(radius);

                double volume = (4/3) * 3.14159 * r * r * r;
                result.setText("Volume: "+volume+"m^3");
            }
        });






    }
}