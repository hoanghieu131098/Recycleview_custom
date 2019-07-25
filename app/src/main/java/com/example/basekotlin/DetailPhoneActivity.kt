package com.example.basekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_detail_phone.*
import android.widget.ImageView.ScaleType
import android.widget.LinearLayout



class DetailPhoneActivity : AppCompatActivity() {
     var isImageFitToScreen:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_phone)
        val inten=intent
        img.setImageResource(inten.getIntExtra("ImagePhone",R.drawable.icon_load_error))
        tv.text=inten.getStringExtra("NamePhone")
        btnback.setOnClickListener {

            finish()
        }
        img.setOnClickListener {
//            img.setScaleType(ScaleType.FIT_XY)
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
//            getWindow().requestFeature(Window.FEATURE_ACTION_BAR)
//            getSupportActionBar()?.hide()
        }
    }
}
