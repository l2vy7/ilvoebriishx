package com.startapp.sdk.ads.splash;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.C11796b3;
import com.startapp.C5116u5;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;

/* renamed from: com.startapp.sdk.ads.splash.b */
/* compiled from: Sta */
public class C12217b extends C11796b3 {

    /* renamed from: v */
    public SplashConfig f54317v = null;

    /* renamed from: w */
    public SplashScreen f54318w;

    /* renamed from: x */
    public boolean f54319x = false;

    /* renamed from: y */
    public boolean f54320y = false;

    /* renamed from: a */
    public boolean mo45149a(int i, KeyEvent keyEvent) {
        if (this.f54319x) {
            if (i == 25) {
                if (!this.f54320y) {
                    this.f54320y = true;
                    SplashScreen splashScreen = this.f54318w;
                    splashScreen.f54302g = true;
                    splashScreen.f54297b.f54280g = true;
                    Toast.makeText(this.f52600b, "Test Mode", 0).show();
                    return true;
                }
            } else if (i == 24 && this.f54320y) {
                this.f52600b.finish();
                return true;
            }
        }
        return i == 4;
    }

    /* renamed from: d */
    public void mo45107d() {
    }

    /* renamed from: e */
    public void mo45108e() {
    }

    /* renamed from: f */
    public void mo45109f() {
        AdPreferences adPreferences;
        if (this.f54317v != null) {
            Serializable serializableExtra = this.f52599a.getSerializableExtra("AdPreference");
            if (serializableExtra != null) {
                adPreferences = (AdPreferences) serializableExtra;
            } else {
                adPreferences = new AdPreferences();
            }
            this.f54319x = this.f52599a.getBooleanExtra("testMode", false);
            SplashScreen splashScreen = new SplashScreen(this.f52600b, this.f54317v, adPreferences);
            this.f54318w = splashScreen;
            SplashEventHandler splashEventHandler = splashScreen.f54297b;
            C5116u5.m23368a(splashEventHandler.f54274a).mo21243a(splashEventHandler.f54284k, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
            if (!splashScreen.mo45959c()) {
                splashScreen.f54301f.post(splashScreen.f54305j);
            } else {
                splashScreen.f54301f.postDelayed(splashScreen.f54305j, 100);
            }
        }
    }

    /* renamed from: g */
    public void mo45150g() {
        SplashEventHandler.SplashState splashState;
        SplashScreen splashScreen = this.f54318w;
        if (splashScreen != null) {
            splashScreen.f54301f.removeCallbacks(splashScreen.f54305j);
            SplashEventHandler splashEventHandler = splashScreen.f54297b;
            SplashEventHandler.SplashState splashState2 = splashEventHandler.f54282i;
            if (splashState2 != SplashEventHandler.SplashState.DISPLAYED && splashState2 != (splashState = SplashEventHandler.SplashState.DO_NOT_DISPLAY)) {
                splashEventHandler.f54282i = splashState;
                if (splashEventHandler.f54277d) {
                    splashEventHandler.mo45943b();
                }
            }
        }
    }

    /* renamed from: h */
    public void mo45151h() {
    }

    /* renamed from: a */
    public void mo45095a(Bundle bundle) {
        this.f54317v = (SplashConfig) this.f52599a.getSerializableExtra("SplashConfig");
    }
}
