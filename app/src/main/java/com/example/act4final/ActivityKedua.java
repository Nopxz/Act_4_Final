package com.example.act4final;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txEmail =findViewById(R.id.tvEmail);
        txPassword =findViewById(R.id.tvPassword);

        Bundle bundle =getIntent().getExtras();

        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}

