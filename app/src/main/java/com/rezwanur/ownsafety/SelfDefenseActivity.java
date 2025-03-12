package com.rezwanur.ownsafety;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SelfDefenseActivity extends AppCompatActivity {

    WebView webView1;
    WebView webView2;
    WebView webView3;
    WebView webView4;
    WebView webView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_defense);

        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(SelfDefenseActivity.this, MainActivity.class));
            SelfDefenseActivity.this.finish();
        });

        webView1 = findViewById(R.id.webView1);

        webView1.setWebChromeClient(new WebChromeClient());
        webView1.getSettings().setLoadsImagesAutomatically(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("https://www.youtube.com/embed/T7aNSRoDCmg");

        webView2 = findViewById(R.id.webView2);

        webView2.setWebChromeClient(new WebChromeClient());
        webView2.getSettings().setLoadsImagesAutomatically(true);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("https://www.youtube.com/embed/k9Jn0eP-ZVg");

        webView3 = findViewById(R.id.webView3);

        webView3.setWebChromeClient(new WebChromeClient());
        webView3.getSettings().setLoadsImagesAutomatically(true);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.loadUrl("https://www.youtube.com/embed/Ww1DeUSC94o");

        webView4 = findViewById(R.id.webView4);

        webView4.setWebChromeClient(new WebChromeClient());
        webView4.getSettings().setLoadsImagesAutomatically(true);
        webView4.getSettings().setJavaScriptEnabled(true);
        webView4.loadUrl("https://www.youtube.com/embed/CH7DvnTNLuI");

        webView5 = findViewById(R.id.webView5);

        webView5.setWebChromeClient(new WebChromeClient());
        webView5.getSettings().setLoadsImagesAutomatically(true);
        webView5.getSettings().setJavaScriptEnabled(true);
        webView5.loadUrl("https://www.youtube.com/embed/lHIqBqBt4iE");

    }
}