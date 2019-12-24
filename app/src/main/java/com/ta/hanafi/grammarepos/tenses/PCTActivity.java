package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class PCTActivity extends AppCompatActivity {

    WebView wvPct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct);

        wvPct = findViewById(R.id.wv_pct);

        wvPct = new WebView(this);
        wvPct.loadUrl("file:///android_asset/PastCT.html");
        wvPct.setWebChromeClient(new WebChromeClient());
        wvPct.clearCache(true);
        wvPct.getSettings().setAppCacheEnabled(false);
        wvPct.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvPct);
    }
}
