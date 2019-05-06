package com.example.ju.finddustproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ju.finddustproject.Item.Documents;
import com.example.ju.finddustproject.Item.TM;
import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.Latitude)
    TextView mlatitude;
    @BindView(R.id.Longitude)
    TextView Longitude;
    @BindView(R.id.Lookup)
    Button mlookup;

    private PermissionRequest permissionRequest;

    private CurrentLocation mlocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //권한 요청
        permissionRequest = new PermissionRequest(this);
        permissionRequest.locationAccess();

        mlocation = new CurrentLocation(this);

        mlookup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mlocation.tmLookup();
            }
        });


    }




}
