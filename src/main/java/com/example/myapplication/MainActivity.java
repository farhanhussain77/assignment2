package com.example.myapplication;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    EditText txt;
    EditText res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText) findViewById(R.id.editTextNumberSigned);
        res = (EditText) findViewById(R.id.editTextNumberDecimal2);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.onClickListner() {
            @Override
            public void onClick(View v){
                res.setText(txt.toString());
            }
        });
    }
}