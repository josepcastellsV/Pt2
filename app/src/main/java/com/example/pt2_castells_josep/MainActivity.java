package com.example.pt2_castells_josep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button masa = (Button) findViewById(R.id.masa);
        Button longitud = (Button) findViewById(R.id.longitud);
        Button temperatura = (Button) findViewById(R.id.temperatura);

        masa.setOnClickListener(this);
        longitud.setOnClickListener(this);
        temperatura.setOnClickListener(this);
    }

    public void onClick(View view1) {

        switch (view1.getId()) {

            case (R.id.masa): {
                Intent intent = new Intent(MainActivity.this, Pes.class);
                startActivity(intent);
            }
            case (R.id.longitud): {
                Intent intent = new Intent(MainActivity.this, Longitud.class);
                startActivity(intent);
            }
            case (R.id.temperatura): {
                Intent intent = new Intent(MainActivity.this, Temperatura.class);
                startActivity(intent);
            }
        }
    }
}