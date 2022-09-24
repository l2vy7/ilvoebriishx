package com.google.ads.interactivemedia.p039v3.internal;

import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ox */
/* compiled from: IMASDK */
final class C4247ox extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ C4248oy f18234a;

    C4247ox(C4248oy oyVar) {
        this.f18234a = oyVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        aup.m14887r(audioTrack == this.f18234a.f18235a.f18279q);
        if (this.f18234a.f18235a.f18276n != null && this.f18234a.f18235a.f18254Q) {
            this.f18234a.f18235a.f18276n.mo16411a();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        aup.m14887r(audioTrack == this.f18234a.f18235a.f18279q);
        if (this.f18234a.f18235a.f18276n != null && this.f18234a.f18235a.f18254Q) {
            this.f18234a.f18235a.f18276n.mo16411a();
        }
    }
}
