package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.C7353b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gx2 implements Runnable {

    /* renamed from: j */
    static Boolean f32491j;

    /* renamed from: b */
    private final Context f32492b;

    /* renamed from: c */
    private final zzcjf f32493c;

    /* renamed from: d */
    private final lx2 f32494d = ox2.m35895F();

    /* renamed from: e */
    private String f32495e;

    /* renamed from: f */
    private int f32496f;

    /* renamed from: g */
    private boolean f32497g = false;

    /* renamed from: h */
    private final i22 f32498h;

    /* renamed from: i */
    private final gj0 f32499i;

    public gx2(Context context, zzcjf zzcjf, i22 i22, gj0 gj0, byte[] bArr) {
        this.f32492b = context;
        this.f32493c = zzcjf;
        this.f32498h = i22;
        this.f32499i = gj0;
    }

    /* renamed from: b */
    public static synchronized boolean m32732b() {
        boolean booleanValue;
        synchronized (gx2.class) {
            if (f32491j == null) {
                if (!y10.f41634b.mo34648e().booleanValue()) {
                    f32491j = Boolean.FALSE;
                } else {
                    f32491j = Boolean.valueOf(Math.random() < y10.f41633a.mo34648e().doubleValue());
                }
            }
            booleanValue = f32491j.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    private final synchronized void m32733c() {
        if (!this.f32497g) {
            this.f32497g = true;
            if (m32732b()) {
                zzt.zzp();
                this.f32495e = com.google.android.gms.ads.internal.util.zzt.zzv(this.f32492b);
                this.f32496f = C7353b.m29920h().mo29973b(this.f32492b);
                long intValue = (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37232v6)).intValue();
                po0.f37725d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: d */
    private final synchronized void m32734d() {
        try {
            new h22(this.f32492b, this.f32493c.f43036b, this.f32499i, Binder.getCallingUid(), (byte[]) null).zza(new f22((String) C8311wv.m39277c().mo18570b(p00.f37224u6), 60000, new HashMap(), ((ox2) this.f32494d.mo32424p()).mo33365g(), "application/x-protobuf"));
        } catch (Exception e) {
            if (!(e instanceof wy1) || ((wy1) e).mo35689a() != 3) {
                zzt.zzo().mo18591r(e, "CuiMonitor.sendCuiPing");
            } else {
                this.f32494d.mo33413C();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo32302a(fx2 fx2) {
        if (!this.f32497g) {
            m32733c();
        }
        if (m32732b()) {
            if (fx2 != null) {
                lx2 lx2 = this.f32494d;
                mx2 E = nx2.m35449E();
                ix2 E2 = jx2.m33776E();
                E2.mo32797S(7);
                E2.mo32794P(fx2.mo31947h());
                E2.mo32787I(fx2.mo31941b());
                E2.mo32799U(3);
                E2.mo32793O(this.f32493c.f43036b);
                E2.mo32800y(this.f32495e);
                E2.mo32791M(Build.VERSION.RELEASE);
                E2.mo32795Q(Build.VERSION.SDK_INT);
                E2.mo32798T(fx2.mo31949j());
                E2.mo32790L(fx2.mo31940a());
                E2.mo32785C((long) this.f32496f);
                E2.mo32796R(fx2.mo31948i());
                E2.mo32784B(fx2.mo31942c());
                E2.mo32786H(fx2.mo31943d());
                E2.mo32788J(fx2.mo31944e());
                E2.mo32789K(fx2.mo31945f());
                E2.mo32792N(fx2.mo31946g());
                E.mo33614y(E2);
                lx2.mo33412B(E);
            }
        }
    }

    public final synchronized void run() {
        if (m32732b()) {
            if (this.f32494d.mo33414y() != 0) {
                m32734d();
            }
        }
    }
}
