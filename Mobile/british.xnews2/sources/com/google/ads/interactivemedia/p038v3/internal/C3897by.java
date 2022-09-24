package com.google.ads.interactivemedia.p038v3.internal;

import android.os.AsyncTask;

/* renamed from: com.google.ads.interactivemedia.v3.internal.by */
/* compiled from: IMASDK */
public abstract class C3897by extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C3898bz f16799a;

    /* renamed from: d */
    protected final C3890br f16800d;

    public C3897by(C3890br brVar) {
        this.f16800d = brVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C3898bz bzVar = this.f16799a;
        if (bzVar != null) {
            bzVar.mo15606b();
        }
    }

    /* renamed from: b */
    public final void mo15603b(C3898bz bzVar) {
        this.f16799a = bzVar;
    }
}
