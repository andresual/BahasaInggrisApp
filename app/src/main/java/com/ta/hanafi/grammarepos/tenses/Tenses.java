package com.ta.hanafi.grammarepos.tenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.ta.hanafi.grammarepos.MainActivity;
import com.ta.hanafi.grammarepos.R;

public class Tenses extends AppCompatActivity {

    private ImageButton btnSpt;
    private ImageButton btnPct;
    private ImageButton btnPpt;
    private ImageButton btnPpct;
    private ImageButton btnSpastt;
    private ImageButton btnPastct;
    private ImageButton btnPastpt;
    private ImageButton btnPastpct;
    private ImageButton btnSft;
    private ImageButton btnFct;
    private ImageButton btnFpt;
    private ImageButton btnFpct;
    private ImageButton btnSpft;
    private ImageButton btnPfct;
    private ImageButton btnPfpt;
    private ImageButton btnPfpc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tenses);
        initView();

        btnSpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, SimplePresentTenseActivity.class);
                startActivity(intent);
            }
        });

        btnPct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PCTActivity.class);
                startActivity(intent);
            }
        });

        btnPpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PPTActivity.class);
                startActivity(intent);
            }
        });

        btnPpct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PPCTActivity.class);
                startActivity(intent);
            }
        });

        //4 data blm
        btnSpastt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, SPTActivity.class);
                startActivity(intent);
            }
        });

        btnPastct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PCTActivity.class);
                startActivity(intent);
            }
        });

        btnPastpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PPTActivity.class);
                startActivity(intent);
            }
        });

        btnPastpct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PPCTActivity.class);
                startActivity(intent);
            }
        });

        btnSft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, SFTActivity.class);
                startActivity(intent);
            }
        });

        btnFct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, FCTActivity.class);
                startActivity(intent);
            }
        });

        btnFpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, FPTActivity.class);
                startActivity(intent);
            }
        });

        btnFpct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, FPCTActivity.class);
                startActivity(intent);
            }
        });

        btnSpft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, SPFTActivity.class);
                startActivity(intent);
            }
        });

        btnPfct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PFCTActivity.class);
                startActivity(intent);
            }
        });

        btnPfpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PFPTActivity.class);
                startActivity(intent);
            }
        });

        btnPfpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tenses.this, PFPCActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent Btn1 = new Intent(getApplicationContext(), MainActivity.class);
        Tenses.this.finish();
        startActivity(Btn1);
    }

    private void initView() {
        btnSpt = findViewById(R.id.btn_spt);
        btnPct = findViewById(R.id.btn_pct);
        btnPpt = findViewById(R.id.btn_ppt);
        btnPpct = findViewById(R.id.btn_ppct);
        btnSpastt = findViewById(R.id.btn_spastt);
        btnPastct = findViewById(R.id.btn_pastct);
        btnPastpt = findViewById(R.id.btn_pastpt);
        btnPastpct = findViewById(R.id.btn_pastpct);
        btnSft = findViewById(R.id.btn_sft);
        btnFct = findViewById(R.id.btn_fct);
        btnFpt = findViewById(R.id.btn_fpt);
        btnFpct = findViewById(R.id.btn_fpct);
        btnSpft = findViewById(R.id.btn_spft);
        btnPfct = findViewById(R.id.btn_pfct);
        btnPfpt = findViewById(R.id.btn_pfpt);
        btnPfpc = findViewById(R.id.btn_pfpc);
    }
}
