package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.o61;
import com.google.android.gms.internal.ads.v91;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mu2<R extends v91<AdT>, AdT extends o61> {

    /* renamed from: a */
    private final fu2<R, AdT> f35621a;

    /* renamed from: b */
    private final mb3<du2<R, AdT>> f35622b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f35623c = false;
    @GuardedBy("this")

    /* renamed from: d */
    private boolean f35624d = false;

    public mu2(kt2 kt2, eu2<R, AdT> eu2, fu2<R, AdT> fu2) {
        this.f35621a = fu2;
        this.f35622b = bb3.m30647g(bb3.m30654n(eu2.mo31668a(fu2), new ku2(this, eu2, kt2, fu2), fu2.zzb()), Exception.class, new ju2(this, eu2), fu2.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.mb3<com.google.android.gms.internal.ads.du2<R, AdT>> mo33593a(com.google.android.gms.internal.ads.fu2<R, AdT> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f35624d     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.f35623c     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.fu2<R, AdT> r0 = r2.f35621a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.tt2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.tt2 r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.fu2<R, AdT> r0 = r2.f35621a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.tt2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.tt2 r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.f35623c = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.mb3<com.google.android.gms.internal.ads.du2<R, AdT>> r3 = r2.f35622b     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu2.mo33593a(com.google.android.gms.internal.ads.fu2):com.google.android.gms.internal.ads.mb3");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ mb3 mo33594b(eu2 eu2, kt2 kt2, fu2 fu2, st2 st2) throws Exception {
        synchronized (this) {
            this.f35624d = true;
            eu2.mo31669b(st2);
            if (!this.f35623c) {
                kt2.mo33179c(fu2.zza(), st2);
                mb3 i = bb3.m30649i(null);
                return i;
            }
            mb3 i2 = bb3.m30649i(new du2(st2, fu2));
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo33595c(eu2 eu2, Exception exc) throws Exception {
        synchronized (this) {
            this.f35624d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void mo33596d(xa3<Void> xa3) {
        bb3.m30658r(bb3.m30654n(this.f35622b, lu2.f35264a, this.f35621a.zzb()), xa3, this.f35621a.zzb());
    }
}
