package com.nexus.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView statusText;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusText = findViewById(R.id.statusText);

        // Sistema de Sinalizacao
        Button btnSystem1 = findViewById(R.id.btnSystem1);
        Button btnSystem2 = findViewById(R.id.btnSystem2);
        Button btnSystem3 = findViewById(R.id.btnSystem3);
        Button btnReset = findViewById(R.id.btnReset);

        btnSystem1.setOnClickListener(v -> activateSystem(1, "Sistema 1: ATIVO"));
        btnSystem2.setOnClickListener(v -> activateSystem(2, "Sistema 2: ONLINE"));
        btnSystem3.setOnClickListener(v -> activateSystem(3, "Sistema 3: PROCESSANDO"));
        btnReset.setOnClickListener(v -> resetSystems());
    }

    private void activateSystem(int system, String message) {
        clickCount++;
        statusText.setText(message + "\nCliques: " + clickCount);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void resetSystems() {
        clickCount = 0;
        statusText.setText("Sistema Resetado");
        Toast.makeText(this, "Todos os sistemas foram resetados", Toast.LENGTH_SHORT).show();
    }
}