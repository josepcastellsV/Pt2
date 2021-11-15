package com.example.pt2_castells_josep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Longitud extends AppCompatActivity implements View.OnClickListener  {
    EditText inputL;
    TextView outputL;
    RadioButton kmIn;
    RadioButton kmOut;
    RadioButton ydIn;
    RadioButton ydOut;
    RadioButton miIn;
    RadioButton miOut;
    RadioButton pzIn;
    RadioButton pzOut;
    Button convertL;
    Button enrrereL;
    Double var2;
    Double op2;
    DecimalFormat precision = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

        kmIn = (RadioButton) findViewById(R.id.kmIn);
        kmOut = (RadioButton) findViewById(R.id.kmOut);
        ydIn = (RadioButton) findViewById(R.id.ydIn);
        ydOut = (RadioButton) findViewById(R.id.ydOut);
        miIn = (RadioButton) findViewById(R.id.miIn);
        miOut = (RadioButton) findViewById(R.id.miOut);
        pzIn = (RadioButton) findViewById(R.id.pzIn);
        pzOut = (RadioButton) findViewById(R.id.pzOut);

        outputL = findViewById(R.id.outputT);
        inputL = findViewById(R.id.inputT);
        convertL = findViewById(R.id.convertL);
        enrrereL = findViewById(R.id.enrrereL);

        convertL.setOnClickListener(this);
        enrrereL.setOnClickListener(this);
    }

    public void onClick(View Longitud) {
        switch (Longitud.getId()) {


            case (R.id.convertL): {

                // if(!input.getText().toString().equalsIgnoreCase("")){

                var2 = Double.parseDouble(inputL.getText().toString());
                System.out.println(var2);

                outputL.setText("");

                if (kmIn.isChecked() && kmOut.isChecked()) {
                    outputL.setText(var2.toString());
                } else if (ydIn.isChecked() && ydOut.isChecked()) {
                    outputL.setText(var2.toString());
                } else if (miIn.isChecked() && miOut.isChecked()) {
                    outputL.setText(var2.toString());
                } else if (pzIn.isChecked() && pzOut.isChecked()) {
                    outputL.setText(var2.toString());

                } else if (ydIn.isChecked() && kmOut.isChecked()) {
                    //yd a km
                    op2 = (var2*0.0009144);
                    outputL.setText(precision.format(op2));
                } else if (miIn.isChecked() && kmOut.isChecked()) {
                    //mi a km
                    op2 = (var2*1.609344);
                    outputL.setText(precision.format(op2));
                } else if (pzIn.isChecked() && kmOut.isChecked()) {
                    //pz a km
                    op2 = (var2 *0.0000254);
                    outputL.setText(precision.format(op2));

                } else if (kmIn.isChecked() && ydOut.isChecked()) {
                    //km a yd
                    op2 = (var2*0.6213712);
                    outputL.setText(precision.format(op2));

                } else if (pzIn.isChecked() && ydOut.isChecked()) {
                    //pz a yd
                    op2 = (var2*0.02777778);
                    outputL.setText(precision.format(op2));
                } else if (miIn.isChecked() && ydOut.isChecked()) {
                    //mi a yd
                    op2 = (var2*1760);
                    outputL.setText(precision.format(op2));

                } else if (kmIn.isChecked() && miOut.isChecked()) {
                    //km a mi
                    op2 = (var2*0.6213712);
                    outputL.setText(precision.format(op2));

                } else if (ydIn.isChecked() && miOut.isChecked()) {
                    //yd a mi
                    op2 = (var2*0.0005681818);
                    outputL.setText(precision.format(op2));
                } else if (pzIn.isChecked() && miOut.isChecked()) {
                    //pz a mi
                    op2 = (var2*0.00001578283);
                    outputL.setText(precision.format(op2));
                } else if (kmIn.isChecked() && pzOut.isChecked()) {
                    //km a pz
                    op2 = (var2*39370.08);
                    outputL.setText(precision.format(op2));

                } else if (miIn.isChecked() && pzOut.isChecked()) {
                    //mi a pz
                    op2 = (var2*63360);
                    outputL.setText(precision.format(op2));
                } else if (ydIn.isChecked() && pzOut.isChecked()) {
                    //yd a pz
                    op2 = (var2*36);
                    outputL.setText(precision.format(op2));
                }
                //   }
                break;
            }
            case (R.id.enrrereL): {
                startActivity(new Intent(Longitud.this, MainActivity.class));
                break;
            }
        }
    }
}
