package com.google.ads.interactivemedia.p038v3.internal;

import android.app.Application;
import android.content.Context;
import com.google.ads.interactivemedia.p038v3.api.AdError;
import com.google.ads.interactivemedia.p038v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p038v3.api.AdEvent;
import com.google.ads.interactivemedia.p038v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.p038v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p038v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.BaseManager;
import com.google.ads.interactivemedia.p038v3.api.C3759Ad;
import com.google.ads.interactivemedia.p038v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p038v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p038v3.impl.data.C3803c;
import com.google.ads.interactivemedia.p038v3.impl.data.C3806f;
import com.google.ads.interactivemedia.p038v3.impl.data.C3807g;
import com.google.ads.interactivemedia.p038v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dg */
/* compiled from: IMASDK */
abstract class C3933dg implements BaseManager, C3956ec, C3994fn {

    /* renamed from: a */
    private final C3958ee f16904a;

    /* renamed from: b */
    private final String f16905b;

    /* renamed from: c */
    private final List<AdEvent.AdEventListener> f16906c = new ArrayList(1);

    /* renamed from: d */
    private final C3940dn f16907d;

    /* renamed from: e */
    private final Context f16908e;

    /* renamed from: f */
    private final C3907ch f16909f;

    /* renamed from: g */
    private final C3973et f16910g;

    /* renamed from: h */
    private final C3983fc f16911h;

    /* renamed from: i */
    private C3803c f16912i;

    /* renamed from: j */
    private AdProgressInfo f16913j;

    /* renamed from: k */
    private AdsRenderingSettings f16914k;

    /* renamed from: l */
    private boolean f16915l = false;

    /* renamed from: m */
    private C3995fo f16916m;

    C3933dg(String str, C3958ee eeVar, C3983fc fcVar, BaseDisplayContainer baseDisplayContainer, C3907ch chVar, C3973et etVar, C3940dn dnVar, Context context, boolean z) {
        this.f16905b = str;
        this.f16904a = eeVar;
        this.f16911h = fcVar;
        this.f16908e = context;
        this.f16907d = dnVar;
        this.f16914k = new C3807g();
        this.f16909f = chVar;
        chVar.mo15618a(z);
        if (etVar == null) {
            etVar = null;
        } else {
            etVar.mo15746e(str);
            etVar.mo15745d(baseDisplayContainer.getAdContainer());
            addAdEventListener(etVar);
            addAdErrorListener(etVar);
            C3932df dfVar = (C3932df) baseDisplayContainer;
            for (FriendlyObstruction f : dfVar.mo15664b()) {
                etVar.mo15747f(f);
            }
            dfVar.mo15665c(etVar);
        }
        this.f16910g = etVar;
        eeVar.mo15709g(this, str);
        eeVar.mo15713k(this.f16911h, str);
        chVar.mo15619b();
        Application c = C4130ko.m17747c(context);
        if (c != null) {
            C3995fo foVar = new C3995fo(c);
            this.f16916m = foVar;
            foVar.mo15846a(this);
        }
    }

    /* renamed from: m */
    private final void m16968m(String str) {
        if (C4130ko.m17746b(this.f16908e, this.f16904a.mo15706d())) {
            this.f16904a.mo15705c().requestFocus();
            this.f16904a.mo15717o(new C3949dw(C3947du.userInteraction, C3948dv.focusUiElement, str));
        }
    }

    /* renamed from: n */
    private final void m16969n(AdErrorEvent adErrorEvent) {
        this.f16913j = null;
        this.f16907d.mo15684d(adErrorEvent);
    }

    /* renamed from: o */
    private final boolean m16970o() {
        return this.f16914k.getFocusSkipButtonWhenAvailable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, Object> mo15644a(AdsRenderingSettings adsRenderingSettings) {
        HashMap hashMap = new HashMap();
        hashMap.put("adsRenderingSettings", C3806f.builder(adsRenderingSettings).build());
        return hashMap;
    }

    public void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f16907d.mo15681a(adErrorListener);
    }

