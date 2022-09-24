package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.ea */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9134ea {

    /* renamed from: c */
    private static final C9134ea f45016c = new C9134ea();

    /* renamed from: a */
    private final C9194ia f45017a = new C9269n9();

    /* renamed from: b */
    private final ConcurrentMap f45018b = new ConcurrentHashMap();

    private C9134ea() {
    }

    /* renamed from: a */
    public static C9134ea m42831a() {
        return f45016c;
    }

    /* renamed from: b */
    public final C9179ha mo37546b(Class cls) {
        C9453z8.m43975f(cls, "messageType");
        C9179ha haVar = (C9179ha) this.f45018b.get(cls);
        if (haVar == null) {
            haVar = this.f45017a.mo37648a(cls);
            C9453z8.m43975f(cls, "messageType");
            C9453z8.m43975f(haVar, "schema");
            C9179ha haVar2 = (C9179ha) this.f45018b.putIfAbsent(cls, haVar);
            return haVar2 == null ? haVar : haVar2;
        }
    }
}
