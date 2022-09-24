package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bka */
/* compiled from: IMASDK */
public final class bka {

    /* renamed from: a */
    static final bka f16512a = new bka((byte[]) null);

    /* renamed from: b */
    private static volatile boolean f16513b = false;

    /* renamed from: c */
    private static volatile bka f16514c;

    /* renamed from: d */
    private final Map<bjz, avr> f16515d;

    bka() {
        this.f16515d = new HashMap();
    }

    /* renamed from: a */
    public static bka m16275a() {
        bka bka = f16514c;
        if (bka == null) {
            synchronized (bka.class) {
                bka = f16514c;
                if (bka == null) {
                    bka = f16512a;
                    f16514c = bka;
                }
            }
        }
        return bka;
    }

    /* renamed from: b */
    public final <ContainingType extends bln> avr mo15366b(ContainingType containingtype, int i) {
        return this.f16515d.get(new bjz(containingtype, i));
    }

    bka(byte[] bArr) {
        this.f16515d = Collections.emptyMap();
    }
}
