package com.facumediotte.androidudemyfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int result = check();
        Toast.makeText(this, "Hola desde el curso Aprendiendo Android: " + result, Toast.LENGTH_LONG).show();
        Person p = new Person("Facundo");
    }

    private int check() {
        int a = 5;
        int b = 10;
        int c = 20;
        int result = 0;

        if (a > b) {
            result = 0;
        }else {
            if (c > a){
                result = c;
            } else {
                result = a;
            }
        }
        return result;
    }

    public class Person {
        public String name;

        Person(String name){
            this.name = name;
        }
    }
}
