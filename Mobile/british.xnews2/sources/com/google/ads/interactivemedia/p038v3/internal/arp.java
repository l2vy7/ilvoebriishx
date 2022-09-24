package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arp */
/* compiled from: IMASDK */
public final class arp {

    /* renamed from: a */
    private final String f15618a;

    /* renamed from: b */
    private final aro f15619b;

    /* renamed from: c */
    private aro f15620c;

    /* synthetic */ arp(String str) {
        aro aro = new aro((byte[]) null);
        this.f15619b = aro;
        this.f15620c = aro;
        ars.m14627g(str);
        this.f15618a = str;
    }

    /* renamed from: a */
    public final arp mo14246a(Object obj) {
        aro aro = new aro((byte[]) null);
        this.f15620c.f15617b = aro;
        this.f15620c = aro;
        aro.f15616a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f15618a);
        sb.append('{');
        aro aro = this.f15619b.f15617b;
        String str = "";
        while (aro != null) {
            Object obj = aro.f15616a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            aro = aro.f15617b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
