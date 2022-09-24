package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vv0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzcjf f40560a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f40561b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WeakReference<Context> f40562c;

    /* renamed from: c */
    public final vv0 mo35501c(Context context) {
        this.f40562c = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f40561b = context;
        return this;
    }

    /* renamed from: d */
    public final vv0 mo35502d(zzcjf zzcjf) {
        this.f40560a = zzcjf;
        return this;
    }
}
