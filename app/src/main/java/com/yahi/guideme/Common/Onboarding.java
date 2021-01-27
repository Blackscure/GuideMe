package com.yahi.guideme.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.yahi.guideme.HelperClasses.SliderAdapter;
import com.yahi.guideme.R;

public class Onboarding extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout dots;


    SliderAdapter sliderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

            //Hooks
        viewPager = findViewById(R.id.slider);
        dots = findViewById(R.id.dots);

        //call adapter
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
    }
}