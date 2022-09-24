package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import p006a5.C6488j;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x13 {

    /* renamed from: a */
    private final File f40992a;

    /* renamed from: b */
    final File f40993b;

    /* renamed from: c */
    private final SharedPreferences f40994c;

    /* renamed from: d */
    private final int f40995d;

    public x13(Context context, int i) {
        this.f40994c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        y13.m39724a(dir, false);
        this.f40992a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        y13.m39724a(dir2, true);
        this.f40993b = dir2;
        this.f40995d = i;
    }

    /* renamed from: a */
    static String m39321a(C8118rd rdVar) {
        return C6488j.m28271a(rdVar.mo33364c().mo31616f());
    }

    /* renamed from: e */
    private final File m39322e() {
        File file = new File(this.f40992a, Integer.toString(this.f40995d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: f */
    private final String m39323f() {
        int i = this.f40995d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* renamed from: g */
    private final String m39324g() {
        int i = this.f40995d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35704b(com.google.android.gms.internal.ads.C8011od r8, com.google.android.gms.internal.ads.c23 r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.rd r0 = r8.mo33868H()
            java.lang.String r0 = r0.mo34529O()
            com.google.android.gms.internal.ads.eo3 r1 = r8.mo33870J()
            byte[] r1 = r1.mo31616f()
            com.google.android.gms.internal.ads.eo3 r2 = r8.mo33869I()
            byte[] r2 = r2.mo31616f()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x017d
        L_0x0026:
            java.io.File r3 = r7.f40993b
            com.google.android.gms.internal.ads.y13.m39727d(r3)
            java.io.File r3 = r7.f40993b
            r3.mkdirs()
            java.io.File r3 = r7.f40993b
            java.io.File r3 = com.google.android.gms.internal.ads.y13.m39726c(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.f40993b
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.y13.m39725b(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.y13.m39728e(r3, r1)
            if (r1 == 0) goto L_0x017d
        L_0x004c:
            java.io.File r1 = r7.f40993b
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.y13.m39725b(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.y13.m39728e(r0, r2)
            if (r0 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.rd r0 = r8.mo33868H()
            java.lang.String r0 = r0.mo34529O()
            java.io.File r1 = r7.f40993b
            java.io.File r0 = com.google.android.gms.internal.ads.y13.m39725b(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.mo30844a(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.rd r9 = r8.mo33868H()
            java.lang.String r9 = r9.mo34529O()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = 0
            goto L_0x0137
        L_0x008a:
            java.io.File r0 = r7.f40993b
            java.io.File r0 = com.google.android.gms.internal.ads.y13.m39725b(r9, r5, r0)
            java.io.File r2 = r7.f40993b
            java.io.File r2 = com.google.android.gms.internal.ads.y13.m39725b(r9, r3, r2)
            java.io.File r6 = r7.m39322e()
            java.io.File r5 = com.google.android.gms.internal.ads.y13.m39725b(r9, r5, r6)
            java.io.File r6 = r7.m39322e()
            java.io.File r9 = com.google.android.gms.internal.ads.y13.m39725b(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.qd r9 = com.google.android.gms.internal.ads.C8118rd.m37034I()
            com.google.android.gms.internal.ads.rd r0 = r8.mo33868H()
            java.lang.String r0 = r0.mo34529O()
            r9.mo34324I(r0)
            com.google.android.gms.internal.ads.rd r0 = r8.mo33868H()
            java.lang.String r0 = r0.mo34528N()
            r9.mo34325y(r0)
            com.google.android.gms.internal.ads.rd r0 = r8.mo33868H()
            long r2 = r0.mo34525E()
            r9.mo34321B(r2)
            com.google.android.gms.internal.ads.rd r0 = r8.mo33868H()
            long r2 = r0.mo34527H()
            r9.mo34323H(r2)
            com.google.android.gms.internal.ads.rd r8 = r8.mo33868H()
            long r2 = r8.mo34526F()
            r9.mo34322C(r2)
            com.google.android.gms.internal.ads.kp3 r8 = r9.mo32424p()
            com.google.android.gms.internal.ads.rd r8 = (com.google.android.gms.internal.ads.C8118rd) r8
            com.google.android.gms.internal.ads.rd r9 = r7.mo35705c(r1)
            android.content.SharedPreferences r0 = r7.f40994c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0125
            java.lang.String r2 = r8.mo34529O()
            java.lang.String r3 = r9.mo34529O()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r7.m39323f()
            java.lang.String r9 = m39321a(r9)
            r0.putString(r2, r9)
        L_0x0125:
            java.lang.String r9 = r7.m39324g()
            java.lang.String r8 = m39321a(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = 1
        L_0x0137:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.rd r0 = r7.mo35705c(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = r0.mo34529O()
            r9.add(r0)
        L_0x0149:
            r0 = 2
            com.google.android.gms.internal.ads.rd r0 = r7.mo35705c(r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.mo34529O()
            r9.add(r0)
        L_0x0157:
            java.io.File r0 = r7.m39322e()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0160:
            if (r4 >= r1) goto L_0x017c
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0179
            java.io.File r3 = r7.m39322e()
            java.io.File r2 = com.google.android.gms.internal.ads.y13.m39726c(r2, r3)
            com.google.android.gms.internal.ads.y13.m39727d(r2)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x017c:
            return r8
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x13.mo35704b(com.google.android.gms.internal.ads.od, com.google.android.gms.internal.ads.c23):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C8118rd mo35705c(int i) {
        String str;
        if (i == 1) {
            str = this.f40994c.getString(m39324g(), (String) null);
        } else {
            str = this.f40994c.getString(m39323f(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C8118rd L = C8118rd.m37037L(eo3.m31873L(C6488j.m28273c(str)));
            String O = L.mo34529O();
            File b = y13.m39725b(O, "pcam.jar", m39322e());
            if (!b.exists()) {
                b = y13.m39725b(O, "pcam", m39322e());
            }
            File b2 = y13.m39725b(O, "pcbc", m39322e());
            if (!b.exists() || !b2.exists()) {
                return null;
            }
            return L;
        } catch (wp3 unused) {
        }
    }

    /* renamed from: d */
    public final w13 mo35706d(int i) {
        C8118rd c = mo35705c(1);
        if (c == null) {
            return null;
        }
        String O = c.mo34529O();
        File b = y13.m39725b(O, "pcam.jar", m39322e());
        if (!b.exists()) {
            b = y13.m39725b(O, "pcam", m39322e());
        }
        return new w13(c, b, y13.m39725b(O, "pcbc", m39322e()), y13.m39725b(O, "pcopt", m39322e()));
    }
}
