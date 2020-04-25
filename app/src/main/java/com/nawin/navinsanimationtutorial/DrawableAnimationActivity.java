package com.nawin.navinsanimationtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DrawableAnimationActivity extends AppCompatActivity {

   AnimationDrawable drawableAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);

        ImageView imgView = (ImageView) findViewById(R.id.imgview);
        imgView.setBackgroundResource(R.drawable.directions);

        drawableAnimation = (AnimationDrawable) imgView.getBackground();
    }

    public void startAnimation(View view){
        drawableAnimation.start();
    }

    public void stopAnimation(View view){
        if(drawableAnimation.isRunning()){
            drawableAnimation.stop();
        }
    }
}
