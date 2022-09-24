package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.n1 */
public enum C8960n1 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C8847a0.class, C8847a0.class, C8847a0.f44287c),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: b */
    private final Class<?> f44643b;

    /* renamed from: c */
    private final Class<?> f44644c;

    /* renamed from: d */
    private final Object f44645d;

    private C8960n1(Class<?> cls, Class<?> cls2, Object obj) {
        this.f44643b = cls;
        this.f44644c = cls2;
        this.f44645d = obj;
    }

    /* renamed from: d */
    public final Class<?> mo37046d() {
        return this.f44644c;
    }
}
