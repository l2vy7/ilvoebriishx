package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t54 extends n44<Integer> {

    /* renamed from: s */
    private static final C7764ho f39287s;

    /* renamed from: j */
    private final f54[] f39288j;

    /* renamed from: k */
    private final gi0[] f39289k;

    /* renamed from: l */
    private final ArrayList<f54> f39290l;

    /* renamed from: m */
    private final Map<Object, Long> f39291m;

    /* renamed from: n */
    private final p73<Object, j44> f39292n;

    /* renamed from: o */
    private int f39293o = -1;

    /* renamed from: p */
    private long[][] f39294p;

    /* renamed from: q */
    private s54 f39295q;

    /* renamed from: r */
    private final p44 f39296r;

    static {
        C7490a4 a4Var = new C7490a4();
        a4Var.mo30301a("MergingMediaSource");
        f39287s = a4Var.mo30303c();
    }

    public t54(boolean z, boolean z2, f54... f54Arr) {
        p44 p44 = new p44();
        this.f39288j = f54Arr;
        this.f39296r = p44;
        this.f39290l = new ArrayList<>(Arrays.asList(f54Arr));
        this.f39289k = new gi0[f54Arr.length];
        this.f39294p = new long[0][];
        this.f39291m = new HashMap();
        this.f39292n = y73.m39786a(8).mo35378b(2).mo34866c();
    }

    /* renamed from: d */
    public final C7764ho mo18986d() {
        f54[] f54Arr = this.f39288j;
        return f54Arr.length > 0 ? f54Arr[0].mo18986d() : f39287s;
    }

    /* renamed from: g */
    public final void mo18987g(b54 b54) {
        r54 r54 = (r54) b54;
        int i = 0;
        while (true) {
            f54[] f54Arr = this.f39288j;
            if (i < f54Arr.length) {
                f54Arr[i].mo18987g(r54.mo34506h(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final b54 mo18988k(c54 c54, o84 o84, long j) {
        int length = this.f39288j.length;
        b54[] b54Arr = new b54[length];
        int a = this.f39289k[0].mo32133a(c54.f34474a);
        for (int i = 0; i < length; i++) {
            b54Arr[i] = this.f39288j[i].mo18988k(c54.mo30857c(this.f39289k[i].mo32135f(a)), o84, j - this.f39294p[a][i]);
        }
        return new r54(this.f39296r, this.f39294p[a], b54Arr, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo18989t(mt1 mt1) {
        super.mo18989t(mt1);
        for (int i = 0; i < this.f39288j.length; i++) {
            mo33631z(Integer.valueOf(i), this.f39288j[i]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo18990v() {
        super.mo18990v();
        Arrays.fill(this.f39289k, (Object) null);
        this.f39293o = -1;
        this.f39295q = null;
        this.f39290l.clear();
        Collections.addAll(this.f39290l, this.f39288j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ c54 mo18991x(Object obj, c54 c54) {
        if (((Integer) obj).intValue() == 0) {
            return c54;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final /* bridge */ /* synthetic */ void mo18992y(Object obj, f54 f54, gi0 gi0) {
        int i;
        if (this.f39295q == null) {
            if (this.f39293o == -1) {
                i = gi0.mo31950b();
                this.f39293o = i;
            } else {
                int b = gi0.mo31950b();
                int i2 = this.f39293o;
                if (b == i2) {
                    i = i2;
                } else {
                    this.f39295q = new s54(0);
                    return;
                }
            }
            if (this.f39294p.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.f39289k.length;
                iArr[0] = i;
                this.f39294p = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.f39290l.remove(f54);
            this.f39289k[((Integer) obj).intValue()] = gi0;
            if (this.f39290l.isEmpty()) {
                mo31769u(this.f39289k[0]);
            }
        }
    }

    public final void zzv() throws IOException {
        s54 s54 = this.f39295q;
        if (s54 == null) {
            super.zzv();
            return;
        }
        throw s54;
    }
}
