package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.v91;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qo2<R extends v91<? extends o61>> {

    /* renamed from: a */
    private final kt2 f38212a;

    /* renamed from: b */
    private final R f38213b;

    /* renamed from: c */
    private final Executor f38214c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public po2 f38215d;

    public qo2(kt2 kt2, R r, Executor executor) {
        this.f38212a = kt2;
        this.f38213b = r;
        this.f38214c = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    /* renamed from: e */
    public final tt2 m36561e() {
        bs2 zzg = this.f38213b.zzg();
        return this.f38212a.mo33177a(zzg.f30087d, zzg.f30089f, zzg.f30093j);
    }

    /* renamed from: c */
    public final mb3<po2> mo34373c() {
        mb3<V> mb3;
        po2 po2 = this.f38215d;
        if (po2 != null) {
            return bb3.m30649i(po2);
        }
        if (!k20.f34124a.mo34648e().booleanValue()) {
            po2 po22 = new po2((zzcdq) null, m36561e(), (oo2) null);
            this.f38215d = po22;
            mb3 = bb3.m30649i(po22);
        } else {
            mb3 = bb3.m30646f(bb3.m30653m(sa3.m37369D(this.f38213b.zzb().mo34670e(this.f38212a.zza())), new no2(this), this.f38214c), b12.class, new mo2(this), this.f38214c);
        }
        return bb3.m30653m(mb3, lo2.f35153a, this.f38214c);
    }
}
