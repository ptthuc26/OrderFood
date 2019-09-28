package com.example.oderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edUser, edPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        edUser = findViewById(R.id.edUser);
        edPass = findViewById(R.id.edPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OderFood.class);
                if(edUser.getText().toString().equals("admin") && edPass.getText().toString().equals("admin")){
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getBaseContext(),"Incorrect account",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
