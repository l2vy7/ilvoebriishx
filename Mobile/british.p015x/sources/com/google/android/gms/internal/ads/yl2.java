package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yl2 extends C8101qw implements zzaa, C8271vo, nc1 {

    /* renamed from: b */
    private final uv0 f41913b;

    /* renamed from: c */
    private final Context f41914c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ViewGroup f41915d;

    /* renamed from: e */
    private AtomicBoolean f41916e = new AtomicBoolean();

    /* renamed from: f */
    private final String f41917f;

    /* renamed from: g */
    private final sl2 f41918g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final zm2 f41919h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzcjf f41920i;

    /* renamed from: j */
    private long f41921j = -1;

    /* renamed from: k */
    private g31 f41922k;
    @GuardedBy("this")

    /* renamed from: l */
    protected v31 f41923l;

    public yl2(uv0 uv0, Context context, String str, sl2 sl2, zm2 zm2, zzcjf zzcjf) {
        this.f41915d = new FrameLayout(context);
        this.f41913b = uv0;
        this.f41914c = context;
        this.f41917f = str;
        this.f41918g = sl2;
        this.f41919h = zm2;
        zm2.mo36078n(this);
        this.f41920i = zzcjf;
    }

    /* renamed from: p6 */
    static /* bridge */ /* synthetic */ zzr m39956p6(yl2 yl2, v31 v31) {
        boolean o = v31.mo35363o();
        int intValue = ((Integer) C8311wv.m39277c().mo18570b(p00.f37221u3)).intValue();
        zzq zzq = new zzq();
        zzq.zzd = 50;
        int i = 0;
        zzq.zza = true != o ? 0 : intValue;
        if (true != o) {
            i = intValue;
        }
        zzq.zzb = i;
        zzq.zzc = intValue;
        return new zzr(yl2.f41914c, zzq, yl2);
    }

    /* renamed from: s6 */
    private final synchronized void m39959s6(int i) {
        if (this.f41916e.compareAndSet(false, true)) {
            v31 v31 = this.f41923l;
            if (!(v31 == null || v31.mo35365q() == null)) {
                this.f41919h.mo36076C(this.f41923l.mo35365q());
            }
            this.f41919h.zzj();
            this.f41915d.removeAllViews();
            g31 g31 = this.f41922k;
            if (g31 != null) {
                zzt.zzb().mo18172e(g31);
            }
            if (this.f41923l != null) {
                long j = -1;
                if (this.f41921j != -1) {
                    j = zzt.zzA().elapsedRealtime() - this.f41921j;
                }
                this.f41923l.mo35364p(j, i);
            }
            zzx();
        }
    }

    public final synchronized void zzA() {
    }

    public final synchronized void zzB() {
        C4604n.m20093f("resume must be called on the main UI thread.");
    }

    public final void zzC(C7518aw awVar) {
    }

    public final void zzD(C7624dw dwVar) {
    }

    public final void zzE(C8279vw vwVar) {
    }

    public final synchronized void zzF(zzbfi zzbfi) {
        C4604n.m20093f("setAdSize must be called on the main UI thread.");
    }

    public final void zzG(C8385yw ywVar) {
    }

    public final void zzH(C7654ep epVar) {
        this.f41919h.mo36081x(epVar);
    }

    public final void zzI(zzbfo zzbfo) {
        this.f41918g.mo18426k(zzbfo);
    }

    public final void zzJ(C7699fx fxVar) {
    }

    public final void zzK(zzbjd zzbjd) {
    }

    public final void zzL(boolean z) {
    }

    public final void zzM(ih0 ih0) {
    }

    public final synchronized void zzN(boolean z) {
    }

    public final synchronized void zzO(l10 l10) {
    }

    public final void zzP(C7555by byVar) {
    }

    public final void zzQ(lh0 lh0, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(qj0 qj0) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzbkq zzbkq) {
    }

    public final void zzW(C10487a aVar) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.f41918g.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final void zza() {
        m39959s6(3);
    }

    public final synchronized boolean zzaa(zzbfd zzbfd) throws RemoteException {
        C4604n.m20093f("loadAd must be called on the main UI thread.");
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzL(this.f41914c)) {
            if (zzbfd.f42958t == null) {
                co0.zzg("Failed to load the ad because app ID is missing.");
                this.f41919h.mo18436d(us2.m38446d(4, (String) null, (zzbew) null));
                return false;
            }
        }
        if (zzY()) {
            return false;
        }
        this.f41916e = new AtomicBoolean();
        return this.f41918g.mo18423a(zzbfd, this.f41917f, new wl2(this), new xl2(this));
    }

    public final synchronized void zzab(C7590cx cxVar) {
    }

    public final void zzbR() {
        m39959s6(4);
    }

    public final Bundle zzd() {
        return new Bundle();
    }

    public final synchronized zzbfi zzg() {
        C4604n.m20093f("getAdSize must be called on the main UI thread.");
        v31 v31 = this.f41923l;
        if (v31 == null) {
            return null;
        }
        return fs2.m32243a(this.f41914c, Collections.singletonList(v31.mo35358j()));
    }

    public final void zzh() {
        if (this.f41923l != null) {
            this.f41921j = zzt.zzA().elapsedRealtime();
            int h = this.f41923l.mo35356h();
            if (h > 0) {
                g31 g31 = new g31(this.f41913b.mo35286e(), zzt.zzA());
                this.f41922k = g31;
                g31.mo32006c(h, new vl2(this));
            }
        }
    }

    public final C7624dw zzi() {
        return null;
    }

    public final C8385yw zzj() {
        return null;
    }

    public final synchronized C7663ey zzk() {
        return null;
    }

    public final synchronized C7774hy zzl() {
        return null;
    }

    public final C10487a zzn() {
        C4604n.m20093f("getAdFrame must be called on the main UI thread.");
        return C10489b.m48195m6(this.f41915d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo() {
        m39959s6(5);
    }

    public final void zzp() {
        C8241uv.m38463b();
        if (vn0.m38857p()) {
            m39959s6(5);
        } else {
            this.f41913b.mo35285d().execute(new ul2(this));
        }
    }

    public final synchronized String zzr() {
        return this.f41917f;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized void zzx() {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        v31 v31 = this.f41923l;
        if (v31 != null) {
            v31.mo31310a();
        }
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) {
    }

    public final synchronized void zzz() {
        C4604n.m20093f("pause must be called on the main UI thread.");
    }
}
