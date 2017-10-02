package com.example.marvinloco.aplicativologistico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Secundaria extends AppCompatActivity {
    Button btn_2, btn_3;
    EditText edi1, edi2;

    TextView txt2;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        btn_2 = (Button) findViewById(R.id.btn_2);
        edi1 = (EditText) findViewById(R.id.edi1);
        edi2 = (EditText) findViewById(R.id.edi2);

        btn_3 = (Button) findViewById(R.id.btn_3);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt2.setVisibility(View.GONE);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi1.getText().toString().equals("admin") &&

                        edi2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Redireccionar...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();

                    txt2.setVisibility(View.VISIBLE);
                    txt2.setBackgroundColor(Color.RED);
                    counter--;
                    txt2.setText(Integer.toString(counter));

                    if (counter == 0) {
                        btn_2.setEnabled(false);
                    }
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
