package com.nexus.app;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView statusText = findViewById(R.id.statusText);
        Button btnGreen = findViewById(R.id.btnGreen);
        
        btnGreen.setOnClickListener(v -> {
            clickCount++;
            statusText.setText("SISTEMA VERDE ATIVADO! Cliques: " + clickCount);
        });
    }
}