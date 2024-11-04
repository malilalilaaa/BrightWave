package com.example.brightwave;

import static com.example.brightwave.R.id.SignText2;
import static com.example.brightwave.R.id.SignupButton;
import static com.example.brightwave.R.id.SignupText1;
import static com.example.brightwave.R.id.SignupText3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText getEmail;

    EditText getUsername;

    EditText getPassword;
    Button loginButton;
    Button signupButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.loginText1);
        password = findViewById(R.id.loginText2);
        loginButton = findViewById(R.id.loginButton);
        getEmail = findViewById(R.id.SignupText1);
        getUsername = findViewById(R.id.SignupText2);
        getPassword = findViewById(R.id.SignupText3);
        signupButton = findViewById(R.id.SignupButton);


        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(username.getText().toString().trim().equals("Mahiya") && password.getText().toString().trim().equals("ayman")){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getEmail.getText().toString().trim().equals("c223309@ugrad.iiuc.ac.bd") && getUsername.getText().toString().trim().equals("Shafwat Mahiya") && getPassword.getText().toString().trim().equals("ayman")){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}