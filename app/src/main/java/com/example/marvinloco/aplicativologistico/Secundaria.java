package com.example.marvinloco.aplicativologistico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

        import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;

        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;

        import android.webkit.WebView;
        import android.webkit.WebViewClient;

        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.io.FileInputStream;
        import java.io.FileOutputStream;

public class Secundaria extends AppCompatActivity {
    Button btn_2, btn_3;
    EditText ed1, ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        btn_2 = (Button) findViewById(R.id.btn_2);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.edi2);

        btn_3 = (Button) findViewById(R.id.btn_3);
        tx1 = (TextView) findViewById(R.id.tx1);
        tx1.setVisibility(View.GONE);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") &&

                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

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
