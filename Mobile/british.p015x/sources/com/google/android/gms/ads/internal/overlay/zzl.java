package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C7497ab;
import com.google.android.gms.internal.ads.C7659eu;
import com.google.android.gms.internal.ads.C7728gq;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.d33;
import com.google.android.gms.internal.ads.d60;
import com.google.android.gms.internal.ads.e10;
import com.google.android.gms.internal.ads.f42;
import com.google.android.gms.internal.ads.f60;
import com.google.android.gms.internal.ads.f70;
import com.google.android.gms.internal.ads.gi1;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.hl0;
import com.google.android.gms.internal.ads.ir2;
import com.google.android.gms.internal.ads.ku0;
import com.google.android.gms.internal.ads.lr2;
import com.google.android.gms.internal.ads.mv0;
import com.google.android.gms.internal.ads.n42;
import com.google.android.gms.internal.ads.nv1;
import com.google.android.gms.internal.ads.nw2;
import com.google.android.gms.internal.ads.ov0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.sx2;
import com.google.android.gms.internal.ads.wf0;
import com.google.android.gms.internal.ads.xg0;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.Collections;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class zzl extends xg0 implements zzaa {

    /* renamed from: v */
    static final int f27793v = Color.argb(0, 0, 0, 0);

    /* renamed from: b */
    protected final Activity f27794b;

    /* renamed from: c */
    AdOverlayInfoParcel f27795c;

    /* renamed from: d */
    xt0 f27796d;

    /* renamed from: e */
    zzh f27797e;

    /* renamed from: f */
    zzr f27798f;

    /* renamed from: g */
    boolean f27799g = false;

    /* renamed from: h */
    FrameLayout f27800h;

    /* renamed from: i */
    WebChromeClient.CustomViewCallback f27801i;

    /* renamed from: j */
    boolean f27802j = false;

    /* renamed from: k */
    boolean f27803k = false;

    /* renamed from: l */
    zzg f27804l;

    /* renamed from: m */
    boolean f27805m = false;

    /* renamed from: n */
    private final Object f27806n = new Object();

    /* renamed from: o */
    private Runnable f27807o;

    /* renamed from: p */
    private boolean f27808p;

    /* renamed from: q */
    private boolean f27809q;

    /* renamed from: r */
    private boolean f27810r = false;

    /* renamed from: s */
    private boolean f27811s = false;

    /* renamed from: t */
    private boolean f27812t = true;

    /* renamed from: u */
    int f27813u = 1;

    public zzl(Activity activity) {
        this.f27794b = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.zzo;
     */
    /* renamed from: o6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m28791o6(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f27795c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.gms.ads.internal.util.zzae r3 = com.google.android.gms.ads.internal.zzt.zzq()
            android.app.Activity r4 = r5.f27794b
            boolean r6 = r3.zzo(r4, r6)
            boolean r3 = r5.f27803k
            r4 = 19
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            if (r6 != 0) goto L_0x0037
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0038
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f27795c
            if (r6 == 0) goto L_0x0038
            com.google.android.gms.ads.internal.zzj r6 = r6.zzo
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.zzg
            if (r6 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.app.Activity r6 = r5.f27794b
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36976S0
            com.google.android.gms.internal.ads.n00 r3 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r3.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0068
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x0062
            if (r2 == 0) goto L_0x005f
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x0064
        L_0x005f:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x0064
        L_0x0062:
            r0 = 256(0x100, float:3.59E-43)
        L_0x0064:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0068:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0084
            r6.addFlags(r0)
            r6.clearFlags(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0083:
            return
        L_0x0084:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.m28791o6(android.content.res.Configuration):void");
    }

    /* renamed from: p6 */
    private static final void m28792p6(C10487a aVar, View view) {
        if (aVar != null && view != null) {
            zzt.zzh().mo34046c(aVar, view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo28420f() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzo;
        if (this.f27794b.isFinishing() && !this.f27810r) {
            this.f27810r = true;
            xt0 xt0 = this.f27796d;
            if (xt0 != null) {
                xt0.mo18785r0(this.f27813u - 1);
                synchronized (this.f27806n) {
                    if (!this.f27808p && this.f27796d.mo18746e()) {
                        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37187q3)).booleanValue() && !this.f27811s && (adOverlayInfoParcel = this.f27795c) != null && (zzo = adOverlayInfoParcel.zzc) != null) {
                            zzo.zzbK();
                        }
                        zze zze = new zze(this);
                        this.f27807o = zze;
                        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(zze, ((Long) C8311wv.m39277c().mo18570b(p00.f36920L0)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n6 */
    public final void mo28421n6(boolean z) throws zzf {
        if (!this.f27809q) {
            this.f27794b.requestWindowFeature(1);
        }
        Window window = this.f27794b.getWindow();
        if (window != null) {
            xt0 xt0 = this.f27795c.zzd;
            zzb zzb = null;
            mv0 u0 = xt0 != null ? xt0.mo18793u0() : null;
            boolean z2 = false;
            boolean z3 = u0 != null && u0.zzJ();
            this.f27805m = false;
            if (z3) {
                int i = this.f27795c.zzj;
                if (i == 6) {
                    if (this.f27794b.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.f27805m = z2;
                } else if (i == 7) {
                    if (this.f27794b.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    this.f27805m = z2;
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z2);
            co0.zze(sb.toString());
            zzy(this.f27795c.zzj);
            window.setFlags(16777216, 16777216);
            co0.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f27803k) {
                this.f27804l.setBackgroundColor(-16777216);
            } else {
                this.f27804l.setBackgroundColor(f27793v);
            }
            this.f27794b.setContentView(this.f27804l);
            this.f27809q = true;
            if (z) {
                try {
                    zzt.zzz();
                    Activity activity = this.f27794b;
                    xt0 xt02 = this.f27795c.zzd;
                    ov0 m = xt02 != null ? xt02.mo18765m() : null;
                    xt0 xt03 = this.f27795c.zzd;
                    String U = xt03 != null ? xt03.mo18734U() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
                    zzcjf zzcjf = adOverlayInfoParcel.zzm;
                    xt0 xt04 = adOverlayInfoParcel.zzd;
                    xt0 a = ku0.m20660a(activity, m, U, true, z3, (C7497ab) null, (p10) null, zzcjf, (e10) null, (com.google.android.gms.ads.internal.zzl) null, xt04 != null ? xt04.zzm() : null, C7728gq.m32636a(), (ir2) null, (lr2) null);
                    this.f27796d = a;
                    mv0 u02 = a.mo18793u0();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f27795c;
                    d60 d60 = adOverlayInfoParcel2.zzp;
                    f60 f60 = adOverlayInfoParcel2.zze;
                    zzw zzw = adOverlayInfoParcel2.zzi;
                    xt0 xt05 = adOverlayInfoParcel2.zzd;
                    if (xt05 != null) {
                        zzb = xt05.mo18793u0().zzd();
                    }
                    u02.mo18249E((C7659eu) null, d60, (zzo) null, f60, zzw, true, (h70) null, zzb, (wf0) null, (hl0) null, (f42) null, (sx2) null, (nv1) null, (nw2) null, (f70) null, (gi1) null);
                    this.f27796d.mo18793u0().mo18251F0(new zzd(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f27795c;
                    String str = adOverlayInfoParcel3.zzl;
                    if (str != null) {
                        this.f27796d.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.zzh;
                        if (str2 != null) {
                            this.f27796d.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", C6540C.UTF8_NAME, (String) null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    xt0 xt06 = this.f27795c.zzd;
                    if (xt06 != null) {
                        xt06.mo18742c0(this);
                    }
                } catch (Exception e) {
                    co0.zzh("Error obtaining webview.", e);
                    throw new zzf("Could not obtain webview for the overlay.");
                }
            } else {
                xt0 xt07 = this.f27795c.zzd;
                this.f27796d = xt07;
                xt07.mo18795v0(this.f27794b);
            }
            this.f27796d.mo18712B(this);
            xt0 xt08 = this.f27795c.zzd;
            if (xt08 != null) {
                m28792p6(xt08.mo18761l0(), this.f27804l);
            }
            if (this.f27795c.zzk != 5) {
                ViewParent parent = this.f27796d.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f27796d.mo18790t());
                }
                if (this.f27803k) {
                    this.f27796d.mo18739a0();
                }
                this.f27804l.addView(this.f27796d.mo18790t(), -1, -1);
            }
            if (!z && !this.f27805m) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f27795c;
            if (adOverlayInfoParcel4.zzk != 5) {
                zzu(z3);
                if (this.f27796d.mo18756j()) {
                    zzw(z3, true);
                    return;
                }
                return;
            }
            n42.m35046q6(this.f27794b, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f27794b);
        this.f27800h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f27800h.addView(view, -1, -1);
        this.f27794b.setContentView(this.f27800h);
        this.f27809q = true;
        this.f27801i = customViewCallback;
        this.f27799g = true;
    }

    public final void zzC() {
        synchronized (this.f27806n) {
            this.f27808p = true;
            Runnable runnable = this.f27807o;
            if (runnable != null) {
                d33 d33 = com.google.android.gms.ads.internal.util.zzt.zza;
                d33.removeCallbacks(runnable);
                d33.post(this.f27807o);
            }
        }
    }

    public final boolean zzE() {
        this.f27813u = 1;
        if (this.f27796d == null) {
            return true;
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue() || !this.f27796d.canGoBack()) {
            boolean D = this.f27796d.mo18715D();
            if (!D) {
                this.f27796d.mo18321Z("onbackblocked", Collections.emptyMap());
            }
            return D;
        }
        this.f27796d.goBack();
        return false;
    }

    public final void zzb() {
        this.f27813u = 3;
        this.f27794b.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.f27794b.overridePendingTransition(0, 0);
        }
    }

    public final void zzbR() {
        this.f27813u = 2;
        this.f27794b.finish();
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        xt0 xt0;
        zzo zzo;
        if (!this.f27811s) {
            this.f27811s = true;
            xt0 xt02 = this.f27796d;
            if (xt02 != null) {
                this.f27804l.removeView(xt02.mo18790t());
                zzh zzh = this.f27797e;
                if (zzh != null) {
                    this.f27796d.mo18795v0(zzh.zzd);
                    this.f27796d.mo18755i0(false);
                    ViewGroup viewGroup = this.f27797e.zzc;
                    View t = this.f27796d.mo18790t();
                    zzh zzh2 = this.f27797e;
                    viewGroup.addView(t, zzh2.zza, zzh2.zzb);
                    this.f27797e = null;
                } else if (this.f27794b.getApplicationContext() != null) {
                    this.f27796d.mo18795v0(this.f27794b.getApplicationContext());
                }
                this.f27796d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
            if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.zzc) == null)) {
                zzo.zzf(this.f27813u);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f27795c;
            if (adOverlayInfoParcel2 != null && (xt0 = adOverlayInfoParcel2.zzd) != null) {
                m28792p6(xt0.mo18761l0(), this.f27795c.zzd.mo18790t());
            }
        }
    }

    public final void zzd() {
        this.f27804l.f27791c = true;
    }

    /* access modifiers changed from: protected */
    public final void zze() {
        this.f27796d.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
        if (adOverlayInfoParcel != null && this.f27799g) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.f27800h != null) {
            this.f27794b.setContentView(this.f27804l);
            this.f27809q = true;
            this.f27800h.removeAllViews();
            this.f27800h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f27801i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f27801i = null;
        }
        this.f27799g = false;
    }

    public final void zzg(int i, int i2, Intent intent) {
    }

    public final void zzh() {
        this.f27813u = 1;
    }

    public final void zzj(C10487a aVar) {
        m28791o6((Configuration) C10489b.m48194f3(aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ zzf -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ zzf -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ zzf -> 0x00f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzk(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.f27794b
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r8.f27802j = r2
            r2 = 4
            android.app.Activity r3 = r8.f27794b     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(r3)     // Catch:{ zzf -> 0x00f5 }
            r8.f27795c = r3     // Catch:{ zzf -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzcjf r3 = r3.zzm     // Catch:{ zzf -> 0x00f5 }
            int r3 = r3.f43038d     // Catch:{ zzf -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.f27813u = r2     // Catch:{ zzf -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.f27794b     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.f27794b     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ zzf -> 0x00f5 }
            r8.f27812t = r3     // Catch:{ zzf -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.zzj r4 = r3.zzo     // Catch:{ zzf -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.zza     // Catch:{ zzf -> 0x00f5 }
            r8.f27803k = r6     // Catch:{ zzf -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.f27803k = r1     // Catch:{ zzf -> 0x00f5 }
        L_0x005a:
            int r3 = r3.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.zzf     // Catch:{ zzf -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            com.google.android.gms.ads.internal.overlay.zzk r3 = new com.google.android.gms.ads.internal.overlay.zzk     // Catch:{ zzf -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ zzf -> 0x00f5 }
            r3.zzb()     // Catch:{ zzf -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.f27803k = r0     // Catch:{ zzf -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.f27812t     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.ab1 r9 = r9.zzx     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.zzd()     // Catch:{ zzf -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.zzo r9 = r9.zzc     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.zzb()     // Catch:{ zzf -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            int r3 = r9.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            com.google.android.gms.internal.ads.eu r9 = r9.zzb     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.onAdClicked()     // Catch:{ zzf -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.gi1 r9 = r9.zzy     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.zzq()     // Catch:{ zzf -> 0x00f5 }
        L_0x009d:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch:{ zzf -> 0x00f5 }
            android.app.Activity r3 = r8.f27794b     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r6 = r4.zzn     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcjf r7 = r4.zzm     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r7 = r7.f43036b     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r4 = r4.zzw     // Catch:{ zzf -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ zzf -> 0x00f5 }
            r8.f27804l = r9     // Catch:{ zzf -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.util.zzae r9 = com.google.android.gms.ads.internal.zzt.zzq()     // Catch:{ zzf -> 0x00f5 }
            android.app.Activity r3 = r8.f27794b     // Catch:{ zzf -> 0x00f5 }
            r9.zzr(r3)     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f27795c     // Catch:{ zzf -> 0x00f5 }
            int r3 = r9.zzk     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.mo28421n6(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00d0:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ zzf -> 0x00f5 }
            throw r9     // Catch:{ zzf -> 0x00f5 }
        L_0x00d8:
            r8.mo28421n6(r1)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00dc:
            com.google.android.gms.ads.internal.overlay.zzh r1 = new com.google.android.gms.ads.internal.overlay.zzh     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.xt0 r9 = r9.zzd     // Catch:{ zzf -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ zzf -> 0x00f5 }
            r8.f27797e = r1     // Catch:{ zzf -> 0x00f5 }
            r8.mo28421n6(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00e9:
            r8.mo28421n6(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00ed:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ zzf -> 0x00f5 }
            throw r9     // Catch:{ zzf -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.co0.zzj(r9)
            r8.f27813u = r2
            android.app.Activity r9 = r8.f27794b
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzk(android.os.Bundle):void");
    }

    public final void zzl() {
        xt0 xt0 = this.f27796d;
        if (xt0 != null) {
            try {
                this.f27804l.removeView(xt0.mo18790t());
            } catch (NullPointerException unused) {
            }
        }
        mo28420f();
    }

    public final void zzm() {
        if (this.f27805m) {
            this.f27805m = false;
            zze();
        }
    }

    public final void zzn() {
        zzo zzo;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
        if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.zzc) == null)) {
            zzo.zzbz();
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37205s3)).booleanValue() && this.f27796d != null && (!this.f27794b.isFinishing() || this.f27797e == null)) {
            this.f27796d.onPause();
        }
        mo28420f();
    }

    public final void zzo() {
    }

    public final void zzp() {
        zzo zzo;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
        if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.zzc) == null)) {
            zzo.zzbS();
        }
        m28791o6(this.f27794b.getResources().getConfiguration());
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37205s3)).booleanValue()) {
            xt0 xt0 = this.f27796d;
            if (xt0 == null || xt0.mo18783q0()) {
                co0.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f27796d.onResume();
            }
        }
    }

    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f27802j);
    }

    public final void zzr() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37205s3)).booleanValue()) {
            xt0 xt0 = this.f27796d;
            if (xt0 == null || xt0.mo18783q0()) {
                co0.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f27796d.onResume();
            }
        }
    }

    public final void zzs() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37205s3)).booleanValue() && this.f27796d != null && (!this.f27794b.isFinishing() || this.f27797e == null)) {
            this.f27796d.onPause();
        }
        mo28420f();
    }

    public final void zzt() {
        zzo zzo;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f27795c;
        if (adOverlayInfoParcel != null && (zzo = adOverlayInfoParcel.zzc) != null) {
            zzo.zze();
        }
    }

    public final void zzu(boolean z) {
        int intValue = ((Integer) C8311wv.m39277c().mo18570b(p00.f37221u3)).intValue();
        int i = 0;
        boolean z2 = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36944O0)).booleanValue() || z;
        zzq zzq = new zzq();
        zzq.zzd = 50;
        zzq.zza = true != z2 ? 0 : intValue;
        if (true != z2) {
            i = intValue;
        }
        zzq.zzb = i;
        zzq.zzc = intValue;
        this.f27798f = new zzr(this.f27794b, zzq, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.f27795c.zzg);
        this.f27804l.addView(this.f27798f, layoutParams);
    }

    public final void zzv() {
        this.f27809q = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f27795c).zzo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzw(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36928M0
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f27795c
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.zzh
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f36936N0
            com.google.android.gms.internal.ads.n00 r4 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r4.mo18570b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f27795c
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzj r3 = r3.zzo
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.zzi
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.vf0 r7 = new com.google.android.gms.internal.ads.vf0
            com.google.android.gms.internal.ads.xt0 r4 = r6.f27796d
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo35419c(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.zzr r7 = r6.f27798f
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.zzb(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzw(boolean, boolean):void");
    }

    public final void zzx() {
        this.f27804l.removeView(this.f27798f);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.f27794b.getApplicationInfo().targetSdkVersion >= ((Integer) C8311wv.m39277c().mo18570b(p00.f37214t4)).intValue()) {
            if (this.f27794b.getApplicationInfo().targetSdkVersion <= ((Integer) C8311wv.m39277c().mo18570b(p00.f37222u4)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) C8311wv.m39277c().mo18570b(p00.f37230v4)).intValue()) {
                    if (i2 <= ((Integer) C8311wv.m39277c().mo18570b(p00.f37238w4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f27794b.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzt.zzo().mo18591r(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.f27804l.setBackgroundColor(0);
        } else {
            this.f27804l.setBackgroundColor(-16777216);
        }
    }
}
