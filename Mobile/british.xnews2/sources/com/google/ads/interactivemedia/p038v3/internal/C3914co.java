package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.p038v3.api.AdError;
import com.google.ads.interactivemedia.p038v3.api.AdsManager;
import com.google.ads.interactivemedia.p038v3.api.AdsRequest;
import com.google.ads.interactivemedia.p038v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.StreamManager;
import com.google.ads.interactivemedia.p038v3.api.StreamRequest;
import com.google.ads.interactivemedia.p038v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.co */
/* compiled from: IMASDK */
final class C3914co implements C3954ea {

    /* renamed from: a */
    final /* synthetic */ C3920cu f16833a;

    C3914co(C3920cu cuVar) {
        this.f16833a = cuVar;
    }

    /* renamed from: a */
    public final void mo15632a(String str, List<Float> list, SortedSet<Float> sortedSet, boolean z) {
        AdsRequest adsRequest = (AdsRequest) this.f16833a.f16852g.get(str);
        if (adsRequest == null) {
            C3940dn n = this.f16833a.f16850e;
            AdError.AdErrorType adErrorType = AdError.AdErrorType.LOAD;
            AdError.AdErrorCode adErrorCode = AdError.AdErrorCode.INTERNAL_ERROR;
            String valueOf = String.valueOf(str);
            n.mo15684d(new C3909cj(new AdError(adErrorType, adErrorCode, valueOf.length() != 0 ? "Request not found for session id: ".concat(valueOf) : new String("Request not found for session id: ")), new Object()));
            return;
        }
        ContentProgressProvider contentProgressProvider = adsRequest.getContentProgressProvider();
        AdError adError = null;
        C3976ew ewVar = contentProgressProvider != null ? new C3976ew(contentProgressProvider) : null;
        this.f16833a.f16854i.mo15744c(((C3927da) adsRequest).mo15652g());
        if (sortedSet != null && !sortedSet.isEmpty() && ewVar == null) {
            adError = new AdError(AdError.AdErrorType.PLAY, AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
        }
        if (adError != null) {
            this.f16833a.f16850e.mo15684d(new C3909cj(adError, adsRequest.getUserRequestContext()));
            return;
        }
        C3920cu cuVar = this.f16833a;
        C3920cu.m16941p(cuVar, new C3922cw((AdsManager) new C3921cv(str, cuVar.f16848c, this.f16833a.f16858m, ewVar, list, sortedSet, this.f16833a.f16854i, new C3940dn(), this.f16833a.f16847b, z), adsRequest.getUserRequestContext()));
    }

    /* renamed from: b */
    public final void mo15633b(String str, String str2, boolean z) {
        String str3 = str;
        StreamRequest streamRequest = (StreamRequest) this.f16833a.f16853h.get(str3);
        this.f16833a.f16854i.mo15744c(streamRequest.getContentUrl());
        this.f16833a.f16854i.mo15750i();
        C3920cu cuVar = this.f16833a;
        C3958ee k = cuVar.f16848c;
        String manifestSuffix = streamRequest.getManifestSuffix();
        C3973et o = this.f16833a.f16854i;
        C3940dn dnVar = new C3940dn();
        Context c = this.f16833a.f16847b;
        StreamDisplayContainer l = this.f16833a.f16857l;
        String str4 = str;
        C3958ee eeVar = k;
        C3920cu.m16941p(cuVar, new C3922cw((StreamManager) new C3978ey(str4, eeVar, l, new C3982fb(str4, eeVar, dnVar, l, manifestSuffix), new C3907ch(str3, k, l.getAdContainer()), o, dnVar, c, str2, z), streamRequest.getUserRequestContext()));
    }

    /* renamed from: c */
    public final void mo15634c(String str, AdError.AdErrorType adErrorType, int i, String str2) {
        Object obj;
        if (this.f16833a.f16852g.get(str) != null) {
            obj = ((AdsRequest) this.f16833a.f16852g.get(str)).getUserRequestContext();
        } else {
            obj = this.f16833a.f16853h.get(str) != null ? ((StreamRequest) this.f16833a.f16853h.get(str)).getUserRequestContext() : new Object();
        }
        this.f16833a.f16850e.mo15684d(new C3909cj(new AdError(adErrorType, i, str2), obj));
    }

    /* renamed from: d */
    public final void mo15635d(String str, AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode) {
        Object obj;
        if (this.f16833a.f16852g.get(str) != null) {
            obj = ((AdsRequest) this.f16833a.f16852g.get(str)).getUserRequestContext();
        } else {
            obj = this.f16833a.f16853h.get(str) != null ? ((StreamRequest) this.f16833a.f16853h.get(str)).getUserRequestContext() : new Object();
        }
        this.f16833a.f16850e.mo15684d(new C3909cj(new AdError(adErrorType, adErrorCode, "adsLoaded message did not contain cue points."), obj));
    }
}
