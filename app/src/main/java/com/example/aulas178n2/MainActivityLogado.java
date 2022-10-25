package com.example.aulas178n2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivityLogado extends AppCompatActivity {

    Button btlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_logado);

        btlogout = findViewById(R.id.buttonLogout);

        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();

                Toast.makeText(MainActivityLogado.this, "Logout", Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivityLogado.this, MainActivity.class));
            }
        });

    }
}