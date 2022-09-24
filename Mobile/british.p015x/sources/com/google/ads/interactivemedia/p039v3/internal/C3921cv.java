package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.AdsManager;
import com.google.ads.interactivemedia.p039v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p039v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p039v3.impl.data.C3797bj;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cv */
/* compiled from: IMASDK */
public final class C3921cv extends C3933dg implements AdsManager, AdErrorEvent.AdErrorListener {

    /* renamed from: a */
    private final List<Float> f16860a;

    /* renamed from: b */
    private final C3984fd f16861b;

    /* renamed from: c */
    private C3938dl f16862c;

    /* renamed from: d */
    private C3976ew f16863d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3921cv(java.lang.String r16, com.google.ads.interactivemedia.p039v3.internal.C3958ee r17, com.google.ads.interactivemedia.p039v3.api.AdDisplayContainer r18, com.google.ads.interactivemedia.p039v3.internal.C3976ew r19, java.util.List r20, java.util.SortedSet r21, com.google.ads.interactivemedia.p039v3.internal.C3973et r22, com.google.ads.interactivemedia.p039v3.internal.C3940dn r23, android.content.Context r24, boolean r25) {
        /*
            r15 = this;
            r10 = r15
            r11 = r16
            r12 = r17
            r13 = r19
            com.google.ads.interactivemedia.v3.internal.el r3 = new com.google.ads.interactivemedia.v3.internal.el
            r4 = r18
            r7 = r23
            r3.<init>(r11, r12, r7, r4)
            com.google.ads.interactivemedia.v3.internal.ch r5 = new com.google.ads.interactivemedia.v3.internal.ch
            android.view.ViewGroup r0 = r18.getAdContainer()
            r5.<init>(r11, r12, r0)
            com.google.ads.interactivemedia.v3.internal.fd r14 = new com.google.ads.interactivemedia.v3.internal.fd
            android.webkit.WebView r0 = r17.mo15705c()
            android.view.ViewGroup r1 = r18.getAdContainer()
            r14.<init>(r0, r1)
            r0 = r15
            r1 = r16
            r2 = r17
            r6 = r22
            r8 = r24
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r20
            r10.f16860a = r0
            r10.f16863d = r13
            r10.f16861b = r14
            if (r13 == 0) goto L_0x004d
            com.google.ads.interactivemedia.v3.internal.dl r0 = new com.google.ads.interactivemedia.v3.internal.dl
            r1 = r21
            r0.<init>(r12, r1, r11)
            r10.f16862c = r0
            r13.mo15752a(r0)
            r19.mo15754c()
        L_0x004d:
            r15.addAdErrorListener(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C3921cv.<init>(java.lang.String, com.google.ads.interactivemedia.v3.internal.ee, com.google.ads.interactivemedia.v3.api.AdDisplayContainer, com.google.ads.interactivemedia.v3.internal.ew, java.util.List, java.util.SortedSet, com.google.ads.interactivemedia.v3.internal.et, com.google.ads.interactivemedia.v3.internal.dn, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, Object> mo15644a(AdsRenderingSettings adsRenderingSettings) {
        Map<String, Object> a = super.mo15644a(adsRenderingSettings);
        C3976ew ewVar = this.f16863d;
        if (ewVar != null) {
            VideoProgressUpdate f = ewVar.mo15757f();
            if (!f.equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY)) {
                double currentTimeMs = (double) (((float) f.getCurrentTimeMs()) / 1000.0f);
                StringBuilder sb = new StringBuilder(68);
                sb.append("AdsManager.init -> Setting contentStartTime ");
                sb.append(currentTimeMs);
                C4257pg.m18525d(sb.toString());
                a.put("contentStartTime", Double.valueOf(currentTimeMs));
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo15645b(C3955eb ebVar) {
        C3965el elVar = (C3965el) mo15668e();
        AdEvent.AdEventType adEventType = ebVar.f16958a;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = adEventType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 5) {
                C3976ew ewVar = this.f16863d;
                if (ewVar != null) {
                    ewVar.mo15755d();
                }
            } else if (ordinal == 6) {
                this.f16861b.mo15777b();
                elVar.mo15735e();
                C3976ew ewVar2 = this.f16863d;
                if (ewVar2 != null) {
                    ewVar2.mo15754c();
                }
            } else if (ordinal == 14) {
                this.f16861b.mo15777b();
            } else if (ordinal == 15) {
                this.f16861b.mo15776a();
            }
            super.mo15645b(ebVar);
            return;
        }
        super.destroy();
        C3976ew ewVar3 = this.f16863d;
        if (ewVar3 != null) {
            ewVar3.mo15755d();
            this.f16863d = null;
        }
        this.f16861b.mo15777b();
        mo15670g(C3948dv.destroy);
        super.mo15645b(ebVar);
        mo15669f();
    }

    public final void clicked() {
        mo15670g(C3948dv.click);
    }

    public final void destroy() {
        super.destroy();
        C3976ew ewVar = this.f16863d;
        if (ewVar != null) {
            ewVar.mo15755d();
            this.f16863d = null;
        }
        this.f16861b.mo15777b();
        mo15670g(C3948dv.destroy);
    }

    public final void discardAdBreak() {
        mo15670g(C3948dv.discardAdBreak);
    }

    public final List<Float> getAdCuePoints() {
        return this.f16860a;
    }

    public final boolean isCustomPlaybackUsed() {
        return ((C3965el) mo15668e()).mo15737g();
    }

    public final void onAdError(AdErrorEvent adErrorEvent) {
        this.f16861b.mo15777b();
    }

    public final void pause() {
        mo15670g(C3948dv.pause);
    }

    public final void requestNextAdBreak() {
        C3976ew ewVar = this.f16863d;
        if (ewVar != null) {
            mo15671h(C3947du.contentTimeUpdate, C3948dv.contentTimeUpdate, C3797bj.create(ewVar.mo15757f()));
            mo15670g(C3948dv.requestNextAdBreak);
        }
    }

    public final void resume() {
        mo15670g(C3948dv.resume);
    }

    public final void skip() {
        mo15670g(C3948dv.skip);
    }

    public final void start() {
        mo15670g(C3948dv.start);
    }
}
