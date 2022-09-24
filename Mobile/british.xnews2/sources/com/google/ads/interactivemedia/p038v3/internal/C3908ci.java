package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p038v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.player.VideoAdPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ci */
/* compiled from: IMASDK */
public final class C3908ci extends C3932df implements AdDisplayContainer {

    /* renamed from: a */
    private VideoAdPlayer f16818a;

    public C3908ci(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        super(viewGroup);
        this.f16818a = videoAdPlayer;
    }

    public final VideoAdPlayer getPlayer() {
        return this.f16818a;
    }

    public final void setPlayer(VideoAdPlayer videoAdPlayer) {
        ars.m14627g(videoAdPlayer);
        this.f16818a = videoAdPlayer;
    }

    public C3908ci(Context context, VideoAdPlayer videoAdPlayer) {
        this((ViewGroup) new C3928db(context), videoAdPlayer);
    }
}
