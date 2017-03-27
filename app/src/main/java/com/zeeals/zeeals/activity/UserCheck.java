package com.zeeals.zeeals.activity;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  16/03/17.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zeeals.zeeals.R;

import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class UserCheck extends AppCompatActivity {
    EditText et_web;
    Button btn_next;


    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name_Web = "nameKey";

    SharedPreferences sharedpreferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_check);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        ButterKnife.bind(this);
        et_web=(EditText)findViewById(R.id.et_website);

        btn_next=(Button)findViewById(R.id.btn_next);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

 btn_next.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {

         String Web = et_web.getText().toString();
         SharedPreferences.Editor editor = sharedpreferences.edit();

         editor.putString(Name_Web, Web);
         editor.commit();
editor.apply();

         Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

         intent.putExtra(Name_Web, Web);
         sharedpreferences.edit().putString("nameKey",Web).apply();

         startActivity(intent);


     }
 });


    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


}
