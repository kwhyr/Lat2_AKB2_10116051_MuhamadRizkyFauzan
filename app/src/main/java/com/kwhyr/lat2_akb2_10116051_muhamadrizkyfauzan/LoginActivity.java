package com.kwhyr.lat2_akb2_10116051_muhamadrizkyfauzan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView register = findViewById(R.id.textLoginRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navireg();
            }
        });
    }

    public void navireg() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
