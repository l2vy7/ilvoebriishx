package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qx3 extends vw3 {

    /* renamed from: A */
    private float f38321A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f38322B;

    /* renamed from: C */
    private List f38323C;

    /* renamed from: D */
    private boolean f38324D;

    /* renamed from: E */
    private boolean f38325E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public b34 f38326F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ky0 f38327G;

    /* renamed from: b */
    protected final hx3[] f38328b;

    /* renamed from: c */
    private final rx1 f38329c;

    /* renamed from: d */
    private final Context f38330d;

    /* renamed from: e */
    private final aw3 f38331e;

    /* renamed from: f */
    private final nx3 f38332f;

    /* renamed from: g */
    private final px3 f38333g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<m80> f38334h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final a04 f38335i;

    /* renamed from: j */
    private final w53 f38336j;

    /* renamed from: k */
    private final ka3 f38337k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final xx3 f38338l;

    /* renamed from: m */
    private final yx3 f38339m;

    /* renamed from: n */
    private final zx3 f38340n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8281w f38341o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8281w f38342p;

    /* renamed from: q */
    private AudioTrack f38343q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Object f38344r;

    /* renamed from: s */
    private Surface f38345s;

    /* renamed from: t */
    private int f38346t;

    /* renamed from: u */
    private int f38347u;

    /* renamed from: v */
    private int f38348v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public mc3 f38349w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public mc3 f38350x;

    /* renamed from: y */
    private int f38351y;

    /* renamed from: z */
    private oe3 f38352z;

    protected qx3(lx3 lx3) {
        qx3 qx3;
        Handler handler;
        px3 px3;
        nx3 nx3;
        aw3 aw3;
        rx1 rx1 = new rx1(ov1.f36608a);
        this.f38329c = rx1;
        try {
            Context applicationContext = lx3.f35279a.getApplicationContext();
            this.f38330d = applicationContext;
            a04 j = lx3.f35285g;
            this.f38335i = j;
            this.f38352z = lx3.f35287i;
            this.f38346t = 1;
            this.f38322B = false;
            nx3 nx32 = new nx3(this, (mx3) null);
            this.f38332f = nx32;
            px3 px32 = new px3((ox3) null);
            this.f38333g = px32;
            this.f38334h = new CopyOnWriteArraySet<>();
            Handler handler2 = new Handler(lx3.f35286h);
            hx3[] a = lx3.f35290l.mo32762a(handler2, nx32, nx32, nx32, nx32);
            this.f38328b = a;
            this.f38321A = 1.0f;
            if (d13.f20195a < 21) {
                AudioTrack audioTrack = this.f38343q;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.f38343q.release();
                    this.f38343q = null;
                }
                if (this.f38343q == null) {
                    this.f38343q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f38351y = this.f38343q.getAudioSessionId();
            } else {
                this.f38351y = xy3.m39689a(applicationContext);
            }
            this.f38323C = Collections.emptyList();
            this.f38324D = true;
            i40 i40 = new i40();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                i40.mo32548c(iArr);
                k60 e = i40.mo32550e();
                aw3 aw32 = r1;
                handler = handler2;
                px3 = px32;
                nx3 = nx32;
                aw3 aw33 = new aw3(a, lx3.f35281c, lx3.f35282d, lx3.f35283e, lx3.f35284f, j, true, lx3.f35288j, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, 15000, lx3.f35291m, 500, false, lx3.f35280b, lx3.f35286h, this, e, (byte[]) null);
                qx3 = this;
                aw3 = aw32;
            } catch (Throwable th) {
                th = th;
                qx3 = this;
                qx3.f38329c.mo34633e();
                throw th;
            }
            try {
                qx3.f38331e = aw3;
                nx3 nx33 = nx3;
                aw3.mo30520D(nx33);
                aw3.mo30519C(nx33);
                Handler handler3 = handler;
                qx3.f38336j = new w53(lx3.f35279a, handler3, nx33);
                qx3.f38337k = new ka3(lx3.f35279a, handler3, nx33);
                d13.m20317p((Object) null, (Object) null);
                xx3 xx3 = new xx3(lx3.f35279a, handler3, nx33);
                qx3.f38338l = xx3;
                int i = qx3.f38352z.f36452a;
                xx3.mo35818f(3);
                qx3.f38339m = new yx3(lx3.f35279a);
                qx3.f38340n = new zx3(lx3.f35279a);
                qx3.f38326F = m36778H(xx3);
                qx3.f38327G = ky0.f34736e;
                qx3.m36780J(1, 10, Integer.valueOf(qx3.f38351y));
                qx3.m36780J(2, 10, Integer.valueOf(qx3.f38351y));
                qx3.m36780J(1, 3, qx3.f38352z);
                qx3.m36780J(2, 4, Integer.valueOf(qx3.f38346t));
                qx3.m36780J(2, 5, 0);
                qx3.m36780J(1, 9, Boolean.valueOf(qx3.f38322B));
                px3 px33 = px3;
                qx3.m36780J(2, 7, px33);
                qx3.m36780J(6, 8, px33);
                rx1.mo34633e();
            } catch (Throwable th2) {
                th = th2;
                qx3.f38329c.mo34633e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            qx3 = this;
            qx3.f38329c.mo34633e();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static int m36777G(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static b34 m36778H(xx3 xx3) {
        return new b34(0, xx3.mo35816b(), xx3.mo35815a());
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m36779I(int i, int i2) {
        if (i != this.f38347u || i2 != this.f38348v) {
            this.f38347u = i;
            this.f38348v = i2;
            this.f38335i.mo18055l(i, i2);
            Iterator<m80> it = this.f38334h.iterator();
            while (it.hasNext()) {
                it.next().mo18055l(i, i2);
            }
        }
    }

    /* renamed from: J */
    private final void m36780J(int i, int i2, Object obj) {
        hx3[] hx3Arr = this.f38328b;
        int length = hx3Arr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            hx3 hx3 = hx3Arr[i3];
            if (hx3.zzb() == i) {
                ex3 B = this.f38331e.mo30518B(hx3);
                B.mo31685f(i2);
                B.mo31684e(obj);
                B.mo31683d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m36781K() {
        m36780J(1, 2, Float.valueOf(this.f38321A * this.f38337k.mo33052a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m36782L(Object obj) {
        boolean z;
        ArrayList<ex3> arrayList = new ArrayList<>();
        hx3[] hx3Arr = this.f38328b;
        int length = hx3Arr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            hx3 hx3 = hx3Arr[i];
            if (hx3.zzb() == 2) {
                ex3 B = this.f38331e.mo30518B(hx3);
                B.mo31685f(1);
                B.mo31684e(obj);
                B.mo31683d();
                arrayList.add(B);
            }
            i++;
        }
        Object obj2 = this.f38344r;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (ex3 i2 : arrayList) {
                    i2.mo31688i(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f38344r;
            Surface surface = this.f38345s;
            if (obj3 == surface) {
                surface.release();
                this.f38345s = null;
            }
        }
        this.f38344r = obj;
        if (z) {
            this.f38331e.mo30529l(false, vk3.m38833d(new lw3(3), 1003));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m36783M(boolean z, int i, int i2) {
        int i3 = 1;
        boolean z2 = z && i != -1;
        if (!z2 || i == 1) {
            i3 = 0;
        }
        this.f38331e.mo30528k(z2, i3, i2);
    }

    /* renamed from: N */
    private final void m36784N() {
        IllegalStateException illegalStateException;
        this.f38329c.mo34630b();
        if (Thread.currentThread() != this.f38331e.mo30517A().getThread()) {
            String d = d13.m20302d("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f38331e.mo30517A().getThread().getName());
            if (!this.f38324D) {
                if (this.f38325E) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                fc2.m20476b("SimpleExoPlayer", d, illegalStateException);
                this.f38325E = true;
                return;
            }
            throw new IllegalStateException(d);
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m36800o(qx3 qx3) {
        qx3.f38335i.mo18050g(qx3.f38322B);
        Iterator<m80> it = qx3.f38334h.iterator();
        while (it.hasNext()) {
            it.next().mo18050g(qx3.f38322B);
        }
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m36802q(qx3 qx3, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        qx3.m36782L(surface);
        qx3.f38345s = surface;
    }

    /* renamed from: t */
    static /* synthetic */ void m36805t(qx3 qx3) {
        int P = qx3.mo34430P();
        if (P == 2 || P == 3) {
            qx3.m36784N();
            qx3.f38331e.mo30530m();
            qx3.mo34429F();
            qx3.mo34429F();
        }
    }

    @Deprecated
    /* renamed from: A */
    public final void mo34425A(boolean z) {
        this.f38324D = false;
    }

    /* renamed from: B */
    public final void mo34426B(Surface surface) {
        m36784N();
        m36782L(surface);
        int i = surface == null ? 0 : -1;
        m36779I(i, i);
    }

    /* renamed from: C */
    public final void mo34427C(float f) {
        m36784N();
        float A = d13.m20270A(f, 0.0f, 1.0f);
        if (this.f38321A != A) {
            this.f38321A = A;
            m36781K();
            this.f38335i.mo18025K(A);
            Iterator<m80> it = this.f38334h.iterator();
            while (it.hasNext()) {
                it.next().mo18025K(A);
            }
        }
    }

    @Deprecated
    /* renamed from: D */
    public final void mo34428D(boolean z) {
        m36784N();
        this.f38337k.mo33053b(mo34429F(), 1);
        this.f38331e.mo30529l(false, (vk3) null);
        this.f38323C = Collections.emptyList();
    }

    /* renamed from: F */
    public final boolean mo34429F() {
        m36784N();
        return this.f38331e.mo30531n();
    }

    /* renamed from: P */
    public final int mo34430P() {
        m36784N();
        return this.f38331e.mo30532w();
    }

    /* renamed from: Q */
    public final int mo34431Q() {
        m36784N();
        this.f38331e.mo30533x();
        return 2;
    }

    /* renamed from: R */
    public final long mo34432R() {
        m36784N();
        return this.f38331e.mo30534y();
    }

    /* renamed from: S */
    public final long mo34433S() {
        m36784N();
        return this.f38331e.mo30535z();
    }

    /* renamed from: a */
    public final void mo30523a(int i, long j) {
        m36784N();
        this.f38335i.mo18038Y();
        this.f38331e.mo30523a(i, j);
    }

    /* renamed from: u */
    public final void mo34434u(c04 c04) {
        this.f38335i.mo18036W(c04);
    }

    /* renamed from: v */
    public final void mo34435v() {
        m36784N();
        boolean F = mo34429F();
        int b = this.f38337k.mo33053b(F, 2);
        m36783M(F, b, m36777G(F, b));
        this.f38331e.mo30525h();
    }

    /* renamed from: w */
    public final void mo34436w() {
        AudioTrack audioTrack;
        m36784N();
        if (d13.f20195a < 21 && (audioTrack = this.f38343q) != null) {
            audioTrack.release();
            this.f38343q = null;
        }
        this.f38338l.mo35817e();
        this.f38337k.mo33054d();
        this.f38331e.mo30526i();
        this.f38335i.mo18039Z();
        Surface surface = this.f38345s;
        if (surface != null) {
            surface.release();
            this.f38345s = null;
        }
        this.f38323C = Collections.emptyList();
    }

    /* renamed from: x */
    public final void mo34437x(c04 c04) {
        this.f38335i.mo18041a0(c04);
    }

    /* renamed from: y */
    public final void mo34438y(f54 f54) {
        m36784N();
        this.f38331e.mo30527j(Collections.singletonList(f54), true);
    }

    /* renamed from: z */
    public final void mo34439z(boolean z) {
        m36784N();
        int b = this.f38337k.mo33053b(z, mo34430P());
        m36783M(z, b, m36777G(z, b));
    }

    public final int zze() {
        m36784N();
        return this.f38331e.zze();
    }

    public final int zzf() {
        m36784N();
        return this.f38331e.zzf();
    }

    public final int zzg() {
        m36784N();
        return this.f38331e.zzg();
    }

    public final int zzh() {
        m36784N();
        return this.f38331e.zzh();
    }

    public final int zzi() {
        m36784N();
        return 0;
    }

    public final long zzj() {
        m36784N();
        return this.f38331e.zzj();
    }

    public final long zzk() {
        m36784N();
        return this.f38331e.zzk();
    }

    public final long zzl() {
        m36784N();
        return this.f38331e.zzl();
    }

    public final gi0 zzm() {
        m36784N();
        return this.f38331e.zzm();
    }

    public final boolean zzo() {
        m36784N();
        return false;
    }

    public final boolean zzp() {
        m36784N();
        return this.f38331e.zzp();
    }
}
