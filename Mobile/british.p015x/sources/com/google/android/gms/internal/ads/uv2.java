package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class uv2<E> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final mb3<?> f39997d = bb3.m30649i(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final nb3 f39998a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f39999b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final vv2<E> f40000c;

    public uv2(nb3 nb3, ScheduledExecutorService scheduledExecutorService, vv2<E> vv2) {
        this.f39998a = nb3;
        this.f39999b = scheduledExecutorService;
        this.f40000c = vv2;
    }

    /* renamed from: a */
    public final kv2 mo35306a(E e, mb3<?>... mb3Arr) {
        return new kv2(this, e, Arrays.asList(mb3Arr), (jv2) null);
    }

    /* renamed from: b */
    public final <I> tv2<I> mo35307b(E e, mb3<I> mb3) {
        return new tv2(this, e, (String) null, mb3, Collections.singletonList(mb3), mb3, (sv2) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo31415f(E e);
}
