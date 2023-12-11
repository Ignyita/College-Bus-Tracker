package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class driverl extends AppCompatActivity {

    Button b1;
    EditText ph, pass;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_driverlogin);
        b1 = findViewById(R.id.button);
        ph = findViewById(R.id.phone);
        pass = findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Phone;
                String Password;
                Phone = ph.getText().toString();
                Password = pass.getText().toString();
                Intent next = getIntent();
                if (TextUtils.isEmpty(Phone)) {
                    Toast.makeText(driverl.this, "Enter the email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(Password)) {
                    Toast.makeText(driverl.this, "Enter the password", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });
    }
}
