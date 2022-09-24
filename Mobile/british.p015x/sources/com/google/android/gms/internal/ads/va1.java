package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class va1 implements yd1 {

    /* renamed from: a */
    private final boolean f40368a;

    /* renamed from: b */
    private final ArrayList<mt1> f40369b = new ArrayList<>(1);

    /* renamed from: c */
    private int f40370c;

    /* renamed from: d */
    private ci1 f40371d;

    protected va1(boolean z) {
        this.f40368a = z;
    }

    /* renamed from: h */
    public final void mo30796h(mt1 mt1) {
        Objects.requireNonNull(mt1);
        if (!this.f40369b.contains(mt1)) {
            this.f40369b.add(mt1);
            this.f40370c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo35395j(int i) {
        ci1 ci1 = this.f40371d;
        int i2 = d13.f20195a;
        for (int i3 = 0; i3 < this.f40370c; i3++) {
            this.f40369b.get(i3).mo33586b(this, ci1, this.f40368a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo35396k() {
        ci1 ci1 = this.f40371d;
        int i = d13.f20195a;
        for (int i2 = 0; i2 < this.f40370c; i2++) {
            this.f40369b.get(i2).mo33588p(this, ci1, this.f40368a);
        }
        this.f40371d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo35397l(ci1 ci1) {
        for (int i = 0; i < this.f40370c; i++) {
            this.f40369b.get(i).mo33587o(this, ci1, this.f40368a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo35398m(ci1 ci1) {
        this.f40371d = ci1;
        for (int i = 0; i < this.f40370c; i++) {
            this.f40369b.get(i).mo33589x(this, ci1, this.f40368a);
        }
    }

    public /* synthetic */ Map zza() {
        return Collections.emptyMap();
    }
}
