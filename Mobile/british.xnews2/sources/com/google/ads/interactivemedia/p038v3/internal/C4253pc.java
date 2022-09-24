package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pc */
/* compiled from: IMASDK */
final class C4253pc implements C4229of {

    /* renamed from: a */
    final /* synthetic */ C4254pd f18298a;

    /* synthetic */ C4253pc(C4254pd pdVar) {
        this.f18298a = pdVar;
    }

    /* renamed from: a */
    public final void mo16411a() {
        if (this.f18298a.f18309l != null) {
            this.f18298a.f18309l.mo16024b();
        }
    }

    /* renamed from: b */
    public final void mo16412b(Exception exc) {
        ali.m14023b("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f18298a.f18300c.mo16399i(exc);
    }
}
