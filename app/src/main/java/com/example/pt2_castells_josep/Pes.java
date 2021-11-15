package com.example.pt2_castells_josep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Pes extends AppCompatActivity implements View.OnClickListener {
    EditText pesInput;
    TextView outputP;
    RadioButton kgIn;
    RadioButton kgOut;
    RadioButton lbIn;
    RadioButton lbOut;
    RadioButton ozIn;
    RadioButton ozOut;
    RadioButton stIn;
    RadioButton stOut;
    Button convertP;
    Button enrrereP;
    Double var2;
    Double op2;
    DecimalFormat precision = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pes);

        kgIn = (RadioButton) findViewById(R.id.kgIn);
        kgOut = (RadioButton) findViewById(R.id.kgOut);
        lbIn = (RadioButton) findViewById(R.id.lbIn);
        lbOut = (RadioButton) findViewById(R.id.lbOut);
        ozIn = (RadioButton) findViewById(R.id.ozIn);
        ozOut = (RadioButton) findViewById(R.id.ozOut);
        stIn = (RadioButton) findViewById(R.id.stIn);
        stOut = (RadioButton) findViewById(R.id.stOut);


        Button convertP = (Button) findViewById(R.id.convertP);
        Button enrrereP = (Button) findViewById(R.id.enrrereP);

        convertP.setOnClickListener(this);
        enrrereP.setOnClickListener(this);

    }
    public void onClick(View Pes) {
        switch (Pes.getId()) {


            case (R.id.convertP): {

                // if(!input.getText().toString().equalsIgnoreCase("")){

                var2 = Double.parseDouble(pesInput.getText().toString());
                System.out.println(var2);

                pesInput.setText("");

                if (kgIn.isChecked() && kgOut.isChecked()) {
                    pesInput.setText(var2.toString());
                } else if (lbIn.isChecked() && lbOut.isChecked()) {
                    outputP.setText(var2.toString());
                } else if (ozIn.isChecked() && ozOut.isChecked()) {
                    outputP.setText(var2.toString());
                } else if (stIn.isChecked() && stOut.isChecked()) {
                    outputP.setText(var2.toString());

                } else if (lbIn.isChecked() && kgOut.isChecked()) {
                    //lb a kg
                    op2 = (var2*2.20462262);
                    outputP.setText(precision.format(op2));
                } else if (ozIn.isChecked() && kgOut.isChecked()) {
                    //oz a kg
                    op2 = (var2*35.27396);
                    outputP.setText(precision.format(op2));
                } else if (stIn.isChecked() && kgOut.isChecked()) {
                    //st a kg
                    op2 = (var2 *0.157473);
                    outputP.setText(precision.format(op2));

                } else if (kgIn.isChecked() && lbOut.isChecked()) {
                    //kg a lb
                    op2 = (var2*0.45359237);
                    outputP.setText(precision.format(op2));

                } else if (ozIn.isChecked() && lbOut.isChecked()) {
                    //oz a lb
                    op2 = (var2*16);
                    outputP.setText(precision.format(op2));
                } else if (stIn.isChecked() && lbOut.isChecked()) {
                    //st a lb
                    op2 = (var2*0.07142857);
                    outputP.setText(precision.format(op2));

                } else if (kgIn.isChecked() && ozOut.isChecked()) {
                    //kg a oz
                    op2 = (var2*0.02833);
                    outputP.setText(precision.format(op2));

                } else if (lbIn.isChecked() && ozOut.isChecked()) {
                    //lb a oz
                    op2 = (var2*0.0625);
                    outputP.setText(precision.format(op2));
                } else if (stIn.isChecked() && ozOut.isChecked()) {
                    //st a oz
                    op2 = (var2*1/224);
                    outputP.setText(precision.format(op2));
                } else if (kgIn.isChecked() && stOut.isChecked()) {
                    //kg a st
                    op2 = (var2*6.35029318);
                    outputP.setText(precision.format(op2));

                } else if (lbIn.isChecked() && stOut.isChecked()) {
                    //lb a st
                    op2 = (var2*14);
                    outputP.setText(precision.format(op2));
                } else if (ozIn.isChecked() && stOut.isChecked()) {
                    //oz a st
                    op2 = (var2*224);
                    outputP.setText(precision.format(op2));
                }
                //   }
                break;
            }
            case (R.id.enrrereP): {
                startActivity(new Intent(Pes.this, MainActivity.class));
                break;
            }
        }
    }
}
