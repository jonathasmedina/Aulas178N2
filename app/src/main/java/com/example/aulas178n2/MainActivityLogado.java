package com.example.aulas178n2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivityLogado extends AppCompatActivity {

    Button btlogout, btSalva;
    String nome, email;
    EditText nomeEd, emailEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_logado);

        btlogout = findViewById(R.id.buttonLogout);
        btSalva  = findViewById(R.id.buttonSalva);
        nomeEd  = findViewById(R.id.editSalvaNome);
        emailEd  = findViewById(R.id.editSalvaEmail);

        btSalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome = nomeEd.getText().toString();
                email = emailEd.getText().toString();

            }
        });

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