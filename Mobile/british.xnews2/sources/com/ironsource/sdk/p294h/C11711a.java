package com.ironsource.sdk.p294h;

import android.os.Handler;
import com.ironsource.sdk.p298k.C11736c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.sdk.h.a */
public final class C11711a extends Handler {

    /* renamed from: a */
    public final ConcurrentHashMap<String, C11736c> f52428a = new ConcurrentHashMap<>();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ all -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.obj     // Catch:{ all -> 0x0039 }
            com.ironsource.sdk.h.c r0 = (com.ironsource.sdk.p294h.C11715c) r0     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x0039 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.sdk.k.c> r2 = r5.f52428a     // Catch:{ all -> 0x0039 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0039 }
            com.ironsource.sdk.k.c r2 = (com.ironsource.sdk.p298k.C11736c) r2     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0013
            return
        L_0x0013:
            int r6 = r6.what     // Catch:{ all -> 0x0039 }
            r3 = 1016(0x3f8, float:1.424E-42)
            if (r6 == r3) goto L_0x0020
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r6 != r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            if (r3 == 0) goto L_0x0027
            r2.mo44759a(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0033
        L_0x0027:
            com.ironsource.sdk.g.e r3 = new com.ironsource.sdk.g.e     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = com.ironsource.environment.C4952a.C49531.m22715a((int) r6)     // Catch:{ all -> 0x0039 }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x0039 }
            r2.mo44760a(r0, r3)     // Catch:{ all -> 0x0039 }
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.sdk.k.c> r6 = r5.f52428a     // Catch:{ all -> 0x0039 }
            r6.remove(r1)     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r6 = move-exception
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p294h.C11711a.handleMessage(android.os.Message):void");
    }
}
