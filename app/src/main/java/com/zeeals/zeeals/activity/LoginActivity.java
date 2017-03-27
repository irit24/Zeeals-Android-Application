package com.zeeals.zeeals.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.zeeals.zeeals.MainActivity;
import com.zeeals.zeeals.R;
import com.zeeals.zeeals.utils.PrefManager;

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

public class LoginActivity extends AppCompatActivity {
    private UserCheck prefManager;

    @BindView(R.id.et_name)
    EditText etuser;
    @BindView(R.id.et_pass)
    EditText etpass;

@BindView(R.id.btn_login)
    Button btnlogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        ButterKnife.bind(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(a);

            }
        });

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    }

