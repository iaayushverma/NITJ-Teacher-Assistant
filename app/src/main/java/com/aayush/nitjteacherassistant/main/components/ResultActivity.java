package com.aayush.nitjteacherassistant.main.components;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.aayush.nitjteacherassistant.R;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_activity);

        EditText sgpa, percentage;

        sgpa = (EditText) findViewById(R.id.sgpa);
        percentage = (EditText) findViewById(R.id.percentage);
        TextView t = (TextView) findViewById(R.id.t);
        TextView t1 = (TextView) findViewById(R.id.t3);

        Intent i3 = getIntent();
        float cgpa = i3.getFloatExtra("final_sgpa", 0);
        float pr = i3.getFloatExtra("final_perc", 0);
        if(cgpa!=0 && pr!=0)
        {
            sgpa.setText(String.valueOf(CgpaActivity.cg));
            percentage.setText(String.valueOf(CgpaActivity.pr) + "%");
        }



    }

}