package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ko */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7874ko implements Comparator<C8093qo> {
    C7874ko(C7948mo moVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C8093qo qoVar = (C8093qo) obj;
        C8093qo qoVar2 = (C8093qo) obj2;
        int i = qoVar.f38207c - qoVar2.f38207c;
        if (i != 0) {
            return i;
        }
        return (int) (qoVar.f38205a - qoVar2.f38205a);
    }
}
