package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.clearcut.x2 */
final class C9031x2 {

    /* renamed from: c */
    private static final C9031x2 f44793c = new C9031x2();

    /* renamed from: a */
    private final C8880d3 f44794a;

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C8870c3<?>> f44795b = new ConcurrentHashMap();

    private C9031x2() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        C8880d3 d3Var = null;
        for (int i = 0; i <= 0; i++) {
            d3Var = m42489c(strArr[0]);
            if (d3Var != null) {
                break;
            }
        }
        this.f44794a = d3Var == null ? new C8849a2() : d3Var;
    }

    /* renamed from: a */
    public static C9031x2 m42488a() {
        return f44793c;
    }

    /* renamed from: c */
    private static C8880d3 m42489c(String str) {
        try {
            return (C8880d3) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <T> C8870c3<T> mo37226b(Class<T> cls) {
        C8910h1.m41836e(cls, "messageType");
        C8870c3<T> c3Var = (C8870c3) this.f44795b.get(cls);
        if (c3Var != null) {
            return c3Var;
        }
        C8870c3<T> a = this.f44794a.mo36813a(cls);
        C8910h1.m41836e(cls, "messageType");
        C8910h1.m41836e(a, "schema");
        C8870c3<T> putIfAbsent = this.f44795b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: d */
    public final <T> C8870c3<T> mo37227d(T t) {
        return mo37226b(t.getClass());
    }
}
