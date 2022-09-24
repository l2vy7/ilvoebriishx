package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aja */
/* compiled from: IMASDK */
public abstract class aja implements ajg {

    /* renamed from: a */
    private final boolean f15029a;

    /* renamed from: b */
    private final ArrayList<akp> f15030b = new ArrayList<>(1);

    /* renamed from: c */
    private int f15031c;

    /* renamed from: d */
    private ajk f15032d;

    protected aja(boolean z) {
        this.f15029a = z;
    }

    /* renamed from: b */
    public final void mo13295b(akp akp) {
        aup.m14890u(akp);
        if (!this.f15030b.contains(akp)) {
            this.f15030b.add(akp);
            this.f15031c++;
        }
    }

    /* renamed from: e */
    public Map mo13298e() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo13796g(ajk ajk) {
        for (int i = 0; i < this.f15031c; i++) {
            this.f15030b.get(i).mo13826h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo13797h(ajk ajk) {
        this.f15032d = ajk;
        for (int i = 0; i < this.f15031c; i++) {
            this.f15030b.get(i).mo13827i(ajk, this.f15029a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo13798i(int i) {
        ajk ajk = this.f15032d;
        int i2 = amm.f15298a;
        for (int i3 = 0; i3 < this.f15031c; i3++) {
            this.f15030b.get(i3).mo13824f(ajk, this.f15029a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo13799j() {
        ajk ajk = this.f15032d;
        int i = amm.f15298a;
        for (int i2 = 0; i2 < this.f15031c; i2++) {
            this.f15030b.get(i2).mo13825g(ajk, this.f15029a);
        }
        this.f15032d = null;
    }
}
