package com.example.raghu.passingdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
   RadioGroup gender;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        gender=(RadioGroup) findViewById(R.id.gender);

        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),Display.class);

                Bundle b=new Bundle();
                b.putString("name",et1.getText().toString());
                b.putString("age",et2.getText().toString());
                int val=gender.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(val);
                b.putString("gender",rb.getText().toString());

                i.putExtras(b);


                startActivity(i);





            }
        });






    }
}
