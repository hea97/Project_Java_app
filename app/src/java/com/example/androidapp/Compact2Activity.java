package com.example.androidapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Compact2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_compact_2);

        // 환율 정보 업데이트 로직 추가
        TextView exchangeRateInfo = findViewById(R.id.exchange_rate_info);
        updateExchangeRate(exchangeRateInfo);
    }

    private void updateExchangeRate(TextView exchangeRateTextView) {
        // API를 호출해 환율 데이터를 가져오는 코드
        // 예시 데이터 (실제 API 연동 필요)
        String exchangeRate = "1 USD = 1,200 KRW";
        exchangeRateTextView.setText(exchangeRate);
    }
}
