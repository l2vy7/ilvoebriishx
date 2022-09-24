package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atk */
/* compiled from: IMASDK */
final class atk extends atq {

    /* renamed from: a */
    final /* synthetic */ atr f15707a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    atk(atr atr) {
        super(atr);
        this.f15707a = atr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14448a(int i) {
        return new ati(this.f15707a, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = this.f15707a.mo14474b(key);
            if (b == -1 || !arq.m14618b(value, this.f15707a.f15719b[b])) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int d = aup.m14873d(key);
        int c = this.f15707a.mo14475c(key, d);
        if (c == -1 || !arq.m14618b(value, this.f15707a.f15719b[c])) {
            return false;
        }
        this.f15707a.mo14483g(c, d);
        return true;
    }
}
