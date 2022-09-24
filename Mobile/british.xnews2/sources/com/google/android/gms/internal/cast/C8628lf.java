package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.lf */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public enum C8628lf {
    DOUBLE(C8644mf.DOUBLE, 1),
    FLOAT(C8644mf.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C8644mf.BOOLEAN, 0),
    STRING(C8644mf.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C8644mf.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C8644mf.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final C8644mf f43690b;

    private C8628lf(C8644mf mfVar, int i) {
        this.f43690b = mfVar;
    }

    /* renamed from: d */
    public final C8644mf mo36603d() {
        return this.f43690b;
    }
}
