package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i74 implements Comparable<i74> {

    /* renamed from: b */
    private final boolean f33127b;

    /* renamed from: c */
    private final boolean f33128c;

    public i74(C8281w wVar, int i) {
        this.f33127b = 1 != (wVar.f40611d & 1) ? false : true;
        this.f33128c = s74.m37356m(i, false);
    }

    /* renamed from: a */
    public final int compareTo(i74 i74) {
        return e63.m31723i().mo30627d(this.f33128c, i74.f33128c).mo30627d(this.f33127b, i74.f33127b).mo30624a();
    }
}
