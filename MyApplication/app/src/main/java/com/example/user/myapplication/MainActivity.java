package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate, hashCode=" + this.hashCode());
    }

    public void openSecond(View view) {
//        Intent intent = getIntent();
        Intent intent =  new Intent(this, SecondActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//        Log.i("MainActivity", "openSecond, " + intent.hashCode());
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop, hashCode=" + this.hashCode());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy, hashCode=" + this.hashCode());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause, hashCode=" + this.hashCode());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume, hashCode=" + this.hashCode());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart, hashCode=" + this.hashCode());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart, hashCode=" + this.hashCode());
    }

}
