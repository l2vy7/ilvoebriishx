package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.clearcut.a1 */
public enum C8848a1 {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, C8868c1.MAP, C8960n1.VOID);
    

    /* renamed from: q0 */
    private static final C8848a1[] f44332q0 = null;

    /* renamed from: r0 */
    private static final Type[] f44334r0 = null;

    /* renamed from: b */
    private final C8960n1 f44344b;

    /* renamed from: c */
    private final int f44345c;

    /* renamed from: d */
    private final C8868c1 f44346d;

    /* renamed from: e */
    private final Class<?> f44347e;

    /* renamed from: f */
    private final boolean f44348f;

    static {
        int i;
        f44334r0 = new Type[0];
        C8848a1[] values = values();
        f44332q0 = new C8848a1[values.length];
        for (C8848a1 a1Var : values) {
            f44332q0[a1Var.f44345c] = a1Var;
        }
    }

    private C8848a1(int i, C8868c1 c1Var, C8960n1 n1Var) {
        int i2;
        this.f44345c = i;
        this.f44346d = c1Var;
        this.f44344b = n1Var;
        int i3 = C8856b1.f44398a[c1Var.ordinal()];
        boolean z = true;
        this.f44347e = (i3 == 1 || i3 == 2) ? n1Var.mo37046d() : null;
        this.f44348f = (c1Var != C8868c1.SCALAR || (i2 = C8856b1.f44399b[n1Var.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: d */
    public final int mo36812d() {
        return this.f44345c;
    }
}
