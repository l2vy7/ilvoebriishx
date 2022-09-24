package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.p038v3.api.AdError;
import com.google.ads.interactivemedia.p038v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p038v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p038v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.p038v3.impl.data.C3788ba;
import com.google.ads.interactivemedia.p038v3.impl.data.C3797bj;
import com.google.ads.interactivemedia.p038v3.impl.data.C3802bo;
import com.google.ads.interactivemedia.p038v3.impl.data.C3803c;
import com.google.ads.interactivemedia.p038v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fb */
/* compiled from: IMASDK */
public final class C3982fb implements VideoStreamPlayer.VideoStreamPlayerCallback, C3983fc, C3975ev {

    /* renamed from: a */
    private VideoStreamPlayer f17040a;

    /* renamed from: b */
    private C3958ee f17041b;

    /* renamed from: c */
    private final C3940dn f17042c;

    /* renamed from: d */
    private boolean f17043d = false;

    /* renamed from: e */
    private final C3984fd f17044e;

    /* renamed from: f */
    private final String f17045f;

    /* renamed from: g */
    private final String f17046g;

    /* renamed from: h */
    private final StreamDisplayContainer f17047h;

    /* renamed from: i */
    private C3976ew f17048i;

    C3982fb(String str, C3958ee eeVar, C3940dn dnVar, StreamDisplayContainer streamDisplayContainer, String str2) {
        C3976ew ewVar = new C3976ew(streamDisplayContainer.getVideoStreamPlayer());
        C3984fd fdVar = new C3984fd(eeVar.mo15705c(), streamDisplayContainer.getAdContainer());
        this.f17040a = streamDisplayContainer.getVideoStreamPlayer();
        this.f17042c = dnVar;
        this.f17045f = str;
        this.f17041b = eeVar;
        this.f17046g = str2;
        this.f17043d = false;
        this.f17047h = streamDisplayContainer;
        this.f17048i = ewVar;
        this.f17044e = fdVar;
    }

    /* renamed from: o */
    private final void m17094o(C3948dv dvVar, Object obj) {
        this.f17041b.mo15717o(new C3949dw(C3947du.videoDisplay1, dvVar, this.f17045f, obj));
    }

    /* renamed from: a */
    public final void mo15680a(VideoProgressUpdate videoProgressUpdate) {
        if (!this.f17043d) {
            m17094o(C3948dv.start, C3802bo.builder().volumePercentage(this.f17040a.getVolume()).build());
            this.f17043d = true;
        }
        m17094o(C3948dv.timeupdate, C3797bj.create(videoProgressUpdate));
    }

    /* renamed from: b */
    public final void mo15768b() {
        this.f17040a.onAdBreakStarted();
    }

    /* renamed from: c */
    public final void mo15733c() {
        this.f17048i.mo15752a(this);
        this.f17048i.mo15754c();
    }

    /* renamed from: d */
    public final void mo15734d(C3947du duVar, C3948dv dvVar, C3788ba baVar) {
        String str;
        String str2;
        C3948dv dvVar2 = C3948dv.activate;
        int ordinal = dvVar.ordinal();
        if (ordinal != 44) {
            if (ordinal == 51) {
                this.f17040a.pause();
            } else if (ordinal == 52) {
                this.f17040a.resume();
            }
        } else if (baVar == null || (str = baVar.streamUrl) == null) {
            this.f17042c.mo15684d(new C3909cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
        } else {
            int i = 0;
            this.f17043d = false;
            String str3 = this.f17046g;
            if (!(str3 == null || str3.length() == 0)) {
                String str4 = "";
                String replaceAll = this.f17046g.trim().replaceAll("\\s+", str4);
                if (replaceAll.charAt(0) == '?') {
                    replaceAll = replaceAll.substring(1);
                }
                if (replaceAll.length() != 0) {
                    Map<String, String> d = C4038hd.m17318d(Uri.parse(str));
                    HashMap hashMap = new HashMap();
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    buildUpon.clearQuery();
                    if (replaceAll.length() != 0) {
                        str2 = "http://www.dom.com/path?".concat(replaceAll);
                    } else {
                        str2 = new String("http://www.dom.com/path?");
                    }
                    Map<String, String> d2 = C4038hd.m17318d(Uri.parse(str2));
                    hashMap.putAll(d2);
                    if (!d.isEmpty()) {
                        for (String next : d.keySet()) {
                            if (!d2.containsKey(next)) {
                                hashMap.put(next, d.get(next));
                            }
                        }
                    }
                    if (hashMap.size() != 0) {
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append((String) entry.getValue());
                            if (i < hashMap.size() - 1) {
                                sb.append("&");
                            }
                            i++;
                        }
                        str4 = sb.toString();
                    }
                    buildUpon.encodedQuery(str4);
                    str = buildUpon.build().toString();
                }
            }
            this.f17040a.loadUrl(str, baVar.subtitles);
        }
    }

