package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C4547a;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import p130p3.C5902a;
import p130p3.C5903b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ce0 {
    /* renamed from: a */
    public static int m30976a(C5902a aVar) {
        C5902a aVar2 = C5902a.INVALID_REQUEST;
        C5903b bVar = C5903b.UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            return ordinal != 2 ? 0 : 2;
        }
        return 3;
    }

    /* renamed from: b */
    public static C4547a m30977b(zzbfd zzbfd, boolean z) {
        C5903b bVar;
        List<String> list = zzbfd.f42944f;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zzbfd.f42941c);
        int i = zzbfd.f42943e;
        if (i == 1) {
            bVar = C5903b.MALE;
        } else if (i != 2) {
            bVar = C5903b.UNKNOWN;
        } else {
            bVar = C5903b.FEMALE;
        }
        return new C4547a(date, bVar, hashSet, z, zzbfd.f42950l);
    }
}
