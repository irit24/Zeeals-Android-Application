package com.zeeals.zeeals.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.zeeals.zeeals.MainActivity;
import com.zeeals.zeeals.R;
import com.zeeals.zeeals.utils.Constant;


/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  08/03/17.
 */

public class SplashActivity extends Activity {
    private SharedPreferences pref;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    /**
     * Called when the activity is first created.
     */
    Thread splashTread;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        pref = getPreferences(0);

        StartAnimations();
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        anim.reset();
        RelativeLayout l = (RelativeLayout) findViewById(R.id.splash);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.image);
        iv.setImageResource(R.drawable.ic_logo);
        iv.clearAnimation();
        iv.startAnimation(anim);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 2000) {
                        sleep(100);
                        waited += 100;
                    }

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
//                    Intent intent = null;
//                    if (pref.getBoolean(Constant.IS_LOGGED_IN, true)) {
//
//                        intent = new Intent(SplashActivity.this,
//                                MainActivity.class);
//                    } else if (pref.getBoolean(Constant.IS_LOGGED_IN, true)) {
//                        intent = new Intent(SplashActivity.this,
//                                Login.class);
//



                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    SplashActivity.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    SplashActivity.this.finish();
                }

            }
        };
        splashTread.start();

    }

}

