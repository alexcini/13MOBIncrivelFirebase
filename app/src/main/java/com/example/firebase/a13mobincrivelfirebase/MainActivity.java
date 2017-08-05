    package com.example.firebase.a13mobincrivelfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

import com.google.firebase.messaging.FirebaseMessagingService;

import static android.R.attr.layout_width;

    public class MainActivity extends AppCompatActivity {

        private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        FirebaseMessaging.getInstance().subscribeToTopic("mob");


}
        public void clickme(View v) {
            Bundle params = new Bundle();
            params.putString("NOME", "Cini");
            mFirebaseAnalytics.logEvent("clickme", params);
        }

        public void forcarCrash(View v) {
            int r = 2 / 0;
             //*throw new RuntimeException("This is a crash");
        }

        }
