package com.ta.hanafi.grammarepos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Soal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal);
    }

    @Override
    public void onBackPressed() {
        Intent Btn1 = new Intent(getApplicationContext(), MainActivity.class);
        Soal.this.finish();
        startActivity(Btn1);
    }
}
