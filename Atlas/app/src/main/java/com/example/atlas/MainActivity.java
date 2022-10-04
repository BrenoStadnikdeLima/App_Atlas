package com.example.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imbuton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imbuton = findViewById(R.id.Play);
        imbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Cadastro.class);
                startActivity(intent);

            }
        });

        imbuton = findViewById(R.id.linha);
        imbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,recuperar_senha.class);
            startActivity(intent);

            }
        });

        imbuton = findViewById(R.id.lnbranca);
        imbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,recuperar_senha.class);
                startActivity(intent);
            }
        });
    }
}