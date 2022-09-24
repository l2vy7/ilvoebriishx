package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s24 implements g34 {

    /* renamed from: b */
    private final n43<HandlerThread> f38858b;

    /* renamed from: c */
    private final n43<HandlerThread> f38859c;

    public s24(int i, boolean z) {
        q24 q24 = new q24(i);
        r24 r24 = new r24(i);
        this.f38858b = q24;
        this.f38859c = r24;
    }

    /* renamed from: a */
    static /* synthetic */ HandlerThread m37307a(int i) {
        return new HandlerThread(u24.m38116m(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* renamed from: b */
    static /* synthetic */ HandlerThread m37308b(int i) {
        return new HandlerThread(u24.m38116m(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.u24 mo34653c(com.google.android.gms.internal.ads.f34 r11) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.j34 r0 = r11.f31611a
            java.lang.String r0 = r0.f33740a
            r1 = 0
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0054 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0054 }
            if (r4 == 0) goto L_0x0016
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0054 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0054 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0054 }
            r2 = r3
        L_0x001c:
            com.google.android.gms.internal.ads.bz2.m30876a(r2)     // Catch:{ Exception -> 0x0054 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0054 }
            com.google.android.gms.internal.ads.u24 r9 = new com.google.android.gms.internal.ads.u24     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.n43<android.os.HandlerThread> r2 = r10.f38858b     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.q24 r2 = (com.google.android.gms.internal.ads.q24) r2     // Catch:{ Exception -> 0x0052 }
            int r2 = r2.f37844b     // Catch:{ Exception -> 0x0052 }
            android.os.HandlerThread r5 = m37307a(r2)     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.n43<android.os.HandlerThread> r2 = r10.f38859c     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.r24 r2 = (com.google.android.gms.internal.ads.r24) r2     // Catch:{ Exception -> 0x0052 }
            int r2 = r2.f38515b     // Catch:{ Exception -> 0x0052 }
            android.os.HandlerThread r6 = m37308b(r2)     // Catch:{ Exception -> 0x0052 }
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ Exception -> 0x004f }
            android.media.MediaFormat r3 = r11.f31612b     // Catch:{ Exception -> 0x004f }
            android.view.Surface r4 = r11.f31614d     // Catch:{ Exception -> 0x004f }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            com.google.android.gms.internal.ads.u24.m38115l(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004f }
            return r9
        L_0x004f:
            r11 = move-exception
            r1 = r9
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            goto L_0x0056
        L_0x0054:
            r11 = move-exception
            r0 = r1
        L_0x0056:
            if (r1 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x0061
            r0.release()
            goto L_0x0061
        L_0x005e:
            r1.zzl()
        L_0x0061:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s24.mo34653c(com.google.android.gms.internal.ads.f34):com.google.android.gms.internal.ads.u24");
    }
}
