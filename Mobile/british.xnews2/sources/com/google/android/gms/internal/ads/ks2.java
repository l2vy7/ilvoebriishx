package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ks2 {

    /* renamed from: a */
    private final ir2 f34466a;

    /* renamed from: b */
    private final lr2 f34467b;

    /* renamed from: c */
    private final f42 f34468c;

    /* renamed from: d */
    private final sx2 f34469d;

    public ks2(f42 f42, sx2 sx2, ir2 ir2, lr2 lr2) {
        this.f34466a = ir2;
        this.f34467b = lr2;
        this.f34468c = f42;
        this.f34469d = sx2;
    }

    /* renamed from: a */
    public final void mo33170a(List<String> list) {
        for (String b : list) {
            mo33171b(b, 2);
        }
    }

    /* renamed from: b */
    public final void mo33171b(String str, int i) {
        if (!this.f34466a.f33477g0) {
            this.f34469d.mo34829b(str);
            return;
        }
        this.f34468c.mo31747f(new h42(zzt.zzA().currentTimeMillis(), this.f34467b.f35215b, str, i));
    }

    /* renamed from: c */
    public final void mo33172c(List<String> list, int i) {
        for (String b : list) {
            mo33171b(b, i);
        }
    }
}
