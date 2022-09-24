package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbt */
/* compiled from: IMASDK */
public enum bbt implements bkn {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f16047h;

    private bbt(int i) {
        this.f16047h = i;
    }

    /* renamed from: a */
    public static bbt m15544a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(bbt.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        bbt bbt = UNRECOGNIZED;
        if (this != bbt) {
            sb.append(" number=");
            if (this != bbt) {
                sb.append(this.f16047h);
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
