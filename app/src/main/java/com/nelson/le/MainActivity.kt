package com.nelson.le

import android.os.Bundle
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sunImageView: ImageView = findViewById(R.id.sunImageView)
        val earthImageView: ImageView = findViewById(R.id.earthImageView)

        val sunAnimationSet = AnimationSet(true)

        val sunRotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)
        val sunScaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation)

        sunAnimationSet.addAnimation(sunRotateAnimation)
        sunAnimationSet.addAnimation(sunScaleAnimation)

        sunImageView.startAnimation(sunAnimationSet)

        earthImageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate_animation))
    }
}
