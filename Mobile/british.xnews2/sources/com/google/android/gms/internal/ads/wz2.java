package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class wz2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private xz2 f40968a;

    /* renamed from: b */
    protected final oz2 f40969b;

    public wz2(oz2 oz2, byte[] bArr) {
        this.f40969b = oz2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        xz2 xz2 = this.f40968a;
        if (xz2 != null) {
            xz2.mo35825a(this);
        }
    }

    /* renamed from: b */
    public final void mo35699b(xz2 xz2) {
        this.f40968a = xz2;
    }
}
