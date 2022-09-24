package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w13 {

    /* renamed from: a */
    private final C8118rd f40662a;

    /* renamed from: b */
    private final File f40663b;

    /* renamed from: c */
    private final File f40664c;

    /* renamed from: d */
    private final File f40665d;

    /* renamed from: e */
    private byte[] f40666e;

    public w13(C8118rd rdVar, File file, File file2, File file3) {
        this.f40662a = rdVar;
        this.f40663b = file;
        this.f40664c = file3;
        this.f40665d = file2;
    }

    /* renamed from: a */
    public final C8118rd mo35538a() {
        return this.f40662a;
    }

    /* renamed from: b */
    public final File mo35539b() {
        return this.f40664c;
    }

    /* renamed from: c */
    public final File mo35540c() {
        return this.f40663b;
    }

    /* renamed from: d */
    public final boolean mo35541d(long j) {
        return this.f40662a.mo34526F() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo35542e() {
        /*
            r3 = this;
            byte[] r0 = r3.f40666e
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.io.File r0 = r3.f40665d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            com.google.android.gms.internal.ads.eo3 r0 = com.google.android.gms.internal.ads.eo3.m31876O(r2)     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            byte[] r0 = r0.mo31616f()     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            p006a5.C0114k.m409a(r2)
            goto L_0x0025
        L_0x0018:
            r0 = move-exception
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            p006a5.C0114k.m409a(r1)
            throw r0
        L_0x0020:
            r2 = r1
        L_0x0021:
            p006a5.C0114k.m409a(r2)
            r0 = r1
        L_0x0025:
            r3.f40666e = r0
        L_0x0027:
            byte[] r0 = r3.f40666e
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w13.mo35542e():byte[]");
    }
}
