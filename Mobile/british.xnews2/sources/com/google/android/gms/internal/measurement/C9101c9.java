package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public enum C9101c9 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C9329r7.class, C9329r7.class, C9329r7.f45419c),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: b */
    private final Class f44936b;

    /* renamed from: c */
    private final Class f44937c;

    /* renamed from: d */
    private final Object f44938d;

    private C9101c9(Class cls, Class cls2, Object obj) {
        this.f44936b = cls;
        this.f44937c = cls2;
        this.f44938d = obj;
    }

    /* renamed from: d */
    public final Class mo37457d() {
        return this.f44937c;
    }
}
