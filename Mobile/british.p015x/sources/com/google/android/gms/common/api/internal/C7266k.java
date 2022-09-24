package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7266k {

    /* renamed from: a */
    private final Set<C7259j<?>> f29035a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static <L> C7259j<L> m29687a(L l, Looper looper, String str) {
        C4604n.m20099l(l, "Listener must not be null");
        C4604n.m20099l(looper, "Looper must not be null");
        C4604n.m20099l(str, "Listener type must not be null");
        return new C7259j<>(looper, l, str);
    }

    /* renamed from: b */
    public final void mo29884b() {
        for (C7259j<?> a : this.f29035a) {
            a.mo29873a();
        }
        this.f29035a.clear();
    }
}
