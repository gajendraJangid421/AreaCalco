package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivityRandom6 extends AppCompatActivity {

    TextView tvAreaResult, tvPerimeterResult;
    EditText editSide1Number, editSide2Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_random6);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvPerimeterResult = findViewById(R.id.tvPerimeterResult);
        editSide1Number = findViewById(R.id.editSide1Number);
        editSide2Number = findViewById(R.id.editSide2Number);
    }

    public void areaOfHexa(View v){
        double side1, area, perimeter;

        side1 = Double.parseDouble(editSide1Number.getText().toString());

        perimeter = side1 * 6;
        area = 3 * Math.sqrt(3) * Math.pow(side1, 2) / 2;

        Toast.makeText(getApplicationContext(), "HEXAGON", LENGTH_SHORT).show();
        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
    public void areaOfOcta(View v){
        double side2, area, perimeter;

        side2 = Double.parseDouble(editSide2Number.getText().toString());

        perimeter = side2 * 8;
        area = 2 * (1 + Math.sqrt(2)) * Math.pow(side2, 2);

        Toast.makeText(getApplicationContext(), "OCTAGON", LENGTH_SHORT).show();
        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
}