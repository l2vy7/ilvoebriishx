package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dj2<T> implements uu3<cj2<T>> {

    /* renamed from: a */
    private final iv3<Executor> f30812a;

    /* renamed from: b */
    private final iv3<Set<zi2<? extends yi2<T>>>> f30813b;

    public dj2(iv3<Executor> iv3, iv3<Set<zi2<? extends yi2<T>>>> iv32) {
        this.f30812a = iv3;
        this.f30813b = iv32;
    }

    /* renamed from: a */
    public final cj2<T> zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new cj2<>(nb3, ((gv3) this.f30813b).zzb());
    }
}
