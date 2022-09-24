package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.h3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public enum C9529h3 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C9552k1.class, C9552k1.class, C9552k1.f45714c),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b */
    private final Class<?> f45668b;

    /* renamed from: c */
    private final Class<?> f45669c;

    /* renamed from: d */
    private final Object f45670d;

    private C9529h3(Class<?> cls, Class<?> cls2, Object obj) {
        this.f45668b = cls;
        this.f45669c = cls2;
        this.f45670d = obj;
    }

    /* renamed from: d */
    public final Class<?> mo38420d() {
        return this.f45669c;
    }
}
