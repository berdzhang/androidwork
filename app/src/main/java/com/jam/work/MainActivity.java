package com.jam.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next;
    Button submit;
    TextView show;
    EditText get;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(TextView)findViewById(R.id.main_show);
        get=(EditText)findViewById(R.id.main_get_name);
        str=get.getText().toString().trim();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.length()==0){
                    show.setText("please entry you name!");
                }else show.setText(str+",welcome!");
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}