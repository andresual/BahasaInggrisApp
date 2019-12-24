package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class SPFTActivity extends AppCompatActivity {

    WebView wvSpft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spft);

        wvSpft = findViewById(R.id.wv_spft);

        wvSpft = new WebView(this);
        wvSpft.loadUrl("file:///android_asset/SPFT.html");
        wvSpft.setWebChromeClient(new WebChromeClient());
        wvSpft.clearCache(true);
        wvSpft.getSettings().setAppCacheEnabled(false);
        wvSpft.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvSpft);
    }
}
