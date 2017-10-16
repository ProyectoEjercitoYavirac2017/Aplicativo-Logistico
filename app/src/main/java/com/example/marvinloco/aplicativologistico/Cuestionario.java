package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Cuestionario extends AppCompatActivity {

    CheckBox cb1;
    TextView txt1;
    Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);


        btn_1 = (Button) findViewById(R.id.btn_1);
        cb1=(CheckBox) findViewById(R.id.cb1);
        txt1=(TextView) findViewById(R.id.txt1);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Cuestionario.this, Cuestionario_1.class);
                Cuestionario.this.startActivity(itemintent);
                finish();
            }
        });


        cb1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(cb1.isChecked())
                    txt1.setText("CheckBox marcado");
                else
                    txt1.setText("CheckBox no marcado");
            }
        });
    }
}



