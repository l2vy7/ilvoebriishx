package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;

/* renamed from: com.startapp.nc */
/* compiled from: Sta */
public class C12078nc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f53334a;

    /* renamed from: b */
    public final /* synthetic */ VideoMode f53335b;

    public C12078nc(VideoMode videoMode, int i) {
        this.f53335b = videoMode;
        this.f53334a = i;
    }

    public void run() {
        try {
            this.f53335b.mo46017f(this.f53334a);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
