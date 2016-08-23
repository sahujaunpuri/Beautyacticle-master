package com.nicodelee.beautyarticle.ui;

import android.os.Bundle;
import android.os.Handler;

import com.nicodelee.beautyarticle.R;

public class WelcomeAct extends BaseAct {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_welcome);
        initView();
    }
    private void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                skipIntent(MainAct.class,true);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }

        }, 300);
    }

}
