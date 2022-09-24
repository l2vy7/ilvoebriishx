package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public enum C9624t0 implements C9689z2 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);
    

    /* renamed from: s */
    private static final C9681y2<C9624t0> f45874s = null;

    /* renamed from: b */
    private final int f45876b;

    static {
        f45874s = new C9660w0();
    }

    private C9624t0(int i) {
        this.f45876b = i;
    }

    /* renamed from: a */
    public static C9624t0 m44580a(int i) {
        switch (i) {
            case 0:
                return UNRECOGNIZED;
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case 9:
                return QR_CODE;
            case 10:
                return UPC_A;
            case 11:
                return UPC_E;
            case 12:
                return PDF417;
            case 13:
                return AZTEC;
            case 14:
                return DATABAR;
            case 16:
                return TEZ_CODE;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static C9474b3 m44581d() {
        return C9641v0.f45904a;
    }

    /* renamed from: e */
    public final int mo38237e() {
        return this.f45876b;
    }

    public final String toString() {
        return "<" + C9624t0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f45876b + " name=" + name() + '>';
    }
}
