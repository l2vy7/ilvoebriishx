package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum ws3 {
    DOUBLE(xs3.DOUBLE, 1),
    FLOAT(xs3.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(xs3.BOOLEAN, 0),
    STRING(xs3.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(xs3.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(xs3.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final xs3 f40898b;

    private ws3(xs3 xs3, int i) {
        this.f40898b = xs3;
    }

    /* renamed from: d */
    public final xs3 mo35670d() {
        return this.f40898b;
    }
}
