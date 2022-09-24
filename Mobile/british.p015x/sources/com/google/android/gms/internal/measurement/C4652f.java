package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C4652f implements Iterable, C9306q, C9244m {

    /* renamed from: b */
    final SortedMap f21233b;

    /* renamed from: c */
    final Map f21234c;

    public C4652f() {
        this.f21233b = new TreeMap();
        this.f21234c = new TreeMap();
    }

    /* renamed from: a */
    public final boolean mo19176a(String str) {
        return SessionDescription.ATTR_LENGTH.equals(str) || this.f21234c.containsKey(str);
    }

    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return C9108d0.m42764a(str, this, r4Var, list);
        }
        return C9214k.m43143a(this, new C9369u(str), r4Var, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.C9306q) r2.f21234c.get(r3);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C9306q mo19178c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.i r3 = new com.google.android.gms.internal.measurement.i
            int r0 = r2.mo19182g()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo19176a(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f21234c
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C9306q) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.q r3 = com.google.android.gms.internal.measurement.C9306q.f45372d0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4652f.mo19178c(java.lang.String):com.google.android.gms.internal.measurement.q");
    }

    /* renamed from: e */
    public final void mo19179e(String str, C9306q qVar) {
        if (qVar == null) {
            this.f21234c.remove(str);
        } else {
            this.f21234c.put(str, qVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4652f)) {
            return false;
        }
        C4652f fVar = (C4652f) obj;
        if (mo19182g() != fVar.mo19182g()) {
            return false;
        }
        if (this.f21233b.isEmpty()) {
            return fVar.f21233b.isEmpty();
        }
        for (int intValue = ((Integer) this.f21233b.firstKey()).intValue(); intValue <= ((Integer) this.f21233b.lastKey()).intValue(); intValue++) {
            if (!mo19183h(intValue).equals(fVar.mo19183h(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo19181f() {
        return this.f21233b.size();
    }

    /* renamed from: g */
    public final int mo19182g() {
        if (this.f21233b.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f21233b.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.C9306q) r1.f21233b.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C9306q mo19183h(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo19182g()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo19194x(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f21233b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C9306q) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C9306q.f45372d0
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4652f.mo19183h(int):com.google.android.gms.internal.measurement.q");
    }

    public final int hashCode() {
        return this.f21233b.hashCode() * 31;
    }

    /* renamed from: i */
    public final String mo19185i(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f21233b.isEmpty()) {
            for (int i = 0; i < mo19182g(); i++) {
                C9306q h = mo19183h(i);
                sb.append(str);
                if (!(h instanceof C9384v) && !(h instanceof C9275o)) {
                    sb.append(h.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator iterator() {
        return new C9123e(this);
    }

    /* renamed from: j */
    public final Iterator mo19187j() {
        return this.f21233b.keySet().iterator();
    }

    /* renamed from: q */
    public final List mo19188q() {
        ArrayList arrayList = new ArrayList(mo19182g());
        for (int i = 0; i < mo19182g(); i++) {
            arrayList.add(mo19183h(i));
        }
        return arrayList;
    }

    /* renamed from: r */
    public final void mo19189r() {
        this.f21233b.clear();
    }

    /* renamed from: t */
    public final void mo19190t(int i, C9306q qVar) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= mo19182g()) {
            mo19193v(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f21233b.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f21233b;
                Integer valueOf = Integer.valueOf(intValue);
                C9306q qVar2 = (C9306q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo19193v(intValue + 1, qVar2);
                    this.f21233b.remove(valueOf);
                }
            }
            mo19193v(i, qVar);
        }
    }

    public final String toString() {
        return mo19185i(",");
    }

    /* renamed from: u */
    public final void mo19192u(int i) {
        int intValue = ((Integer) this.f21233b.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f21233b.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f21233b;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f21233b.put(valueOf, C9306q.f45372d0);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f21233b.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f21233b;
                    Integer valueOf2 = Integer.valueOf(i);
                    C9306q qVar = (C9306q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f21233b.put(Integer.valueOf(i - 1), qVar);
                        this.f21233b.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: v */
    public final void mo19193v(int i, C9306q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (qVar == null) {
            this.f21233b.remove(Integer.valueOf(i));
        } else {
            this.f21233b.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: x */
    public final boolean mo19194x(int i) {
        if (i >= 0 && i <= ((Integer) this.f21233b.lastKey()).intValue()) {
            return this.f21233b.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final C9306q zzd() {
        C4652f fVar = new C4652f();
        for (Map.Entry entry : this.f21233b.entrySet()) {
            if (entry.getValue() instanceof C9244m) {
                fVar.f21233b.put((Integer) entry.getKey(), (C9306q) entry.getValue());
            } else {
                fVar.f21233b.put((Integer) entry.getKey(), ((C9306q) entry.getValue()).zzd());
            }
        }
        return fVar;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        if (this.f21233b.size() == 1) {
            return mo19183h(0).zzh();
        }
        if (this.f21233b.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return mo19185i(",");
    }

    public final Iterator zzl() {
        return new C9107d(this, this.f21233b.keySet().iterator(), this.f21234c.keySet().iterator());
    }

    public C4652f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo19193v(i, (C9306q) list.get(i));
            }
        }
    }
}
