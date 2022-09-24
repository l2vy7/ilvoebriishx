package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9758e6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ boolean f46235b;

    /* renamed from: c */
    final /* synthetic */ Uri f46236c;

    /* renamed from: d */
    final /* synthetic */ String f46237d;

    /* renamed from: e */
    final /* synthetic */ String f46238e;

    /* renamed from: f */
    final /* synthetic */ C9768f6 f46239f;

    C9758e6(C9768f6 f6Var, boolean z, Uri uri, String str, String str2) {
        this.f46239f = f6Var;
        this.f46235b = z;
        this.f46236c = uri;
        this.f46237d = str;
        this.f46238e = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[SYNTHETIC, Splitter:B:32:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f8 A[Catch:{ RuntimeException -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa A[Catch:{ RuntimeException -> 0x018d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.measurement.internal.f6 r2 = r1.f46239f
            boolean r0 = r1.f46235b
            android.net.Uri r3 = r1.f46236c
            java.lang.String r4 = r1.f46237d
            java.lang.String r5 = r1.f46238e
            com.google.android.gms.measurement.internal.g6 r6 = r2.f46270b
            r6.mo19272b()
            com.google.android.gms.measurement.internal.g6 r6 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.d9 r6 = r6.mo19372N()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.internal.measurement.C9181hc.m43000b()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.g6 r7 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.f r7 = r7.mo19392z()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.r2 r8 = com.google.android.gms.measurement.internal.C9903s2.f46723x0     // Catch:{ RuntimeException -> 0x018d }
            r9 = 0
            boolean r7 = r7.mo19337B(r9, r8)     // Catch:{ RuntimeException -> 0x018d }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "_cis"
            java.lang.String r13 = "utm_medium"
            java.lang.String r14 = "utm_source"
            java.lang.String r15 = "utm_campaign"
            java.lang.String r9 = "gclid"
            if (r10 == 0) goto L_0x003f
        L_0x003d:
            r1 = 0
            goto L_0x009c
        L_0x003f:
            boolean r10 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x018d }
            if (r10 != 0) goto L_0x007a
            boolean r10 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r10 != 0) goto L_0x007a
            boolean r10 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x018d }
            if (r10 != 0) goto L_0x007a
            boolean r10 = r5.contains(r13)     // Catch:{ RuntimeException -> 0x018d }
            if (r10 != 0) goto L_0x007a
            if (r7 == 0) goto L_0x006c
            java.lang.String r7 = "utm_id"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x018d }
            if (r7 != 0) goto L_0x006a
            java.lang.String r7 = "dclid"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x018d }
            if (r7 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r7 = 1
            goto L_0x007a
        L_0x006c:
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.d3 r6 = r6.mo19276j()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.b3 r6 = r6.mo19281p()     // Catch:{ RuntimeException -> 0x018d }
            r6.mo38856a(r11)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x003d
        L_0x007a:
            java.lang.String r10 = "https://google.com/search?"
            int r16 = r5.length()     // Catch:{ RuntimeException -> 0x018d }
            if (r16 == 0) goto L_0x0087
            java.lang.String r10 = r10.concat(r5)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x008d
        L_0x0087:
            java.lang.String r1 = new java.lang.String     // Catch:{ RuntimeException -> 0x018d }
            r1.<init>(r10)     // Catch:{ RuntimeException -> 0x018d }
            r10 = r1
        L_0x008d:
            android.net.Uri r1 = android.net.Uri.parse(r10)     // Catch:{ RuntimeException -> 0x018d }
            android.os.Bundle r1 = r6.mo19328t0(r1, r7)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 == 0) goto L_0x009c
            java.lang.String r6 = "referrer"
            r1.putString(r12, r6)     // Catch:{ RuntimeException -> 0x018d }
        L_0x009c:
            java.lang.String r6 = "_cmp"
            if (r0 == 0) goto L_0x00f2
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.d9 r0 = r0.mo19372N()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.internal.measurement.C9181hc.m43000b()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.g6 r7 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r7 = r7.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.f r7 = r7.mo19392z()     // Catch:{ RuntimeException -> 0x018d }
            r10 = 0
            boolean r7 = r7.mo19337B(r10, r8)     // Catch:{ RuntimeException -> 0x018d }
            android.os.Bundle r0 = r0.mo19328t0(r3, r7)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 == 0) goto L_0x00f2
            java.lang.String r3 = "intent"
            r0.putString(r12, r3)     // Catch:{ RuntimeException -> 0x018d }
            boolean r3 = r0.containsKey(r9)     // Catch:{ RuntimeException -> 0x018d }
            if (r3 != 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00e6
            boolean r3 = r1.containsKey(r9)     // Catch:{ RuntimeException -> 0x018d }
            if (r3 == 0) goto L_0x00e6
            r3 = 1
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x018d }
            r3 = 0
            java.lang.String r8 = r1.getString(r9)     // Catch:{ RuntimeException -> 0x018d }
            r7[r3] = r8     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r3 = "_cer"
            java.lang.String r8 = "gclid=%s"
            java.lang.String r7 = java.lang.String.format(r8, r7)     // Catch:{ RuntimeException -> 0x018d }
            r0.putString(r3, r7)     // Catch:{ RuntimeException -> 0x018d }
        L_0x00e6:
            com.google.android.gms.measurement.internal.g6 r3 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            r3.mo38956u(r4, r6, r0)     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.g6 r3 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.j9 r3 = r3.f46304n     // Catch:{ RuntimeException -> 0x018d }
            r3.mo39031a(r4, r0)     // Catch:{ RuntimeException -> 0x018d }
        L_0x00f2:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 == 0) goto L_0x00fa
            goto L_0x017c
        L_0x00fa:
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r3 = "Activity created with referrer"
            r0.mo38857b(r3, r5)     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.r2 r3 = com.google.android.gms.measurement.internal.C9903s2.f46677a0     // Catch:{ RuntimeException -> 0x018d }
            r7 = 0
            boolean r0 = r0.mo19337B(r7, r3)     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r3 = "_ldl"
            java.lang.String r7 = "auto"
            if (r0 == 0) goto L_0x0148
            if (r1 == 0) goto L_0x012f
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            r0.mo38956u(r4, r6, r1)     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.j9 r0 = r0.f46304n     // Catch:{ RuntimeException -> 0x018d }
            r0.mo39031a(r4, r1)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x0140
        L_0x012f:
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.mo38857b(r1, r5)     // Catch:{ RuntimeException -> 0x018d }
        L_0x0140:
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            r1 = 1
            r4 = 0
            r0.mo38933L(r7, r3, r4, r1)     // Catch:{ RuntimeException -> 0x018d }
            return
        L_0x0148:
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 == 0) goto L_0x017d
            boolean r0 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 != 0) goto L_0x0170
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 != 0) goto L_0x0170
            boolean r0 = r5.contains(r13)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 == 0) goto L_0x017d
        L_0x0170:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x018d }
            if (r0 != 0) goto L_0x017c
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            r1 = 1
            r0.mo38933L(r7, r3, r5, r1)     // Catch:{ RuntimeException -> 0x018d }
        L_0x017c:
            return
        L_0x017d:
            com.google.android.gms.measurement.internal.g6 r0 = r2.f46270b     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ RuntimeException -> 0x018d }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19281p()     // Catch:{ RuntimeException -> 0x018d }
            r0.mo38856a(r11)     // Catch:{ RuntimeException -> 0x018d }
            return
        L_0x018d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.g6 r1 = r2.f46270b
            com.google.android.gms.measurement.internal.h4 r1 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19282q()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.mo38857b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9758e6.run():void");
    }
}
