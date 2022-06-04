package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //EditText originX,originY,radius,pointX,pointY;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        originX = findViewById(R.id.originX);
//        originY = findViewById(R.id.originY);
//        radius = findViewById(R.id.radius);
//        pointX = findViewById(R.id.pointX);
//        pointY = findViewById(R.id.pointY);
    }

    public void findIfInside(View view) {

        double origin_x = Double.parseDouble(binding.originX.getText().toString().trim());
        double origin_y = Double.parseDouble(binding.originY.getText().toString().trim());
        double radius_r = Double.parseDouble(binding.radius.getText().toString().trim());
        double point_x = Double.parseDouble(binding.pointX.getText().toString().trim());
        double point_y = Double.parseDouble(binding.pointY.getText().toString().trim());

        //System.out.println(origin_x + " " + radius_r);
        double distance = Math.sqrt(Math.pow((point_x - origin_x),2) + Math.pow((point_y - origin_y),2));

        if(radius_r > distance){
            Toast.makeText(this, "Its within circle", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Its Outside the Circle", Toast.LENGTH_SHORT).show();
        }

    }
}