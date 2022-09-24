package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i64 extends f44 implements z54 {

    /* renamed from: g */
    private final C7764ho f33113g;

    /* renamed from: h */
    private final C7685fj f33114h;

    /* renamed from: i */
    private final xc1 f33115i;

    /* renamed from: j */
    private final l24 f33116j;

    /* renamed from: k */
    private final int f33117k;

    /* renamed from: l */
    private boolean f33118l = true;

    /* renamed from: m */
    private long f33119m = C6540C.TIME_UNSET;

    /* renamed from: n */
    private boolean f33120n;

    /* renamed from: o */
    private boolean f33121o;

    /* renamed from: p */
    private mt1 f33122p;

    /* renamed from: q */
    private final f64 f33123q;

    /* renamed from: r */
    private final u84 f33124r;

    /* synthetic */ i64(C7764ho hoVar, xc1 xc1, f64 f64, l24 l24, u84 u84, int i, h64 h64, byte[] bArr) {
        C7685fj fjVar = hoVar.f32786b;
        Objects.requireNonNull(fjVar);
        this.f33114h = fjVar;
        this.f33113g = hoVar;
        this.f33115i = xc1;
        this.f33123q = f64;
        this.f33116j = l24;
        this.f33124r = u84;
        this.f33117k = i;
    }

    /* renamed from: x */
    private final void m33092x() {
        long j = this.f33119m;
        boolean z = this.f33120n;
        boolean z2 = this.f33121o;
        C7764ho hoVar = this.f33113g;
        v64 v64 = r1;
        v64 v642 = new v64(C6540C.TIME_UNSET, C6540C.TIME_UNSET, C6540C.TIME_UNSET, j, j, 0, 0, z, false, false, (Object) null, hoVar, z2 ? hoVar.f32788d : null);
        mo31769u(this.f33118l ? new e64(this, v64) : v64);
    }

    /* renamed from: d */
    public final C7764ho mo18986d() {
        return this.f33113g;
    }

    /* renamed from: f */
    public final void mo32565f(long j, boolean z, boolean z2) {
        if (j == C6540C.TIME_UNSET) {
            j = this.f33119m;
        }
        if (this.f33118l || this.f33119m != j || this.f33120n != z || this.f33121o != z2) {
            this.f33119m = j;
            this.f33120n = z;
            this.f33121o = z2;
            this.f33118l = false;
            m33092x();
        }
    }

    /* renamed from: g */
    public final void mo18987g(b54 b54) {
        ((d64) b54).mo18216s();
    }

    /* renamed from: k */
    public final b54 mo18988k(c54 c54, o84 o84, long j) {
        yd1 zza = this.f33115i.zza();
        mt1 mt1 = this.f33122p;
        if (mt1 != null) {
            zza.mo30796h(mt1);
        }
        Uri uri = this.f33114h.f31774a;
        h44 h44 = new h44(this.f33123q.f31655a);
        l24 l24 = this.f33116j;
        f24 n = mo31763n(c54);
        u84 u84 = this.f33124r;
        m54 p = mo31765p(c54);
        String str = this.f33114h.f31777d;
        return new d64(uri, zza, h44, l24, n, u84, p, this, o84, (String) null, this.f33117k, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo18989t(mt1 mt1) {
        this.f33122p = mt1;
        m33092x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo18990v() {
    }

    public final void zzv() {
    }
}
