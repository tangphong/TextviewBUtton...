package com.example.tangphong_pc.bai3coder;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private  final  String TAG=getClass().getSimpleName();
        private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_login);
      // btnlogin= (Button) findViewById(R.id.btnlogin);
      //  btnlogin.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View v) {
        //        Intent intent = new Intent(MainActivity.this,DialogActivity.class);
        //        startActivity(intent);
        //    }
     //   });
    }

    @Override
    protected void onStart() {
        super.onStart();
     Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

}
