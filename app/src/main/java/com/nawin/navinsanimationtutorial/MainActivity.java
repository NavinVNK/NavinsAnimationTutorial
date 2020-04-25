package com.nawin.navinsanimationtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button drawableBtn,tweenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tweenBtn=findViewById(R.id.tweenanim);
        drawableBtn=findViewById(R.id.drawanim);
        setupWindowAnimations();
         tweenBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(MainActivity.this, TweenAnimationActivity.class);
                 // Starts TargetActivity
                 startActivity(i, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
             }
         });
drawableBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, DrawableAnimationActivity.class);
        // Starts TargetActivity
        startActivity(i, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
    }
});

    }
    private void setupWindowAnimations() {
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }
}
