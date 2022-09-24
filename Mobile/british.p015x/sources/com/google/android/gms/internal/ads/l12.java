package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l12 {

    /* renamed from: a */
    private final nb3 f34784a;

    /* renamed from: b */
    private final r02 f34785b;

    /* renamed from: c */
    private final ou3<d22> f34786c;

    public l12(nb3 nb3, r02 r02, ou3<d22> ou3) {
        this.f34784a = nb3;
        this.f34785b = r02;
        this.f34786c = ou3;
    }

    /* renamed from: g */
    private final <RetT> mb3<RetT> m34257g(zzcdq zzcdq, k12<InputStream> k12, k12<InputStream> k122, ha3<InputStream, RetT> ha3) {
        mb3<V> mb3;
        String str = zzcdq.f21153e;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(str)) {
            mb3 = bb3.m30648h(new b12(1));
        } else {
            mb3 = bb3.m30647g(k12.mo30842a(zzcdq), ExecutionException.class, j12.f33698a, this.f34784a);
        }
        return bb3.m30647g(bb3.m30654n(sa3.m37369D(mb3), ha3, this.f34784a), b12.class, new h12(this, k122, zzcdq, ha3), this.f34784a);
    }

    /* renamed from: a */
    public final mb3<zzcdq> mo33227a(zzcdq zzcdq) {
        return m34257g(zzcdq, new c12(this.f34785b), new d12(this), new g12(zzcdq));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ mb3 mo33228b(k12 k12, zzcdq zzcdq, ha3 ha3, b12 b12) throws Exception {
        return bb3.m30654n(k12.mo30842a(zzcdq), ha3, this.f34784a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo33229c(zzcdq zzcdq) {
        return this.f34786c.zzb().mo31082n6(zzcdq, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ mb3 mo33230d(zzcdq zzcdq) {
        String str;
        r02 r02 = this.f34785b;
        if (k20.f34127d.mo34648e().booleanValue()) {
            str = zzcdq.f21157i;
        } else {
            str = zzcdq.f21159k;
        }
        return r02.mo34449c(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ mb3 mo33231e(zzcdq zzcdq) {
        String str;
        d22 zzb = this.f34786c.zzb();
        if (k20.f34127d.mo34648e().booleanValue()) {
            str = zzcdq.f21157i;
        } else {
            str = zzcdq.f21159k;
        }
        return zzb.mo31085q6(str);
    }

    /* renamed from: f */
    public final mb3<Void> mo33232f(zzcdq zzcdq) {
        if (C7569cc.m30949g(zzcdq.f21159k)) {
            return bb3.m30648h(new wy1(2, "Pool key missing from removeUrl call."));
        }
        return m34257g(zzcdq, new e12(this), new f12(this), i12.f33028a);
    }
}
