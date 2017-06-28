package com.example.raghu.passingdatabetweenactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);


        Bundle b=getIntent().getExtras();


        TextView name=(TextView)findViewById(R.id.name);
        TextView age=(TextView)findViewById(R.id.age);
        TextView gender=(TextView)findViewById(R.id.gender);

        name.setText(b.getCharSequence("name"));
        age.setText(b.getCharSequence("age"));
        gender.setText(b.getCharSequence("gender"));
    }
}
