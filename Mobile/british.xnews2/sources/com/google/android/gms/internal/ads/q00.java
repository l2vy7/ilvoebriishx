package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class q00 {
    /* renamed from: a */
    static List<String> m36265a() {
        ArrayList arrayList = new ArrayList();
        m36267c(arrayList, s10.m37297c("gad:dynamite_module:experiment_id", ""));
        m36267c(arrayList, c20.f30208a);
        m36267c(arrayList, c20.f30209b);
        m36267c(arrayList, c20.f30210c);
        m36267c(arrayList, c20.f30211d);
        m36267c(arrayList, c20.f30212e);
        m36267c(arrayList, c20.f30218k);
        m36267c(arrayList, c20.f30213f);
        m36267c(arrayList, c20.f30214g);
        m36267c(arrayList, c20.f30215h);
        m36267c(arrayList, c20.f30216i);
        m36267c(arrayList, c20.f30217j);
        return arrayList;
    }

    /* renamed from: b */
    static List<String> m36266b() {
        ArrayList arrayList = new ArrayList();
        m36267c(arrayList, o20.f36245a);
        return arrayList;
    }

    /* renamed from: c */
    private static void m36267c(List<String> list, s10<String> s10) {
        String e = s10.mo34648e();
        if (!TextUtils.isEmpty(e)) {
            list.add(e);
        }
    }
}
