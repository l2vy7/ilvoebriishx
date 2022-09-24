package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONObject;
import p243q4.C10942l;

/* renamed from: com.google.android.gms.cast.framework.media.m */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7129m extends C7107b0 {

    /* renamed from: u */
    final /* synthetic */ JSONObject f28722u;

    /* renamed from: v */
    final /* synthetic */ C4580e f28723v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7129m(C4580e eVar, JSONObject jSONObject) {
        super(eVar, false);
        this.f28723v = eVar;
        this.f28722u = jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo29540q() throws C10942l {
        this.f28723v.f19927c.mo43241k(mo29541r(), 0, -1, (MediaQueueItem[]) null, -1, false, (Integer) null, this.f28722u);
    }
}
