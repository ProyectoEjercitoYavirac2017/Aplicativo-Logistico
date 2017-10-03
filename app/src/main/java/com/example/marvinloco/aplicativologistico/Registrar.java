package com.example.marvinloco.aplicativologistico;
import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    Button btn_2, btn_3;
    EditText edi4, edi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edi4 = (EditText) findViewById(R.id.edi1);
        edi5 = (EditText) findViewById(R.id.edi2);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi4.getText().toString().equals("") ==
                        edi5.getText().toString().equals("")) {
                    Intent itemintent = new Intent(Registrar.this, Secundaria.class);
                    Registrar.this.startActivity(itemintent);
                    Toast.makeText(getApplicationContext(), "Redireccionar...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Registrar.this, Secundaria.class);
                Registrar.this.startActivity(itemintent);
                finish();
            }
        });
    }

}

