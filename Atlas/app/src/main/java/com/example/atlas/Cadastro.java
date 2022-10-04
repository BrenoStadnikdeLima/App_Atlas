package com.example.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cadastro extends AppCompatActivity {
    private ImageButton imbuton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        imbuton = findViewById(R.id.bklogin);
        imbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imbuton = findViewById(R.id.plcada);
        imbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this,Home.class);
                startActivity(intent);
            }
        });
    }
}