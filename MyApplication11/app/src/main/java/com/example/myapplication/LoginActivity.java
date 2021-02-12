package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button loginButton, signinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.initializeView();
        this.SetListner();

    }

    public void initializeView(){
        loginButton = (Button) findViewById(R.id.loginButton) ;
        signinButton = (Button) findViewById(R.id.signinButton) ;
    }
    public void SetListner(){
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Connect DB and Send Query(id, pw)
                System.out.println("s");
            }
        }) ;
        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Move to "Singin Page"
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }) ;
    }

}
