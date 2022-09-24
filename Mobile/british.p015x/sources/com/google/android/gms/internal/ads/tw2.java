package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tw2 {

    /* renamed from: a */
    private final C6483e f39559a;

    /* renamed from: b */
    private final Map<String, List<String>> f39560b = new HashMap();

    /* renamed from: c */
    private final Map<String, Long> f39561c = new HashMap();

    public tw2(C6483e eVar) {
        this.f39559a = eVar;
    }

    /* renamed from: d */
    private final void m38042d(String str, String str2) {
        if (!this.f39560b.containsKey(str)) {
            this.f39560b.put(str, new ArrayList());
        }
        this.f39560b.get(str).add(str2);
    }

    /* renamed from: a */
    public final List<sw2> mo35052a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f39560b.entrySet()) {
            int i = 0;
            if (((List) next.getValue()).size() > 1) {
                for (String sw2 : (List) next.getValue()) {
                    String str = (String) next.getKey();
                    i++;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(str);
                    sb.append(".");
                    sb.append(i);
                    arrayList.add(new sw2(sb.toString(), sw2));
                }
            } else {
                arrayList.add(new sw2((String) next.getKey(), (String) ((List) next.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo35053b(String str) {
        if (this.f39561c.containsKey(str)) {
            long elapsedRealtime = this.f39559a.elapsedRealtime();
            long longValue = this.f39561c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(20);
            sb.append(elapsedRealtime - longValue);
            m38042d(str, sb.toString());
            return;
        }
        this.f39561c.put(str, Long.valueOf(this.f39559a.elapsedRealtime()));
    }

    /* renamed from: c */
    public final void mo35054c(String str, String str2) {
        if (this.f39561c.containsKey(str)) {
            long elapsedRealtime = this.f39559a.elapsedRealtime();
            long longValue = this.f39561c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(str2.length() + 20);
            sb.append(str2);
            sb.append(elapsedRealtime - longValue);
            m38042d(str, sb.toString());
            return;
        }
        this.f39561c.put(str, Long.valueOf(this.f39559a.elapsedRealtime()));
    }
}
