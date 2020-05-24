package com.facumediotte.intentImplicito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author fmediotte
 */
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GREETER = "Hello from the other side";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acceder al segundo activity y mandarle un string
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("greeter2", GREETER);
                startActivity(intent);
            }
        });
    }
}
