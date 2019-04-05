package com.example.bspi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("http://bspi.gov.bd");

    }
}
