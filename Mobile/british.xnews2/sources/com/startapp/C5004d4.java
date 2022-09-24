package com.startapp;

import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.d4 */
/* compiled from: Sta */
public class C5004d4 {

    /* renamed from: a */
    public final C11882e4 f22123a;

    /* renamed from: b */
    public final long f22124b;

    /* renamed from: c */
    public String f22125c;

    /* renamed from: d */
    public String f22126d;

    /* renamed from: e */
    public String f22127e;

    /* renamed from: f */
    public Object f22128f;

    /* renamed from: g */
    public String f22129g;

    /* renamed from: h */
    public Long f22130h;

    /* renamed from: i */
    public String f22131i;

    /* renamed from: j */
    public boolean f22132j;

    /* renamed from: k */
    public String f22133k;

    public C5004d4(C11882e4 e4Var) {
        if (e4Var != C11882e4.f52887f) {
            this.f22123a = e4Var;
        } else {
            this.f22123a = C11882e4.f52886e;
        }
        C11882e4 e4Var2 = this.f22123a;
        if (e4Var2 == C11882e4.f52886e || e4Var2 == C11882e4.f52885d) {
            this.f22131i = C5015nb.m22909a(C5015nb.m22903a(0));
        }
        this.f22124b = 0;
    }

    /* renamed from: a */
    public void mo20661a() {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.f22424K.f55097a;
            if (componentLocator != null) {
                componentLocator.mo21225l().mo45473a(this, (C11956i4) null);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public void mo20662a(C11956i4 i4Var) {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.f22424K.f55097a;
            if (componentLocator != null) {
                componentLocator.mo21225l().mo45473a(this, (C11956i4) null);
            } else {
                i4Var.mo45138a(this, 3);
            }
        } catch (Throwable unused) {
        }
    }

    public C5004d4(Throwable th) {
        this.f22123a = C11882e4.f52887f;
        this.f22127e = C5015nb.m22927b(th);
        this.f22126d = C5015nb.m22909a(C5015nb.m22904a(th));
        this.f22131i = C5015nb.m22909a(C5015nb.m22903a(1));
        this.f22124b = 0;
    }

    /* renamed from: a */
    public static void m22887a(Throwable th) {
        try {
            new C5004d4(th).mo20661a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m22888a(Throwable th, C11882e4 e4Var) {
        try {
            new C5004d4(th, e4Var).mo20661a();
        } catch (Throwable unused) {
        }
    }

    public C5004d4(Throwable th, C11882e4 e4Var) {
        boolean z = e4Var == C11882e4.f52889h;
        this.f22123a = e4Var;
        this.f22127e = C5015nb.m22927b(th);
        this.f22126d = C5015nb.m22909a(C5015nb.m22904a(th));
        this.f22131i = z ? th.getClass().getName() : C5015nb.m22909a(C5015nb.m22903a(1));
        this.f22124b = 0;
    }

    public C5004d4(C11882e4 e4Var, long j) {
        this.f22123a = e4Var;
        this.f22124b = j;
    }
}
