package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.AdError;
import com.google.ads.interactivemedia.p039v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p039v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p039v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p039v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p039v3.impl.data.C3788ba;
import com.google.ads.interactivemedia.p039v3.impl.data.C3804d;
import com.google.ads.interactivemedia.p039v3.impl.data.ResizeAndPositionVideoMsgData;

/* renamed from: com.google.ads.interactivemedia.v3.internal.el */
/* compiled from: IMASDK */
public final class C3965el implements C3983fc, C3911cl {

    /* renamed from: a */
    private final AdDisplayContainer f16989a;

    /* renamed from: b */
    private final VideoAdPlayer f16990b;

    /* renamed from: c */
    private final C3940dn f16991c;

    /* renamed from: d */
    private final C3958ee f16992d;

    /* renamed from: e */
    private final String f16993e;

    /* renamed from: f */
    private final C3912cm f16994f;

    /* renamed from: g */
    private final atr<C3947du, AdMediaInfo> f16995g = atr.m14768p();

    public C3965el(String str, C3958ee eeVar, C3940dn dnVar, AdDisplayContainer adDisplayContainer) {
        this.f16989a = adDisplayContainer;
        VideoAdPlayer player = adDisplayContainer.getPlayer();
        this.f16990b = player;
        this.f16991c = dnVar;
        this.f16992d = eeVar;
        this.f16993e = str;
        C3912cm cmVar = new C3912cm(this);
        this.f16994f = cmVar;
        player.addCallback(cmVar);
    }

    /* renamed from: a */
    public final void mo15628a(C3948dv dvVar, AdMediaInfo adMediaInfo, Object obj) {
        C3947du duVar = this.f16995g.mo14487j().get(adMediaInfo);
        if (duVar == null) {
            String valueOf = String.valueOf(dvVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 113);
            sb.append("The adMediaInfo for the ");
            sb.append(valueOf);
            sb.append(" event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
            C4257pg.m18526e(sb.toString());
            return;
        }
        this.f16992d.mo15717o(new C3949dw(duVar, dvVar, this.f16993e, obj));
    }

    /* renamed from: b */
    public final void mo15629b(C3947du duVar, C3948dv dvVar) {
        this.f16992d.mo15717o(new C3949dw(duVar, dvVar, "*"));
    }

    /* renamed from: c */
    public final void mo15733c() {
    }

    /* renamed from: d */
    public final void mo15734d(C3947du duVar, C3948dv dvVar, C3788ba baVar) {
        AdMediaInfo adMediaInfo = this.f16995g.get(duVar);
        C3948dv dvVar2 = C3948dv.activate;
        int ordinal = dvVar.ordinal();
        if (ordinal != 33) {
            if (ordinal != 42) {
                if (ordinal != 71) {
                    if (ordinal == 51) {
                        this.f16990b.pauseAd(adMediaInfo);
                        return;
                    } else if (ordinal == 52) {
                        this.f16990b.playAd(adMediaInfo);
                        this.f16994f.mo15630a();
                        return;
                    } else {
                        return;
                    }
                }
            } else if (baVar == null || baVar.videoUrl == null) {
                this.f16991c.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
                return;
            } else {
                this.f16994f.mo15630a();
                AdMediaInfo adMediaInfo2 = new AdMediaInfo(baVar.videoUrl);
                C3804d dVar = baVar.adPodInfo;
                if (dVar == null) {
                    dVar = null;
                }
                this.f16995g.put(duVar, adMediaInfo2);
                this.f16990b.loadAd(adMediaInfo2, dVar);
                return;
            }
        }
        this.f16990b.stopAd(adMediaInfo);
        this.f16995g.remove(duVar);
    }

    /* renamed from: e */
    public final void mo15735e() {
        this.f16994f.mo15631b();
    }

    /* renamed from: f */
    public final void mo15736f() {
        C4257pg.m18525d("Destroying NativeVideoDisplay");
        this.f16990b.removeCallback(this.f16994f);
        this.f16990b.release();
    }

    /* renamed from: g */
    public final boolean mo15737g() {
        return this.f16990b instanceof C3991fk;
    }

    public final VideoProgressUpdate getAdProgress() {
        return this.f16990b.getAdProgress();
    }

    /* renamed from: h */
    public final void mo15738h(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f16990b instanceof ResizablePlayer)) {
            C4257pg.m18528g("Video player does not support resizing.");
        } else if (!C4257pg.m18524c(this.f16989a, resizeAndPositionVideoMsgData)) {
            C4257pg.m18528g("Creative resize parameters were not within the containers bounds.");
        } else {
            int width = this.f16989a.getAdContainer().getWidth();
            int height = this.f16989a.getAdContainer().getHeight();
            int intValue = resizeAndPositionVideoMsgData.mo12903x().intValue();
            int intValue2 = resizeAndPositionVideoMsgData.width().intValue();
            int intValue3 = resizeAndPositionVideoMsgData.mo12904y().intValue();
            ((ResizablePlayer) this.f16990b).resize(resizeAndPositionVideoMsgData.mo12903x().intValue(), resizeAndPositionVideoMsgData.mo12904y().intValue(), (width - intValue) - intValue2, (height - intValue3) - resizeAndPositionVideoMsgData.height().intValue());
        }
    }

    /* renamed from: i */
    public final void mo15739i() {
        VideoAdPlayer videoAdPlayer = this.f16990b;
        if (videoAdPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoAdPlayer).resize(0, 0, 0, 0);
        }
    }
}
