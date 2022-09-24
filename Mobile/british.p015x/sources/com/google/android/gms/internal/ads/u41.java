package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class u41 {

    /* renamed from: a */
    private final m61 f39758a;

    /* renamed from: b */
    private final View f39759b;

    /* renamed from: c */
    private final jr2 f39760c;

    /* renamed from: d */
    private final xt0 f39761d;

    public u41(View view, xt0 xt0, m61 m61, jr2 jr2) {
        this.f39759b = view;
        this.f39761d = xt0;
        this.f39758a = m61;
        this.f39760c = jr2;
    }

    /* renamed from: f */
    public static final yh1<cc1> m38137f(Context context, zzcjf zzcjf, ir2 ir2, bs2 bs2) {
        return new yh1<>(new s41(context, zzcjf, ir2, bs2), po0.f37727f);
    }

    /* renamed from: g */
    public static final Set<yh1<cc1>> m38138g(g61 g61) {
        return Collections.singleton(new yh1(g61, po0.f37727f));
    }

    /* renamed from: h */
    public static final yh1<cc1> m38139h(e61 e61) {
        return new yh1<>(e61, po0.f37726e);
    }

    /* renamed from: a */
    public final View mo35099a() {
        return this.f39759b;
    }

    /* renamed from: b */
    public final xt0 mo35100b() {
        return this.f39761d;
    }

    /* renamed from: c */
    public final m61 mo35101c() {
        return this.f39758a;
    }

    /* renamed from: d */
    public ac1 mo30645d(Set<yh1<cc1>> set) {
        return new ac1(set);
    }

    /* renamed from: e */
    public final jr2 mo35102e() {
        return this.f39760c;
    }
}
