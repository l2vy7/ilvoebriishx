package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g41 extends C7511ap {

    /* renamed from: b */
    private final f41 f32135b;

    /* renamed from: c */
    private final C8136rw f32136c;

    /* renamed from: d */
    private final zm2 f32137d;

    /* renamed from: e */
    private boolean f32138e = false;

    public g41(f41 f41, C8136rw rwVar, zm2 zm2) {
        this.f32135b = f41;
        this.f32136c = rwVar;
        this.f32137d = zm2;
    }

    /* renamed from: N4 */
    public final void mo30754N4(C7555by byVar) {
        C4604n.m20093f("setOnPaidEventListener must be called on the main UI thread.");
        zm2 zm2 = this.f32137d;
        if (zm2 != null) {
            zm2.mo36080w(byVar);
        }
    }

    /* renamed from: e0 */
    public final void mo30755e0(boolean z) {
        this.f32138e = z;
    }

    /* renamed from: h5 */
    public final void mo30756h5(C7691fp fpVar) {
    }

    /* renamed from: m1 */
    public final void mo30757m1(C10487a aVar, C7875kp kpVar) {
        try {
            this.f32137d.mo36082z(kpVar);
            this.f32135b.mo31743j((Activity) C10489b.m48194f3(aVar), kpVar, this.f32138e);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final C8136rw zze() {
        return this.f32136c;
    }

    public final C7663ey zzf() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37117i5)).booleanValue()) {
            return null;
        }
        return this.f32135b.mo33838c();
    }
}
