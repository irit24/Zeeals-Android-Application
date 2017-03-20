package com.zeeals.zeeals.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.zeeals.zeeals.MainActivity;
import com.zeeals.zeeals.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  14/03/17.
 */


public class NextActivity extends AppCompatActivity {
    @BindView(R.id.btn_next)
    Button button;

    @OnClick(R.id.btn_next)
    public void ButtonClick() {
        Intent a = new Intent(getApplicationContext(), WelcomeActivity.class);
        startActivity(a);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        ButterKnife.bind(this);

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
