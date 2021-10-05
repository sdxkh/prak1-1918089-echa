package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText a, t;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        a = (EditText) findViewById(R.id.input_alas);
        t = (EditText) findViewById(R.id.input_tinggi);
        hitung = (Button) findViewById(R.id.btn_hitung);
        hasil = (TextView) findViewById(R.id.output_luas);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alas1 = a.getText().toString();
                String tinggi1 = t.getText().toString();

                double a = Double.parseDouble(alas1);
                double t = Double.parseDouble(tinggi1);
                double hs = LuasSegitiga(a,t);
                String output = String.valueOf(hs);
                hasil.setText(output.toString());
            }
        });
    }
    public double LuasSegitiga(double a, double t){
        double v = a * t / 2;
        return v;
    }
}