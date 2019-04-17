package com.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    private EditText etURL;
    private Button btnOpen;
    private WebView webOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etURL = findViewById(R.id.etURL);
        btnOpen = findViewById(R.id.btnOpen);
        webOutput = findViewById(R.id.webOutput);
        WebSettings webSettings = webOutput.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webOutput.setWebViewClient(new WebViewClient());




        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etURL.getText().toString();
                webOutput.loadUrl("https://" + url);

            }
        });
    }


}
