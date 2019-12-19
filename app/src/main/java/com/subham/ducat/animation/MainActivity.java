package com.subham.ducat.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;

    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageView= (ImageView) findViewById(R.id.imageView);




       animation=AnimationUtils.loadAnimation(this,R.anim.first);

       imageView.startAnimation(animation);


    }
}
