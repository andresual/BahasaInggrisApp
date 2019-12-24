package com.ta.hanafi.grammarepos.grammar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class AdjectiveActivity extends AppCompatActivity {

    WebView wvAdj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjective);

        wvAdj = findViewById(R.id.wv_adj);

        wvAdj = new WebView(this);
        wvAdj.loadUrl("file:///android_asset/adj.html");
        wvAdj.setWebChromeClient(new WebChromeClient());
        wvAdj.clearCache(true);
        wvAdj.getSettings().setAppCacheEnabled(false);
        wvAdj.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvAdj);
    }
}
