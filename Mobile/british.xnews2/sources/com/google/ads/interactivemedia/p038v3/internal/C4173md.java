package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.md */
/* compiled from: IMASDK */
final class C4173md {

    /* renamed from: a */
    private final WifiManager f17947a;

    /* renamed from: b */
    private WifiManager.WifiLock f17948b;

    /* renamed from: c */
    private boolean f17949c;

    /* renamed from: d */
    private boolean f17950d;

    public C4173md(Context context) {
        this.f17947a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private final void m18100c() {
        WifiManager.WifiLock wifiLock = this.f17948b;
        if (wifiLock != null) {
            wifiLock.release();
        }
    }

    /* renamed from: a */
    public final void mo16340a(boolean z) {
        this.f17949c = false;
        m18100c();
    }

    /* renamed from: b */
    public final void mo16341b(boolean z) {
        this.f17950d = z;
        m18100c();
    }
}
