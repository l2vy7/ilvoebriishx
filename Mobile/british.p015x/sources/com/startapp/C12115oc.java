package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.oc */
/* compiled from: Sta */
public class C12115oc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f53982a;

    /* renamed from: b */
    public final /* synthetic */ VideoMode f53983b;

    public C12115oc(VideoMode videoMode, int i) {
        this.f53983b = videoMode;
        this.f53982a = i;
    }

    public void run() {
        try {
            this.f53983b.mo46016e(this.f53982a);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
