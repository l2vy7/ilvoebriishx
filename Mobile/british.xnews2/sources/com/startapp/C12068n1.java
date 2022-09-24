package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C12269e;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* renamed from: com.startapp.n1 */
/* compiled from: Sta */
public abstract class C12068n1 {

    /* renamed from: a */
    public C5065h f53319a;

    /* renamed from: b */
    public Handler f53320b = null;

    /* renamed from: c */
    public Long f53321c = null;

    /* renamed from: d */
    public boolean f53322d = false;

    /* renamed from: com.startapp.n1$a */
    /* compiled from: Sta */
    public class C12069a implements Runnable {
        public C12069a() {
        }

        public void run() {
            C12068n1.this.mo45531c();
        }
    }

    public C12068n1(C5065h hVar) {
        this.f53319a = hVar;
    }

    /* renamed from: a */
    public abstract boolean mo45529a();

    /* renamed from: b */
    public abstract long mo45530b();

    /* renamed from: c */
    public void mo45531c() {
        this.f53321c = null;
        this.f53322d = false;
        C5065h hVar = this.f53319a;
        if (hVar.f22376m < MetaData.f22407k.mo21167I()) {
            hVar.f22376m++;
            hVar.mo21056a((StartAppAd) null, (AdEventListener) null, true, false);
            return;
        }
        C5065h.C5067b bVar = hVar.f22379p;
        if (bVar != null) {
            ((C12269e) bVar).mo46174a(hVar);
        }
    }

    /* renamed from: d */
    public void mo45560d() {
        if (!this.f53322d) {
            if (this.f53321c == null) {
                this.f53321c = Long.valueOf(System.currentTimeMillis());
            }
            if (mo45529a()) {
                if (this.f53320b == null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    this.f53320b = new Handler(myLooper);
                }
                long b = mo45530b();
                if (b >= 0) {
                    this.f53322d = true;
                    this.f53320b.postDelayed(new C12069a(), b);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo45561e() {
        Handler handler = this.f53320b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.f53321c = null;
        this.f53322d = false;
    }
}
