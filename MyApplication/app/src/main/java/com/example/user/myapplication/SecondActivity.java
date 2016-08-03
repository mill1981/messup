package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("SecondActivity", "onCreate, hashCode=" + this.hashCode());
    }

    public void openFirstActivity(View view) {
//        Intent intent = getIntent();
        Intent intent = new Intent(this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //刪掉原本的Activity,再產生一個新的
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); //將現存的Activity的順序調整，不刪除
//        Log.i("SecondActivity", "openFirstActivity, intent.hashCode=" + intent.hashCode());
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SecondActivity", "onStart, hashCode=" + this.hashCode());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecondActivity", "onStop, hashCode=" + this.hashCode());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("SecondActivity", "onRestart, hashCode=" + this.hashCode());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SecondActivity", "onResume, hashCode=" + this.hashCode());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SecondActivity", "onPause, hashCode=" + this.hashCode());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity", "onDestroy, hashCode=" + this.hashCode());
    }
}
