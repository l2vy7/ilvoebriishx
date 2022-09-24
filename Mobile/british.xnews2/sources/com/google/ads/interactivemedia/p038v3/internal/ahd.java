package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahd */
/* compiled from: IMASDK */
public final class ahd extends ahe {

    /* renamed from: a */
    public final int f14794a;

    /* renamed from: b */
    public final long f14795b;

    /* renamed from: c */
    public final long f14796c;

    /* renamed from: d */
    public final boolean f14797d;

    /* renamed from: e */
    public final int f14798e;

    /* renamed from: f */
    public final long f14799f;

    /* renamed from: g */
    public final int f14800g;

    /* renamed from: h */
    public final long f14801h;

    /* renamed from: i */
    public final long f14802i;

    /* renamed from: j */
    public final boolean f14803j;

    /* renamed from: k */
    public final boolean f14804k;

    /* renamed from: l */
    public final C4276pz f14805l;

    /* renamed from: m */
    public final List<aha> f14806m;

    /* renamed from: n */
    public final List<agy> f14807n;

    /* renamed from: o */
    public final Map<Uri, agz> f14808o;

    /* renamed from: p */
    public final long f14809p;

    /* renamed from: q */
    public final ahc f14810q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahd(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, long j5, boolean z2, boolean z3, boolean z4, C4276pz pzVar, List<aha> list2, List<agy> list3, ahc ahc, Map<Uri, agz> map) {
        super(str, list, z2);
        long j6;
        String str2 = str;
        List<String> list4 = list;
        this.f14794a = i;
        this.f14796c = j2;
        this.f14797d = z;
        this.f14798e = i2;
        this.f14799f = j3;
        this.f14800g = i3;
        this.f14801h = j4;
        this.f14802i = j5;
        this.f14803j = z3;
        this.f14804k = z4;
        this.f14805l = pzVar;
        this.f14806m = atz.m14811m(list2);
        this.f14807n = atz.m14811m(list3);
        this.f14808o = aue.m14838c(map);
        if (!list3.isEmpty()) {
            agy agy = (agy) art.m14630a(list3);
            j6 = agy.f14782g + agy.f14780e;
            this.f14809p = j6;
        } else if (!list2.isEmpty()) {
            aha aha = (aha) art.m14630a(list2);
            j6 = aha.f14782g + aha.f14780e;
            this.f14809p = j6;
        } else {
            this.f14809p = 0;
            j6 = 0;
        }
        this.f14795b = j == C6540C.TIME_UNSET ? -9223372036854775807L : j >= 0 ? j : j6 + j;
        this.f14810q = ahc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13564a(List list) {
        return this;
    }

    /* renamed from: b */
    public final long mo13716b() {
        return this.f14796c + this.f14809p;
    }
}
