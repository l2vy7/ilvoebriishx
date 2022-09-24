package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbj {

    /* renamed from: a */
    private final String[] f27857a;

    /* renamed from: b */
    private final double[] f27858b;

    /* renamed from: c */
    private final double[] f27859c;

    /* renamed from: d */
    private final int[] f27860d;

    /* renamed from: e */
    private int f27861e = 0;

    /* synthetic */ zzbj(zzbh zzbh, zzbi zzbi) {
        int size = zzbh.f27855b.size();
        this.f27857a = (String[]) zzbh.f27854a.toArray(new String[size]);
        this.f27858b = m28823a(zzbh.f27855b);
        this.f27859c = m28823a(zzbh.f27856c);
        this.f27860d = new int[size];
    }

    /* renamed from: a */
    private static final double[] m28823a(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final List<zzbg> zza() {
        ArrayList arrayList = new ArrayList(this.f27857a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f27857a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f27859c[i];
            double d2 = this.f27858b[i];
            int i2 = this.f27860d[i];
            double d3 = (double) i2;
            double d4 = (double) this.f27861e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzbg(str, d, d2, d3 / d4, i2));
            i++;
        }
    }

    public final void zzb(double d) {
        this.f27861e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f27859c;
            if (i < dArr.length) {
                double d2 = dArr[i];
                if (d2 <= d && d < this.f27858b[i]) {
                    int[] iArr = this.f27860d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= d2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
