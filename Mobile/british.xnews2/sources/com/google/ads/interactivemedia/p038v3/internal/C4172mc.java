package com.google.ads.interactivemedia.p038v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mc */
/* compiled from: IMASDK */
final class C4172mc {

    /* renamed from: a */
    private final PowerManager f17943a;

    /* renamed from: b */
    private PowerManager.WakeLock f17944b;

    /* renamed from: c */
    private boolean f17945c;

    /* renamed from: d */
    private boolean f17946d;

    public C4172mc(Context context) {
        this.f17943a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    private final void m18097c() {
        PowerManager.WakeLock wakeLock = this.f17944b;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    /* renamed from: a */
    public final void mo16338a(boolean z) {
        this.f17945c = false;
        m18097c();
    }

    /* renamed from: b */
    public final void mo16339b(boolean z) {
        this.f17946d = z;
        m18097c();
    }
}
