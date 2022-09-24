package com.google.ads.interactivemedia.p039v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ama */
/* compiled from: IMASDK */
public final class ama {

    /* renamed from: a */
    private static final Comparator<alz> f15266a = aly.f15257b;

    /* renamed from: b */
    private static final Comparator<alz> f15267b = aly.f15256a;

    /* renamed from: c */
    private final int f15268c = 2000;

    /* renamed from: d */
    private final ArrayList<alz> f15269d = new ArrayList<>();

    /* renamed from: e */
    private final alz[] f15270e = new alz[5];

    /* renamed from: f */
    private int f15271f = -1;

    /* renamed from: g */
    private int f15272g;

    /* renamed from: h */
    private int f15273h;

    /* renamed from: i */
    private int f15274i;

    public ama(int i) {
    }

    /* renamed from: a */
    public final void mo13980a() {
        this.f15269d.clear();
        this.f15271f = -1;
        this.f15272g = 0;
        this.f15273h = 0;
    }

    /* renamed from: b */
    public final void mo13981b(int i, float f) {
        alz alz;
        if (this.f15271f != 1) {
            Collections.sort(this.f15269d, f15266a);
            this.f15271f = 1;
        }
        int i2 = this.f15274i;
        if (i2 > 0) {
            alz[] alzArr = this.f15270e;
            int i3 = i2 - 1;
            this.f15274i = i3;
            alz = alzArr[i3];
        } else {
            alz = new alz((byte[]) null);
        }
        int i4 = this.f15272g;
        this.f15272g = i4 + 1;
        alz.f15259a = i4;
        alz.f15260b = i;
        alz.f15261c = f;
        this.f15269d.add(alz);
        this.f15273h += i;
        while (true) {
            int i5 = this.f15273h;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                alz alz2 = this.f15269d.get(0);
                int i7 = alz2.f15260b;
                if (i7 <= i6) {
                    this.f15273h -= i7;
                    this.f15269d.remove(0);
                    int i8 = this.f15274i;
                    if (i8 < 5) {
                        alz[] alzArr2 = this.f15270e;
                        this.f15274i = i8 + 1;
                        alzArr2[i8] = alz2;
                    }
                } else {
                    alz2.f15260b = i7 - i6;
                    this.f15273h -= i6;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final float mo13982c() {
        if (this.f15271f != 0) {
            Collections.sort(this.f15269d, f15267b);
            this.f15271f = 0;
        }
        float f = ((float) this.f15273h) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f15269d.size(); i2++) {
            alz alz = this.f15269d.get(i2);
            i += alz.f15260b;
            if (((float) i) >= f) {
                return alz.f15261c;
            }
        }
        if (this.f15269d.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<alz> arrayList = this.f15269d;
        return arrayList.get(arrayList.size() - 1).f15261c;
    }
}
