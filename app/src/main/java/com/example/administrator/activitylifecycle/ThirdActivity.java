package com.example.administrator.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/5/15.
 */

public class ThirdActivity extends Activity {
    static final String TAG = "TEST";
    Button btnComplete,btnPrevious,btnCycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e(TAG, "ThirdActivity=====onCreate");

        btnComplete = (Button)findViewById(R.id.btn_third);
        btnPrevious = (Button)findViewById(R.id.btn_third_previous);
        btnCycle = (Button)findViewById(R.id.btn_cycle);

        btnCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    //销毁Activity时调用
    @Override
    protected void onDestroy() {
        Log.e(TAG, "ThirdActivity=====onDestroy");
        super.onDestroy();
    }

    //启动Activity时调用
    @Override
    protected void onStart() {
        Log.e(TAG, "ThirdActivity=====onStart");
        super.onStart();
    }

    //停止Activity时调用
    @Override
    protected void onStop() {
        Log.e(TAG, "ThirdActivity=====onStop");
        super.onStop();
    }

    //Activity被重新启动时调用
    @Override
    protected void onRestart() {
        Log.e(TAG, "ThirdActivity=====onRestart");
        super.onRestart();
    }

    //获取Activity的焦点
    @Override
    protected void onResume() {
        Log.e(TAG, "ThirdActivity=====onResume");
        super.onResume();
    }

    //暂停Activity，失去焦点
    @Override
    protected void onPause() {
        Log.e(TAG, "ThirdActivity=====onPause");
        super.onPause();
    }

    //在此方法中打印是否调用这个方法的日志
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "ThirdActivity=====OnNewIntent");
    }
}
