package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.interactivemedia.p038v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p038v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p038v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p038v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p038v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fj */
/* compiled from: IMASDK */
public final class C3990fj implements VideoAdPlayer, ResizablePlayer, C3991fk, C3986ff {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4162lt f17058a;

    /* renamed from: b */
    private final SurfaceView f17059b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final air f17060c;

    /* renamed from: d */
    private final FrameLayout f17061d;

    /* renamed from: e */
    private final ViewGroup f17062e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<VideoAdPlayer.VideoAdPlayerCallback> f17063f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final HashSet<AdMediaInfo> f17064g;

    /* renamed from: h */
    private final C3987fg f17065h;

    /* renamed from: i */
    private final C3988fh f17066i;

    /* renamed from: j */
    private final C3989fi f17067j;

    /* renamed from: k */
    private final ArrayList<AdMediaInfo> f17068k = new ArrayList<>();

    /* renamed from: l */
    private final ajp f17069l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public aam f17070m;

    /* renamed from: n */
    private AdPodInfo f17071n;

    /* renamed from: o */
    private int f17072o;

    public C3990fj(Context context, ViewGroup viewGroup) {
        C4162lt a = C4091jc.m17494a(context, new C3993fm(context), new aif(ahz.f14909a, new aht()));
        this.f17062e = viewGroup;
        this.f17058a = a;
        this.f17069l = new ajp(context, amm.m14226ap(context));
        this.f17063f = new ArrayList(1);
        C3988fh fhVar = new C3988fh(this);
        this.f17066i = fhVar;
        this.f17064g = avr.m14960b(4);
        C3989fi fiVar = new C3989fi(this);
        this.f17067j = fiVar;
        this.f17065h = new C3987fg(this);
        a.mo16298e(fhVar);
        a.mo16300g(fiVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17061d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        air air = new air(context);
        this.f17060c = air;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        air.setLayoutParams(layoutParams);
        this.f17072o = 1;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f17059b = surfaceView;
        surfaceView.setZOrderMediaOverlay(true);
        a.mo16297d(surfaceView);
        air.addView(surfaceView);
        frameLayout.addView(air);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: i */
    private final void m17193i() {
        this.f17061d.setVisibility(8);
        this.f17059b.setVisibility(4);
        this.f17070m = null;
        this.f17065h.mo15781b();
        this.f17072o = 1;
        this.f17058a.mo15935a();
        this.f17058a.mo16295S();
        this.f17064g.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final AdMediaInfo m17194j() {
        int n = this.f17058a.mo16010n();
        if (this.f17070m == null) {
            return null;
        }
        return m17197m(n);
    }

    /* renamed from: k */
    private final void m17195k(AdMediaInfo adMediaInfo) {
        abd abd;
        Uri parse = Uri.parse(adMediaInfo.getUrl());
        int ab = amm.m14212ab(parse);
        if (ab == 0) {
            ajp ajp = this.f17069l;
            abd = new adx(new aef(acz.f14222b, ajp), ajp).mo13516a(parse);
        } else if (ab == 2) {
            abd = new afz(new afm(this.f17069l)).mo13642a(parse);
        } else if (ab == 3) {
            abd = new aby(this.f17069l, new C3992fl()).mo13378a(parse);
        } else {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unsupported type: ");
            sb.append(ab);
            throw new IllegalStateException(sb.toString());
        }
        this.f17070m.mo13277C(abd);
        this.f17068k.add(adMediaInfo);
    }

    /* renamed from: l */
    private final int m17196l(AdMediaInfo adMediaInfo) {
        return this.f17068k.indexOf(adMediaInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final AdMediaInfo m17197m(int i) {
        if (i < 0 || i >= this.f17068k.size()) {
            return null;
        }
        return this.f17068k.get(i);
    }

    /* renamed from: a */
    public final void mo15779a() {
        AdMediaInfo j = m17194j();
        VideoProgressUpdate adProgress = getAdProgress();
        for (VideoAdPlayer.VideoAdPlayerCallback onAdProgress : this.f17063f) {
            onAdProgress.onAdProgress(j, adProgress);
        }
    }

    public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f17063f.add(videoAdPlayerCallback);
    }

    public final VideoProgressUpdate getAdProgress() {
        if ((this.f17058a.mo16302i() == 2 || this.f17058a.mo16302i() == 3) && this.f17058a.mo16307w() > 0) {
            return new VideoProgressUpdate(this.f17058a.mo16012p(), this.f17058a.mo16307w());
        }
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    public final int getVolume() {
        return 100;
    }

    public final void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f17070m != null) {
            AdPodInfo adPodInfo2 = this.f17071n;
            if (adPodInfo2 == null || adPodInfo == null || adPodInfo2.getPodIndex() != adPodInfo.getPodIndex()) {
                throw new IllegalStateException("Called loadAd on an ad from a different ad break.");
            }
            m17195k(adMediaInfo);
            return;
        }
        this.f17058a.mo15935a();
        C4162lt ltVar = this.f17058a;
        ltVar.mo15995C(ltVar.mo16010n());
        this.f17068k.clear();
        this.f17070m = new aam(new ack(), new abd[0]);
        this.f17071n = adPodInfo;
        m17195k(adMediaInfo);
        this.f17058a.mo16304k(false);
        this.f17058a.mo16303j(this.f17070m);
        this.f17072o = 2;
    }

    public final void pauseAd(AdMediaInfo adMediaInfo) {
        this.f17065h.mo15781b();
        this.f17072o = 4;
        this.f17058a.mo16304k(false);
        for (VideoAdPlayer.VideoAdPlayerCallback onPause : this.f17063f) {
            onPause.onPause(adMediaInfo);
        }
    }

    public final void playAd(AdMediaInfo adMediaInfo) {
        if (this.f17070m == null || !this.f17068k.contains(adMediaInfo)) {
            throw new IllegalStateException("Call to playAd without appropriate call to loadAd first.");
        }
        this.f17061d.setVisibility(0);
        this.f17059b.setVisibility(0);
        int i = this.f17072o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                for (VideoAdPlayer.VideoAdPlayerCallback onPlay : this.f17063f) {
                    onPlay.onPlay(adMediaInfo);
                }
                this.f17058a.mo16296c(this.f17059b.getHolder());
            } else if (i2 == 2) {
                return;
            } else {
                if (i2 == 3) {
                    for (VideoAdPlayer.VideoAdPlayerCallback onResume : this.f17063f) {
                        onResume.onResume(adMediaInfo);
                    }
                }
            }
            this.f17065h.mo15780a();
            this.f17072o = 3;
            this.f17058a.mo16304k(true);
        } else {
            throw new IllegalStateException("Call to playAd when player state is not LOADED.");
        }
    }

    public final void release() {
        m17193i();
        this.f17058a.mo16299f(this.f17066i);
        this.f17058a.mo16301h(this.f17067j);
        this.f17058a.mo16306o();
        this.f17065h.mo15781b();
        this.f17062e.removeView(this.f17061d);
    }

    public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f17063f.remove(videoAdPlayerCallback);
    }

    public final void resize(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((this.f17062e.getWidth() - i) - i3, (this.f17062e.getHeight() - i2) - i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        this.f17060c.setLayoutParams(layoutParams);
    }

    public final void stopAd(AdMediaInfo adMediaInfo) {
        if (this.f17070m == null) {
            Log.e("IMASDK", "Attempting to stop when no current ad source");
            return;
        }
        this.f17064g.add(adMediaInfo);
        int l = m17196l(adMediaInfo);
        int n = this.f17058a.mo16010n();
        if (l == n) {
            if (m17196l(adMediaInfo) == this.f17068k.size() - 1) {
                m17193i();
                return;
            }
            this.f17058a.mo15995C(this.f17058a.mo16010n() + 1);
        } else if (l > n) {
            this.f17070m.mo13282I(m17196l(adMediaInfo));
            this.f17068k.remove(adMediaInfo);
        }
    }
}
