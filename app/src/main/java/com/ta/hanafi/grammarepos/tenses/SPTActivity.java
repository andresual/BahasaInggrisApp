package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class SPTActivity extends AppCompatActivity {

    WebView wvSpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spt);

        wvSpt = findViewById(R.id.wv_spt);

        wvSpt = new WebView(this);
        wvSpt.loadUrl("file:///android_asset/SPT.html");
        wvSpt.setWebChromeClient(new WebChromeClient());
        wvSpt.clearCache(true);
        wvSpt.getSettings().setAppCacheEnabled(false);
        wvSpt.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvSpt);
    }
}
