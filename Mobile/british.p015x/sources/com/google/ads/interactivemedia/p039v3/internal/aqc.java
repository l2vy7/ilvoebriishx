package com.google.ads.interactivemedia.p039v3.internal;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqc */
/* compiled from: IMASDK */
final class aqc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqs f15558a;

    /* renamed from: b */
    final /* synthetic */ aqd f15559b;

    aqc(aqd aqd, aqs aqs) {
        this.f15559b = aqd;
        this.f15558a = aqs;
    }

    public final void run() {
        try {
            aqs<List<aqs<?>>> a = ((ard) this.f15559b.f15561b).mo14240a();
            Executor executor = aqy.f15588b;
            a.mo14227j(executor, this.f15559b);
            a.mo14226i(executor, this.f15559b);
            a.mo14224g(executor, this.f15559b);
        } catch (aqr e) {
            if (e.getCause() instanceof Exception) {
                this.f15559b.f15562c.mo14237m((Exception) e.getCause());
            } else {
                this.f15559b.f15562c.mo14237m(e);
            }
        } catch (Exception e2) {
            this.f15559b.f15562c.mo14237m(e2);
        }
    }
}
