package com.example.volumecalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape> shapeArrayList;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();
        Shape s1 = new Shape(R.drawable.sphere,"Sphere");
        Shape s2 = new Shape(R.drawable.cyclinded,"Cylinder");
        Shape s3 = new Shape(R.drawable.cube,"Cube");
        Shape s4 = new Shape(R.drawable.prisim,"Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i) {
                    case 0:
                        intent = new Intent(getApplicationContext(), sphere.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), activity_cylinder.class);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), activity_cube.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), activity_prism.class);
                        break;
                    default:
                        return;
                }
                startActivity(intent);
            }
        });
    }
}
