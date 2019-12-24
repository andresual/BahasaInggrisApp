package com.ta.hanafi.grammarepos;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ta.hanafi.grammarepos.grammar.Grammar;
import com.ta.hanafi.grammarepos.tenses.Tenses;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button grammarBtn = (Button) findViewById(R.id.buttonGrammar);
        grammarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Btn1 = new Intent(getApplicationContext(), Grammar.class);
                MainActivity.this.finish();
                startActivity(Btn1);
            }
        });

        final Button tensesBtn = (Button) findViewById(R.id.buttonTenses);
        tensesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Btn1 = new Intent(getApplicationContext(), Tenses.class);
                MainActivity.this.finish();
                startActivity(Btn1);
            }
        });

        final Button soalBtn = (Button) findViewById(R.id.buttonSoal);
        soalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Btn1 = new Intent(getApplicationContext(), Soal.class);
                MainActivity.this.finish();
                startActivity(Btn1);
            }
        });

        final Button tentangBtn = (Button) findViewById(R.id.buttonTentang);
        tentangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Btn1 = new Intent(getApplicationContext(), Tentang.class);
                MainActivity.this.finish();
                startActivity(Btn1);
            }
        });
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan tombol kembali dua kali untuk keluar", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
