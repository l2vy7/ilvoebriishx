package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wo3 {

    /* renamed from: b */
    private static volatile wo3 f40836b;

    /* renamed from: c */
    private static volatile wo3 f40837c;

    /* renamed from: d */
    static final wo3 f40838d = new wo3(true);

    /* renamed from: a */
    private final Map<vo3, jp3<?, ?>> f40839a;

    wo3() {
        this.f40839a = new HashMap();
    }

    /* renamed from: a */
    public static wo3 m39219a() {
        wo3 wo3 = f40836b;
        if (wo3 == null) {
            synchronized (wo3.class) {
                wo3 = f40836b;
                if (wo3 == null) {
                    wo3 = f40838d;
                    f40836b = wo3;
                }
            }
        }
        return wo3;
    }

    /* renamed from: b */
    public static wo3 m39220b() {
        Class<wo3> cls = wo3.class;
        wo3 wo3 = f40837c;
        if (wo3 != null) {
            return wo3;
        }
        synchronized (cls) {
            wo3 wo32 = f40837c;
            if (wo32 != null) {
                return wo32;
            }
            wo3 b = fp3.m32211b(cls);
            f40837c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends uq3> jp3<ContainingType, ?> mo35651c(ContainingType containingtype, int i) {
        return this.f40839a.get(new vo3(containingtype, i));
    }

    wo3(boolean z) {
        this.f40839a = Collections.emptyMap();
    }
}
