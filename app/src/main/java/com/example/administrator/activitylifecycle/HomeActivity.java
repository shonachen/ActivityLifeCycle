package com.example.administrator.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/5/15.
 */

public class HomeActivity extends Activity {
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnNext = (Button)findViewById(R.id.btn_next);

        //点击按钮进入下一个SecondActivity
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
