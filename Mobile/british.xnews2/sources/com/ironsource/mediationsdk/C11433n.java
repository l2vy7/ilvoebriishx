package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p275a.C11291c;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.n */
public abstract class C11433n {

    /* renamed from: a */
    private HashSet<ImpressionDataListener> f51439a = new HashSet<>();

    public C11433n(HashSet<ImpressionDataListener> hashSet) {
        this.f51439a = hashSet;
    }

    /* renamed from: c */
    protected static String m51092c() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44447a(C11291c cVar, String str) {
        if (cVar != null) {
            ImpressionData a = cVar.mo44003a(str);
            if (a != null) {
                Iterator<ImpressionDataListener> it = this.f51439a.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* renamed from: a */
    public final void mo44448a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f51439a.add(impressionDataListener);
        }
    }

    /* renamed from: b */
    public final void mo44449b() {
        synchronized (this) {
            this.f51439a.clear();
        }
    }

    /* renamed from: b */
    public final void mo44450b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f51439a.remove(impressionDataListener);
        }
    }
}
