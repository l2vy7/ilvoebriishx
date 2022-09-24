package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.d0 */
/* compiled from: Sta */
public class C11839d0 {
    /* renamed from: a */
    public static List<AdDetails> m52129a(Context context, List<AdDetails> list, int i, Set<String> set, boolean z) {
        Context context2 = context;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z2 = false;
        for (AdDetails next : list) {
            ArrayList arrayList5 = (ArrayList) C5015nb.m22912a((List<String>) Arrays.asList(next.mo46268w()));
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(arrayList5.isEmpty() ? null : (String) arrayList5.get(0), next.mo46246c(), i2, next.mo46259o());
            boolean z3 = next.mo46246c() != null && next.mo46246c().startsWith("!");
            boolean a = C12437y.m53783a(context, z3 ? next.mo46246c().substring(1) : next.mo46246c(), next.mo46259o());
            boolean z4 = AdsCommonMetaData.f22242h.mo20878H() && ((a && !z3) || (!a && z3));
            arrayList3.add(appPresenceDetails);
            if (z4) {
                appPresenceDetails.mo46148a(a);
                appPresenceDetails.mo46150b(false);
                if (!z3) {
                    arrayList2.add(next);
                    arrayList4.add(appPresenceDetails);
                }
                set.add(next.mo46260p());
                z2 = true;
            } else {
                Set<String> set2 = set;
                arrayList.add(next);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i2 > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            for (AppPresenceDetails b : arrayList4.subList(0, min)) {
                b.mo46150b(true);
            }
        }
        if (z2) {
            SimpleTokenUtils.m23087f(context);
            if (z) {
                new C11810c0(context, arrayList3).mo45177a();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<AppPresenceDetails> m52130a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a = C5015nb.m22910a(str, "@tracking@", "@tracking@");
        if (a != null) {
            strArr = a.split(",");
        }
        String[] strArr2 = new String[0];
        String a2 = C5015nb.m22910a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a2 != null) {
            strArr2 = a2.split(",");
        }
        String[] strArr3 = new String[0];
        String a3 = C5015nb.m22910a(str, "@minAppVersion@", "@minAppVersion@");
        if (a3 != null) {
            strArr3 = a3.split(",");
        }
        int i2 = 0;
        while (i2 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(strArr.length > i2 ? strArr[i2] : null, strArr2[i2], i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        while (i2 < strArr.length) {
            arrayList.add(new AppPresenceDetails(strArr[i2], "", i, strArr3.length > i2 ? Integer.valueOf(strArr3[i2]).intValue() : 0));
            i2++;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Boolean m52128a(Context context, List<AppPresenceDetails> list, int i, Set<String> set, List<AppPresenceDetails> list2) {
        boolean z = false;
        for (AppPresenceDetails next : list) {
            boolean startsWith = next.mo46149b().startsWith("!");
            boolean a = C12437y.m53783a(context, startsWith ? next.mo46149b().substring(1) : next.mo46149b(), next.mo46146a());
            if ((!startsWith && a) || (startsWith && !a)) {
                next.mo46148a(a);
                z = i == 0;
                if (z && !startsWith) {
                    set.add(next.mo46149b());
                } else if (!z && next.mo46151c() != null) {
                    next.mo46147a(next.mo46151c() + "&isShown=" + next.mo46153e() + "&appPresence=" + next.mo46152d());
                }
            }
            list2.add(next);
        }
        if (z) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                list2.get(i2).mo46150b(false);
            }
        }
        return Boolean.valueOf(z);
    }
}
