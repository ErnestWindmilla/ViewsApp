package com.example.viewsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.splash_activity );

        // Hacer la transición al MainActivity después de 2 seg.
        new Handler().postDelayed (new Runnable() {
            @Override
            public void run () {
                // Crear el Intent para llamar a MainActivity
                Intent intent = new Intent ( SplashActivity.this, MainActivity.class );
                startActivity ( intent );
                finish ();
            }
        }, 2000 );

    }
}
