package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mv2 {
    /* renamed from: a */
    public static final <O> tv2<O> m34930a(Callable<O> callable, Object obj, uv2 uv2) {
        return m34931b(callable, uv2.f39998a, obj, uv2);
    }

    /* renamed from: b */
    public static final <O> tv2<O> m34931b(Callable<O> callable, nb3 nb3, Object obj, uv2 uv2) {
        return new tv2(uv2, obj, (String) null, uv2.f39997d, Collections.emptyList(), nb3.mo33675b(callable), (sv2) null);
    }

    /* renamed from: c */
    public static final <O> tv2<O> m34932c(mb3<O> mb3, Object obj, uv2 uv2) {
        return new tv2(uv2, obj, (String) null, uv2.f39997d, Collections.emptyList(), mb3, (sv2) null);
    }

    /* renamed from: d */
    public static final tv2 m34933d(gv2 gv2, nb3 nb3, Object obj, uv2 uv2) {
        return m34931b(new lv2(gv2), nb3, obj, uv2);
    }
}
