package ru.maksim.sample

import android.animation.AnimatorInflater
import android.graphics.drawable.ClipDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        play.setOnClickListener({ play() })
    }

    private fun play() {
        val clippedDrawable = clippedView.background as ClipDrawable
        Log.d(TAG, "level=${clippedDrawable.level}")
        val animator = AnimatorInflater.loadAnimator(this, R.animator.clipped_view_animator)
        animator.setTarget(clippedDrawable)
        animator.start()
    }
}
