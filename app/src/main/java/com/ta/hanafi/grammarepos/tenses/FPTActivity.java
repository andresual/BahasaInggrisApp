package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class FPTActivity extends AppCompatActivity {

    WebView wvFpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpt);

        wvFpt = findViewById(R.id.wv_fpt);

        wvFpt = new WebView(this);
        wvFpt.loadUrl("file:///android_asset/FPT.html");
        wvFpt.setWebChromeClient(new WebChromeClient());
        wvFpt.clearCache(true);
        wvFpt.getSettings().setAppCacheEnabled(false);
        wvFpt.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvFpt);
    }
}
