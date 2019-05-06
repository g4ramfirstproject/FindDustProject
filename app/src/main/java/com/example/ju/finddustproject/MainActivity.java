package com.example.ju.finddustproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button SearchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kangraeminInit();
    }
    void kangraeminInit(){
        SearchButton = findViewById(R.id.SearchFineDustBySidoName);
        SearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SidoName.class);
                startActivity(intent);
            }
        });

            //ㅎㅇ
        //윤희중
        //반가워



        //테스트 주석

        
        //윤희중
        //강래민 주석a
        //강래민 대답해

    }
}


