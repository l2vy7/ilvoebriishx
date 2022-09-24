package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.f3 */
/* compiled from: Sta */
public class C11897f3 extends C12379v0 {

    /* renamed from: e */
    public final C5069e f52931e;

    /* renamed from: com.startapp.f3$a */
    /* compiled from: Sta */
    public class C11898a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12023l1 f52932a;

        public C11898a(C12023l1 l1Var) {
            this.f52932a = l1Var;
        }

        public void run() {
            this.f52932a.mo45519c();
            C11897f3.this.f54864b.mo45392a(this.f52932a.mo45518b());
        }
    }

    public C11897f3(Context context, C5069e eVar, C12128p7 p7Var) {
        super(context, p7Var);
        this.f52931e = eVar;
    }

    /* renamed from: a */
    public void mo45343a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f22407k.mo21194g().mo46327c());
            C12023l1 l1Var = new C12023l1(this.f54863a, this.f54864b);
            this.f54865c.postDelayed(new C11898a(l1Var), millis);
            l1Var.mo45517a(mo45344b());
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            this.f54864b.mo45392a((Object) null);
        }
    }

    /* renamed from: b */
    public final boolean mo45344b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - this.f52931e.getLong("lastBtDiscoveringTime", 0) >= ((long) MetaData.f22407k.mo21194g().mo46325a()) * 60000;
        if (z) {
            C5069e.C5070a a = this.f52931e.edit();
            a.mo21101a("lastBtDiscoveringTime", Long.valueOf(currentTimeMillis));
            a.f22385a.putLong("lastBtDiscoveringTime", currentTimeMillis);
            a.apply();
        }
        return z;
    }
}
