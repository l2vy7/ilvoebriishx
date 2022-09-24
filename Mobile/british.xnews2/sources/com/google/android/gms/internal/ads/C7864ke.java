package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ke */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7864ke {

    /* renamed from: a */
    public final C8158sj f34258a;

    /* renamed from: b */
    public final Object f34259b;

    /* renamed from: c */
    public final int f34260c;

    /* renamed from: d */
    public final C7649ek[] f34261d = new C7649ek[2];

    /* renamed from: e */
    public final boolean[] f34262e = new boolean[2];

    /* renamed from: f */
    public final long f34263f;

    /* renamed from: g */
    public int f34264g;

    /* renamed from: h */
    public long f34265h;

    /* renamed from: i */
    public boolean f34266i;

    /* renamed from: j */
    public boolean f34267j;

    /* renamed from: k */
    public boolean f34268k;

    /* renamed from: l */
    public C7864ke f34269l;

    /* renamed from: m */
    public C8409zk f34270m;

    /* renamed from: n */
    private final C8224ue[] f34271n;

    /* renamed from: o */
    private final C8261ve[] f34272o;

    /* renamed from: p */
    private final C8373yk f34273p;

    /* renamed from: q */
    private final C8229uj f34274q;

    /* renamed from: r */
    private C8409zk f34275r;

    /* renamed from: s */
    private final jr0 f34276s;

    public C7864ke(C8224ue[] ueVarArr, C8261ve[] veVarArr, long j, C8373yk ykVar, jr0 jr0, C8229uj ujVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.f34271n = ueVarArr;
        this.f34272o = veVarArr;
        this.f34263f = j;
        this.f34273p = ykVar;
        this.f34276s = jr0;
        this.f34274q = ujVar;
        Objects.requireNonNull(obj);
        this.f34259b = obj;
        this.f34260c = i;
        this.f34264g = i2;
        this.f34266i = z;
        this.f34265h = j2;
        this.f34258a = ujVar.mo34345b(i2, jr0.mo32968l());
    }

    /* renamed from: a */
    public final long mo33068a(long j, boolean z) {
        return mo33069b(j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo33069b(long j, boolean z, boolean[] zArr) {
        C8301wk wkVar = this.f34270m.f42487b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f34262e;
            if (z || !this.f34270m.mo36070a(this.f34275r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long c = this.f34258a.mo33907c(wkVar.mo35641b(), this.f34262e, this.f34261d, zArr, j);
        this.f34275r = this.f34270m;
        this.f34268k = false;
        int i2 = 0;
        while (true) {
            C7649ek[] ekVarArr = this.f34261d;
            if (i2 < 2) {
                if (ekVarArr[i2] != null) {
                    C8195tl.m37900e(wkVar.mo35640a(i2) != null);
                    this.f34268k = true;
                } else {
                    C8195tl.m37900e(wkVar.mo35640a(i2) == null);
                }
                i2++;
            } else {
                this.f34276s.mo32960d(this.f34271n, this.f34270m.f42486a, wkVar);
                return c;
            }
        }
    }

    /* renamed from: c */
    public final void mo33070c() {
        try {
            this.f34274q.mo34344a(this.f34258a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    /* renamed from: d */
    public final boolean mo33071d() {
        return this.f34267j && (!this.f34268k || this.f34258a.zzg() == Long.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean mo33072e() throws C7536be {
        C8409zk a = this.f34273p.mo35195a(this.f34272o, this.f34258a.zzn());
        C8409zk zkVar = this.f34275r;
        if (zkVar != null) {
            int i = 0;
            while (i < 2) {
                if (a.mo36070a(zkVar, i)) {
                    i++;
                }
            }
            return false;
        }
        this.f34270m = a;
        return true;
    }
}
