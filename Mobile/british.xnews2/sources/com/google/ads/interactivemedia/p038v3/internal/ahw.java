package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahw */
final /* synthetic */ class ahw implements Comparator {

    /* renamed from: a */
    static final Comparator f14889a = new ahw();

    /* renamed from: b */
    static final Comparator f14890b = new ahw((byte[]) null);

    /* renamed from: c */
    static final Comparator f14891c = new ahw((char[]) null);

    /* renamed from: d */
    private final /* synthetic */ int f14892d = 0;

    private ahw() {
    }

    private ahw(byte[] bArr) {
    }

    private ahw(char[] cArr) {
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.f14892d;
        if (i == 0) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i2 = aif.f14979a;
            if (num.intValue() == -1) {
                if (num2.intValue() == -1) {
                    return 0;
                }
                return -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        } else if (i == 1) {
            return ((C4120ke) obj2).f17677h - ((C4120ke) obj).f17677h;
        } else {
            Integer num3 = (Integer) obj;
            Integer num4 = (Integer) obj2;
            int i3 = aif.f14979a;
            return 0;
        }
    }
}
