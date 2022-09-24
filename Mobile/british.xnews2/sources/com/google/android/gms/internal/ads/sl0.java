package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sl0 implements C7763hn {

    /* renamed from: b */
    private final Context f38990b;

    /* renamed from: c */
    private final Object f38991c;

    /* renamed from: d */
    private final String f38992d;

    /* renamed from: e */
    private boolean f38993e;

    public sl0(Context context, String str) {
        this.f38990b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f38992d = str;
        this.f38993e = false;
        this.f38991c = new Object();
    }

    /* renamed from: a */
    public final String mo34722a() {
        return this.f38992d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34723c(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.km0 r0 = com.google.android.gms.ads.internal.zzt.zzn()
            android.content.Context r1 = r3.f38990b
            boolean r0 = r0.mo18501z(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f38991c
            monitor-enter(r0)
            boolean r1 = r3.f38993e     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f38993e = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f38992d     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f38993e     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.km0 r4 = com.google.android.gms.ads.internal.zzt.zzn()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f38990b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f38992d     // Catch:{ all -> 0x003f }
            r4.mo18488m(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.km0 r4 = com.google.android.gms.ads.internal.zzt.zzn()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f38990b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f38992d     // Catch:{ all -> 0x003f }
            r4.mo18489n(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl0.mo34723c(boolean):void");
    }

    /* renamed from: n0 */
    public final void mo18767n0(C7689fn fnVar) {
        mo34723c(fnVar.f31824j);
    }
}
