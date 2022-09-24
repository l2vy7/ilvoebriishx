package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhb */
/* compiled from: IMASDK */
final class bhb {

    /* renamed from: a */
    final String f16329a;

    /* renamed from: b */
    final boolean f16330b;

    /* renamed from: c */
    final boolean f16331c;

    /* renamed from: d */
    final /* synthetic */ Field f16332d;

    /* renamed from: e */
    final /* synthetic */ boolean f16333e;

    /* renamed from: f */
    final /* synthetic */ bfi f16334f;

    /* renamed from: g */
    final /* synthetic */ bet f16335g;

    /* renamed from: h */
    final /* synthetic */ biu f16336h;

    /* renamed from: i */
    final /* synthetic */ boolean f16337i;

    protected bhb(String str, boolean z, boolean z2) {
        this.f16329a = str;
        this.f16330b = z;
        this.f16331c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    bhb(String str, boolean z, boolean z2, Field field, boolean z3, bfi bfi, bet bet, biu biu, boolean z4) {
        this(str, z, z2);
        this.f16332d = field;
        this.f16333e = z3;
        this.f16334f = bfi;
        this.f16335g = bet;
        this.f16336h = biu;
        this.f16337i = z4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15120a(biy biy, Object obj) throws IOException, IllegalAccessException {
        bfi bfi;
        Object obj2 = this.f16332d.get(obj);
        if (this.f16333e) {
            bfi = this.f16334f;
        } else {
            bfi = new bhi(this.f16335g, this.f16334f, this.f16336h.mo15134b());
        }
        bfi.write(biy, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15121b(biw biw, Object obj) throws IOException, IllegalAccessException {
        Object read = this.f16334f.read(biw);
        if (read != null || !this.f16337i) {
            this.f16332d.set(obj, read);
        }
    }

    /* renamed from: c */
    public boolean mo15122c(Object obj) throws IOException, IllegalAccessException {
        return this.f16330b && this.f16332d.get(obj) != obj;
    }
}
