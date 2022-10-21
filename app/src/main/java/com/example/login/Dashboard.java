package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.helper.Helper;

public class Dashboard extends AppCompatActivity {
    TextView tvUsername;
    ImageButton txtimg


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tvUsername = findViewById(R.id.tvUsername);
        tvUsername.setText(Helper.getUsername());
    }
}