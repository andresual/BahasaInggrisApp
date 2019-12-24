package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class FCTActivity extends AppCompatActivity {

    WebView wvFct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fct);

        wvFct = findViewById(R.id.wv_fct);

        wvFct = new WebView(this);
        wvFct.loadUrl("file:///android_asset/FCT.html");
        wvFct.setWebChromeClient(new WebChromeClient());
        wvFct.clearCache(true);
        wvFct.getSettings().setAppCacheEnabled(false);
        wvFct.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvFct);
    }
}
