package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.c6 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public enum C9488c6 {
    DOUBLE(C9548j6.DOUBLE, 1),
    FLOAT(C9548j6.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C9548j6.BOOLEAN, 0),
    STRING(C9548j6.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C9548j6.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C9548j6.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: b */
    private final C9548j6 f45625b;

    /* renamed from: c */
    private final int f45626c;

    private C9488c6(C9548j6 j6Var, int i) {
        this.f45625b = j6Var;
        this.f45626c = i;
    }

    /* renamed from: d */
    public final C9548j6 mo38310d() {
        return this.f45625b;
    }
}
