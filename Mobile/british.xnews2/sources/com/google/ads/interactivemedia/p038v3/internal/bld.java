package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bld */
/* compiled from: IMASDK */
final class bld implements bll {

    /* renamed from: b */
    private static final bld f16625b = new bld((byte[]) null);

    /* renamed from: a */
    private final /* synthetic */ int f16626a = 0;

    bld() {
    }

    private bld(byte[] bArr) {
    }

    /* renamed from: c */
    public static bld m16390c() {
        return f16625b;
    }

    /* renamed from: a */
    public final boolean mo15430a(Class cls) {
        if (this.f16626a != 0) {
            return bkl.class.isAssignableFrom(cls);
        }
        return false;
    }

    /* renamed from: b */
    public final blk mo15431b(Class cls) {
        String str;
        Class cls2 = bkl.class;
        if (this.f16626a == 0) {
            throw new IllegalStateException("This should never be called.");
        } else if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unsupported message type: ".concat(name);
            } else {
                str = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str);
        } else {
            try {
                return (blk) bkl.m16306am(cls.asSubclass(cls2)).mo15393av(3);
            } catch (Exception e) {
                String name2 = cls.getName();
                throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
            }
        }
    }
}
