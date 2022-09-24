package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.internal.ads.cq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7583cq {
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: a */
    public C8163sp f30456a;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: b */
    public boolean f30457b;

    /* renamed from: c */
    private final Context f30458c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f30459d = new Object();

    C7583cq(Context context) {
        this.f30458c = context;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m31085e(C7583cq cqVar) {
        synchronized (cqVar.f30459d) {
            C8163sp spVar = cqVar.f30456a;
            if (spVar != null) {
                spVar.disconnect();
                cqVar.f30456a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Future<C7655eq> mo30981c(zzbak zzbak) {
        C8305wp wpVar = new C8305wp(this);
        C7512aq aqVar = new C7512aq(this, zzbak, wpVar);
        C7547bq bqVar = new C7547bq(this, wpVar);
        synchronized (this.f30459d) {
            C8163sp spVar = new C8163sp(this.f30458c, zzt.zzt().zzb(), aqVar, bqVar);
            this.f30456a = spVar;
            spVar.checkAvailabilityAndConnect();
        }
        return wpVar;
    }
}
