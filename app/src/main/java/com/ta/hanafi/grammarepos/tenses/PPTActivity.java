package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class PPTActivity extends AppCompatActivity {

    WebView wvPpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);

        wvPpt = findViewById(R.id.wv_ppt);

        wvPpt = new WebView(this);
        wvPpt.loadUrl("file:///android_asset/PastPT.html");
        wvPpt.setWebChromeClient(new WebChromeClient());
        wvPpt.clearCache(true);
        wvPpt.getSettings().setAppCacheEnabled(false);
        wvPpt.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvPpt);
    }
}
