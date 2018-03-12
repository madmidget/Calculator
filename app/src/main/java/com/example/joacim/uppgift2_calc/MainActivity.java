package com.example.joacim.uppgift2_calc;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button historyBtn = (Button) findViewById(R.id.historyBtn);
        Button refreshBtn = (Button) findViewById(R.id.refreshBtn);
        final EditText firstNum_editText = (EditText) findViewById(R.id.firstNum_editText);
        final EditText secondNum_editText = (EditText) findViewById(R.id.secondNumber_editText);



        addBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView sum_textView = (TextView) findViewById(R.id.sum_textView);
                EditText firstNum_editText = (EditText) findViewById(R.id.firstNum_editText);
                EditText secondNum_editText = (EditText) findViewById(R.id.secondNumber_editText);
                int num1 = Integer.parseInt(firstNum_editText.getText().toString());
                int num2 = Integer.parseInt(secondNum_editText.getText().toString());

                int sumAdd = num1 + num2;
                sum_textView.setText(sumAdd + "");



            }

        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNum_editText = (EditText) findViewById(R.id.firstNum_editText);
                EditText secondNum_editText = (EditText) findViewById(R.id.secondNumber_editText);
                TextView sum_textView = (TextView) findViewById(R.id.sum_textView);

                int num1 = Integer.parseInt(firstNum_editText.getText().toString());
                int num2 = Integer.parseInt(secondNum_editText.getText().toString());

                int sumSub = num1 - num2;
                sum_textView.setText(sumSub + "");

            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNum_editText = (EditText) findViewById(R.id.firstNum_editText);
                EditText secondNum_editText = (EditText) findViewById(R.id.secondNumber_editText);
                TextView sum_textView = (TextView) findViewById(R.id.sum_textView);

                int num1 = Integer.parseInt(firstNum_editText.getText().toString());
                int num2 = Integer.parseInt(secondNum_editText.getText().toString());

                if (num1 < 1 || num2 < 1) {
                    sum_textView.setText("Går inte");

                } else {

                    int sumDiv = num1 / num2;
                    sum_textView.setText(sumDiv + "");
                }

            }
        });

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum_editText.setText("");
                secondNum_editText.setText("");
            }
        });


        historyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), SumList.class);
                myIntent.putExtra("com.example.joacim.uppgift2_calc.sumthin", "Hello History");
                startActivity(myIntent);
            }
        });




    }
}








