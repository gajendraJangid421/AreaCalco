package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityRectangle extends AppCompatActivity {

    TextView tvAreaResult, tvPerimeterResult;
    EditText editLengthNumber, editWidthNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rectangle);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvPerimeterResult = findViewById(R.id.tvPerimeterResult);
        editLengthNumber = findViewById(R.id.editLengthNumber);
        editWidthNumber = findViewById(R.id.editWidthNumber);
    }
    public void areaOfRectangle(View v){
        double length, width, area, perimeter;

        length = Double.parseDouble(editLengthNumber.getText().toString());
        width = Double.parseDouble(editWidthNumber.getText().toString());

        area = length * width;
        perimeter = 2 * (length + width);

        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
}