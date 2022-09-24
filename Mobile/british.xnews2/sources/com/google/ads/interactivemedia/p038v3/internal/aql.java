package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aql */
/* compiled from: IMASDK */
final class aql implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqs f15572a;

    /* renamed from: b */
    final /* synthetic */ aqm f15573b;

    aql(aqm aqm, aqs aqs) {
        this.f15573b = aqm;
        this.f15572a = aqs;
    }

    public final void run() {
        synchronized (this.f15573b.f15575b) {
            if (this.f15573b.f15576c != null) {
                this.f15573b.f15576c.mo14211c((Exception) C4604n.m20098k(this.f15572a.mo14222e()));
            }
        }
    }
}
