package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p94 {

    /* renamed from: g */
    private static final Comparator<o94> f37362g = l94.f34961b;

    /* renamed from: h */
    private static final Comparator<o94> f37363h = m94.f35460b;

    /* renamed from: a */
    private final ArrayList<o94> f37364a = new ArrayList<>();

    /* renamed from: b */
    private final o94[] f37365b = new o94[5];

    /* renamed from: c */
    private int f37366c = -1;

    /* renamed from: d */
    private int f37367d;

    /* renamed from: e */
    private int f37368e;

    /* renamed from: f */
    private int f37369f;

    public p94(int i) {
    }

    /* renamed from: a */
    public final float mo34098a(float f) {
        if (this.f37366c != 0) {
            Collections.sort(this.f37364a, f37363h);
            this.f37366c = 0;
        }
        float f2 = ((float) this.f37368e) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f37364a.size(); i2++) {
            o94 o94 = this.f37364a.get(i2);
            i += o94.f36349b;
            if (((float) i) >= f2) {
                return o94.f36350c;
            }
        }
        if (this.f37364a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<o94> arrayList = this.f37364a;
        return arrayList.get(arrayList.size() - 1).f36350c;
    }

    /* renamed from: b */
    public final void mo34099b(int i, float f) {
        o94 o94;
        if (this.f37366c != 1) {
            Collections.sort(this.f37364a, f37362g);
            this.f37366c = 1;
        }
        int i2 = this.f37369f;
        if (i2 > 0) {
            o94[] o94Arr = this.f37365b;
            int i3 = i2 - 1;
            this.f37369f = i3;
            o94 = o94Arr[i3];
        } else {
            o94 = new o94((n94) null);
        }
        int i4 = this.f37367d;
        this.f37367d = i4 + 1;
        o94.f36348a = i4;
        o94.f36349b = i;
        o94.f36350c = f;
        this.f37364a.add(o94);
        this.f37368e += i;
        while (true) {
            int i5 = this.f37368e;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                o94 o942 = this.f37364a.get(0);
                int i7 = o942.f36349b;
                if (i7 <= i6) {
                    this.f37368e -= i7;
                    this.f37364a.remove(0);
                    int i8 = this.f37369f;
                    if (i8 < 5) {
                        o94[] o94Arr2 = this.f37365b;
                        this.f37369f = i8 + 1;
                        o94Arr2[i8] = o942;
                    }
                } else {
                    o942.f36349b = i7 - i6;
                    this.f37368e -= i6;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo34100c() {
        this.f37364a.clear();
        this.f37366c = -1;
        this.f37367d = 0;
        this.f37368e = 0;
    }
}
