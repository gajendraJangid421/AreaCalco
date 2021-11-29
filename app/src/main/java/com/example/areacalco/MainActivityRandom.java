package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityRandom extends AppCompatActivity {

    TextView tvAreaResult, tvPerimeterResult;
    EditText editside1Number, editside2Number, editside3Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_random);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvPerimeterResult = findViewById(R.id.tvPerimeterResult);
        editside1Number = findViewById(R.id.editside1Number);
        editside2Number = findViewById(R.id.editside2Number);
        editside3Number = findViewById(R.id.editside3Number);
    }
    public void areaOfSide3(View v){
        double side1, side2, side3, semiP, area, perimeter;

        side1 = Double.parseDouble(editside1Number.getText().toString());
        side2 = Double.parseDouble(editside2Number.getText().toString());
        side3 = Double.parseDouble(editside3Number.getText().toString());

        perimeter = side1 + side2 + side3;
        semiP = perimeter / 2;
        area = Math.sqrt(semiP * (semiP - side1) * (semiP - side2) * (semiP - side3));

        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
}