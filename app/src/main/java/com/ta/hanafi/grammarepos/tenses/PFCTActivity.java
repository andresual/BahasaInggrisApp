package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class PFCTActivity extends AppCompatActivity {

    WebView wvPfct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfct);

        wvPfct = findViewById(R.id.wv_pfct);

        wvPfct = new WebView(this);
        wvPfct.loadUrl("file:///android_asset/PFCT.html");
        wvPfct.setWebChromeClient(new WebChromeClient());
        wvPfct.clearCache(true);
        wvPfct.getSettings().setAppCacheEnabled(false);
        wvPfct.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvPfct);
    }
}
