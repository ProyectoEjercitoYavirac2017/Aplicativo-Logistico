package com.example.marvinloco.aplicativologistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Secundaria extends AppCompatActivity {
    Button btn_2, btn_3;
    EditText edi1, edi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        edi1 = (EditText) findViewById(R.id.edi1);
        edi2 = (EditText) findViewById(R.id.edi2);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi1.getText().toString().equals("admin") &&

                        edi2.getText().toString().equals("admin")) {
                    Intent itemintent = new Intent(Secundaria.this, Menu.class);
                    Secundaria.this.startActivity(itemintent);
                    Toast.makeText(getApplicationContext(), "Redireccionar...", Toast.LENGTH_SHORT).show();
                    } else {
                    Toast.makeText(getApplicationContext(), "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
                    }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Secundaria.this, Registrar.class);
                Secundaria.this.startActivity(itemintent);
                finish();
                }
        });
    }

}


