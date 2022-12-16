package com.example.juegogatito;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,ganador,turno1,turno2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView11); t2=findViewById(R.id.textView12); t3=findViewById(R.id.textView13);

        t4=findViewById(R.id.textView14); t5=findViewById(R.id.textView16); t6=findViewById(R.id.textView15);

        t7=findViewById(R.id.textView17); t8=findViewById(R.id.textView19); t9=findViewById(R.id.textView18);

        ganador=findViewById(R.id.textView23); turno1=findViewById(R.id.textView21); turno2=findViewById(R.id.textView20);

        t1.setBackgroundColor(Color.GRAY); t2.setBackgroundColor(Color.GRAY); t3.setBackgroundColor(Color.GRAY);

        t4.setBackgroundColor(Color.GRAY); t5.setBackgroundColor(Color.GRAY); t6.setBackgroundColor(Color.GRAY);

        t7.setBackgroundColor(Color.GRAY); t8.setBackgroundColor(Color.GRAY); t9.setBackgroundColor(Color.GRAY);

        turno2.setBackgroundColor(Color.RED); turno1.setBackgroundColor(Color.GREEN);
    }
}