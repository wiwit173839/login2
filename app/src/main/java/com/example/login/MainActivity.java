package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.helper.Helper;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText txtUsername, txtPassword;
    Button btnlogin;
    TextView tvDaftar;
   String username = "12345";
   String password = "admin";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnlogin = findViewById(R.id.btnlogin);
        tvDaftar = findViewById(R.id.tvDaftar);

        btnlogin.setOnClickListener(view -> {
            String user =  txtUsername.getText().toString();
            String password = txtPassword.getText().toString();

            if ((user.equals(username)) && (password.equals(password))){

                Helper.setUsername(user);
                startActivity(new Intent(this, Dashboard.class));
            }

        });

    }
}