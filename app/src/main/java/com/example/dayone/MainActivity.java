package com.example.dayone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;
String s;
TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//setting environment of xml in java
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=editText.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Hii I am here"+s, Toast.LENGTH_SHORT).show();
                textview.setText(s);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    textview.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                }
                textview.setAllCaps(true);
                textview.setTextSize(25);
                textview.setTextColor(getResources().getColor(R.color.colorAccent));
                Intent intent=new Intent(MainActivity.this,Hello.class);
                startActivity(intent);
            }
        });
    }
}
