package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nk1 implements r61<w61> {

    /* renamed from: a */
    private final Map<String, r42<w61>> f36034a;

    /* renamed from: b */
    private final Map<String, r42<dm1>> f36035b;

    /* renamed from: c */
    private final Map<String, i72<dm1>> f36036c;

    /* renamed from: d */
    private final iv3<r61<m41>> f36037d;

    /* renamed from: e */
    private final tm1 f36038e;

    nk1(Map<String, r42<w61>> map, Map<String, r42<dm1>> map2, Map<String, i72<dm1>> map3, iv3<r61<m41>> iv3, tm1 tm1) {
        this.f36034a = map;
        this.f36035b = map2;
        this.f36036c = map3;
        this.f36037d = iv3;
        this.f36038e = tm1;
    }

    /* renamed from: b */
    public final r42<w61> mo33709b(int i, String str) {
        r42 b;
        r42<w61> r42 = this.f36034a.get(str);
        if (r42 != null) {
            return r42;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            i72 i72 = this.f36036c.get(str);
            if (i72 != null) {
                return new s42(i72, v61.f40314a);
            }
            r42 r422 = this.f36035b.get(str);
            if (r422 == null) {
                return null;
            }
            return w61.m39044a(r422);
        } else if (this.f36038e.mo34983e() == null || (b = this.f36037d.zzb().mo33709b(i, str)) == null) {
            return null;
        } else {
            return w61.m39044a(b);
        }
    }
}
