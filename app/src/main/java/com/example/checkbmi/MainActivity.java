package com.example.checkbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=findViewById(R.id.inKg);
        input2=findViewById(R.id.inMeter);
        check=findViewById(R.id.checkBtn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kg=input1.getText().toString();
                String meter=input2.getText().toString();
                float inK=Float.parseFloat(kg);
                float inM=Float.parseFloat(meter);
                float bmi=inK/(inM*inM);
                String bmiValue=String.valueOf(bmi);
                Intent intent = new Intent(MainActivity.this,Result.class);
                intent.putExtra("Result",bmiValue);
                startActivity(intent);
            }
        });
    }
}