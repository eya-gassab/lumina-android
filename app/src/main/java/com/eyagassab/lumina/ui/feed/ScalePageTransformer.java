package com.eyagassab.lumina.ui.feed;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ScalePageTransformer implements ViewPager2.PageTransformer {

    private static final float MIN_SCALE = 0.94f;

    @Override
    public void transformPage(@NonNull View page, float position) {
        float distance = Math.min(Math.abs(position), 1f);
        float scale = 1f - (1f - MIN_SCALE) * distance;
        page.setScaleX(scale);
        page.setScaleY(scale);
    }
}