package com.example.girish.numberprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.numberprogressbar.NumberProgressBar;

public class MainActivity extends AppCompatActivity {
NumberProgressBar bar;
Button  b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = (NumberProgressBar) findViewById(R.id.number_progress_bar);
        b1= (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bar.incrementProgressBy(5);
            }
        });
    }
}
