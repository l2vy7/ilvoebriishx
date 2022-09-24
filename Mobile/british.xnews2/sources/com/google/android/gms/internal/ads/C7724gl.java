package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7724gl {

    /* renamed from: a */
    private final C7507al[] f32356a = new C7507al[1];

    /* renamed from: b */
    private int f32357b;

    /* renamed from: c */
    private int f32358c;

    /* renamed from: d */
    private int f32359d = 0;

    /* renamed from: e */
    private C7507al[] f32360e = new C7507al[100];

    public C7724gl(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo32160a() {
        return this.f32358c * C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    /* renamed from: b */
    public final synchronized C7507al mo32161b() {
        C7507al alVar;
        this.f32358c++;
        int i = this.f32359d;
        if (i > 0) {
            C7507al[] alVarArr = this.f32360e;
            int i2 = i - 1;
            this.f32359d = i2;
            alVar = alVarArr[i2];
            alVarArr[i2] = null;
        } else {
            alVar = new C7507al(new byte[C6540C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
        }
        return alVar;
    }

    /* renamed from: c */
    public final synchronized void mo32162c(C7507al alVar) {
        C7507al[] alVarArr = this.f32356a;
        alVarArr[0] = alVar;
        mo32163d(alVarArr);
    }

    /* renamed from: d */
    public final synchronized void mo32163d(C7507al[] alVarArr) {
        int i = this.f32359d;
        int i2 = i + r1;
        C7507al[] alVarArr2 = this.f32360e;
        int length = alVarArr2.length;
        if (i2 >= length) {
            this.f32360e = (C7507al[]) Arrays.copyOf(alVarArr2, Math.max(length + length, i2));
        }
        for (C7507al alVar : alVarArr) {
            byte[] bArr = alVar.f29678a;
            C7507al[] alVarArr3 = this.f32360e;
            int i3 = this.f32359d;
            this.f32359d = i3 + 1;
            alVarArr3[i3] = alVar;
        }
        this.f32358c -= alVarArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo32164e() {
        mo32165f(0);
    }

    /* renamed from: f */
    public final synchronized void mo32165f(int i) {
        int i2 = this.f32357b;
        this.f32357b = i;
        if (i < i2) {
            mo32166g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo32166g() {
        int max = Math.max(0, C7836jm.m33642d(this.f32357b, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f32358c);
        int i = this.f32359d;
        if (max < i) {
            Arrays.fill(this.f32360e, max, i, (Object) null);
            this.f32359d = max;
        }
    }
}
