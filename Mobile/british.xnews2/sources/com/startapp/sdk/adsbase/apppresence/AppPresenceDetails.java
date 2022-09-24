package com.startapp.sdk.adsbase.apppresence;

import java.io.Serializable;

/* compiled from: Sta */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private int adAttempt;
    private boolean appPresence = false;
    private boolean isShown = true;
    private int minAppVersion;
    private String packageName;
    private String trackingUrl;

    public AppPresenceDetails(String str, String str2, int i, int i2) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i;
        this.minAppVersion = i2;
    }

    /* renamed from: a */
    public void mo46147a(String str) {
        this.trackingUrl = str;
    }

    /* renamed from: b */
    public String mo46149b() {
        return this.packageName;
    }

    /* renamed from: c */
    public String mo46151c() {
        return this.trackingUrl;
    }

    /* renamed from: d */
    public boolean mo46152d() {
        return this.appPresence;
    }

    /* renamed from: e */
    public boolean mo46153e() {
        return this.isShown;
    }

    /* renamed from: a */
    public void mo46148a(boolean z) {
        this.appPresence = z;
    }

    /* renamed from: b */
    public void mo46150b(boolean z) {
        this.isShown = z;
    }

    /* renamed from: a */
    public int mo46146a() {
        return this.minAppVersion;
    }
}
