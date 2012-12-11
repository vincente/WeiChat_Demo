package com.example.weichat.UI;

import com.example.weichat.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeA extends Activity {
	
	private Handler handler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strat);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				Intent intent = new Intent(WelcomeA.this, WhatsnewPagesA.class);
				startActivity(intent);
				WelcomeA.this.finish();
			}
		}, 2000);
    }
}
