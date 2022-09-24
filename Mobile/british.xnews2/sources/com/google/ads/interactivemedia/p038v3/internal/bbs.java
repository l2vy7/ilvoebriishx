package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbs */
/* compiled from: IMASDK */
public enum bbs implements bkn {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f16038g;

    private bbs(int i) {
        this.f16038g = i;
    }

    /* renamed from: a */
    public static bbs m15543a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i == 4) {
            return NIST_P521;
        }
        if (i != 5) {
            return null;
        }
        return CURVE25519;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(bbs.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        bbs bbs = UNRECOGNIZED;
        if (this != bbs) {
            sb.append(" number=");
            if (this != bbs) {
                sb.append(this.f16038g);
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
