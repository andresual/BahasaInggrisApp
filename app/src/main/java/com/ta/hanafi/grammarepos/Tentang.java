package com.ta.hanafi.grammarepos;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);
    }

    @Override
    public void onBackPressed() {
        Intent Btn1 = new Intent(getApplicationContext(), MainActivity.class);
        Tentang.this.finish();
        startActivity(Btn1);
    }
}
