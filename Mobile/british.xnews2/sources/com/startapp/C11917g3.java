package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.C12293a;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.g3 */
/* compiled from: Sta */
public class C11917g3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ComponentLocator f52975a;

    /* renamed from: b */
    public final /* synthetic */ C12293a f52976b;

    /* renamed from: com.startapp.g3$a */
    /* compiled from: Sta */
    public class C11918a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Boolean f52977a;

        public C11918a(Boolean bool) {
            this.f52977a = bool;
        }

        public void run() {
            C11917g3.this.f52976b.mo46436a(this.f52977a);
        }
    }

    public C11917g3(C12293a aVar, ComponentLocator componentLocator) {
        this.f52976b = aVar;
        this.f52975a = componentLocator;
    }

    public void run() {
        this.f52975a.mo21220g().execute(new C11918a(this.f52976b.mo46435a()));
    }
}
