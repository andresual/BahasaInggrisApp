package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class SFTActivity extends AppCompatActivity {

    WebView wvSft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sft);

        wvSft = findViewById(R.id.wv_sft);

        wvSft = new WebView(this);
        wvSft.loadUrl("file:///android_asset/SFT.html");
        wvSft.setWebChromeClient(new WebChromeClient());
        wvSft.clearCache(true);
        wvSft.getSettings().setAppCacheEnabled(false);
        wvSft.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvSft);
    }
}
