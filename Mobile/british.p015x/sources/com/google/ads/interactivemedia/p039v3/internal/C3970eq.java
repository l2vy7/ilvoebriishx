package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.p039v3.impl.data.C3789bb;
import com.google.ads.interactivemedia.p039v3.impl.data.C3790bc;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.gms.common.api.C7203b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eq */
/* compiled from: IMASDK */
final class C3970eq implements C3969ep {

    /* renamed from: a */
    private final aoz f17000a;

    /* renamed from: b */
    private final C3997fq f17001b;

    C3970eq(Context context, C3997fq fqVar) {
        this.f17000a = new ape(context);
        this.f17001b = fqVar;
    }

    /* renamed from: a */
    public final C3791bd mo15741a(C3790bc bcVar) {
        try {
            return C3791bd.forResponse(bcVar.mo13111id(), (String) arh.m14596c(this.f17000a.mo14169a(bcVar.url(), bcVar.requestType() == C3789bb.GET ? 0 : 1, bcVar.content(), this.f17001b.isLimitedAdTracking), (long) (bcVar.connectionTimeoutMs() + bcVar.readTimeoutMs()), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            return C3791bd.forError(bcVar.mo13111id(), 101);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof apa) {
                return C3791bd.forError(bcVar.mo13111id(), ((apa) cause).mo14175a());
            } else if (cause instanceof C7203b) {
                return C3791bd.forError(bcVar.mo13111id(), 102);
            } else {
                return C3791bd.forError(bcVar.mo13111id(), 100);
            }
        }
    }
}
