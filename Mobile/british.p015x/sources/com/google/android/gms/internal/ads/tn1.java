package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tn1 {

    /* renamed from: a */
    private final vs1 f39470a;

    /* renamed from: b */
    private final ir1 f39471b;

    /* renamed from: c */
    private final e31 f39472c;

    /* renamed from: d */
    private final qm1 f39473d;

    public tn1(vs1 vs1, ir1 ir1, e31 e31, qm1 qm1) {
        this.f39470a = vs1;
        this.f39471b = ir1;
        this.f39472c = e31;
        this.f39473d = qm1;
    }

    /* renamed from: a */
    public final View mo34988a() throws ju0 {
        xt0 a = this.f39470a.mo35491a(zzbfi.m40643E0(), (ir2) null, (lr2) null);
        ((View) a).setVisibility(8);
        a.mo18726O("/sendMessageToSdk", new nn1(this));
        a.mo18726O("/adMuted", new on1(this));
        this.f39471b.mo32759j(new WeakReference(a), "/loadHtml", new pn1(this));
        this.f39471b.mo32759j(new WeakReference(a), "/showOverlay", new qn1(this));
        this.f39471b.mo32759j(new WeakReference(a), "/hideOverlay", new rn1(this));
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo34989b(xt0 xt0, Map map) {
        this.f39471b.mo32756g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo34990c(xt0 xt0, Map map) {
        this.f39473d.zzf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo34991d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(TtmlNode.ATTR_ID, (String) map.get(TtmlNode.ATTR_ID));
        this.f39471b.mo32756g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo34992e(xt0 xt0, Map map) {
        co0.zzi("Showing native ads overlay.");
        xt0.mo18790t().setVisibility(0);
        this.f39472c.mo31462f(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo34993f(xt0 xt0, Map map) {
        co0.zzi("Hiding native ads overlay.");
        xt0.mo18790t().setVisibility(8);
        this.f39472c.mo31462f(false);
    }
}
