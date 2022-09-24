package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bd */
/* compiled from: IMASDK */
public final class C3876bd {

    /* renamed from: a */
    private static C3876bd f16137a;

    /* renamed from: b */
    private float f16138b = 0.0f;

    /* renamed from: c */
    private C3854av f16139c;

    /* renamed from: d */
    private C3855aw f16140d;

    /* renamed from: e */
    private final C4038hd f16141e;

    /* renamed from: f */
    private final C4257pg f16142f;

    public C3876bd(C4038hd hdVar, C4257pg pgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f16141e = hdVar;
        this.f16142f = pgVar;
    }

    /* renamed from: a */
    public static C3876bd m15693a() {
        if (f16137a == null) {
            f16137a = new C3876bd(new C4038hd(), new C4257pg(), (byte[]) null, (byte[]) null, (byte[]) null);
        }
        return f16137a;
    }

    /* renamed from: b */
    public final void mo14935b(Context context) {
        this.f16139c = new C3854av(new Handler(), context, new C4130ko(), this, (byte[]) null, (byte[]) null);
    }

    /* renamed from: c */
    public final void mo14936c() {
        C3870ay.m15173a().mo14772g(this);
        C3870ay.m15173a().mo14769c();
        if (C3870ay.m15173a().mo14771e()) {
            C3895bw.m16881b().mo15599c();
        }
        this.f16139c.mo14599a();
    }

    /* renamed from: d */
    public final void mo14937d() {
        C3895bw.m16881b().mo15600d();
        C3870ay.m15173a().mo14770d();
        this.f16139c.mo14600b();
    }

    /* renamed from: e */
    public final void mo14938e(float f) {
        this.f16138b = f;
        if (this.f16140d == null) {
            this.f16140d = C3855aw.m14982a();
        }
        for (C3846ap h : this.f16140d.mo14652f()) {
            h.mo14171h().mo15157j(f);
        }
    }

    /* renamed from: f */
    public final float mo14939f() {
        return this.f16138b;
    }
}
