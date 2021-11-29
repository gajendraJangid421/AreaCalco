package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivitySquare extends AppCompatActivity {

    TextView tvAreaResult, tvPerimeterResult;
    EditText editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_square);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        tvPerimeterResult = findViewById(R.id.tvPerimeterResult);
        editNumber = findViewById(R.id.editNumber);
    }

    public void areaOfSquare(View v){
        double length, area, perimeter;

        length = Double.parseDouble(editNumber.getText().toString());

        area = Math.pow(length, 2);
        perimeter = 4 * length;

        tvAreaResult.setText(String.valueOf(area));
        tvPerimeterResult.setText(String.valueOf(perimeter));
    }
}