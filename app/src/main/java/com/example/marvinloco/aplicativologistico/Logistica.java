package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logistica extends AppCompatActivity {

    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logistica);

        btn_1 = (Button) findViewById(R.id.etusua);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Logistica.this, Cuestionario.class);
                Logistica.this.startActivity(itemintent);
                finish();
            }
        });

        btn_2 = (Button) findViewById(R.id.btn_2);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Logistica.this, Preguntas.class);
                Logistica.this.startActivity(itemintent);
                finish();
            }
        });

    }
}
