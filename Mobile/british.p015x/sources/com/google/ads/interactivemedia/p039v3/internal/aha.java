package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aha */
/* compiled from: IMASDK */
public final class aha extends ahb {

    /* renamed from: a */
    public final String f14776a;

    /* renamed from: b */
    public final List<agy> f14777b;

    public aha(String str, long j, long j2, String str2, String str3) {
        this(str, (aha) null, "", 0, -1, C6540C.TIME_UNSET, (C4276pz) null, str2, str3, j, j2, false, atz.m14807i());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aha(String str, aha aha, String str2, long j, int i, long j2, C4276pz pzVar, String str3, String str4, long j3, long j4, boolean z, List<agy> list) {
        super(str, aha, j, i, j2, pzVar, str3, str4, j3, j4, z);
        this.f14776a = str2;
        this.f14777b = atz.m14811m(list);
    }
}
