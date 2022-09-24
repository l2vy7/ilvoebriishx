package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.C7341k;

/* renamed from: com.google.android.gms.common.api.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7343m<R extends C7341k> implements C7342l<R> {
    /* renamed from: a */
    public final void mo29606a(R r) {
        Status p0 = r.mo29527p0();
        if (p0.mo29735G0()) {
            mo29963c(r);
            return;
        }
        mo29962b(p0);
        if (r instanceof C7213i) {
            try {
                ((C7213i) r).release();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo29962b(Status status);

    /* renamed from: c */
    public abstract void mo29963c(R r);
}
