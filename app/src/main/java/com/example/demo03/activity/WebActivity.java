package com.example.demo03.activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.example.tabhostdemo.R;

public class WebActivity  extends FragmentActivity {


    Button button = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        String url = "https://www.baidu.com/";
        WebView webView = (WebView) findViewById(R.id.web_view);
        button = (Button) findViewById(R.id.webButton);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebActivity.this.finish();
            }
        });
    }

}
