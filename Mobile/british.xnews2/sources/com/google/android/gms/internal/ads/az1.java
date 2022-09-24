package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class az1 {

    /* renamed from: a */
    private final nb3 f29834a;

    /* renamed from: b */
    private final nb3 f29835b;

    /* renamed from: c */
    private final j02 f29836c;

    /* renamed from: d */
    private final ou3<d22> f29837d;

    public az1(nb3 nb3, nb3 nb32, j02 j02, ou3<d22> ou3) {
        this.f29834a = nb3;
        this.f29835b = nb32;
        this.f29836c = j02;
        this.f29837d = ou3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ mb3 mo30582a(zzcdq zzcdq, int i, b12 b12) throws Exception {
        return this.f29837d.zzb().mo31083o6(zzcdq, i);
    }

    /* renamed from: b */
    public final mb3<InputStream> mo30583b(zzcdq zzcdq) {
        mb3<V> mb3;
        String str = zzcdq.f21153e;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(str)) {
            mb3 = bb3.m30648h(new b12(1));
        } else {
            mb3 = bb3.m30647g(this.f29834a.mo33675b(new zy1(this, zzcdq)), ExecutionException.class, yy1.f42241a, this.f29835b);
        }
        return bb3.m30647g(mb3, b12.class, new xy1(this, zzcdq, Binder.getCallingUid()), this.f29835b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ InputStream mo30584c(zzcdq zzcdq) throws Exception {
        uo0<InputStream> uo0;
        j02 j02 = this.f29836c;
        synchronized (j02.f34768c) {
            if (j02.f34769d) {
                uo0 = j02.f34767b;
            } else {
                j02.f34769d = true;
                j02.f34771f = zzcdq;
                j02.f34772g.checkAvailabilityAndConnect();
                j02.f34767b.zzc(new i02(j02), po0.f37727f);
                uo0 = j02.f34767b;
            }
        }
        return (InputStream) uo0.get((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37011W3)).intValue(), TimeUnit.SECONDS);
    }
}
