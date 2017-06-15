package com.thirdspare.android.ckcyberpackapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class TBAFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_tba, parentViewGroup, false);
        WebView mWebView;
        mWebView = (WebView)view.findViewById(R.id.wbvTBA);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



        // mWebView = (WebView)findViewById(R.id.wbvTest);
        mWebView.setWebViewClient(new WebViewClient());
        // mWebView.loadUrl("http://www.thirdspare.com");
        mWebView.loadUrl("https://www.thebluealliance.com/");
        return view;

    }
}
