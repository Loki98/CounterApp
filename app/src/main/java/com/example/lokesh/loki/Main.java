package com.example.lokesh.loki;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1, b2;
        b1= (Button)findViewById(R.id.b);
        b2 =(Button)findViewById(R.id.c);
        final TextView t1 = (TextView)findViewById(R.id.a);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View chit) {
                int count=Integer.parseInt(t1.getText().toString());
                count++;
                t1.setText(String.valueOf(count));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View chit) {
                int count=Integer.parseInt(t1.getText().toString());
                count--;
                t1.setText(String.valueOf(count));
            }
        });
    }

}
