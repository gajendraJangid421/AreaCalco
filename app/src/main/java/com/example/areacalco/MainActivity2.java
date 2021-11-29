package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvAreaResult, tvCircumferenceResult;
    EditText editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvCircumferenceResult = findViewById(R.id.tvCircumferenceResult);
        editNumber = findViewById(R.id.editNumber);
    }

    public void areaOfCircle(View v){
        double radius, area, circumference;

        radius = Double.parseDouble(editNumber.getText().toString());

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        tvAreaResult.setText(String.valueOf(area));
        tvCircumferenceResult.setText(String.valueOf(circumference));
    }
}