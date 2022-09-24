package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.cd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8477cd {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C8796wb.class, C8796wb.class, C8796wb.f44177c),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b */
    private final Class<?> f43383b;

    /* renamed from: c */
    private final Class<?> f43384c;

    /* renamed from: d */
    private final Object f43385d;

    private C8477cd(Class<?> cls, Class<?> cls2, Object obj) {
        this.f43383b = cls;
        this.f43384c = cls2;
        this.f43385d = obj;
    }

    /* renamed from: d */
    public final Class<?> mo36416d() {
        return this.f43384c;
    }
}
