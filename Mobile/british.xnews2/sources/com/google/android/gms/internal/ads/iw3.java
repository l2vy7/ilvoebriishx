package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iw3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f33544a;

    /* renamed from: b */
    public bx3 f33545b;

    /* renamed from: c */
    public int f33546c;

    /* renamed from: d */
    public boolean f33547d;

    /* renamed from: e */
    public int f33548e;

    /* renamed from: f */
    public boolean f33549f;

    /* renamed from: g */
    public int f33550g;

    public iw3(bx3 bx3) {
        this.f33545b = bx3;
    }

    /* renamed from: a */
    public final void mo32779a(int i) {
        boolean z = true;
        if (true != (this.f33544a | i)) {
            z = false;
        }
        this.f33544a = z;
        this.f33546c += i;
    }

    /* renamed from: b */
    public final void mo32780b(int i) {
        this.f33544a = true;
        this.f33549f = true;
        this.f33550g = i;
    }

    /* renamed from: c */
    public final void mo32781c(bx3 bx3) {
        this.f33544a |= this.f33545b != bx3;
        this.f33545b = bx3;
    }

    /* renamed from: d */
    public final void mo32782d(int i) {
        boolean z = true;
        if (!this.f33547d || this.f33548e == 5) {
            this.f33544a = true;
            this.f33547d = true;
            this.f33548e = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        nu1.m20745d(z);
    }
}
