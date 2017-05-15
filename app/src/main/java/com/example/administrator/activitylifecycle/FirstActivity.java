package com.example.administrator.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {
    static final String TAG = "TEST";
    Button btnNext,btnThird,btnCycle;

    //创建Activity时调用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.e(TAG, "FirstActivity=====onCreate");

        btnNext = (Button)findViewById(R.id.btn_next);
        btnThird = (Button)findViewById(R.id.btn_next_third);
        btnCycle = (Button)findViewById(R.id.btn_cycle);

        btnCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        //点击按钮进入下一个SecondActivity
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    //销毁Activity时调用
    @Override
    protected void onDestroy() {
        Log.e(TAG, "FirstActivity=====onDestroy");
        super.onDestroy();
    }

    //启动Activity时调用
    @Override
    protected void onStart() {
        Log.e(TAG, "FirstActivity=====onStart");
        super.onStart();
    }

    //停止Activity时调用
    @Override
    protected void onStop() {
        Log.e(TAG, "FirstActivity=====onStop");
        super.onStop();
    }

    //Activity被重新启动时调用
    @Override
    protected void onRestart() {
        Log.e(TAG, "FirstActivity=====onRestart");
        super.onRestart();
    }

    //获取Activity的焦点
    @Override
    protected void onResume() {
        Log.e(TAG, "FirstActivity=====onResume");
        super.onResume();
    }

    //暂停Activity，失去焦点
    @Override
    protected void onPause() {
        Log.e(TAG, "FirstActivity=====onPause");
        super.onPause();
    }

    //在此方法中打印是否调用这个方法的日志
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "FirstActivity=====OnNewIntent");
    }

}
