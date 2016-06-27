package com.stanley.convertisseur;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edi1;
    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edi1 = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

    }

    public void onClick(View v) {

        String str1 = edi1.getText().toString().trim();

        float result = Float.parseFloat(str1) * 9 / 5 + 32;

        textView.setText("= " + String.valueOf(result) + " °F");

        textView2.setText("°C");

    }

    public void onClick2(View v) {

        String str1 = edi1.getText().toString().trim();

        float result = (Float.parseFloat(str1) - 32) * 5 / 9;

        textView.setText("= " + String.valueOf(result) + " °C");

        textView2.setText("°F");

    }
}