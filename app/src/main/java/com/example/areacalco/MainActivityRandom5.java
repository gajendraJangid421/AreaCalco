package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityRandom5 extends AppCompatActivity {

    TextView tvAreaResult, tvPerimeterResult;
    EditText editside1Number, editside2Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_random5);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvPerimeterResult = findViewById(R.id.tvPerimeterResult);
        editside1Number = findViewById(R.id.editside1Number);
        editside2Number = findViewById(R.id.editside2Number);
    }

    public void areaOfSide5(View v){
        double side1, side2, area, perimeter;

        side1 = Double.parseDouble(editside1Number.getText().toString());
        side2 = Double.parseDouble(editside2Number.getText().toString());

        perimeter = side1 * 5;
        area = perimeter * side2 / 2;

        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
}