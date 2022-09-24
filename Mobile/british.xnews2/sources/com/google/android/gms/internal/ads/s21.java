package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class s21 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ xt0 f38855b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f38856c;

    public /* synthetic */ s21(xt0 xt0, JSONObject jSONObject) {
        this.f38855b = xt0;
        this.f38856c = jSONObject;
    }

    public final void run() {
        this.f38855b.mo18317E0("AFMA_updateActiveView", this.f38856c);
    }
}
