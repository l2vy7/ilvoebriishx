package com.google.android.gms.internal.cast;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.cast.pb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8688pb implements Comparator<C8796wb> {
    C8688pb() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C8796wb wbVar = (C8796wb) obj;
        C8796wb wbVar2 = (C8796wb) obj2;
        C8672ob obVar = new C8672ob(wbVar);
        C8672ob obVar2 = new C8672ob(wbVar2);
        while (obVar.hasNext() && obVar2.hasNext()) {
            int compare = Integer.compare(obVar.zza() & 255, obVar2.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(wbVar.mo36697c(), wbVar2.mo36697c());
    }
}
