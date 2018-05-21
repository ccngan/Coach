package com.example.coach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_fitness:
                    mTextMessage.setText(R.string.title_fitness);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_diet:
                    mTextMessage.setText(R.string.title_diet);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button abductorsButton = (Button) findViewById(R.id.abductorsButton);
        abductorsButton.setOnClickListener(this);
        Button absButton = (Button) findViewById(R.id.absButton);
        absButton.setOnClickListener(this);
        Button adductorsButton = (Button) findViewById(R.id.adductorsButton);
        adductorsButton.setOnClickListener(this);
        Button bicepsButton = (Button) findViewById(R.id.bicepsButton);
        bicepsButton.setOnClickListener(this);
        Button chestButton = (Button) findViewById(R.id.chestButton);
        chestButton.setOnClickListener(this);
        Button forearmButton = (Button) findViewById(R.id.forearmButton);
        forearmButton.setOnClickListener(this);
        Button obliquesButton = (Button) findViewById(R.id.obliquesButton);
        obliquesButton.setOnClickListener(this);
        Button shoulderButton = (Button) findViewById(R.id.shouldersButton);
        shoulderButton.setOnClickListener(this);
        Button quadsButton = (Button) findViewById(R.id.quadsButton);
        quadsButton.setOnClickListener(this);


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}


    @Override
    public void onClick(View view) {

        Intent abductorsIntent = new Intent(this, Abductors.class);
        Intent absIntent = new Intent(this, Abs.class);
        Intent adductorsIntent = new Intent(this, Adductors.class);
        Intent bicepsIntent = new Intent(this, Biceps.class);
        Intent chestIntent = new Intent(this, Chest.class);
        Intent forearmIntent = new Intent(this, Forearm.class);
        Intent obliquesIntent = new Intent(this, Obliques.class);
        Intent shouldersIntent = new Intent(this, Shoulders.class);
        Intent quadsIntent = new Intent(this, Quads.class);

        switch(view.getId()) {
            case R.id.abductorsButton:
                startActivity(abductorsIntent);
                break;
            case R.id.absButton:
                startActivity(absIntent);
                break;
            case R.id.adductorsButton:
                startActivity(adductorsIntent);
                break;
            case R.id.bicepsButton:
                startActivity(bicepsIntent);
                break;
            case R.id.chestButton:
                startActivity(chestIntent);
                break;
            case R.id.forearmButton:
                startActivity(forearmIntent);
                break;
            case R.id.obliquesButton:
                startActivity(obliquesIntent);
                break;
            case R.id.shouldersButton:
                startActivity(shouldersIntent);
                break;
            case R.id.quadsButton:
                startActivity(quadsIntent);
                break;

            default:
                break;
        }
    }
}
