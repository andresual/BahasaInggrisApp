package com.ta.hanafi.grammarepos.grammar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class VerbActivity extends AppCompatActivity {

    WebView wvVerb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verb);

        wvVerb = findViewById(R.id.wv_noun);

        wvVerb = new WebView(this);
        wvVerb.loadUrl("file:///android_asset/verb.html");
        wvVerb.setWebChromeClient(new WebChromeClient());
        wvVerb.clearCache(true);
        wvVerb.getSettings().setAppCacheEnabled(false);
        wvVerb.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvVerb);
    }
}
