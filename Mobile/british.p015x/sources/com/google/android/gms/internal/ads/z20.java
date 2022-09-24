package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class z20 extends g30 {

    /* renamed from: j */
    private static final int f42274j;

    /* renamed from: k */
    private static final int f42275k;

    /* renamed from: l */
    static final int f42276l;

    /* renamed from: m */
    static final int f42277m;

    /* renamed from: b */
    private final String f42278b;

    /* renamed from: c */
    private final List<c30> f42279c = new ArrayList();

    /* renamed from: d */
    private final List<q30> f42280d = new ArrayList();

    /* renamed from: e */
    private final int f42281e;

    /* renamed from: f */
    private final int f42282f;

    /* renamed from: g */
    private final int f42283g;

    /* renamed from: h */
    private final int f42284h;

    /* renamed from: i */
    private final int f42285i;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f42274j = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        f42275k = rgb2;
        f42276l = rgb2;
        f42277m = rgb;
    }

    public z20(String str, List<c30> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.f42278b = str;
        for (int i5 = 0; i5 < list.size(); i5++) {
            c30 c30 = list.get(i5);
            this.f42279c.add(c30);
            this.f42280d.add(c30);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = f42276l;
        }
        this.f42281e = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = f42277m;
        }
        this.f42282f = i4;
        this.f42283g = num3 != null ? num3.intValue() : 12;
        this.f42284h = i;
        this.f42285i = i2;
    }

    /* renamed from: o6 */
    public final int mo35992o6() {
        return this.f42283g;
    }

    /* renamed from: p6 */
    public final List<c30> mo35993p6() {
        return this.f42279c;
    }

    public final int zzb() {
        return this.f42284h;
    }

    public final int zzc() {
        return this.f42285i;
    }

    public final int zzd() {
        return this.f42281e;
    }

    public final int zze() {
        return this.f42282f;
    }

    public final String zzg() {
        return this.f42278b;
    }

    public final List<q30> zzh() {
        return this.f42280d;
    }
}
