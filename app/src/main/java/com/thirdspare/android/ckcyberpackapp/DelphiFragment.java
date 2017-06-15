package com.thirdspare.android.ckcyberpackapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class DelphiFragment extends Fragment {

    public static DelphiFragment newInstance() {
        DelphiFragment fragment = new DelphiFragment();
        return fragment;
    }
    private WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_delphi, parentViewGroup, false);
        //WebView mWebView;
        mWebView = (WebView)view.findViewById(R.id.wbvCD);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



        // mWebView = (WebView)findViewById(R.id.wbvTest);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("http://www.thirdspare.com");

        return view;



    }
    public boolean canGoBack() {
        return this.mWebView != null && this.mWebView.canGoBack();
    }

    public void goBack() {
        if(this.mWebView != null) {
            this.mWebView.goBack();
        }
    }
}
