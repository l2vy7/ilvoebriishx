package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.google.android.gms.cast.framework.media.v */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C7147v implements OnFailureListener {

    /* renamed from: a */
    private final C7149w f28743a;

    /* renamed from: b */
    private final long f28744b;

    C7147v(C7149w wVar, long j) {
        this.f28743a = wVar;
        this.f28744b = j;
    }

    public final void onFailure(Exception exc) {
        this.f28743a.f28754c.f19927c.mo43246p(this.f28744b, exc instanceof C7203b ? ((C7203b) exc).mo29766b() : 13);
    }
}
