package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hg2 implements uu3<fg2> {

    /* renamed from: a */
    private final iv3<nb3> f32725a;

    /* renamed from: b */
    private final iv3<ViewGroup> f32726b;

    /* renamed from: c */
    private final iv3<Context> f32727c;

    /* renamed from: d */
    private final iv3<Set<String>> f32728d;

    public hg2(iv3<nb3> iv3, iv3<ViewGroup> iv32, iv3<Context> iv33, iv3<Set<String>> iv34) {
        this.f32725a = iv3;
        this.f32726b = iv32;
        this.f32727c = iv33;
        this.f32728d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new fg2(nb3, ((k41) this.f32726b).mo33026a(), this.f32727c.zzb(), ((gv3) this.f32728d).zzb());
    }
}
