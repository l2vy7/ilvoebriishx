package com.google.android.gms.internal.cast;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.cast.ee */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8511ee {

    /* renamed from: c */
    private static final C8511ee f43448c = new C8511ee();

    /* renamed from: a */
    private final C8578ie f43449a = new C8658nd();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C8561he<?>> f43450b = new ConcurrentHashMap();

    private C8511ee() {
    }

    /* renamed from: a */
    public static C8511ee m40831a() {
        return f43448c;
    }

    /* renamed from: b */
    public final <T> C8561he<T> mo36471b(Class<T> cls) {
        C8443ad.m40690b(cls, "messageType");
        C8561he<T> heVar = (C8561he) this.f43450b.get(cls);
        if (heVar == null) {
            heVar = this.f43449a.mo36558a(cls);
            C8443ad.m40690b(cls, "messageType");
            C8443ad.m40690b(heVar, "schema");
            C8561he<T> putIfAbsent = this.f43450b.putIfAbsent(cls, heVar);
            return putIfAbsent == null ? heVar : putIfAbsent;
        }
    }
}
