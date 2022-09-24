package com.startapp;

import android.content.Context;
import android.webkit.WebSettings;

/* renamed from: com.startapp.kb */
/* compiled from: Sta */
public class C12016kb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f53212a;

    /* renamed from: b */
    public final /* synthetic */ C12034lb f53213b;

    public C12016kb(C12034lb lbVar, Context context) {
        this.f53213b = lbVar;
        this.f53212a = context;
    }

    public void run() {
        try {
            this.f53213b.f53254a = WebSettings.getDefaultUserAgent(this.f53212a);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }
}
