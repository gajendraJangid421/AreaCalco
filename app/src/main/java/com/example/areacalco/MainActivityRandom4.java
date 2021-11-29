package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityRandom4 extends AppCompatActivity {

    TextView tvAreaResult, tvPerimeterResult;
    EditText editside1Number, editside2Number, editside3Number, editside4Number, editAngleNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_random4);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvPerimeterResult = findViewById(R.id.tvPerimeterResult);
        editside1Number = findViewById(R.id.editside1Number);
        editside2Number = findViewById(R.id.editside2Number);
        editside3Number = findViewById(R.id.editside3Number);
        editside4Number = findViewById(R.id.editside4Number);
        editAngleNumber = findViewById(R.id.editAngleNumber);
    }

    public void areaOfSide4(View v){
        double side1, side2, side3, side4, semiP, angle, radian, area, perimeter;

        side1 = Double.parseDouble(editside1Number.getText().toString());
        side2 = Double.parseDouble(editside2Number.getText().toString());
        side3 = Double.parseDouble(editside3Number.getText().toString());
        side4 = Double.parseDouble(editside4Number.getText().toString());
        angle = Double.parseDouble(editAngleNumber.getText().toString());

        perimeter = side1 + side2 + side3 + side4;
        semiP = perimeter / 2;
        radian = Math.toRadians(angle);
        area = Math.sqrt(((semiP - side1) * (semiP - side2) * (semiP - side3) * (semiP - side4)) - (side1 * side2 * side3 * side4 * Math.pow(Math.cos(radian/2),2)));

        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
}