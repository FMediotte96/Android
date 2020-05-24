package com.facumediotte.elementosui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonMain);

        //Ventaja: limpio en cuestión de código
        //Desventaja: sirve para solo un listener
        btn.setOnClickListener(this);

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button clicked from the code!", Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Button clicked from the code!", Toast.LENGTH_LONG).show();
    }
}
