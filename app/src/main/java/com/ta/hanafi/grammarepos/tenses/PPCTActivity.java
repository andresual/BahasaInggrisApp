package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class PPCTActivity extends AppCompatActivity {

    WebView wvPpct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppct);

        wvPpct = findViewById(R.id.wv_ppct);

        wvPpct = new WebView(this);
        wvPpct.loadUrl("file:///android_asset/PastPerfectCT.html");
        wvPpct.setWebChromeClient(new WebChromeClient());
        wvPpct.clearCache(true);
        wvPpct.getSettings().setAppCacheEnabled(false);
        wvPpct.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvPpct);
    }
}
