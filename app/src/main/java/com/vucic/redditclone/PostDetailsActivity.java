package com.vucic.redditclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class PostDetailsActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);

        webView = findViewById(R.id.webView);
        View loadingProgressBar = findViewById(R.id.loadingProgressBar);
        Intent intent = getIntent();
        if (intent != null) {
            String postUrl = intent.getStringExtra(Constants.POST_URL);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient() {

                public void onPageFinished(WebView view, String url) {
                    loadingProgressBar.setVisibility(View.GONE);
                }
            });
            webView.loadUrl(postUrl);
        }
    }
}