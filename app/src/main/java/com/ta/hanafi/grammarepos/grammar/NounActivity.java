package com.ta.hanafi.grammarepos.grammar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class NounActivity extends AppCompatActivity {

    private WebView wvNoun;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun);

        wvNoun = findViewById(R.id.wv_noun);

        wvNoun = new WebView(this);
        wvNoun.loadUrl("file:///android_asset/noun.html");
        wvNoun.setWebChromeClient(new WebChromeClient());
        wvNoun.clearCache(true);
        wvNoun.getSettings().setAppCacheEnabled(false);
        wvNoun.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvNoun);
    }
}
