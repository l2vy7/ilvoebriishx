package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.mb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public enum C9256mb {
    DOUBLE(C9271nb.DOUBLE, 1),
    FLOAT(C9271nb.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C9271nb.BOOLEAN, 0),
    STRING(C9271nb.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C9271nb.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C9271nb.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final C9271nb f45221b;

    private C9256mb(C9271nb nbVar, int i) {
        this.f45221b = nbVar;
    }

    /* renamed from: d */
    public final C9271nb mo37735d() {
        return this.f45221b;
    }
}
