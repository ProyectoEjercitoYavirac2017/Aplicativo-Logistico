package com.example.marvinloco.aplicativologistico;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;


public class Final extends AppCompatActivity {

    Button btn_1,btn_3,btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Final.this, Pdf.class);
                Final.this.startActivity(itemintent);
                finish();
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent emailIntent = new Intent(Intent.ACTION_SEND);
                                         emailIntent.setData(Uri.parse("mailto:"));
                                         emailIntent.setType("text/plain");
                                         startActivity(emailIntent);
                                                                      }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent itemintent = new Intent(Final.this, Login.class);
                    Final.this.startActivity(itemintent);
                    finish();
                }

            });

    }
}



