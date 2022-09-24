package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.j4 */
public enum C8930j4 {
    DOUBLE(C8970o4.DOUBLE, 1),
    FLOAT(C8970o4.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C8970o4.BOOLEAN, 0),
    STRING(C8970o4.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C8970o4.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C8970o4.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final C8970o4 f44585b;

    /* renamed from: c */
    private final int f44586c;

    private C8930j4(C8970o4 o4Var, int i) {
        this.f44585b = o4Var;
        this.f44586c = i;
    }

    /* renamed from: d */
    public final C8970o4 mo36982d() {
        return this.f44585b;
    }
}
