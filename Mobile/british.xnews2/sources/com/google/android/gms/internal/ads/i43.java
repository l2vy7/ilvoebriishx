package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
abstract class i43 extends g33<String> {

    /* renamed from: d */
    final CharSequence f20382d;

    /* renamed from: e */
    final m33 f20383e;

    /* renamed from: f */
    int f20384f = 0;

    /* renamed from: g */
    int f20385g;

    protected i43(k43 k43, CharSequence charSequence) {
        this.f20383e = k43.f34152a;
        this.f20385g = Integer.MAX_VALUE;
        this.f20382d = charSequence;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18341a() {
        int i;
        int i2 = this.f20384f;
        while (true) {
            int i3 = this.f20384f;
            if (i3 != -1) {
                int e = mo18408e(i3);
                if (e == -1) {
                    e = this.f20382d.length();
                    this.f20384f = -1;
                    i = -1;
                } else {
                    i = mo18407c(e);
                    this.f20384f = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f20384f = i4;
                    if (i4 > this.f20382d.length()) {
                        this.f20384f = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f20382d.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f20382d.charAt(e - 1);
                    }
                    int i5 = this.f20385g;
                    if (i5 == 1) {
                        e = this.f20382d.length();
                        this.f20384f = -1;
                        if (e > i2) {
                            this.f20382d.charAt(e - 1);
                        }
                    } else {
                        this.f20385g = i5 - 1;
                    }
                    return this.f20382d.subSequence(i2, e).toString();
                }
            } else {
                mo18342b();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo18407c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo18408e(int i);
}
