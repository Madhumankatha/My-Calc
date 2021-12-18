package com.madhumankatha.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText edNum1,edNum2;
    private TextView tvResult;
    private Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize java object with xml id's
        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);

        tvResult = findViewById(R.id.tvResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        //add click event for buttons
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //returns the user input value
                String n1 = edNum1.getText().toString();
                String n2 = edNum2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter all the fields!!", Toast.LENGTH_SHORT).show();
                }else {
                    int result = Integer.parseInt(n1) + Integer.parseInt(n2);
                    tvResult.setText(Integer.toString(result));
                }
            }
        });

    }

}