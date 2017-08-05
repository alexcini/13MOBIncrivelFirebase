package com.example.firebase.a13mobincrivelfirebase;

import android.app.Application;
import android.os.Bundle;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MinhaAplicacao extends Application {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}