package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aud */
/* compiled from: IMASDK */
final class aud<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f15750a;

    /* renamed from: b */
    private final Object f15751b;

    aud(aue<K, V> aue) {
        Object[] objArr = new Object[aue.size()];
        Object[] objArr2 = new Object[aue.size()];
        avu<Map.Entry<K, V>> a = aue.entrySet().iterator();
        int i = 0;
        while (a.hasNext()) {
            Map.Entry next = a.next();
            objArr[i] = next.getKey();
            objArr2[i] = next.getValue();
            i++;
        }
        this.f15750a = objArr;
        this.f15751b = objArr2;
    }

    /* renamed from: a */
    static final auc<K, V> m14835a(int i) {
        return new auc<>(i);
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        Object obj = this.f15750a;
        if (!(obj instanceof aul)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.f15751b;
            auc a = m14835a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.mo14540b(objArr[i], objArr2[i]);
            }
            return a.mo14539a();
        }
        aul aul = (aul) obj;
        auc a2 = m14835a(aul.size());
        avu a3 = aul.iterator();
        avu a4 = ((att) this.f15751b).iterator();
        while (a3.hasNext()) {
            a2.mo14540b(a3.next(), a4.next());
        }
        return a2.mo14539a();
    }
}
