package com.example.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Compact1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_compact_1);

        // 버튼 클릭 시 Compact2Activity로 이동
        findViewById(R.id.dollar_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compact1Activity.this, Compact2Activity.class);
                startActivity(intent);
            }
        });
    }
}