    /* renamed from: e */
    public final void mo15769e() {
        this.f17040a.onAdBreakEnded();
        mo15775n();
    }

    /* renamed from: f */
    public final void mo15736f() {
        C4257pg.m18525d("Destroying StreamVideoDisplay");
        this.f17040a.removeCallback(this);
        this.f17040a = null;
        this.f17041b = null;
        C3976ew ewVar = this.f17048i;
        if (ewVar != null) {
            ewVar.mo15755d();
            this.f17048i.mo15753b(this);
        }
        this.f17048i = null;
        this.f17044e.mo15777b();
    }

    /* renamed from: g */
    public final void mo15770g() {
        this.f17040a.onAdPeriodStarted();
    }

    public final VideoProgressUpdate getAdProgress() {
        return this.f17040a.getContentProgress();
    }

    /* renamed from: h */
    public final void mo15738h(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f17040a instanceof ResizablePlayer)) {
            C4257pg.m18528g("Stream player does not support resizing.");
        } else if (!C4257pg.m18524c(this.f17047h, resizeAndPositionVideoMsgData)) {
            C4257pg.m18528g("Video resize parameters were not within the container bounds.");
        } else {
            int width = this.f17047h.getAdContainer().getWidth();
            int height = this.f17047h.getAdContainer().getHeight();
            int intValue = resizeAndPositionVideoMsgData.mo12903x().intValue();
            int intValue2 = resizeAndPositionVideoMsgData.width().intValue();
            int intValue3 = resizeAndPositionVideoMsgData.mo12904y().intValue();
            ((ResizablePlayer) this.f17040a).resize(resizeAndPositionVideoMsgData.mo12903x().intValue(), resizeAndPositionVideoMsgData.mo12904y().intValue(), (width - intValue) - intValue2, (height - intValue3) - resizeAndPositionVideoMsgData.height().intValue());
        }
    }

    /* renamed from: i */
    public final void mo15739i() {
        VideoStreamPlayer videoStreamPlayer = this.f17040a;
        if (videoStreamPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoStreamPlayer).resize(0, 0, 0, 0);
        }
    }

    /* renamed from: j */
    public final void mo15771j() {
        this.f17040a.onAdPeriodEnded();
    }

    /* renamed from: k */
    public final void mo15772k(long j) {
        this.f17040a.seek(j);
    }

    /* renamed from: l */
    public final void mo15773l() {
        this.f17040a.addCallback(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo15774m(C3803c cVar) {
        if (cVar.isLinear()) {
            this.f17044e.mo15776a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo15775n() {
        this.f17044e.mo15777b();
    }

    public final void onContentComplete() {
        this.f17041b.mo15717o(new C3949dw(C3947du.adsLoader, C3948dv.contentComplete, "*"));
    }

    public final void onPause() {
        m17094o(C3948dv.pause, (Object) null);
    }

    public final void onResume() {
        m17094o(C3948dv.play, (Object) null);
    }

    public final void onUserTextReceived(String str) {
        m17094o(C3948dv.timedMetadata, C3981fa.create(str));
    }

    public final void onVolumeChanged(int i) {
        m17094o(C3948dv.volumeChange, C3802bo.builder().volumePercentage(i).build());
    }
}
