package com.example.pt2_castells_josep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Temperatura extends AppCompatActivity implements View.OnClickListener {
    RadioButton fIn;
    EditText inputT;
    TextView outputT;
    RadioButton fOut;
    RadioButton cIn;
    RadioButton cOut;
    RadioButton rIn;
    RadioButton rOut;
    RadioButton kIn;
    RadioButton kOut;
    RadioGroup rGroupIn;
    RadioGroup rGroupOut;
    Double var1;
    Double op;
    DecimalFormat precision = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        fIn = (RadioButton) findViewById(R.id.fIn);
        fOut = (RadioButton) findViewById(R.id.fOut);
        cIn = (RadioButton) findViewById(R.id.cIn);
        cOut = (RadioButton) findViewById(R.id.cOut);
        rIn = (RadioButton) findViewById(R.id.rIn);
        rOut = (RadioButton) findViewById(R.id.rOut);
        kIn = (RadioButton) findViewById(R.id.kIn);
        kOut = (RadioButton) findViewById(R.id.kOut);


        rGroupIn =  findViewById(R.id.rGroupIn);
        rGroupOut =  findViewById(R.id.rGroupOut);
        outputT = findViewById(R.id.outputT);
        inputT = findViewById(R.id.inputT);
        Button convertT = (Button) findViewById(R.id.convertT);
        Button enrrereT = (Button) findViewById(R.id.enrrereT);

        convertT.setOnClickListener(this);
        enrrereT.setOnClickListener(this);
    }
    public void onClick(View temperatura){
        switch (temperatura.getId()){
            case (R.id.convertT):{

               // if(!input.getText().toString().equalsIgnoreCase("")){

                    var1 = Double.parseDouble(inputT.getText().toString());
                System.out.println(var1);

                outputT.setText("");

                    if(fIn.isChecked() && fOut.isChecked()){
                        outputT.setText(var1.toString());
                    }
                    else if(kIn.isChecked() && kOut.isChecked()){
                        outputT.setText(var1.toString());
                    }
                    else if(rIn.isChecked() && rOut.isChecked()){
                        outputT.setText(var1.toString());
                    }
                    else if(cIn.isChecked() && cOut.isChecked()){
                        outputT.setText(var1.toString());
                    }
                    else if(fIn.isChecked() && kOut.isChecked()){
                        //Farenheit a Kelvin
                        op=((var1-273.15)/5 +32);
                        outputT.setText(precision.format(op));
                    }
                    else if(cIn.isChecked() && kOut.isChecked()){
                        //Celsius a Kelvin
                        op=(var1+273.15);
                        outputT.setText(precision.format(op));
                    }
                    else if(rIn.isChecked() && kOut.isChecked()){
                        //Rankie a Kelvin
                        op=(var1*0.55);
                        outputT.setText(precision.format(op));
                    }
                    else if(kIn.isChecked() && fOut.isChecked()){
                        //Kelvin a Farenheit
                        op =(var1+459.67) / 0.55;
                        outputT.setText(precision.format(op));
                    }
                    else if(cIn.isChecked() && fOut.isChecked()){
                        //Celsius a Farenheit
                        op=(var1*1.8)+32;
                        outputT.setText(precision.format(op));
                    }
                    else if(rIn.isChecked() && fOut.isChecked()){
                        //Rankie a Farenheit
                        op=(var1-459.67);
                        outputT.setText(precision.format(op));
                    }
                    else if(kIn.isChecked() && cOut.isChecked()){
                        //Kelvin a Celsius
                         op =(var1-273.15);
                        outputT.setText(precision.format(op));
                    }
                    else if(fIn.isChecked() && cOut.isChecked()){
                        //Farenheit a Celsius
                        op=((var1*1.8)-32);
                        outputT.setText(precision.format(op));
                    }
                    else if(rIn.isChecked() && cOut.isChecked()){
                        //Rankie a Celsius
                        op=((var1*1.8)-32);
                        outputT.setText(precision.format(op));
                    }
                    else if(rIn.isChecked() && cOut.isChecked()){
                        //Celsius a Rankie
                        op=((var1+273)*1.8);
                        outputT.setText(precision.format(op));
                    }
                    else if(fIn.isChecked() && rOut.isChecked()){
                        //Farenheit a Rankie
                        op=(var1+459.67);
                        outputT.setText(precision.format(op));
                    }
                    else if(kIn.isChecked() && rOut.isChecked()){
                        //Kelvin a Rankie
                        op=(var1*1.8);
                        outputT.setText(precision.format(op));
                    }
                //   }
                break;
           }
            case (R.id.enrrereT):{
                startActivity(new Intent(Temperatura.this, MainActivity.class));
                break;
            }
       }
    }
}