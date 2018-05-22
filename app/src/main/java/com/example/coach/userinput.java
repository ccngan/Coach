package com.example.coach;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by USER on 22/5/2018.
 */

public class userinput extends AppCompatActivity {
    int age;
    int height;
    int weight;

    EditText ageinput1;
    EditText heightinput1;
    EditText weightinput1;

    Button submitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinput);

        ageinput1=(EditText) findViewById(R.id.ageinput);
        heightinput1=(EditText) findViewById(R.id.heightinput);
        weightinput1=(EditText) findViewById(R.id.weightinput);

        submitbutton=(Button) findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                age = Integer.valueOf(ageinput1.getText().toString());
                height = Integer.valueOf(heightinput1.getText().toString());
                weight = Integer.valueOf(weightinput1.getText().toString());

                showToast(String.valueOf(age));
                showToast(String.valueOf(height));
                showToast(String.valueOf(weight));


            }
        });



    }

    private void showToast(String text) {
        Toast.makeText(userinput.this, text, Toast.LENGTH_SHORT).show();
    }
}
