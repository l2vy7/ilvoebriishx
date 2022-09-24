package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.sdk.adsbase.d */
/* compiled from: Sta */
public interface C5068d {
    /* renamed from: a */
    void mo21073a(boolean z);

    /* renamed from: a */
    boolean mo21074a();

    /* renamed from: a */
    boolean mo21075a(String str);

    /* renamed from: b */
    Long mo21076b();

    /* renamed from: c */
    Long mo21077c();

    /* renamed from: d */
    boolean mo21078d();

    C5041Ad.AdState getState();

    boolean isBelowMinCPM();

    boolean isReady();

    void load(AdPreferences adPreferences, AdEventListener adEventListener);

    void setActivityExtra(ActivityExtra activityExtra);

    void setContext(Context context);
}
