package ru.kirill.android_calculator_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 // Var layout
        Button one;
        Button two;
        Button three;
        Button four;
        Button five;
        Button six;
        Button seven;
        Button eight;
        Button nine;
        Button zero;

        Button plus;
        Button minus;
        Button multiplication;
        Button division;
        Button percent;

        Button clear;
        Button delete;
        Button point;
        Button equal;

        TextView present;
        TextView memory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
    }


    public void initialization(){

        one.findViewById(R.id.button_1);
        two.findViewById(R.id.button_2);
        three.findViewById(R.id.button_3);
        four.findViewById(R.id.button_4);
        five.findViewById(R.id.button_5);
        six.findViewById(R.id.button_6);
        seven.findViewById(R.id.button_7);
        eight.findViewById(R.id.button_8);
        nine.findViewById(R.id.button_9);
        zero.findViewById(R.id.button_0);

        plus.findViewById(R.id.button_plus);
        minus.findViewById(R.id.button_minus);
        multiplication.findViewById(R.id.button_multiplication);
        division.findViewById(R.id.button_division);
        percent.findViewById(R.id.button_percent);

        clear.findViewById(R.id.button_clear);
        delete.findViewById(R.id.button_delete);
        point.findViewById(R.id.button_point);
        equal.findViewById(R.id.button_equal);

        present.findViewById(R.id.text_present);
        memory.findViewById(R.id.text_memory);
    }

}
