package ru.kirill.android_calculator_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.security.Key;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    protected TextView info;
    protected static final String NAME = "theme";
    protected static final String KEY = "key";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(getMyTheme());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        info = findViewById(R.id.text_info);
        call_MainActivity();

        (findViewById(R.id.button_default)).setOnClickListener(this);
        (findViewById(R.id.button_red)).setOnClickListener(this);
        (findViewById(R.id.button_green)).setOnClickListener(this);
        (findViewById(R.id.button_blue)).setOnClickListener(this);
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("info", (String)info.getText());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        info.setText(savedInstanceState.getString("info"));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_default:{
                setMyTheme(R.style.Style_Default);
                info.setText("Default");
                break;
            }
            case R.id.button_red:{
                setMyTheme(R.style.Style_Red);
                info.setText("Red");
                break;
            }
            case R.id.button_green:{
                setMyTheme(R.style.Style_Green);
                info.setText("Green");
                break;
            }
            case R.id.button_blue:{
                setMyTheme(R.style.Style_Blue);
                info.setText("Blue");
                break;
            }
        }
        recreate();

    }

    public void call_MainActivity(){
        (findViewById(R.id.button_return)).setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
        });
    }

    public void setMyTheme(int codeStyle){
        SharedPreferences sharedPreferences = getSharedPreferences(NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY,codeStyle);
        editor.commit();
    }

    public int getMyTheme(){
        SharedPreferences sharedPreferences = getSharedPreferences(NAME, MODE_PRIVATE);
        return sharedPreferences.getInt(KEY, R.style.Style_Default);
    }

}

