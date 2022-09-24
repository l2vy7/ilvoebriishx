package com.startapp;

import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;

/* renamed from: com.startapp.eb */
/* compiled from: Sta */
public class C11889eb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TriggeredLinksMetadata f52906a;

    /* renamed from: b */
    public final /* synthetic */ String f52907b;

    /* renamed from: c */
    public final /* synthetic */ String f52908c;

    /* renamed from: d */
    public final /* synthetic */ int f52909d;

    /* renamed from: e */
    public final /* synthetic */ C11828cb f52910e;

    public C11889eb(C11828cb cbVar, TriggeredLinksMetadata triggeredLinksMetadata, String str, String str2, int i) {
        this.f52910e = cbVar;
        this.f52906a = triggeredLinksMetadata;
        this.f52907b = str;
        this.f52908c = str2;
        this.f52909d = i;
    }

    public void run() {
        try {
            this.f52910e.mo45214a(this.f52906a, "Periodic", this.f52907b, this.f52908c);
        } catch (Throwable th) {
            if (this.f52910e.mo45218a(1)) {
                C5004d4.m22887a(th);
            }
        } finally {
            this.f52910e.mo45216a(this.f52907b, this.f52909d);
            this.f52910e.mo45213a(0);
        }
    }
}
