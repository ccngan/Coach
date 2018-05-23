package com.example.coach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home2 extends AppCompatActivity implements View.OnClickListener{

    private GestureDetectorCompat gestureObject;
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
        setContentView(R.layout.activity_home2);

        gestureObject = new GestureDetectorCompat(this, new Home2.LearnGesture());

        Button calvesButton = (Button) findViewById(R.id.calvesButton);
        calvesButton.setOnClickListener(this);
        Button glutesButton = (Button) findViewById(R.id.glutesButton);
        glutesButton.setOnClickListener(this);
        Button hamstringsButton = (Button) findViewById(R.id.hamstringsButton);
        hamstringsButton.setOnClickListener(this);
        Button latsButton = (Button) findViewById(R.id.latsButton);
        latsButton.setOnClickListener(this);
        Button lowerbackButton = (Button) findViewById(R.id.lowerbackButton);
        lowerbackButton.setOnClickListener(this);
        Button trapsButton = (Button) findViewById(R.id.trapsButton);
        trapsButton.setOnClickListener(this);
        Button tricepsButton = (Button) findViewById(R.id.tricepsButton);
        tricepsButton.setOnClickListener(this);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onTouchEvent (MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View view) {

        Intent calvesIntent = new Intent(this, Calves.class);
        Intent glutesIntent = new Intent(this, Glutes.class);
        Intent hamstringsIntent = new Intent(this, Hamstrings.class);
        Intent latsIntent = new Intent(this, Lats.class);
        Intent lowerbackIntent = new Intent(this, Lowerback.class);
        Intent trapsIntent = new Intent(this, Traps.class);
        Intent tricepsIntent = new Intent(this, Triceps.class);

        switch(view.getId()) {
            case R.id.calvesButton:
                startActivity(calvesIntent);
                break;
            case R.id.glutesButton:
                startActivity(glutesIntent);
                break;
            case R.id.hamstringsButton:
                startActivity(hamstringsIntent);
                break;
            case R.id.latsButton:
                startActivity(latsIntent);
                break;
            case R.id.lowerbackButton:
                startActivity(lowerbackIntent);
                break;
            case R.id.trapsButton:
                startActivity(trapsIntent);
                break;
            case R.id.tricepsButton:
                startActivity(tricepsIntent);
                break;
            default:
                break;
        }
    }

    class LearnGesture extends GestureDetector.SimpleOnGestureListener {
        // SimpleOnGestureListener is listener for what we want to do and how

        // now putting the required code for gesture side by side

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
            Intent intent = new Intent(Home2.this, Home.class);
            finish(); // finish is used to stop history for mainActivity class
            startActivity(intent);
            return true;
        }
    }
}
