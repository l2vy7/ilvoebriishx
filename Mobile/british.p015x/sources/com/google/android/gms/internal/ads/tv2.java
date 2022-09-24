package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tv2<O> {

    /* renamed from: a */
    private final Object f39544a;

    /* renamed from: b */
    private final String f39545b;

    /* renamed from: c */
    private final mb3<?> f39546c;

    /* renamed from: d */
    private final List<mb3<?>> f39547d;

    /* renamed from: e */
    private final mb3<O> f39548e;

    /* renamed from: f */
    final /* synthetic */ uv2 f39549f;

    private tv2(uv2 uv2, uv2 uv22, String str, mb3 mb3, List<mb3> list, mb3<O> mb32) {
        this.f39549f = uv2;
        this.f39544a = uv22;
        this.f39545b = str;
        this.f39546c = mb3;
        this.f39547d = list;
        this.f39548e = mb32;
    }

    /* synthetic */ tv2(uv2 uv2, Object obj, String str, mb3 mb3, List list, mb3 mb32, sv2 sv2) {
        this(uv2, obj, (String) null, mb3, list, mb32);
    }

    /* renamed from: a */
    public final hv2 mo35042a() {
        Object obj = this.f39544a;
        String str = this.f39545b;
        if (str == null) {
            str = this.f39549f.mo31415f(obj);
        }
        hv2 hv2 = new hv2(obj, str, this.f39548e);
        this.f39549f.f40000c.mo31046w(hv2);
        mb3<?> mb3 = this.f39546c;
        qv2 qv2 = new qv2(this, hv2);
        nb3 nb3 = po0.f37727f;
        mb3.zzc(qv2, nb3);
        bb3.m30658r(hv2, new rv2(this, hv2), nb3);
        return hv2;
    }

    /* renamed from: b */
    public final tv2<O> mo35043b(Object obj) {
        return this.f39549f.mo35307b(obj, mo35042a());
    }

    /* renamed from: c */
    public final <T extends Throwable> tv2<O> mo35044c(Class<T> cls, ha3<T, O> ha3) {
        uv2 uv2 = this.f39549f;
        return new tv2(uv2, this.f39544a, this.f39545b, this.f39546c, this.f39547d, bb3.m30647g(this.f39548e, cls, ha3, uv2.f39998a));
    }

    /* renamed from: d */
    public final <O2> tv2<O2> mo35045d(mb3<O2> mb3) {
        return mo35048g(new pv2(mb3), po0.f37727f);
    }

    /* renamed from: e */
    public final <O2> tv2<O2> mo35046e(fv2<O, O2> fv2) {
        return mo35047f(new nv2(fv2));
    }

    /* renamed from: f */
    public final <O2> tv2<O2> mo35047f(ha3<O, O2> ha3) {
        return mo35048g(ha3, this.f39549f.f39998a);
    }

    /* renamed from: g */
    public final <O2> tv2<O2> mo35048g(ha3<O, O2> ha3, Executor executor) {
        return new tv2(this.f39549f, this.f39544a, this.f39545b, this.f39546c, this.f39547d, bb3.m30654n(this.f39548e, ha3, executor));
    }

    /* renamed from: h */
    public final tv2<O> mo35049h(String str) {
        return new tv2(this.f39549f, this.f39544a, str, this.f39546c, this.f39547d, this.f39548e);
    }

    /* renamed from: i */
    public final tv2<O> mo35050i(long j, TimeUnit timeUnit) {
        uv2 uv2 = this.f39549f;
        return new tv2(uv2, this.f39544a, this.f39545b, this.f39546c, this.f39547d, bb3.m30655o(this.f39548e, j, timeUnit, uv2.f39999b));
    }
}
