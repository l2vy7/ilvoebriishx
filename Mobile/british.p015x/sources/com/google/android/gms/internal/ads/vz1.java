package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vz1 {

    /* renamed from: a */
    private final ScheduledExecutorService f40592a;

    /* renamed from: b */
    private final nb3 f40593b;

    /* renamed from: c */
    private final n02 f40594c;

    /* renamed from: d */
    private final ou3<d22> f40595d;

    public vz1(ScheduledExecutorService scheduledExecutorService, nb3 nb3, n02 n02, ou3<d22> ou3) {
        this.f40592a = scheduledExecutorService;
        this.f40593b = nb3;
        this.f40594c = n02;
        this.f40595d = ou3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ mb3 mo35517a(zzcdq zzcdq, int i, Throwable th) throws Exception {
        return this.f40595d.zzb().mo31084p6(zzcdq, i);
    }

    /* renamed from: b */
    public final mb3<InputStream> mo35518b(zzcdq zzcdq) {
        mb3 mb3;
        String str = zzcdq.f21153e;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(str)) {
            mb3 = bb3.m30648h(new b12(1));
        } else {
            n02 n02 = this.f40594c;
            synchronized (n02.f34768c) {
                if (n02.f34769d) {
                    mb3 = n02.f34767b;
                } else {
                    n02.f34769d = true;
                    n02.f34771f = zzcdq;
                    n02.f34772g.checkAvailabilityAndConnect();
                    n02.f34767b.zzc(new m02(n02), po0.f37727f);
                    mb3 = n02.f34767b;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        sa3 D = sa3.m37369D(mb3);
        long intValue = (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37011W3)).intValue();
        return bb3.m30647g((sa3) bb3.m30655o(D, intValue, TimeUnit.SECONDS, this.f40592a), Throwable.class, new uz1(this, zzcdq, callingUid), this.f40593b);
    }
}
