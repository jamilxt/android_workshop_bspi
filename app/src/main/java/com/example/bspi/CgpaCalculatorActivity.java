package com.example.bspi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CgpaCalculatorActivity extends AppCompatActivity {

    TextView totalCgpa;
    EditText semester_1, semester_2, semester_3, semester_4, semester_5, semester_6, semester_7, semester_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculator);

        semester_1 = findViewById(R.id.semester_1);
        semester_2 = findViewById(R.id.semester_2);
        semester_3 = findViewById(R.id.semester_3);
        semester_4 = findViewById(R.id.semester_4);
        semester_5 = findViewById(R.id.semester_5);
        semester_6 = findViewById(R.id.semester_6);
        semester_7 = findViewById(R.id.semester_7);
        semester_8 = findViewById(R.id.semester_8);

        totalCgpa = findViewById(R.id.totalCgpa);

    }

    public void calcuteCgpa(View view) {

        double semester_one = Double.valueOf(semester_1.getText().toString()) * 0.05;
        double semester_two = Double.valueOf(semester_2.getText().toString()) * 0.05;
        double semester_three = Double.valueOf(semester_3.getText().toString()) * 0.05;
        double semester_four = Double.valueOf(semester_4.getText().toString()) * 0.10;
        double semester_five = Double.valueOf(semester_4.getText().toString()) * 0.15;
        double semester_six = Double.valueOf(semester_4.getText().toString()) * 0.20;
        double semester_seven = Double.valueOf(semester_4.getText().toString()) * 0.25;
        double semester_eight = Double.valueOf(semester_4.getText().toString()) * 0.15;

        double total_cgpa = semester_one + semester_two + semester_three + semester_four + semester_five + semester_six + semester_seven + semester_eight;

        totalCgpa.setText(String.valueOf(total_cgpa));
    }
}
