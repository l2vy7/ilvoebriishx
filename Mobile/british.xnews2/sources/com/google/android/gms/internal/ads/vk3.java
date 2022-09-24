package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vk3 extends f00 {

    /* renamed from: l */
    public static final wx3<vk3> f40450l = uj3.f39876a;

    /* renamed from: e */
    public final int f40451e;

    /* renamed from: f */
    public final String f40452f;

    /* renamed from: g */
    public final int f40453g;

    /* renamed from: h */
    public final C8281w f40454h;

    /* renamed from: i */
    public final int f40455i;

    /* renamed from: j */
    public final C7880ku f40456j;

    /* renamed from: k */
    final boolean f40457k;

    private vk3(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C8281w) null, 4, false);
    }

    /* renamed from: b */
    public static vk3 m38831b(Throwable th, String str, int i, C8281w wVar, int i2, boolean z, int i3) {
        return new vk3(1, th, (String) null, i3, str, i, wVar, wVar == null ? 4 : i2, z);
    }

    /* renamed from: c */
    public static vk3 m38832c(IOException iOException, int i) {
        return new vk3(0, iOException, i);
    }

    /* renamed from: d */
    public static vk3 m38833d(RuntimeException runtimeException, int i) {
        return new vk3(2, runtimeException, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final vk3 mo35436a(C7880ku kuVar) {
        String message = getMessage();
        int i = d13.f20195a;
        return new vk3(message, getCause(), this.f31561b, this.f40451e, this.f40452f, this.f40453g, this.f40454h, this.f40455i, kuVar, this.f31562c, this.f40457k);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private vk3(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.C8281w r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x0052
            r0 = 1
            if (r4 == r0) goto L_0x000d
            java.lang.String r0 = "Unexpected runtime error"
            r6 = r18
            r7 = r19
            goto L_0x0058
        L_0x000d:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.xy3.m39693e(r21)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            int r3 = r0.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r3 = r1.length()
            int r2 = r2 + r3
            r5.<init>(r2)
            r6 = r18
            r5.append(r6)
            java.lang.String r2 = " error, index="
            r5.append(r2)
            r7 = r19
            r5.append(r7)
            java.lang.String r2 = ", format="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ", format_supported="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            goto L_0x0058
        L_0x0052:
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L_0x0058:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L_0x0065:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vk3.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.w, int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private vk3(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.google.android.gms.internal.ads.C8281w r15, int r16, com.google.android.gms.internal.ads.C7880ku r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0017
            r2 = r12
            if (r2 != r1) goto L_0x0015
            r2 = 1
            goto L_0x0018
        L_0x0015:
            r3 = 0
            goto L_0x0019
        L_0x0017:
            r2 = r12
        L_0x0018:
            r3 = 1
        L_0x0019:
            com.google.android.gms.internal.ads.nu1.m20745d(r3)
            if (r10 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            com.google.android.gms.internal.ads.nu1.m20745d(r0)
            r6.f40451e = r2
            r0 = r13
            r6.f40452f = r0
            r0 = r14
            r6.f40453g = r0
            r0 = r15
            r6.f40454h = r0
            r0 = r16
            r6.f40455i = r0
            r0 = r17
            r6.f40456j = r0
            r6.f40457k = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vk3.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.w, int, com.google.android.gms.internal.ads.ku, long, boolean):void");
    }
}
