package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.vision.t4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9628t4 {

    /* renamed from: c */
    private static final C9628t4 f45882c = new C9628t4();

    /* renamed from: a */
    private final C9651v4 f45883a = new C9627t3();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C9664w4<?>> f45884b = new ConcurrentHashMap();

    private C9628t4() {
    }

    /* renamed from: b */
    public static C9628t4 m44591b() {
        return f45882c;
    }

    /* renamed from: a */
    public final <T> C9664w4<T> mo38580a(Class<T> cls) {
        C9662w2.m44750d(cls, "messageType");
        C9664w4<T> w4Var = (C9664w4) this.f45884b.get(cls);
        if (w4Var != null) {
            return w4Var;
        }
        C9664w4<T> a = this.f45883a.mo38579a(cls);
        C9662w2.m44750d(cls, "messageType");
        C9662w2.m44750d(a, "schema");
        C9664w4<T> putIfAbsent = this.f45884b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: c */
    public final <T> C9664w4<T> mo38581c(T t) {
        return mo38580a(t.getClass());
    }
}
