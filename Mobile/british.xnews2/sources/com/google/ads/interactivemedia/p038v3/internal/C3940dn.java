package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.AdErrorEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dn */
/* compiled from: IMASDK */
public final class C3940dn {

    /* renamed from: a */
    private final List<AdErrorEvent.AdErrorListener> f16935a = new ArrayList(1);

    /* renamed from: a */
    public final void mo15681a(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f16935a.add(adErrorListener);
    }

    /* renamed from: b */
    public final void mo15682b(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f16935a.remove(adErrorListener);
    }

    /* renamed from: c */
    public final void mo15683c() {
        this.f16935a.clear();
    }

    /* renamed from: d */
    public final void mo15684d(AdErrorEvent adErrorEvent) {
        for (AdErrorEvent.AdErrorListener onAdError : this.f16935a) {
            onAdError.onAdError(adErrorEvent);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16935a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 38);
        sb.append("ErrorListenerSupport [errorListeners=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
