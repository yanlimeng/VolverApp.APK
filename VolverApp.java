#---en Principal.java:::
import android.view.KeyEvent;

#---y tras el primer OVERRYDE, este::
@Override
public boolean onKeyDown(int keyCode, KeyEvent event) {
WebView mWebView;
mWebView = (WebView) findViewById(R.id.webView);
if (event.getAction() == KeyEvent.ACTION_DOWN) {
switch (keyCode) {
case KeyEvent.KEYCODE_BACK:
if (mWebView.canGoBack()) {
mWebView.goBack();
} else {
finish();
}
return true;
}
}
return super.onKeyDown(keyCode, event);
}
