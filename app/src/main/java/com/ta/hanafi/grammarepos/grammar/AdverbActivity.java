package com.ta.hanafi.grammarepos.grammar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class AdverbActivity extends AppCompatActivity {

    WebView wvAdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverb);

        wvAdv = findViewById(R.id.wv_noun);

        wvAdv = new WebView(this);
        wvAdv.loadUrl("file:///android_asset/adv.html");
        wvAdv.setWebChromeClient(new WebChromeClient());
        wvAdv.clearCache(true);
        wvAdv.getSettings().setAppCacheEnabled(false);
        wvAdv.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvAdv);
    }
}
