package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cuestionario_2 extends AppCompatActivity {
    Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);


        btn_1 = (Button) findViewById(R.id.btn_1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Cuestionario_2.this, Cuestionario_3.class);
                Cuestionario_2.this.startActivity(itemintent);
                finish();
            }
        });
    }
}