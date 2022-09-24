package com.google.ads.interactivemedia.p038v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cb */
/* compiled from: IMASDK */
public final class C3901cb extends C3896bx {
    public C3901cb(C3890br brVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(brVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15602a(String str) {
        C3855aw a = C3855aw.m14982a();
        if (a != null) {
            for (C3846ap next : a.mo14651e()) {
                if (this.f16796a.contains(next.mo14172i())) {
                    next.mo14171h().mo15154g(str, this.f16798c);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f16797b.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
