package android.bh.com.videoplayer;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import static android.bh.com.videoplayer.R.id.webview;

public class WebViewActivity extends Activity {

    private WebView mWebView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        mWebView = (WebView)findViewById(webview);

        //mWebView.loadUrl("http://www.google.com");
        mWebView.loadUrl("https://cmnewsrepublic.firebaseapp.com/videopage.html");

    }
}
