package com.google.ads.interactivemedia.p039v3.internal;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cc */
/* compiled from: IMASDK */
public final class C3902cc extends C3896bx {
    public C3902cc(C3890br brVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(brVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15602a(String str) {
        C3855aw a;
        if (!TextUtils.isEmpty(str) && (a = C3855aw.m14982a()) != null) {
            for (C3846ap next : a.mo14651e()) {
                if (this.f16796a.contains(next.mo14172i())) {
                    next.mo14171h().mo15153f(str, this.f16798c);
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C3887bo.m16859j(this.f16797b, this.f16800d.mo15593d())) {
            return null;
        }
        this.f16800d.mo15594e(this.f16797b);
        return this.f16797b.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
