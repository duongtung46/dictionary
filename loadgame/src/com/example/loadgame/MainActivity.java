package com.example.loadgame;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	WebView game;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		game = (WebView) findViewById(R.id.webview);
		
		game.getSettings().setJavaScriptEnabled(true);
		game.setWebViewClient(new WebViewClient() {

			   public void onPageFinished(WebView view, String url) {
			        
			    }
			});
		game.loadUrl("http://162.243.66.163/findnumbers/timso.html");
		
	}

}
