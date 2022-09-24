package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p039v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p039v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p039v3.impl.data.C3797bj;
import com.google.ads.interactivemedia.p039v3.impl.data.C3802bo;
import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cm */
/* compiled from: IMASDK */
final class C3912cm implements VideoAdPlayer.VideoAdPlayerCallback {

    /* renamed from: a */
    private final C3911cl f16824a;

    /* renamed from: b */
    private final HashMap<AdMediaInfo, Boolean> f16825b;

    /* renamed from: c */
    private boolean f16826c = false;

    C3912cm(C3911cl clVar) {
        this.f16824a = clVar;
        this.f16825b = avr.m14967i(2);
    }

    /* renamed from: c */
    private final void m16920c(C3948dv dvVar, AdMediaInfo adMediaInfo) {
        m16921d(dvVar, adMediaInfo, (Object) null);
    }

    /* renamed from: d */
    private final void m16921d(C3948dv dvVar, AdMediaInfo adMediaInfo, Object obj) {
        this.f16824a.mo15628a(dvVar, adMediaInfo, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15630a() {
        this.f16826c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15631b() {
        this.f16826c = false;
    }

    public final void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
        if (this.f16826c && videoProgressUpdate != null && videoProgressUpdate.getDuration() > 0.0f) {
            if (this.f16825b.get(adMediaInfo) == null && videoProgressUpdate.getCurrentTime() > 0.0f) {
                m16920c(C3948dv.start, adMediaInfo);
                this.f16825b.put(adMediaInfo, Boolean.TRUE);
            }
            m16921d(C3948dv.timeupdate, adMediaInfo, C3797bj.create(videoProgressUpdate));
        }
    }

    public final void onBuffering(AdMediaInfo adMediaInfo) {
        if (this.f16826c) {
            m16920c(C3948dv.waiting, adMediaInfo);
        }
    }

    public final void onContentComplete() {
        this.f16824a.mo15629b(C3947du.adsLoader, C3948dv.contentComplete);
    }

    public final void onEnded(AdMediaInfo adMediaInfo) {
        if (this.f16826c) {
            m16920c(C3948dv.end, adMediaInfo);
            this.f16825b.remove(adMediaInfo);
        }
    }

    public final void onError(AdMediaInfo adMediaInfo) {
        if (this.f16826c) {
            m16920c(C3948dv.error, adMediaInfo);
            this.f16825b.remove(adMediaInfo);
        }
    }

    public final void onLoaded(AdMediaInfo adMediaInfo) {
        if (this.f16826c) {
            m16920c(C3948dv.loaded, adMediaInfo);
        }
    }

    public final void onPause(AdMediaInfo adMediaInfo) {
        if (this.f16826c) {
            m16920c(C3948dv.pause, adMediaInfo);
        }
    }

    public final void onPlay(AdMediaInfo adMediaInfo) {
    }

    public final void onResume(AdMediaInfo adMediaInfo) {
        if (this.f16826c) {
            m16920c(C3948dv.play, adMediaInfo);
        }
    }

    public final void onVolumeChanged(AdMediaInfo adMediaInfo, int i) {
        if (this.f16826c) {
            m16921d(C3948dv.volumeChange, adMediaInfo, C3802bo.builder().volumePercentage(i).build());
        }
    }
}
