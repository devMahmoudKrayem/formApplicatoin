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

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one.isChecked()){
                    result.setText("Young");
                    scrren.setBackgroundColor(getColor(R.color.purple_500));

                }else if (tow.isChecked())
                {
                    result.setText("youths");
                    scrren.setBackgroundColor(getColor(R.color.purple_500));

                }else if (three.isChecked()){
                    result.setText("older");
                    scrren.setBackgroundColor(getColor(R.color.purple_500));
                }
            }
        });
    }
}