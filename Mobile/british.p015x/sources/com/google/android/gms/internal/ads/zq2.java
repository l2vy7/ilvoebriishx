package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zq2 extends ak0 {

    /* renamed from: b */
    private final vq2 f42551b;

    /* renamed from: c */
    private final kq2 f42552c;

    /* renamed from: d */
    private final String f42553d;

    /* renamed from: e */
    private final wr2 f42554e;

    /* renamed from: f */
    private final Context f42555f;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: g */
    public yr1 f42556g;
    @GuardedBy("this")

    /* renamed from: h */
    private boolean f42557h = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37234w0)).booleanValue();

    public zq2(String str, vq2 vq2, Context context, kq2 kq2, wr2 wr2) {
        this.f42553d = str;
        this.f42551b = vq2;
        this.f42552c = kq2;
        this.f42554e = wr2;
        this.f42555f = context;
    }

    /* renamed from: q6 */
    private final synchronized void m40426q6(zzbfd zzbfd, jk0 jk0, int i) throws RemoteException {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        this.f42552c.mo33159C(jk0);
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzL(this.f42555f)) {
            if (zzbfd.f42958t == null) {
                co0.zzg("Failed to load the ad because app ID is missing.");
                this.f42552c.mo18436d(us2.m38446d(4, (String) null, (zzbew) null));
                return;
            }
        }
        if (this.f42556g == null) {
            mq2 mq2 = new mq2((String) null);
            this.f42551b.mo35462i(i);
            this.f42551b.mo18423a(zzbfd, this.f42553d, mq2, new yq2(this));
        }
    }

    /* renamed from: D2 */
    public final synchronized void mo30684D2(zzbfd zzbfd, jk0 jk0) throws RemoteException {
        m40426q6(zzbfd, jk0, 3);
    }

    /* renamed from: G1 */
    public final synchronized void mo30685G1(zzbfd zzbfd, jk0 jk0) throws RemoteException {
        m40426q6(zzbfd, jk0, 2);
    }

    /* renamed from: Q */
    public final synchronized void mo30686Q(boolean z) {
        C4604n.m20093f("setImmersiveMode must be called on the main UI thread.");
        this.f42557h = z;
    }

    /* renamed from: W0 */
    public final synchronized void mo30687W0(zzcfn zzcfn) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        wr2 wr2 = this.f42554e;
        wr2.f40858a = zzcfn.f21160b;
        wr2.f40859b = zzcfn.f21161c;
    }

    /* renamed from: Y2 */
    public final void mo30688Y2(fk0 fk0) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        this.f42552c.mo33166z(fk0);
    }

    /* renamed from: f5 */
    public final void mo30689f5(C8386yx yxVar) {
        if (yxVar == null) {
            this.f42552c.mo33164n((e03) null);
        } else {
            this.f42552c.mo33164n(new xq2(this, yxVar));
        }
    }

    /* renamed from: j3 */
    public final void mo30690j3(C7555by byVar) {
        C4604n.m20093f("setOnPaidEventListener must be called on the main UI thread.");
        this.f42552c.mo33165x(byVar);
    }

    /* renamed from: l3 */
    public final synchronized void mo30691l3(C10487a aVar, boolean z) throws RemoteException {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        if (this.f42556g == null) {
            co0.zzj("Rewarded can not be shown before loaded");
            this.f42552c.mo18122N(us2.m38446d(9, (String) null, (zzbew) null));
            return;
        }
        this.f42556g.mo35965m(z, (Activity) C10489b.m48194f3(aVar));
    }

    /* renamed from: p0 */
    public final synchronized void mo30692p0(C10487a aVar) throws RemoteException {
        mo30691l3(aVar, this.f42557h);
    }

    /* renamed from: w2 */
    public final void mo30693w2(kk0 kk0) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        this.f42552c.mo33162M(kk0);
    }

    public final Bundle zzb() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        yr1 yr1 = this.f42556g;
        return yr1 != null ? yr1.mo35960h() : new Bundle();
    }

    public final C7663ey zzc() {
        yr1 yr1;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37117i5)).booleanValue() && (yr1 = this.f42556g) != null) {
            return yr1.mo33838c();
        }
        return null;
    }

    public final yj0 zzd() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        yr1 yr1 = this.f42556g;
        if (yr1 != null) {
            return yr1.mo35961i();
        }
        return null;
    }

    public final synchronized String zze() throws RemoteException {
        yr1 yr1 = this.f42556g;
        if (yr1 == null || yr1.mo33838c() == null) {
            return null;
        }
        return this.f42556g.mo33838c().zze();
    }

    public final boolean zzo() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        yr1 yr1 = this.f42556g;
        return yr1 != null && !yr1.mo35963k();
    }
}
