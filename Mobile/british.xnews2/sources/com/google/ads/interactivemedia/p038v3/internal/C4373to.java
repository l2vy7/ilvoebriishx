package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.to */
/* compiled from: IMASDK */
final class C4373to extends C4375tq {

    /* renamed from: a */
    public final long f18832a;

    /* renamed from: b */
    public final List<C4374tp> f18833b = new ArrayList();

    /* renamed from: c */
    public final List<C4373to> f18834c = new ArrayList();

    public C4373to(int i, long j) {
        super(i);
        this.f18832a = j;
    }

    /* renamed from: a */
    public final void mo16657a(C4374tp tpVar) {
        this.f18833b.add(tpVar);
    }

    /* renamed from: b */
    public final void mo16658b(C4373to toVar) {
        this.f18834c.add(toVar);
    }

    /* renamed from: c */
    public final C4374tp mo16659c(int i) {
        int size = this.f18833b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4374tp tpVar = this.f18833b.get(i2);
            if (tpVar.f18836d == i) {
                return tpVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C4373to mo16660d(int i) {
        int size = this.f18834c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4373to toVar = this.f18834c.get(i2);
            if (toVar.f18836d == i) {
                return toVar;
            }
        }
        return null;
    }

    public final String toString() {
        String g = C4375tq.m19005g(this.f18836d);
        String arrays = Arrays.toString(this.f18833b.toArray());
        String arrays2 = Arrays.toString(this.f18834c.toArray());
        int length = String.valueOf(g).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(g);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
