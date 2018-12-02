package com.example.teacher.runtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView text;
    private Button eq, lo, up;
    private static int cnt = 0;
    private int left = 0, right = 1000000000, mid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mid = (left + right) / 2;
        text = findViewById(R.id.textView);
        String s = "Ваше число - " + String.valueOf(mid) + "?";
        text.setText(s);
        eq = findViewById(R.id.eq);
        eq.setOnClickListener(e->{
            String answer = "Число - " + mid + ", было угадано за " + cnt + " попыток";
            text.setText(answer);
        });
        lo = findViewById(R.id.lo);
        lo.setOnClickListener((view)->{
            right = mid;
            mid = (left + right) / 2;
            String answer = "Ваше число -" + mid + "?";
            cnt++;
            text.setText(answer);
        });
        up = findViewById(R.id.up);
        up.setOnClickListener((view)->{
            left = mid;
            mid = (left + right) / 2;
            String answer = "Ваше число -" + mid + "?";
            cnt++;
            text.setText(answer);
        });
    }
}
