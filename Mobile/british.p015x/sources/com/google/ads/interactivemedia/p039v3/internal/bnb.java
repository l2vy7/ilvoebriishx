package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bnb */
/* compiled from: IMASDK */
public enum bnb {
    DOUBLE(bnc.DOUBLE, 1),
    FLOAT(bnc.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(bnc.BOOLEAN, 0),
    STRING(bnc.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(bnc.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(bnc.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: s */
    private final bnc f16741s;

    /* renamed from: t */
    private final int f16742t;

    private bnb(bnc bnc, int i) {
        this.f16741s = bnc;
        this.f16742t = i;
    }

    /* renamed from: a */
    public final bnc mo15555a() {
        return this.f16741s;
    }
}
