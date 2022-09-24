package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q62 extends tj0 implements yb1 {
    @GuardedBy("this")

    /* renamed from: b */
    private uj0 f37881b;
    @GuardedBy("this")

    /* renamed from: c */
    private xb1 f37882c;
    @GuardedBy("this")

    /* renamed from: d */
    private ri1 f37883d;

    /* renamed from: A5 */
    public final synchronized void mo33501A5(C10487a aVar) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            ((m92) uj0).f35458d.zze();
        }
    }

    /* renamed from: b0 */
    public final synchronized void mo33502b0(C10487a aVar, int i) throws RemoteException {
        ri1 ri1 = this.f37883d;
        if (ri1 != null) {
            String valueOf = String.valueOf(((l92) ri1).f34959c.f39762a);
            co0.zzj(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    /* renamed from: f3 */
    public final synchronized void mo34072f3(xb1 xb1) {
        this.f37882c = xb1;
    }

    /* renamed from: g0 */
    public final synchronized void mo33503g0(C10487a aVar) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            ((m92) uj0).f35459e.zzc();
        }
    }

    /* renamed from: o6 */
    public final synchronized void mo34236o6(uj0 uj0) {
        this.f37881b = uj0;
    }

    /* renamed from: p6 */
    public final synchronized void mo34237p6(ri1 ri1) {
        this.f37883d = ri1;
    }

    /* renamed from: v */
    public final synchronized void mo33504v(C10487a aVar) throws RemoteException {
        xb1 xb1 = this.f37882c;
        if (xb1 != null) {
            xb1.zzd();
        }
    }

    /* renamed from: w0 */
    public final synchronized void mo33505w0(C10487a aVar, zzces zzces) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            ((m92) uj0).f35459e.mo18913C(zzces);
        }
    }

    /* renamed from: y */
    public final synchronized void mo33506y(C10487a aVar) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            uj0.mo33506y(aVar);
        }
    }

    public final synchronized void zze(C10487a aVar) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            ((m92) uj0).f35457c.onAdClicked();
        }
    }

    public final synchronized void zzg(C10487a aVar, int i) throws RemoteException {
        xb1 xb1 = this.f37882c;
        if (xb1 != null) {
            xb1.mo35385m(i);
        }
    }

    public final synchronized void zzh(C10487a aVar) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            ((m92) uj0).f35458d.zzb();
        }
    }

    public final synchronized void zzj(C10487a aVar) throws RemoteException {
        uj0 uj0 = this.f37881b;
        if (uj0 != null) {
            ((m92) uj0).f35456b.zzb();
        }
    }

    public final synchronized void zzl(C10487a aVar) throws RemoteException {
        ri1 ri1 = this.f37883d;
        if (ri1 != null) {
            ((l92) ri1).f34960d.f35955b.execute(new k92((l92) ri1, ((l92) ri1).f34957a, ((l92) ri1).f34958b, ((l92) ri1).f34959c));
        }
    }
}
