package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables
    //Animation topAnim, bottomAnim;
    //ImageView image;
   // TextView name;
private Button button2;

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_webpage);
        webView=findViewById(R.id.webview);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://prastuti.in");

                              button2 = findViewById(R.id.button2);
                              button2.setOnKeyListener(new View.OnKeyListener() {
                              @Override
                              public boolean onKey(View v, int keyCode, KeyEvent event) {
                              return false;
            }

            public void onClick (View v){
                Intent categoryIntent = new Intent(MainActivity.this,Webpage.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        getSupportActionBar() .hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Animations
        //topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
       // bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        //Hooks
        //image = findViewById(R.id.imageView  );
       // name = findViewById(R.id.textView);

       // image.setAnimation(topAnim);
       // name.setAnimation(bottomAnim);


    }
    public void onBackPressed() {
        if(webView.canGoBack())
        { webView.goBack();   }
        else
        {
            super.onBackPressed();
        }
    }

}