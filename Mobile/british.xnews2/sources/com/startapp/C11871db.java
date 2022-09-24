package com.startapp;

import com.startapp.sdk.jobs.C12320b;

/* renamed from: com.startapp.db */
/* compiled from: Sta */
public class C11871db implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12320b.C12321a f52869a;

    /* renamed from: b */
    public final /* synthetic */ C12320b f52870b;

    /* renamed from: c */
    public final /* synthetic */ C11828cb f52871c;

    public C11871db(C11828cb cbVar, C12320b.C12321a aVar, C12320b bVar) {
        this.f52871c = cbVar;
        this.f52869a = aVar;
        this.f52870b = bVar;
    }

    public void run() {
        try {
            this.f52871c.f52691j.run();
        } finally {
            this.f52869a.mo46481a(this.f52870b, false);
        }
    }
}
