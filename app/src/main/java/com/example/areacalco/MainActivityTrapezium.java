package com.example.areacalco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTrapezium extends AppCompatActivity {

    TextView tvAreaResult;
    EditText editBaseNumber1, editBaseNumber2, editHeightNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trapezium);

        tvAreaResult = findViewById(R.id.tvAreaResult);
        editBaseNumber1 = findViewById(R.id.editBaseNumber1);
        editBaseNumber2 = findViewById(R.id.editBaseNumber2);
        editHeightNumber = findViewById(R.id.editHeightNumber);
    }
    public void areaOfTrapezium(View v){
        double base1,base2, height, area;

        base1 = Double.parseDouble(editBaseNumber1.getText().toString());
        base2 = Double.parseDouble(editBaseNumber2.getText().toString());
        height = Double.parseDouble(editHeightNumber.getText().toString());

        area = (base1 + base2) * height / 2;

        tvAreaResult.setText(String.valueOf(area));
    }
}