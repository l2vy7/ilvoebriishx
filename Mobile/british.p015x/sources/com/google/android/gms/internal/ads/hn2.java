package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hn2 extends C8101qw implements zzo, C8271vo {

    /* renamed from: b */
    private final uv0 f32774b;

    /* renamed from: c */
    private final Context f32775c;

    /* renamed from: d */
    private AtomicBoolean f32776d = new AtomicBoolean();

    /* renamed from: e */
    private final String f32777e;

    /* renamed from: f */
    private final bn2 f32778f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zm2 f32779g;
    @GuardedBy("this")

    /* renamed from: h */
    private long f32780h = -1;
    @GuardedBy("this")

    /* renamed from: i */
    private g31 f32781i;
    @GuardedBy("this")

    /* renamed from: j */
    protected f41 f32782j;

    public hn2(uv0 uv0, Context context, String str, bn2 bn2, zm2 zm2) {
        this.f32774b = uv0;
        this.f32775c = context;
        this.f32777e = str;
        this.f32778f = bn2;
        this.f32779g = zm2;
        zm2.mo36079r(this);
    }

    /* renamed from: O5 */
    private final synchronized void m32898O5(int i) {
        if (this.f32776d.compareAndSet(false, true)) {
            this.f32779g.zzj();
            g31 g31 = this.f32781i;
            if (g31 != null) {
                zzt.zzb().mo18172e(g31);
            }
            if (this.f32782j != null) {
                long j = -1;
                if (this.f32780h != -1) {
                    j = zzt.zzA().elapsedRealtime() - this.f32780h;
                }
                this.f32782j.mo31744k(j, i);
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
        this.f32779g.mo36081x(epVar);
    }

    public final void zzI(zzbfo zzbfo) {
        this.f32778f.mo18426k(zzbfo);
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

    public final synchronized void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.f32778f.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final void zza() {
        m32898O5(3);
    }

    public final synchronized boolean zzaa(zzbfd zzbfd) throws RemoteException {
        C4604n.m20093f("loadAd must be called on the main UI thread.");
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzL(this.f32775c)) {
            if (zzbfd.f42958t == null) {
                co0.zzg("Failed to load the ad because app ID is missing.");
                this.f32779g.mo18436d(us2.m38446d(4, (String) null, (zzbew) null));
                return false;
            }
        }
        if (zzY()) {
            return false;
        }
        this.f32776d = new AtomicBoolean();
        return this.f32778f.mo18423a(zzbfd, this.f32777e, new fn2(this), new gn2(this));
    }

    public final synchronized void zzab(C7590cx cxVar) {
    }

    public final synchronized void zzb() {
        if (this.f32782j != null) {
            this.f32780h = zzt.zzA().elapsedRealtime();
            int h = this.f32782j.mo31741h();
            if (h > 0) {
                g31 g31 = new g31(this.f32774b.mo35286e(), zzt.zzA());
                this.f32781i = g31;
                g31.mo32006c(h, new en2(this));
            }
        }
    }

    public final void zzbK() {
    }

    public final void zzbS() {
    }

    public final void zzbz() {
    }

    public final Bundle zzd() {
        return new Bundle();
    }

    public final synchronized void zze() {
        f41 f41 = this.f32782j;
        if (f41 != null) {
            f41.mo31744k(zzt.zzA().elapsedRealtime() - this.f32780h, 1);
        }
    }

    public final void zzf(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            m32898O5(2);
        } else if (i2 == 1) {
            m32898O5(4);
        } else if (i2 == 2) {
            m32898O5(3);
        } else if (i2 == 3) {
            m32898O5(6);
        }
    }

    public final synchronized zzbfi zzg() {
        return null;
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        m32898O5(5);
    }

    public final C10487a zzn() {
        return null;
    }

    public final void zzo() {
        this.f32774b.mo35285d().execute(new dn2(this));
    }

    public final synchronized String zzr() {
        return this.f32777e;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized void zzx() {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        f41 f41 = this.f32782j;
        if (f41 != null) {
            f41.mo31310a();
        }
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) {
    }

    public final synchronized void zzz() {
        C4604n.m20093f("pause must be called on the main UI thread.");
    }
}
