package ru.kirill.android_calculator_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 // Var layout
        protected Button one;
        protected Button two;
        protected Button three;
        protected Button four;
        protected Button five;
        protected Button six;
        protected Button seven;
        protected Button eight;
        protected Button nine;
        protected Button zero;

        protected Button plus;
        protected Button minus;
        protected Button multiplication;
        protected Button division;
        protected Button percent;

        protected Button clear;
        protected Button delete;
        protected Button point;
        protected Button equal;

        protected TextView present;
        protected TextView memory;

        protected float result;
        protected float var_first;
        protected float var_second;

        StringBuffer sb_first = new StringBuffer();
        StringBuffer sb_second = new StringBuffer();
        String var_first_str;
        String var_second_str;
        String var_plus;
        String var_minus;
        String znak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
        setListener();
        setListenerFunction();

    }


    public void initialization(){

        one = findViewById(R.id.button_1);
        two = findViewById(R.id.button_2);
        three = findViewById(R.id.button_3);
        four = findViewById(R.id.button_4);
        five = findViewById(R.id.button_5);
        six = findViewById(R.id.button_6);
        seven = findViewById(R.id.button_7);
        eight = findViewById(R.id.button_8);
        nine = findViewById(R.id.button_9);
        zero = findViewById(R.id.button_0);

        plus = findViewById(R.id.button_plus);
        minus = findViewById(R.id.button_minus);
        multiplication = findViewById(R.id.button_multiplication);
        division = findViewById(R.id.button_division);
        percent = findViewById(R.id.button_percent);

        clear = findViewById(R.id.button_clear);
        delete = findViewById(R.id.button_delete);
        point = findViewById(R.id.button_point);
        equal = findViewById(R.id.button_equal);

        present = findViewById(R.id.text_present);
        memory = findViewById(R.id.text_memory);
    }

    public void setListener(){

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("1");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("1");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }

                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("2");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("2");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("3");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("3");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("4");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("4");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("5");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("5");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("6");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("6");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("7");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("7");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("8");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("8");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("9");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("9");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append("0");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append("0");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var_first_str == null){
                    sb_first.append(".");
                    present.setText(sb_first);
                }
                else{
                    sb_second.append(".");
                    if (znak == "+"){
                        present.setText(var_plus + sb_second);
                    }
                    if (znak == "-"){
                        present.setText(var_minus + sb_second);
                    }
                }

            }
        });
    }


    public void setListenerFunction() {

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sb_first != null) {
                    var_first_str = String.valueOf(sb_first);
                    sb_first.delete(0,sb_first.length());
                    var_plus = (var_first_str + "+");
                    znak = "+";
                    present.setText(var_plus);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sb_first != null) {
                    var_first_str = String.valueOf(sb_first);
                    sb_first.delete(0,sb_first.length());
                    var_minus = (var_first_str + "-");
                    znak = "-";
                    present.setText(var_minus);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (znak == "+"){

                    var_second_str = String.valueOf(sb_second);
                    sb_second.delete(0,sb_second.length());

                    var_first = Float.parseFloat(String.valueOf(var_first_str));
                    var_second = Float.parseFloat(String.valueOf(var_second_str));
                    result = var_first + var_second;

                    present.setText(String.valueOf(result));
                    clearVar();
                }

                if (znak == "-"){

                    var_second_str = String.valueOf(sb_second);
                    sb_second.delete(0,sb_second.length());

                    var_first = Float.parseFloat(String.valueOf(var_first_str));
                    var_second = Float.parseFloat(String.valueOf(var_second_str));
                    result = var_first - var_second;

                    present.setText(String.valueOf(result));
                    clearVar();
                }
            }
        });


    }

    public void clearVar(){
        var_first = 0;
        var_second = 0;
        var_first_str = null;
        var_second_str = null;
        znak = null;
        sb_first.delete(0,sb_first.length());
        sb_second.delete(0,sb_second.length());
    }


}
