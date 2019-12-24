package com.ta.hanafi.grammarepos.tenses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ta.hanafi.grammarepos.R;

public class PFPCActivity extends AppCompatActivity {

    WebView wvPfpc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfpc);

        wvPfpc = findViewById(R.id.wv_pfpc);

        wvPfpc = new WebView(this);
        wvPfpc.loadUrl("file:///android_asset/PFPCT.html");
        wvPfpc.setWebChromeClient(new WebChromeClient());
        wvPfpc.clearCache(true);
        wvPfpc.getSettings().setAppCacheEnabled(false);
        wvPfpc.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        setContentView(wvPfpc);
    }
}
