package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hr1<T> implements e70<Object> {

    /* renamed from: a */
    private final WeakReference<T> f32809a;

    /* renamed from: b */
    private final String f32810b;

    /* renamed from: c */
    private final e70<T> f32811c;

    /* renamed from: d */
    final /* synthetic */ ir1 f32812d;

    /* synthetic */ hr1(ir1 ir1, WeakReference weakReference, String str, e70 e70, gr1 gr1) {
        this.f32812d = ir1;
        this.f32809a = weakReference;
        this.f32810b = str;
        this.f32811c = e70;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        Object obj2 = this.f32809a.get();
        if (obj2 == null) {
            this.f32812d.mo32760k(this.f32810b, this);
        } else {
            this.f32811c.mo18854a(obj2, map);
        }
    }
}
