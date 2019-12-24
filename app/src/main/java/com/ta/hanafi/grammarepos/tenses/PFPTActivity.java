package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class PFPTActivity extends AppCompatActivity {

    WebView wvPfpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfpt);
        
        wvPfpt = findViewById(R.id.wv_pfpt);

        wvPfpt = new WebView(this);
        wvPfpt.loadUrl("file:///android_asset/PFPT.html");
        wvPfpt.setWebChromeClient(new WebChromeClient());
        wvPfpt.clearCache(true);
        wvPfpt.getSettings().setAppCacheEnabled(false);
        wvPfpt.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvPfpt);
    }
}
