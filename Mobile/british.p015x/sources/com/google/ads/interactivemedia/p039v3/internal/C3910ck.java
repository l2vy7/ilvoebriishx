package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.C3759Ad;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ck */
/* compiled from: IMASDK */
public final class C3910ck implements AdEvent {

    /* renamed from: a */
    private final AdEvent.AdEventType f16821a;

    /* renamed from: b */
    private final C3759Ad f16822b;

    /* renamed from: c */
    private final Map<String, String> f16823c;

    C3910ck(AdEvent.AdEventType adEventType, C3759Ad ad, Map<String, String> map) {
        this.f16821a = adEventType;
        this.f16822b = ad;
        this.f16823c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3910ck)) {
            return false;
        }
        C3910ck ckVar = (C3910ck) obj;
        return this.f16821a == ckVar.f16821a && arq.m14618b(this.f16822b, ckVar.f16822b) && arq.m14618b(this.f16823c, ckVar.f16823c);
    }

    public final C3759Ad getAd() {
        return this.f16822b;
    }

    public final Map<String, String> getAdData() {
        return this.f16823c;
    }

    public final AdEvent.AdEventType getType() {
        return this.f16821a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16821a, this.f16822b, this.f16823c});
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(String.format("AdEvent[type=%s, ad=%s", new Object[]{this.f16821a, this.f16822b}));
        if (this.f16823c == null) {
            str = "]";
        } else {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder("{");
            Iterator<Map.Entry<String, String>> it = this.f16823c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                sb.append((String) next.getKey());
                sb.append(": ");
                sb.append((String) next.getValue());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            objArr[0] = sb.toString();
            str = String.format(", adData=%s]", objArr);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
