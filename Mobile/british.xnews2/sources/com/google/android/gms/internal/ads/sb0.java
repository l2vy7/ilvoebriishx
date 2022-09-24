package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbf;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sb0 {

    /* renamed from: b */
    static final zzbf<x90> f20823b = new qb0();

    /* renamed from: c */
    static final zzbf<x90> f20824c = new rb0();

    /* renamed from: a */
    private final db0 f20825a;

    public sb0(Context context, zzcjf zzcjf, String str) {
        this.f20825a = new db0(context, zzcjf, str, f20823b, f20824c);
    }

    /* renamed from: a */
    public final <I, O> hb0<I, O> mo18829a(String str, lb0<I> lb0, jb0<O> jb0) {
        return new wb0(this.f20825a, str, lb0, jb0);
    }

    /* renamed from: b */
    public final bc0 mo18830b() {
        return new bc0(this.f20825a);
    }
}
