package com.example.areacalco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonCircle, buttonSquare, buttonTriangle, buttonRectangle, buttonTrapezium, buttonRandom, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCircle = findViewById(R.id.buttonCircle);
        buttonSquare = findViewById(R.id.buttonSquare);
        buttonTriangle = findViewById(R.id.buttonTriangle);
        buttonRectangle = findViewById(R.id.buttonRectangle);
        buttonTrapezium = findViewById(R.id.buttonTrapezium);
        buttonRandom = findViewById(R.id.buttonRandom);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        buttonCircle.setOnClickListener(v -> openActivityCircle());
        buttonSquare.setOnClickListener(v -> openActivitySquare());
        buttonTriangle.setOnClickListener(v -> openActivityTriangle());
        buttonRectangle.setOnClickListener(v -> openActivityRectangle());
        buttonTrapezium.setOnClickListener(v -> openActivityTrapezium());
        buttonRandom.setOnClickListener(v -> {
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.VISIBLE);
        });
        button3.setOnClickListener(v -> openActivityRandom());
        button4.setOnClickListener(v -> openActivityRandom4());
        button5.setOnClickListener(v -> openActivityRandom5());
        button6.setOnClickListener(v -> openActivityRandom6());
    }

    public void openActivityCircle(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivitySquare(){
        Intent intent = new Intent(this, MainActivitySquare.class);
        startActivity(intent);
    }
    public void openActivityTriangle(){
        Intent intent = new Intent(this, MainActivityTriangle.class);
        startActivity(intent);
    }
    public void openActivityRectangle(){
        Intent intent = new Intent(this, MainActivityRectangle.class);
        startActivity(intent);
    }
    public void openActivityTrapezium(){
        Intent intent = new Intent(this, MainActivityTrapezium.class);
        startActivity(intent);
    }
    public void openActivityRandom(){
        Intent intent = new Intent(this, MainActivityRandom.class);
        startActivity(intent);
    }
    public void openActivityRandom4(){
        Intent intent = new Intent(this, MainActivityRandom4.class);
        startActivity(intent);
    }
    public void openActivityRandom5(){
        Intent intent = new Intent(this, MainActivityRandom5.class);
        startActivity(intent);
    }
    public void openActivityRandom6(){
        Intent intent = new Intent(this, MainActivityRandom6.class);
        startActivity(intent);
    }
}