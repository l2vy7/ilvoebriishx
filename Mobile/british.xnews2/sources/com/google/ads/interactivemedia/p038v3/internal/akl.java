package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akl */
/* compiled from: IMASDK */
public final class akl<T> implements ake {

    /* renamed from: a */
    public final long f15151a = aas.m12804a();

    /* renamed from: b */
    public final ajk f15152b;

    /* renamed from: c */
    public final int f15153c;

    /* renamed from: d */
    private final ako f15154d;

    /* renamed from: e */
    private final akk<? extends T> f15155e;

    /* renamed from: f */
    private volatile T f15156f;

    public akl(ajg ajg, Uri uri, int i, akk<? extends T> akk) {
        ajj ajj = new ajj();
        ajj.mo13811f(uri);
        ajj.mo13807b(1);
        ajk a = ajj.mo13806a();
        this.f15154d = new ako(ajg);
        this.f15152b = a;
        this.f15153c = i;
        this.f15155e = akk;
    }

    /* renamed from: a */
    public final T mo13849a() {
        return this.f15156f;
    }

    /* renamed from: b */
    public final void mo13355b() {
    }

    /* renamed from: c */
    public final void mo13356c() throws IOException {
        this.f15154d.mo13853g();
        aji aji = new aji(this.f15154d, this.f15152b);
        try {
            aji.mo13801a();
            Uri d = this.f15154d.mo13297d();
            aup.m14890u(d);
            this.f15156f = this.f15155e.mo13517a(d, aji);
        } finally {
            amm.m14248r(aji);
        }
    }

    /* renamed from: d */
    public final long mo13850d() {
        return this.f15154d.mo13854h();
    }

    /* renamed from: e */
    public final Uri mo13851e() {
        return this.f15154d.mo13855i();
    }

    /* renamed from: f */
    public final Map<String, List<String>> mo13852f() {
        return this.f15154d.mo13856j();
    }
}
