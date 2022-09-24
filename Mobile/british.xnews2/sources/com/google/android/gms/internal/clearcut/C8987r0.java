package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.r0 */
public final class C8987r0 {

    /* renamed from: b */
    private static final Class<?> f44729b = m42316a();

    /* renamed from: c */
    static final C8987r0 f44730c = new C8987r0(true);

    /* renamed from: a */
    private final Map<Object, Object> f44731a;

    C8987r0() {
        this.f44731a = new HashMap();
    }

    private C8987r0(boolean z) {
        this.f44731a = Collections.emptyMap();
    }

    /* renamed from: a */
    private static Class<?> m42316a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C8987r0 m42317b() {
        return C8980q0.m42274b();
    }
}