    public void addAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f16906c.add(adEventListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b A[LOOP:0: B:27:0x0065->B:29:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15645b(com.google.ads.interactivemedia.p038v3.internal.C3955eb r6) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r0 = r6.f16958a
            com.google.ads.interactivemedia.v3.impl.data.c r1 = r6.f16959b
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r2 = com.google.ads.interactivemedia.p038v3.api.AdEvent.AdEventType.ALL_ADS_COMPLETED
            int r2 = r0.ordinal()
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L_0x0054
            r3 = 24
            if (r2 == r3) goto L_0x0054
            r3 = 5
            if (r2 == r3) goto L_0x004e
            r3 = 6
            if (r2 == r3) goto L_0x0048
            r3 = 20
            if (r2 == r3) goto L_0x0045
            r3 = 21
            if (r2 == r3) goto L_0x0040
            switch(r2) {
                case 13: goto L_0x0034;
                case 14: goto L_0x0054;
                case 15: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0056
        L_0x0024:
            if (r1 == 0) goto L_0x0028
            r5.f16912i = r1
        L_0x0028:
            boolean r1 = r5.m16970o()
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r5.f16905b
            r5.m16968m(r1)
            goto L_0x0056
        L_0x0034:
            boolean r1 = r5.m16970o()
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r5.f16905b
            r5.m16968m(r1)
            goto L_0x0056
        L_0x0040:
            com.google.ads.interactivemedia.v3.api.AdProgressInfo r1 = r6.f16962e
            r5.f16913j = r1
            goto L_0x0056
        L_0x0045:
            r5.f16912i = r1
            goto L_0x0056
        L_0x0048:
            com.google.ads.interactivemedia.v3.internal.ch r1 = r5.f16909f
            r1.mo15622e()
            goto L_0x0056
        L_0x004e:
            com.google.ads.interactivemedia.v3.internal.ch r1 = r5.f16909f
            r1.mo15621d()
            goto L_0x0056
        L_0x0054:
            r5.f16913j = r4
        L_0x0056:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f16960c
            com.google.ads.interactivemedia.v3.internal.ck r1 = new com.google.ads.interactivemedia.v3.internal.ck
            com.google.ads.interactivemedia.v3.impl.data.c r2 = r5.f16912i
            r1.<init>(r0, r2, r6)
            java.util.List<com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener> r6 = r5.f16906c
            java.util.Iterator r6 = r6.iterator()
        L_0x0065:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r6.next()
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener r2 = (com.google.ads.interactivemedia.p038v3.api.AdEvent.AdEventListener) r2
            r2.onAdEvent(r1)
            goto L_0x0065
        L_0x0075:
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.p038v3.api.AdEvent.AdEventType.COMPLETED
            if (r0 == r6) goto L_0x007f
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.p038v3.api.AdEvent.AdEventType.SKIPPED
            if (r0 != r6) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            return
        L_0x007f:
            r5.f16912i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C3933dg.mo15645b(com.google.ads.interactivemedia.v3.internal.eb):void");
    }

    /* renamed from: c */
    public void mo15666c(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.f16911h.mo15738h(resizeAndPositionVideoMsgData);
    }

    /* renamed from: d */
    public void mo15667d() {
        this.f16911h.mo15739i();
    }

    public void destroy() {
        this.f16915l = true;
        this.f16910g.mo15749h();
        this.f16909f.mo15620c();
        this.f16909f.mo15622e();
        C3995fo foVar = this.f16916m;
        if (foVar != null) {
            foVar.mo15847b();
        }
        this.f16911h.mo15736f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C3983fc mo15668e() {
        return this.f16911h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo15669f() {
        this.f16904a.mo15715m(this.f16905b);
        this.f16906c.clear();
        this.f16907d.mo15683c();
    }

    public void focus() {
        m16968m(this.f16905b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo15670g(C3948dv dvVar) {
        this.f16904a.mo15717o(new C3949dw(C3947du.adsManager, dvVar, this.f16905b));
    }

    public VideoProgressUpdate getAdProgress() {
        return this.f16915l ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.f16911h.getAdProgress();
    }

    public AdProgressInfo getAdProgressInfo() {
        return this.f16913j;
    }

    public C3759Ad getCurrentAd() {
        return this.f16912i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo15671h(C3947du duVar, C3948dv dvVar, Object obj) {
        this.f16904a.mo15717o(new C3949dw(duVar, dvVar, this.f16905b, obj));
    }

    /* renamed from: i */
    public void mo15672i(AdError.AdErrorType adErrorType, int i, String str) {
        m16969n(new C3909cj(new AdError(adErrorType, i, str)));
    }

    public void init() {
        init((AdsRenderingSettings) null);
    }

    /* renamed from: j */
    public void mo15673j(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str) {
        m16969n(new C3909cj(new AdError(adErrorType, adErrorCode, str)));
    }

    /* renamed from: k */
    public void mo15674k() {
        this.f16904a.mo15717o(new C3949dw(C3947du.adsManager, C3948dv.appBackgrounding, this.f16905b));
    }

    /* renamed from: l */
    public void mo15675l() {
        this.f16904a.mo15717o(new C3949dw(C3947du.adsManager, C3948dv.appForegrounding, this.f16905b));
    }

    public void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f16907d.mo15682b(adErrorListener);
    }

    public void removeAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f16906c.remove(adEventListener);
    }

    public void init(AdsRenderingSettings adsRenderingSettings) {
        if (adsRenderingSettings != null) {
            this.f16914k = adsRenderingSettings;
        }
        this.f16904a.mo15717o(new C3949dw(C3947du.adsManager, C3948dv.init, this.f16905b, mo15644a(this.f16914k)));
        this.f16911h.mo15733c();
    }
}
