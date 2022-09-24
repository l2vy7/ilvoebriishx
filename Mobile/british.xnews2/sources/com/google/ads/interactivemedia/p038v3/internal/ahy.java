package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahy */
/* compiled from: IMASDK */
public final class ahy implements Comparable<ahy> {

    /* renamed from: a */
    private final boolean f14907a;

    /* renamed from: b */
    private final boolean f14908b;

    public ahy(C4120ke keVar, int i) {
        this.f14907a = 1 != (keVar.f17673d & 1) ? false : true;
        this.f14908b = aif.m13762a(i, false);
    }

    /* renamed from: a */
    public final int compareTo(ahy ahy) {
        return atf.m14742g().mo14443d(this.f14908b, ahy.f14908b).mo14443d(this.f14907a, ahy.f14907a).mo14444e();
    }
}
