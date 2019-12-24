package com.ta.hanafi.grammarepos.grammar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ta.hanafi.grammarepos.MainActivity;
import com.ta.hanafi.grammarepos.R;

public class Grammar extends AppCompatActivity {

    private Button btnNoun;
    private Button btnVerb;
    private Button btnAdj;
    private Button btnAdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grammar);
        initView();
    }

    @Override
    public void onBackPressed() {
        Intent Btn1 = new Intent(getApplicationContext(), MainActivity.class);
        Grammar.this.finish();
        startActivity(Btn1);
    }

    private void initView() {
        btnNoun = findViewById(R.id.btn_noun);
        btnVerb = findViewById(R.id.btn_verb);
        btnAdj = findViewById(R.id.btn_adj);
        btnAdv = findViewById(R.id.btn_adv);

        btnNoun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grammar.this, NounActivity.class);
                startActivity(intent);
            }
        });

        btnVerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grammar.this, VerbActivity.class);
                startActivity(intent);
            }
        });

        btnAdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grammar.this, AdjectiveActivity.class);
                startActivity(intent);
            }
        });

        btnAdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grammar.this, AdverbActivity.class);
                startActivity(intent);
            }
        });
    }
}
