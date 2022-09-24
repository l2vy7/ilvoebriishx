package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mo2 implements p33<b12, po2> {

    /* renamed from: a */
    final /* synthetic */ qo2 f20547a;

    mo2(qo2 qo2) {
        this.f20547a = qo2;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        co0.zzh("", (b12) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        qo2 qo2 = this.f20547a;
        qo2.f38215d = new po2((zzcdq) null, qo2.m36561e(), (oo2) null);
        return this.f20547a.f38215d;
    }
}
