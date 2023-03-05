package com.example.formapplicatoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioGroup allofthem=findViewById(R.id.radg1);
        LinearLayout scrren=findViewById(R.id.scrren);
        RadioButton one=findViewById(R.id.radbt_1);
        RadioButton tow=findViewById(R.id.radbt_2);
        RadioButton three=findViewById(R.id.radbt_3);
        TextView result=findViewById(R.id.tv_1);
        Button save=findViewById(R.id.bt_save);
        CheckBox ch1=findViewById(R.id.chb_1);
        CheckBox ch2=findViewById(R.id.chb_2);
        CheckBox ch3=findViewById(R.id.chb_3);
        CheckBox ch4=findViewById(R.id.chb_4);
        RadioButton femal=findViewById(R.id.femal);
        RadioButton male=findViewById(R.id.male);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();

            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "pyhton", Toast.LENGTH_SHORT).show();

            }
        }); ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "C++", Toast.LENGTH_SHORT).show();

            }
        }); ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Php", Toast.LENGTH_SHORT).show();

            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (femal.isChecked() || male.isChecked()) {

                    if (one.isChecked()) {
                        result.setText("Young");
                        scrren.setBackgroundColor(getColor(R.color.purple_500));

                    } else if (tow.isChecked()) {
                        result.setText("youths");
                        scrren.setBackgroundColor(getColor(R.color.purple_500));

                    } else if (three.isChecked()) {
                        result.setText("older");
                        scrren.setBackgroundColor(getColor(R.color.purple_500));
                    }
                }else {
                    result.setText("you should select Gander");
            }

            }
        });
    }
}