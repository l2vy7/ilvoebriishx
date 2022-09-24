package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f27854a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f27855b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f27856c = new ArrayList();

    public final zzbh zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.f27854a.size()) {
            double doubleValue = this.f27856c.get(i).doubleValue();
            double doubleValue2 = this.f27855b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f27854a.add(i, str);
        this.f27856c.add(i, Double.valueOf(d));
        this.f27855b.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbj zzb() {
        return new zzbj(this, (zzbi) null);
    }
}
