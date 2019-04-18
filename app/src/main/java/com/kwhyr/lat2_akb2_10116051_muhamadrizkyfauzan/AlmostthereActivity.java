package com.kwhyr.lat2_akb2_10116051_muhamadrizkyfauzan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostthereActivity extends AppCompatActivity {

    /*
    NIM : 10116051
    Nama : Muhamad Rizky Fauzan
    Kelas : IF2/AKB2
    Change Log
        16/04/2019 13:00 PM :
        -Membuat Layout Login, Register, AlmostThere, Verify
        -Membuat Intent antar Login, Register, AlmostThere, Verify

        16/04/2019 14:45 PM :
        -Membuat Layout User

        16/04/2019 19:00 PM :
        -Menambah CircleImageView pada foto user di Layout user

        16/04/2019 19:45 PM :
        -fix layout
        -Menambah ScrollView pada login dan register

        16/04/2019 21:00 PM :
        -fix semua layout
        -menambah text ke String
        -Menambah ScrollView pada user
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almostthere);

        Button verify = findViewById(R.id.btnAlmostVerify);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlmostthereActivity.this, VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}
