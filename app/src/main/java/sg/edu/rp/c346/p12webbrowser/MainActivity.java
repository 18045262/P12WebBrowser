package sg.edu.rp.c346.p12webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLoadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewPage);

        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().getAllowFileAccess();
        wvMyPage.getSettings().getBuiltInZoomControls();

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.grab.com/sg/";
                wvMyPage.loadUrl(url);
            }
        });
    }
}
