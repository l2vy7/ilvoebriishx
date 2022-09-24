package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ej1 {

    /* renamed from: a */
    private final gk1 f31394a;

    /* renamed from: b */
    private final xt0 f31395b;

    public ej1(gk1 gk1, xt0 xt0) {
        this.f31394a = gk1;
        this.f31395b = xt0;
    }

    /* renamed from: h */
    public static final yh1<qh1> m31848h(lk1 lk1) {
        return new yh1<>(lk1, po0.f37727f);
    }

    /* renamed from: a */
    public final View mo31586a() {
        xt0 xt0 = this.f31395b;
        if (xt0 == null) {
            return null;
        }
        return xt0.zzI();
    }

    /* renamed from: b */
    public final View mo31587b() {
        xt0 xt0 = this.f31395b;
        if (xt0 != null) {
            return xt0.zzI();
        }
        return null;
    }

    /* renamed from: c */
    public final xt0 mo31588c() {
        return this.f31395b;
    }

    /* renamed from: d */
    public final yh1<hf1> mo31589d(Executor executor) {
        return new yh1<>(new cj1(this.f31395b), executor);
    }

    /* renamed from: e */
    public final gk1 mo31590e() {
        return this.f31394a;
    }

    /* renamed from: f */
    public Set<yh1<ma1>> mo31591f(l91 l91) {
        return Collections.singleton(new yh1(l91, po0.f37727f));
    }

    /* renamed from: g */
    public Set<yh1<qh1>> mo31592g(l91 l91) {
        return Collections.singleton(new yh1(l91, po0.f37727f));
    }
}
