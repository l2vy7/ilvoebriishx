package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.a3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4606a3 implements C8071q2 {

    /* renamed from: a */
    private final C8142s3 f20091a;

    /* renamed from: b */
    private final C7706g3 f20092b = new C7706g3(7, 128);

    /* renamed from: c */
    private final C7706g3 f20093c = new C7706g3(8, 128);

    /* renamed from: d */
    private final C7706g3 f20094d = new C7706g3(6, 128);

    /* renamed from: e */
    private long f20095e;

    /* renamed from: f */
    private final boolean[] f20096f = new boolean[3];

    /* renamed from: g */
    private String f20097g;

    /* renamed from: h */
    private ad4 f20098h;

    /* renamed from: i */
    private C8355y2 f20099i;

    /* renamed from: j */
    private boolean f20100j;

    /* renamed from: k */
    private long f20101k = C6540C.TIME_UNSET;

    /* renamed from: l */
    private boolean f20102l;

    /* renamed from: m */
    private final uq2 f20103m = new uq2();

    public C4606a3(C8142s3 s3Var, boolean z, boolean z2) {
        this.f20091a = s3Var;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: d */
    private final void m20172d(byte[] bArr, int i, int i2) {
        if (!this.f20100j) {
            this.f20092b.mo31999a(bArr, i, i2);
            this.f20093c.mo31999a(bArr, i, i2);
        }
        this.f20094d.mo31999a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo18072a(uq2 uq2) {
        nu1.m20743b(this.f20098h);
        int i = d13.f20195a;
        int k = uq2.mo35241k();
        int l = uq2.mo35242l();
        byte[] h = uq2.mo35238h();
        this.f20095e += (long) uq2.mo35239i();
        yc4.m39857b(this.f20098h, uq2, uq2.mo35239i());
        while (true) {
            int a = kh2.m33958a(h, k, l, this.f20096f);
            if (a != l) {
                int i2 = a + 3;
                byte b = h[i2] & 31;
                int i3 = a - k;
                if (i3 > 0) {
                    m20172d(h, k, a);
                }
                int i4 = l - a;
                long j = this.f20095e - ((long) i4);
                int i5 = i3 < 0 ? -i3 : 0;
                long j2 = this.f20101k;
                if (!this.f20100j) {
                    this.f20092b.mo32002d(i5);
                    this.f20093c.mo32002d(i5);
                    if (!this.f20100j) {
                        if (this.f20092b.mo32003e() && this.f20093c.mo32003e()) {
                            ArrayList arrayList = new ArrayList();
                            C7706g3 g3Var = this.f20092b;
                            arrayList.add(Arrays.copyOf(g3Var.f32121d, g3Var.f32122e));
                            C7706g3 g3Var2 = this.f20093c;
                            arrayList.add(Arrays.copyOf(g3Var2.f32121d, g3Var2.f32122e));
                            C7706g3 g3Var3 = this.f20092b;
                            jg2 d = kh2.m33961d(g3Var3.f32121d, 4, g3Var3.f32122e);
                            C7706g3 g3Var4 = this.f20093c;
                            if2 c = kh2.m33960c(g3Var4.f32121d, 4, g3Var4.f32122e);
                            String a2 = qw1.m36768a(d.f33879a, d.f33880b, d.f33881c);
                            ad4 ad4 = this.f20098h;
                            ge4 ge4 = new ge4();
                            ge4.mo32081h(this.f20097g);
                            ge4.mo32093s(MimeTypes.VIDEO_H264);
                            ge4.mo32078f0(a2);
                            ge4.mo32098x(d.f33883e);
                            ge4.mo32077f(d.f33884f);
                            ge4.mo32090p(d.f33885g);
                            ge4.mo32083i(arrayList);
                            ad4.mo30354a(ge4.mo32099y());
                            this.f20100j = true;
                            this.f20099i.mo35836b(d);
                            this.f20099i.mo35835a(c);
                            this.f20092b.mo32000b();
                            this.f20093c.mo32000b();
                        }
                    } else if (this.f20092b.mo32003e()) {
                        C7706g3 g3Var5 = this.f20092b;
                        this.f20099i.mo35836b(kh2.m33961d(g3Var5.f32121d, 4, g3Var5.f32122e));
                        this.f20092b.mo32000b();
                    } else if (this.f20093c.mo32003e()) {
                        C7706g3 g3Var6 = this.f20093c;
                        this.f20099i.mo35835a(kh2.m33960c(g3Var6.f32121d, 4, g3Var6.f32122e));
                        this.f20093c.mo32000b();
                    }
                }
                if (this.f20094d.mo32002d(i5)) {
                    C7706g3 g3Var7 = this.f20094d;
                    this.f20103m.mo35234d(this.f20094d.f32121d, kh2.m33959b(g3Var7.f32121d, g3Var7.f32122e));
                    this.f20103m.mo35236f(4);
                    this.f20091a.mo34654a(j2, this.f20103m);
                }
                if (this.f20099i.mo35839e(j, i4, this.f20100j, this.f20102l)) {
                    this.f20102l = false;
                }
                long j3 = this.f20101k;
                if (!this.f20100j) {
                    this.f20092b.mo32001c(b);
                    this.f20093c.mo32001c(b);
                }
                this.f20094d.mo32001c(b);
                this.f20099i.mo35838d(j, b, j3);
                k = i2;
            } else {
                m20172d(h, k, l);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f20097g = e4Var.mo31470b();
        ad4 m = yb4.mo18211m(e4Var.mo31469a(), 2);
        this.f20098h = m;
        this.f20099i = new C8355y2(m, false, false);
        this.f20091a.mo34655b(yb4, e4Var);
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f20101k = j;
        }
        this.f20102l |= (i & 2) != 0;
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f20095e = 0;
        this.f20102l = false;
        this.f20101k = C6540C.TIME_UNSET;
        kh2.m33962e(this.f20096f);
        this.f20092b.mo32000b();
        this.f20093c.mo32000b();
        this.f20094d.mo32000b();
        C8355y2 y2Var = this.f20099i;
        if (y2Var != null) {
            y2Var.mo35837c();
        }
    }
}
