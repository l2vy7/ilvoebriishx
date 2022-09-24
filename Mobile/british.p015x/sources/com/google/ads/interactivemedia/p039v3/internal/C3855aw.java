package com.google.ads.interactivemedia.p039v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aw */
/* compiled from: IMASDK */
public final class C3855aw {

    /* renamed from: a */
    private static final C3855aw f15818a = new C3855aw();

    /* renamed from: b */
    private final ArrayList<C3846ap> f15819b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C3846ap> f15820c = new ArrayList<>();

    private C3855aw() {
    }

    /* renamed from: a */
    public static C3855aw m14982a() {
        return f15818a;
    }

    /* renamed from: b */
    public final void mo14648b(C3846ap apVar) {
        this.f15819b.add(apVar);
    }

    /* renamed from: c */
    public final void mo14649c(C3846ap apVar) {
        boolean g = mo14653g();
        this.f15820c.add(apVar);
        if (!g) {
            C3876bd.m15693a().mo14936c();
        }
    }

    /* renamed from: d */
    public final void mo14650d(C3846ap apVar) {
        boolean g = mo14653g();
        this.f15819b.remove(apVar);
        this.f15820c.remove(apVar);
        if (g && !mo14653g()) {
            C3876bd.m15693a().mo14937d();
        }
    }

    /* renamed from: e */
    public final Collection<C3846ap> mo14651e() {
        return Collections.unmodifiableCollection(this.f15819b);
    }

    /* renamed from: f */
    public final Collection<C3846ap> mo14652f() {
        return Collections.unmodifiableCollection(this.f15820c);
    }

    /* renamed from: g */
    public final boolean mo14653g() {
        return this.f15820c.size() > 0;
    }
}
