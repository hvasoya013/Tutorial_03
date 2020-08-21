package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pswd;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = findViewById(R.id.edtUsername);
        pswd = findViewById(R.id.edtPassword);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if (uname.getText().toString().equals("admin") && pswd.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Login succesfully", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter correct credentials..", Toast.LENGTH_SHORT).show();
                }
            };

    });
};
}