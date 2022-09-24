package com.startapp;

import com.startapp.C12052ma;

/* renamed from: com.startapp.la */
/* compiled from: Sta */
public class C12033la implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12052ma f53253a;

    public C12033la(C12052ma maVar) {
        this.f53253a = maVar;
    }

    public void run() {
        C12052ma maVar = this.f53253a;
        maVar.getClass();
        try {
            C12052ma.C12056c cVar = maVar.f53287f;
            if (cVar != null) {
                cVar.mo45549b();
                maVar.f53287f = null;
            }
        } catch (Throwable th) {
            if (maVar.mo45545a(4)) {
                C5004d4.m22887a(th);
            }
        }
    }
}
