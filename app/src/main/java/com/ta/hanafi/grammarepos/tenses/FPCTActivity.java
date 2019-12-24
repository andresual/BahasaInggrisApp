package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class FPCTActivity extends AppCompatActivity {

    WebView wvFpct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpct);

        wvFpct = findViewById(R.id.wv_fpct);

        wvFpct = new WebView(this);
        wvFpct.loadUrl("file:///android_asset/FPCT.html");
        wvFpct.setWebChromeClient(new WebChromeClient());
        wvFpct.clearCache(true);
        wvFpct.getSettings().setAppCacheEnabled(false);
        wvFpct.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvFpct);
    }
}
