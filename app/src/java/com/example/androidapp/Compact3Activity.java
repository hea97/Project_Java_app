package com.example.androidapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Compact3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_compact_3);

        // 화면 내 텍스트 업데이트
        TextView exchangeInfo = findViewById(R.id.exchange_info);
        updateExchangeRate(exchangeInfo);
    }

    private void updateExchangeRate(TextView exchangeInfo) {
        // 예제 API 데이터를 불러오는 코드
        String exchangeRate = "1 USD = 7.12 CNY";
        exchangeInfo.setText(exchangeRate);
    }
}
