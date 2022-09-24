package com.startapp;

import com.startapp.C12052ma;

/* renamed from: com.startapp.ka */
/* compiled from: Sta */
public class C12015ka implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12052ma f53211a;

    public C12015ka(C12052ma maVar) {
        this.f53211a = maVar;
    }

    public void run() {
        C12052ma maVar = this.f53211a;
        maVar.getClass();
        try {
            if (maVar.mo45542a() != null) {
                if (maVar.f53287f == null) {
                    C12052ma.C12056c a = maVar.mo45541a((Class<?>) null);
                    maVar.f53287f = a;
                    if (a != null) {
                        a.mo45548a();
                    }
                }
            }
        } catch (Throwable th) {
            if (maVar.mo45545a(1)) {
                C5004d4.m22887a(th);
            }
        }
    }
}
