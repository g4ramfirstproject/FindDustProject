package com.example.ju.finddustproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EachCityDustInfo extends AppCompatActivity {

    TextView valueDetailCityNameTextView, valueDetailCityFineDustValue,valueDetailCityUltraFineDustValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_city_dust_info);
        GetInfoFromApi.AreaInfoRetrofit dustInfo = (GetInfoFromApi.AreaInfoRetrofit) getIntent().getSerializableExtra("dustInfo");
        valueDetailCityNameTextView = findViewById(R.id.valueDetailCityNameTextView);
        valueDetailCityNameTextView.setText(dustInfo.getCityName());
        valueDetailCityUltraFineDustValue = findViewById(R.id.valueDetailCityUltraFineDustValue);
        valueDetailCityUltraFineDustValue.setText(dustInfo.getPm10Value());
        valueDetailCityFineDustValue = findViewById(R.id.valueDetailCityFineDustValue);
        valueDetailCityFineDustValue.setText(dustInfo.getPm25Value());
    }
}
