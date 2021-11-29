package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTriangle extends AppCompatActivity {

    TextView tvAreaResult;
    EditText editBaseNumber, editHeightNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_triangle);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        editBaseNumber = findViewById(R.id.editBaseNumber);
        editHeightNumber = findViewById(R.id.editHeightNumber);
    }

    public void areaOfTriangle(View v){
        double base, height, area;

        base = Double.parseDouble(editBaseNumber.getText().toString());
        height = Double.parseDouble(editHeightNumber.getText().toString());

        area = (base * height) / 2;

        tvAreaResult.setText(String.valueOf(area));
    }
}