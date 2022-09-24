package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ble */
/* compiled from: IMASDK */
final class ble implements bll {

    /* renamed from: a */
    private final bll[] f16627a;

    ble(bll... bllArr) {
        this.f16627a = bllArr;
    }

    /* renamed from: a */
    public final boolean mo15430a(Class<?> cls) {
        bll[] bllArr = this.f16627a;
        for (int i = 0; i < 2; i++) {
            if (bllArr[i].mo15430a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final blk mo15431b(Class<?> cls) {
        bll[] bllArr = this.f16627a;
        for (int i = 0; i < 2; i++) {
            bll bll = bllArr[i];
            if (bll.mo15430a(cls)) {
                return bll.mo15431b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
