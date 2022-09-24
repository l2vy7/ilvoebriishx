package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.measurement.internal.o */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9859o {

    /* renamed from: a */
    final String f46525a;

    /* renamed from: b */
    final String f46526b;

    /* renamed from: c */
    final long f46527c;

    /* renamed from: d */
    final long f46528d;

    /* renamed from: e */
    final long f46529e;

    /* renamed from: f */
    final long f46530f;

    /* renamed from: g */
    final long f46531g;

    /* renamed from: h */
    final Long f46532h;

    /* renamed from: i */
    final Long f46533i;

    /* renamed from: j */
    final Long f46534j;

    /* renamed from: k */
    final Boolean f46535k;

    C9859o(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C4604n.m20094g(str);
        C4604n.m20094g(str2);
        boolean z = true;
        C4604n.m20088a(j6 >= 0);
        C4604n.m20088a(j7 >= 0);
        C4604n.m20088a(j8 >= 0);
        C4604n.m20088a(j9 < 0 ? false : z);
        this.f46525a = str;
        this.f46526b = str2;
        this.f46527c = j6;
        this.f46528d = j7;
        this.f46529e = j8;
        this.f46530f = j4;
        this.f46531g = j9;
        this.f46532h = l;
        this.f46533i = l2;
        this.f46534j = l3;
        this.f46535k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9859o mo39081a(Long l, Long l2, Boolean bool) {
        return new C9859o(this.f46525a, this.f46526b, this.f46527c, this.f46528d, this.f46529e, this.f46530f, this.f46531g, this.f46532h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9859o mo39082b(long j, long j2) {
        return new C9859o(this.f46525a, this.f46526b, this.f46527c, this.f46528d, this.f46529e, this.f46530f, j, Long.valueOf(j2), this.f46533i, this.f46534j, this.f46535k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C9859o mo39083c(long j) {
        return new C9859o(this.f46525a, this.f46526b, this.f46527c, this.f46528d, this.f46529e, j, this.f46531g, this.f46532h, this.f46533i, this.f46534j, this.f46535k);
    }
}
