package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.startapp.C12425x3;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.dk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7612dk implements C7539bh {

    /* renamed from: a */
    private final C7506ak f30814a = new C7506ak();

    /* renamed from: b */
    private final C8408zj f30815b = new C8408zj();

    /* renamed from: c */
    private final C7544bm f30816c = new C7544bm(32);

    /* renamed from: d */
    private final AtomicInteger f30817d = new AtomicInteger();

    /* renamed from: e */
    private C7542bk f30818e;

    /* renamed from: f */
    private C7542bk f30819f;

    /* renamed from: g */
    private zzapg f30820g;

    /* renamed from: h */
    private zzapg f30821h;

    /* renamed from: i */
    private long f30822i;

    /* renamed from: j */
    private int f30823j = C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* renamed from: k */
    private C7577ck f30824k;

    /* renamed from: l */
    private final C7724gl f30825l;

    public C7612dk(C7724gl glVar, byte[] bArr) {
        this.f30825l = glVar;
        C7542bk bkVar = new C7542bk(0, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f30818e = bkVar;
        this.f30819f = bkVar;
    }

    /* renamed from: o */
    private final int m31430o(int i) {
        if (this.f30823j == 65536) {
            this.f30823j = 0;
            C7542bk bkVar = this.f30819f;
            if (bkVar.f30027c) {
                this.f30819f = bkVar.f30029e;
            }
            C7542bk bkVar2 = this.f30819f;
            C7507al b = this.f30825l.mo32161b();
            C7542bk bkVar3 = new C7542bk(this.f30819f.f30026b, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
            bkVar2.f30028d = b;
            bkVar2.f30029e = bkVar3;
            bkVar2.f30027c = true;
        }
        return Math.min(i, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE - this.f30823j);
    }

    /* renamed from: p */
    private final void m31431p() {
        this.f30814a.mo30402g();
        C7542bk bkVar = this.f30818e;
        if (bkVar.f30027c) {
            C7542bk bkVar2 = this.f30819f;
            boolean z = bkVar2.f30027c;
            int i = (z ? 1 : 0) + (((int) (bkVar2.f30025a - bkVar.f30025a)) / C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
            C7507al[] alVarArr = new C7507al[i];
            for (int i2 = 0; i2 < i; i2++) {
                alVarArr[i2] = bkVar.f30028d;
                bkVar.f30028d = null;
                bkVar = bkVar.f30029e;
            }
            this.f30825l.mo32163d(alVarArr);
        }
        C7542bk bkVar3 = new C7542bk(0, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f30818e = bkVar3;
        this.f30819f = bkVar3;
        this.f30822i = 0;
        this.f30823j = C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f30825l.mo32166g();
    }

    /* renamed from: q */
    private final void m31432q(long j) {
        while (true) {
            C7542bk bkVar = this.f30818e;
            if (j >= bkVar.f30026b) {
                this.f30825l.mo32162c(bkVar.f30028d);
                C7542bk bkVar2 = this.f30818e;
                bkVar2.f30028d = null;
                this.f30818e = bkVar2.f30029e;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final void m31433r() {
        if (!this.f30817d.compareAndSet(1, 0)) {
            m31431p();
        }
    }

    /* renamed from: s */
    private final void m31434s(long j, byte[] bArr, int i) {
        m31432q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f30818e.f30025a);
            int min = Math.min(i - i2, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE - i3);
            C7507al alVar = this.f30818e.f30028d;
            System.arraycopy(alVar.f29678a, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f30818e.f30026b) {
                this.f30825l.mo32162c(alVar);
                C7542bk bkVar = this.f30818e;
                bkVar.f30028d = null;
                this.f30818e = bkVar.f30029e;
            }
        }
    }

    /* renamed from: t */
    private final boolean m31435t() {
        return this.f30817d.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public final void mo30672a(zzapg zzapg) {
        zzapg zzapg2 = zzapg == null ? null : zzapg;
        boolean k = this.f30814a.mo30406k(zzapg2);
        this.f30821h = zzapg;
        C7577ck ckVar = this.f30824k;
        if (ckVar != null && k) {
            ckVar.mo30942j(zzapg2);
        }
    }

    /* renamed from: b */
    public final void mo30673b(C7544bm bmVar, int i) {
        if (m31435t()) {
            while (i > 0) {
                int o = m31430o(i);
                bmVar.mo30720q(this.f30819f.f30028d.f29678a, this.f30823j, o);
                this.f30823j += o;
                this.f30822i += (long) o;
                i -= o;
            }
            m31433r();
            return;
        }
        bmVar.mo30726w(i);
    }

    /* renamed from: c */
    public final void mo30674c(long j, int i, int i2, int i3, C7503ah ahVar) {
        if (m31435t()) {
            try {
                this.f30814a.mo30403h(j, i, this.f30822i - ((long) i2), i2, ahVar);
            } finally {
                m31433r();
            }
        } else {
            long j2 = j;
            this.f30814a.mo30404i(j);
        }
    }

    /* renamed from: d */
    public final int mo30675d(C8121rg rgVar, int i, boolean z) throws IOException, InterruptedException {
        if (!m31435t()) {
            int b = rgVar.mo34532b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = rgVar.mo34531a(this.f30819f.f30028d.f29678a, this.f30823j, m31430o(i));
            if (a != -1) {
                this.f30823j += a;
                this.f30822i += (long) a;
                return a;
            }
            throw new EOFException();
        } finally {
            m31433r();
        }
    }

    /* renamed from: e */
    public final int mo31269e() {
        return this.f30814a.mo30396a();
    }

    /* renamed from: f */
    public final int mo31270f(C8083qe qeVar, C7940mg mgVar, boolean z, boolean z2, long j) {
        int i;
        C7940mg mgVar2 = mgVar;
        int b = this.f30814a.mo30397b(qeVar, mgVar, z, z2, this.f30820g, this.f30815b);
        if (b == -5) {
            this.f30820g = qeVar.f37994a;
            return -5;
        } else if (b != -4) {
            return -3;
        } else {
            if (!mgVar.mo32121f()) {
                if (mgVar2.f35511d < j) {
                    mgVar2.mo32116a(Integer.MIN_VALUE);
                }
                if (mgVar.mo33539i()) {
                    C8408zj zjVar = this.f30815b;
                    long j2 = zjVar.f42481b;
                    this.f30816c.mo30722s(1);
                    m31434s(j2, this.f30816c.f30037a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.f30816c.f30037a[0];
                    byte b3 = b2 & C12425x3.f55111d;
                    byte b4 = b2 & Byte.MAX_VALUE;
                    C7830jg jgVar = mgVar2.f35509b;
                    if (jgVar.f33869a == null) {
                        jgVar.f33869a = new byte[16];
                    }
                    m31434s(j3, jgVar.f33869a, b4);
                    long j4 = j3 + ((long) b4);
                    if (b3 != 0) {
                        this.f30816c.mo30722s(2);
                        m31434s(j4, this.f30816c.f30037a, 2);
                        j4 += 2;
                        i = this.f30816c.mo30713j();
                    } else {
                        i = 1;
                    }
                    C7830jg jgVar2 = mgVar2.f35509b;
                    int[] iArr = jgVar2.f33872d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = jgVar2.f33873e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (b3 != 0) {
                        int i2 = i * 6;
                        this.f30816c.mo30722s(i2);
                        m31434s(j4, this.f30816c.f30037a, i2);
                        j4 += (long) i2;
                        this.f30816c.mo30725v(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.f30816c.mo30713j();
                            iArr4[i3] = this.f30816c.mo30712i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zjVar.f42480a - ((int) (j4 - zjVar.f42481b));
                    }
                    C7503ah ahVar = zjVar.f42483d;
                    C7830jg jgVar3 = mgVar2.f35509b;
                    jgVar3.mo32885b(i, iArr2, iArr4, ahVar.f29639b, jgVar3.f33869a, 1);
                    long j5 = zjVar.f42481b;
                    int i4 = (int) (j4 - j5);
                    zjVar.f42481b = j5 + ((long) i4);
                    zjVar.f42480a -= i4;
                }
                mgVar2.mo33538h(this.f30815b.f42480a);
                C8408zj zjVar2 = this.f30815b;
                long j6 = zjVar2.f42481b;
                ByteBuffer byteBuffer = mgVar2.f35510c;
                int i5 = zjVar2.f42480a;
                m31432q(j6);
                while (i5 > 0) {
                    int i6 = (int) (j6 - this.f30818e.f30025a);
                    int min = Math.min(i5, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE - i6);
                    C7507al alVar = this.f30818e.f30028d;
                    byteBuffer.put(alVar.f29678a, i6, min);
                    j6 += (long) min;
                    i5 -= min;
                    if (j6 == this.f30818e.f30026b) {
                        this.f30825l.mo32162c(alVar);
                        C7542bk bkVar = this.f30818e;
                        bkVar.f30028d = null;
                        this.f30818e = bkVar.f30029e;
                    }
                }
                m31432q(this.f30815b.f42482c);
            }
            return -4;
        }
    }

    /* renamed from: g */
    public final long mo31271g() {
        return this.f30814a.mo30398c();
    }

    /* renamed from: h */
    public final zzapg mo31272h() {
        return this.f30814a.mo30401f();
    }

    /* renamed from: i */
    public final void mo31273i() {
        if (this.f30817d.getAndSet(2) == 0) {
            m31431p();
        }
    }

    /* renamed from: j */
    public final void mo31274j(boolean z) {
        int andSet = this.f30817d.getAndSet(true != z ? 2 : 0);
        m31431p();
        this.f30814a.mo30405j();
        if (andSet == 2) {
            this.f30820g = null;
        }
    }

    /* renamed from: k */
    public final void mo31275k(C7577ck ckVar) {
        this.f30824k = ckVar;
    }

    /* renamed from: l */
    public final void mo31276l() {
        long d = this.f30814a.mo30399d();
        if (d != -1) {
            m31432q(d);
        }
    }

    /* renamed from: m */
    public final boolean mo31277m() {
        return this.f30814a.mo30407l();
    }

    /* renamed from: n */
    public final boolean mo31278n(long j, boolean z) {
        long e = this.f30814a.mo30400e(j, z);
        if (e == -1) {
            return false;
        }
        m31432q(e);
        return true;
    }
}
