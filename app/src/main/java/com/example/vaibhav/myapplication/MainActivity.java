package com.example.vaibhav.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button but;
    private TextView t1;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button)findViewById(R.id.but1);
        t1 = (TextView)findViewById(R.id.text1);
        final String[] db = {"vegeta","hit","goku","zeno sama","beerus","whis","chamapa","vados","yamcha","adnroid 17","krillin","goten","gohan","android 18",
        "grand priest","master roshi","frieza","buu","cell","majin vegeta","piccolo","magenta","pan","chi chi","bulma","trunks","bardock","piccon","king kai",
                "janemba"};
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random ran = new Random();
                int random = ran.nextInt(db.length);
                t1.setText(db[random]);
            }
        });

    }
}
