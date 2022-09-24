package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum yp3 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(eo3.class, eo3.class, eo3.f31444c),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b */
    private final Class<?> f41962b;

    /* renamed from: c */
    private final Class<?> f41963c;

    /* renamed from: d */
    private final Object f41964d;

    private yp3(Class<?> cls, Class<?> cls2, Object obj) {
        this.f41962b = cls;
        this.f41963c = cls2;
        this.f41964d = obj;
    }

    /* renamed from: d */
    public final Class<?> mo35954d() {
        return this.f41963c;
    }
}
