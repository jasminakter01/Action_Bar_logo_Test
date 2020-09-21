package com.example.action_bar_logo_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextpage(View view) {
        Intent intent=new Intent(MainActivity.this,Action_bar_Adding.class);
        startActivity(intent);
    }

    public void nextpage2(View view) {
        Intent intent=new Intent(MainActivity.this,Full_Screen_Test.class);
  startActivity(intent);
    }
}
