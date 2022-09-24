package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dr0 extends sp0 implements TextureView.SurfaceTextureListener, bq0 {

    /* renamed from: d */
    private final mq0 f30966d;

    /* renamed from: e */
    private final nq0 f30967e;

    /* renamed from: f */
    private final boolean f30968f;

    /* renamed from: g */
    private final lq0 f30969g;

    /* renamed from: h */
    private rp0 f30970h;

    /* renamed from: i */
    private Surface f30971i;

    /* renamed from: j */
    private cq0 f30972j;

    /* renamed from: k */
    private String f30973k;

    /* renamed from: l */
    private String[] f30974l;

    /* renamed from: m */
    private boolean f30975m;

    /* renamed from: n */
    private int f30976n = 1;

    /* renamed from: o */
    private kq0 f30977o;

    /* renamed from: p */
    private final boolean f30978p;

    /* renamed from: q */
    private boolean f30979q;

    /* renamed from: r */
    private boolean f30980r;

    /* renamed from: s */
    private int f30981s;

    /* renamed from: t */
    private int f30982t;

    /* renamed from: u */
    private int f30983u;

    /* renamed from: v */
    private int f30984v;

    /* renamed from: w */
    private float f30985w;

    public dr0(Context context, nq0 nq0, mq0 mq0, boolean z, boolean z2, lq0 lq0) {
        super(context);
        this.f30968f = z2;
        this.f30966d = mq0;
        this.f30967e = nq0;
        this.f30978p = z;
        this.f30969g = lq0;
        setSurfaceTextureListener(this);
        nq0.mo33729a(this);
    }

    /* renamed from: P */
    private static String m31547P(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: Q */
    private final void m31548Q() {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30991J(true);
        }
    }

    /* renamed from: R */
    private final void m31549R() {
        if (!this.f30979q) {
            this.f30979q = true;
            zzt.zza.post(new uq0(this));
            zzn();
            this.f30967e.mo33730b();
            if (this.f30980r) {
                mo31388r();
            }
        }
    }

    /* renamed from: S */
    private final void m31550S(boolean z) {
        if ((this.f30972j == null || z) && this.f30973k != null && this.f30971i != null) {
            if (z) {
                if (m31558a0()) {
                    this.f30972j.mo30995N();
                    m31552U();
                } else {
                    co0.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.f30973k.startsWith("cache:")) {
                ms0 l = this.f30966d.mo18760l(this.f30973k);
                if (l instanceof vs0) {
                    cq0 v = ((vs0) l).mo35489v();
                    this.f30972j = v;
                    if (!v.mo30996O()) {
                        co0.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (l instanceof ss0) {
                    ss0 ss0 = (ss0) l;
                    String C = mo31357C();
                    ByteBuffer w = ss0.mo34781w();
                    boolean x = ss0.mo34782x();
                    String v2 = ss0.mo34780v();
                    if (v2 == null) {
                        co0.zzj("Stream cache URL is null.");
                        return;
                    }
                    cq0 B = mo31356B();
                    this.f30972j = B;
                    B.mo30982A(new Uri[]{Uri.parse(v2)}, C, w, x);
                } else {
                    String valueOf = String.valueOf(this.f30973k);
                    co0.zzj(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.f30972j = mo31356B();
                String C2 = mo31357C();
                Uri[] uriArr = new Uri[this.f30974l.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.f30974l;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.f30972j.mo31007z(uriArr, C2);
            }
            this.f30972j.mo30987F(this);
            m31554W(this.f30971i, false);
            if (this.f30972j.mo30996O()) {
                int S = this.f30972j.mo30999S();
                this.f30976n = S;
                if (S == 3) {
                    m31549R();
                }
            }
        }
    }

    /* renamed from: T */
    private final void m31551T() {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30991J(false);
        }
    }

    /* renamed from: U */
    private final void m31552U() {
        if (this.f30972j != null) {
            m31554W((Surface) null, true);
            cq0 cq0 = this.f30972j;
            if (cq0 != null) {
                cq0.mo30987F((bq0) null);
                this.f30972j.mo30983B();
                this.f30972j = null;
            }
            this.f30976n = 1;
            this.f30975m = false;
            this.f30979q = false;
            this.f30980r = false;
        }
    }

    /* renamed from: V */
    private final void m31553V(float f, boolean z) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            try {
                cq0.mo30994M(f, z);
            } catch (IOException e) {
                co0.zzk("", e);
            }
        } else {
            co0.zzj("Trying to set volume before player is initialized.");
        }
    }

    /* renamed from: W */
    private final void m31554W(Surface surface, boolean z) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            try {
                cq0.mo30993L(surface, z);
            } catch (IOException e) {
                co0.zzk("", e);
            }
        } else {
            co0.zzj("Trying to set surface before player is initialized.");
        }
    }

    /* renamed from: X */
    private final void m31555X() {
        m31556Y(this.f30981s, this.f30982t);
    }

    /* renamed from: Y */
    private final void m31556Y(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f30985w != f) {
            this.f30985w = f;
            requestLayout();
        }
    }

    /* renamed from: Z */
    private final boolean m31557Z() {
        return m31558a0() && this.f30976n != 1;
    }

    /* renamed from: a0 */
    private final boolean m31558a0() {
        cq0 cq0 = this.f30972j;
        return cq0 != null && cq0.mo30996O() && !this.f30975m;
    }

    /* renamed from: A */
    public final void mo31355A(int i) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30989H(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final cq0 mo31356B() {
        if (this.f30969g.f35196m) {
            return new nt0(this.f30966d.getContext(), this.f30969g, this.f30966d);
        }
        return new tr0(this.f30966d.getContext(), this.f30969g, this.f30966d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final String mo31357C() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzd(this.f30966d.getContext(), this.f30966d.zzp().f43036b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void mo31358D(String str) {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.mo18701g("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ void mo31359E() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zza();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo31360F() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo31361G(boolean z, long j) {
        this.f30966d.mo18769o0(z, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo31362H(String str) {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.mo18699Y("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo31363I() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo31364J() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo31365K() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zzi();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo31366L(int i, int i2) {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.mo18700e(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo31367M(int i) {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo31368N() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo31369O() {
        rp0 rp0 = this.f30970h;
        if (rp0 != null) {
            rp0.zze();
        }
    }

    /* renamed from: a */
    public final void mo30767a(int i) {
        if (this.f30976n != i) {
            this.f30976n = i;
            if (i == 3) {
                m31549R();
            } else if (i == 4) {
                if (this.f30969g.f35184a) {
                    m31551T();
                }
                this.f30967e.mo33733e();
                this.f39025c.mo34398c();
                zzt.zza.post(new rq0(this));
            }
        }
    }

    /* renamed from: b */
    public final void mo30768b(String str, Exception exc) {
        String str2;
        String P = m31547P("onLoadException", exc);
        if (P.length() != 0) {
            str2 = "ExoPlayerAdapter exception: ".concat(P);
        } else {
            str2 = new String("ExoPlayerAdapter exception: ");
        }
        co0.zzj(str2);
        com.google.android.gms.ads.internal.zzt.zzo().mo18591r(exc, "AdExoPlayerView.onException");
        zzt.zza.post(new sq0(this, P));
    }

    /* renamed from: c */
    public final void mo30769c(boolean z, long j) {
        if (this.f30966d != null) {
            po0.f37726e.execute(new tq0(this, z, j));
        }
    }

    /* renamed from: d */
    public final void mo30770d(String str, Exception exc) {
        String str2;
        String P = m31547P(str, exc);
        if (P.length() != 0) {
            str2 = "ExoPlayerAdapter error: ".concat(P);
        } else {
            str2 = new String("ExoPlayerAdapter error: ");
        }
        co0.zzj(str2);
        this.f30975m = true;
        if (this.f30969g.f35184a) {
            m31551T();
        }
        zzt.zza.post(new cr0(this, P));
        com.google.android.gms.ads.internal.zzt.zzo().mo18591r(exc, "AdExoPlayerView.onError");
    }

    /* renamed from: e */
    public final void mo30771e(int i, int i2) {
        this.f30981s = i;
        this.f30982t = i2;
        m31555X();
    }

    /* renamed from: f */
    public final void mo31370f(int i) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30992K(i);
        }
    }

    /* renamed from: g */
    public final void mo31371g(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.f30974l = new String[]{str};
            } else {
                this.f30974l = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.f30973k;
            if (!this.f30969g.f35197n || str2 == null || str.equals(str2) || this.f30976n != 4) {
                z = false;
            }
            this.f30973k = str;
            m31550S(z);
        }
    }

    /* renamed from: h */
    public final int mo31372h() {
        if (m31557Z()) {
            return (int) this.f30972j.mo31003X();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo31373i() {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            return cq0.mo30998Q();
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo31374j() {
        if (m31557Z()) {
            return (int) this.f30972j.mo31004Y();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo31375k() {
        return this.f30982t;
    }

    /* renamed from: l */
    public final int mo31376l() {
        return this.f30981s;
    }

    /* renamed from: m */
    public final long mo31377m() {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            return cq0.mo31002W();
        }
        return -1;
    }

    /* renamed from: n */
    public final long mo31378n() {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            return cq0.mo31005Z();
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo31379o() {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            return cq0.mo31006a0();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[LOOP:0: B:30:0x007a->B:35:0x0097, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r10 = r9.getMeasuredWidth()
            int r11 = r9.getMeasuredHeight()
            float r0 = r9.f30985w
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.kq0 r2 = r9.f30977o
            if (r2 != 0) goto L_0x0028
            float r2 = (float) r10
            float r3 = (float) r11
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r11 = (int) r2
        L_0x0020:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0028
            float r10 = (float) r11
            float r10 = r10 * r0
            int r10 = (int) r10
        L_0x0028:
            r9.setMeasuredDimension(r10, r11)
            com.google.android.gms.internal.ads.kq0 r0 = r9.f30977o
            if (r0 == 0) goto L_0x0032
            r0.mo33152b(r10, r11)
        L_0x0032:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a6
            int r0 = r9.f30983u
            if (r0 <= 0) goto L_0x003e
            if (r0 != r10) goto L_0x0044
        L_0x003e:
            int r0 = r9.f30984v
            if (r0 <= 0) goto L_0x00a2
            if (r0 == r11) goto L_0x00a2
        L_0x0044:
            boolean r0 = r9.f30968f
            if (r0 != 0) goto L_0x0049
            goto L_0x00a2
        L_0x0049:
            boolean r0 = r9.m31558a0()
            if (r0 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.cq0 r0 = r9.f30972j
            long r2 = r0.mo31003X()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            com.google.android.gms.internal.ads.cq0 r0 = r9.f30972j
            boolean r0 = r0.mo30997P()
            if (r0 != 0) goto L_0x00a2
            r0 = 1
            r9.m31553V(r1, r0)
            com.google.android.gms.internal.ads.cq0 r1 = r9.f30972j
            r1.mo30990I(r0)
            com.google.android.gms.internal.ads.cq0 r0 = r9.f30972j
            long r0 = r0.mo31003X()
            a5.e r2 = com.google.android.gms.ads.internal.zzt.zzA()
            long r2 = r2.currentTimeMillis()
        L_0x007a:
            boolean r4 = r9.m31558a0()
            if (r4 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.cq0 r4 = r9.f30972j
            long r4 = r4.mo31003X()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0099
            a5.e r4 = com.google.android.gms.ads.internal.zzt.zzA()
            long r4 = r4.currentTimeMillis()
            long r4 = r4 - r2
            r6 = 250(0xfa, double:1.235E-321)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007a
        L_0x0099:
            com.google.android.gms.internal.ads.cq0 r0 = r9.f30972j
            r1 = 0
            r0.mo30990I(r1)
            r9.zzn()
        L_0x00a2:
            r9.f30983u = r10
            r9.f30984v = r11
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dr0.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f30978p) {
            kq0 kq0 = new kq0(getContext());
            this.f30977o = kq0;
            kq0.mo33153c(surfaceTexture, i, i2);
            this.f30977o.start();
            SurfaceTexture a = this.f30977o.mo33151a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.f30977o.mo33154d();
                this.f30977o = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f30971i = surface;
        if (this.f30972j == null) {
            m31550S(false);
        } else {
            m31554W(surface, true);
            if (!this.f30969g.f35184a) {
                m31548Q();
            }
        }
        if (this.f30981s == 0 || this.f30982t == 0) {
            m31556Y(i, i2);
        } else {
            m31555X();
        }
        zzt.zza.post(new wq0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo31387q();
        kq0 kq0 = this.f30977o;
        if (kq0 != null) {
            kq0.mo33154d();
            this.f30977o = null;
        }
        if (this.f30972j != null) {
            m31551T();
            Surface surface = this.f30971i;
            if (surface != null) {
                surface.release();
            }
            this.f30971i = null;
            m31554W((Surface) null, true);
        }
        zzt.zza.post(new xq0(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        kq0 kq0 = this.f30977o;
        if (kq0 != null) {
            kq0.mo33152b(i, i2);
        }
        zzt.zza.post(new br0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f30967e.mo33734f(this);
        this.f39024b.mo32218a(surfaceTexture, this.f30970h);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zze.zza(sb.toString());
        zzt.zza.post(new ar0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final String mo31386p() {
        String str = true != this.f30978p ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    /* renamed from: q */
    public final void mo31387q() {
        if (m31557Z()) {
            if (this.f30969g.f35184a) {
                m31551T();
            }
            this.f30972j.mo30990I(false);
            this.f30967e.mo33733e();
            this.f39025c.mo34398c();
            zzt.zza.post(new yq0(this));
        }
    }

    /* renamed from: r */
    public final void mo31388r() {
        if (m31557Z()) {
            if (this.f30969g.f35184a) {
                m31548Q();
            }
            this.f30972j.mo30990I(true);
            this.f30967e.mo33731c();
            this.f39025c.mo34397b();
            this.f39024b.mo32219b();
            zzt.zza.post(new zq0(this));
            return;
        }
        this.f30980r = true;
    }

    /* renamed from: s */
    public final void mo31389s(int i) {
        if (m31557Z()) {
            this.f30972j.mo30984C((long) i);
        }
    }

    /* renamed from: t */
    public final void mo31390t(rp0 rp0) {
        this.f30970h = rp0;
    }

    /* renamed from: u */
    public final void mo31391u(String str) {
        if (str != null) {
            mo31371g(str, (String[]) null);
        }
    }

    /* renamed from: v */
    public final void mo31392v() {
        if (m31558a0()) {
            this.f30972j.mo30995N();
            m31552U();
        }
        this.f30967e.mo33733e();
        this.f39025c.mo34398c();
        this.f30967e.mo33732d();
    }

    /* renamed from: w */
    public final void mo31393w(float f, float f2) {
        kq0 kq0 = this.f30977o;
        if (kq0 != null) {
            kq0.mo33155e(f, f2);
        }
    }

    /* renamed from: x */
    public final void mo31394x(int i) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30985D(i);
        }
    }

    /* renamed from: y */
    public final void mo31395y(int i) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30986E(i);
        }
    }

    /* renamed from: z */
    public final void mo31396z(int i) {
        cq0 cq0 = this.f30972j;
        if (cq0 != null) {
            cq0.mo30988G(i);
        }
    }

    public final void zzn() {
        m31553V(this.f39025c.mo34396a(), false);
    }

    public final void zzv() {
        zzt.zza.post(new vq0(this));
    }
}
