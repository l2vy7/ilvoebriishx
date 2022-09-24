package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sx2 {

    /* renamed from: a */
    private final Executor f39117a;

    /* renamed from: b */
    private final io0 f39118b;

    public sx2(Executor executor, io0 io0) {
        this.f39117a = executor;
        this.f39118b = io0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34828a(String str) {
        this.f39118b.zza(str);
    }

    /* renamed from: b */
    public final void mo34829b(String str) {
        this.f39117a.execute(new rx2(this, str));
    }

    /* renamed from: c */
    public final void mo34830c(List<String> list) {
        for (String b : list) {
            mo34829b(b);
        }
    }
}
