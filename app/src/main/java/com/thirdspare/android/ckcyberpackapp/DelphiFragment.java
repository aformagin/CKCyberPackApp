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

   // public static DelphiFragment newInstance() {
      //  DelphiFragment fragment = new DelphiFragment();
      //  return fragment;
    //}
    static WebView mWebView;
    private View mContentView
private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:{
                    webViewGoBack();
                }break;
            }
        }
    };
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        
        
        
        mContentVIew  = inflater.inflate(R.layout.frag_delphi, null);
        //inflater.inflate(R.layout.frag_delphi, parentViewGroup, false);
        mWebView = (WebView)view.findViewById(R.id.wbvCD);
        
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



        // mWebView = (WebView)findViewById(R.id.wbvTest);
        mWebView.setWebViewClient(new WebViewClient());
       mWebView.loadUrl("http://www.thirdspare.com");
       mWeb.setOnKeyListener(new OnKeyListener(){

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK 
                        && event.getAction() == MotionEvent.ACTION_UP 
                        && mWeb.canGoBack()) {
                    handler.sendEmptyMessage(1);
                    return true;
                }

                return false;
            }

        });



    }
    
        private void webViewGoBack(){
        mWeb.goBack();
    }
    
  //  public boolean canGoBack() {
      //  return this.mWebView != null && this.mWebView.canGoBack();
  //  }

   // public void goBack() {
    //    if(this.mWebView != null) {
    //        this.mWebView.goBack();
    //    }
   // }
}

