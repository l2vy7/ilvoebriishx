package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.to */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8198to implements Comparator<C4613io> {
    public C8198to(C8234uo uoVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4613io ioVar = (C4613io) obj;
        C4613io ioVar2 = (C4613io) obj2;
        if (ioVar.mo18431d() >= ioVar2.mo18431d()) {
            if (ioVar.mo18431d() > ioVar2.mo18431d()) {
                return 1;
            }
            if (ioVar.mo18429b() >= ioVar2.mo18429b()) {
                if (ioVar.mo18429b() > ioVar2.mo18429b()) {
                    return 1;
                }
                float a = (ioVar.mo18428a() - ioVar.mo18431d()) * (ioVar.mo18430c() - ioVar.mo18429b());
                float a2 = (ioVar2.mo18428a() - ioVar2.mo18431d()) * (ioVar2.mo18430c() - ioVar2.mo18429b());
                if (a <= a2) {
                    if (a < a2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
