package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.w6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8287w6 extends C7820j6 {
    public C8287w6(C8253v6 v6Var, SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: a */
    static List<C7929m5> m39042a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String m5Var : (List) next.getValue()) {
                    arrayList.add(new C7929m5((String) next.getKey(), m5Var));
                }
            }
        }
        return arrayList;
    }
}
