package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gj2 implements zi2<ej2> {

    /* renamed from: a */
    private final nb3 f32347a;

    /* renamed from: b */
    private final Context f32348b;

    public gj2(nb3 nb3, Context context) {
        this.f32347a = nb3;
        this.f32348b = context;
    }

    /* renamed from: b */
    private static ResolveInfo m32549b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6 A[Catch:{ Exception -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.ej2 mo32149a() throws java.lang.Exception {
        /*
            r22 = this;
            r0 = r22
            android.content.Context r1 = r0.f32348b
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r3 = m32549b(r1, r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0018
            r7 = 1
            goto L_0x0019
        L_0x0018:
            r7 = 0
        L_0x0019:
            java.lang.String r3 = "http://www.google.com"
            android.content.pm.ResolveInfo r3 = m32549b(r1, r3)
            if (r3 == 0) goto L_0x0023
            r8 = 1
            goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            java.lang.String r9 = r2.getCountry()
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.C8241uv.m38463b()
            boolean r10 = com.google.android.gms.internal.ads.vn0.m38854m()
            android.content.Context r3 = r0.f32348b
            boolean r11 = p006a5.C6487i.m28264b(r3)
            android.content.Context r3 = r0.f32348b
            boolean r12 = p006a5.C6487i.m28265c(r3)
            java.lang.String r13 = r2.getLanguage()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0066
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r3 = 0
        L_0x0052:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0066
            java.util.Locale r4 = r2.get(r3)
            java.lang.String r4 = r4.getLanguage()
            r14.add(r4)
            int r3 = r3 + 1
            goto L_0x0052
        L_0x0066:
            android.content.Context r2 = r0.f32348b
            java.lang.String r3 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r3 = m32549b(r1, r3)
            java.lang.String r4 = "."
            if (r3 != 0) goto L_0x0074
        L_0x0072:
            r15 = 0
            goto L_0x00a6
        L_0x0074:
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            c5.b r2 = p192c5.C6520c.m28321a(r2)     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r15 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0072 }
            android.content.pm.PackageInfo r2 = r2.mo24355f(r15, r5)     // Catch:{ NameNotFoundException -> 0x0072 }
            if (r2 == 0) goto L_0x0072
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r15 = java.lang.String.valueOf(r3)     // Catch:{ NameNotFoundException -> 0x0072 }
            int r15 = r15.length()     // Catch:{ NameNotFoundException -> 0x0072 }
            int r15 = r15 + 12
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0072 }
            r6.<init>(r15)     // Catch:{ NameNotFoundException -> 0x0072 }
            r6.append(r2)     // Catch:{ NameNotFoundException -> 0x0072 }
            r6.append(r4)     // Catch:{ NameNotFoundException -> 0x0072 }
            r6.append(r3)     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r2 = r6.toString()     // Catch:{ NameNotFoundException -> 0x0072 }
            r15 = r2
        L_0x00a6:
            android.content.Context r2 = r0.f32348b
            c5.b r2 = p192c5.C6520c.m28321a(r2)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r3 = "com.android.vending"
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r2 = r2.mo24355f(r3, r6)     // Catch:{ Exception -> 0x00d9 }
            if (r2 == 0) goto L_0x00d9
            int r3 = r2.versionCode     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00d9 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x00d9 }
            int r6 = r6 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d9 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00d9 }
            r5.append(r3)     // Catch:{ Exception -> 0x00d9 }
            r5.append(r4)     // Catch:{ Exception -> 0x00d9 }
            r5.append(r2)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00d9 }
            r16 = r2
            goto L_0x00db
        L_0x00d9:
            r16 = 0
        L_0x00db:
            java.lang.String r2 = android.os.Build.FINGERPRINT
            android.content.Context r3 = r0.f32348b
            if (r1 != 0) goto L_0x00e4
        L_0x00e1:
            r18 = 0
            goto L_0x012f
        L_0x00e4:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "http://www.example.com"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r6 = "android.intent.action.VIEW"
            r4.<init>(r6, r5)
            r5 = 0
            android.content.pm.ResolveInfo r6 = r1.resolveActivity(r4, r5)
            r5 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r1.queryIntentActivities(r4, r5)
            if (r1 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            r4 = 0
        L_0x0101:
            int r5 = r1.size()
            if (r4 >= r5) goto L_0x00e1
            java.lang.Object r5 = r1.get(r4)
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r0 = r6.activityInfo
            java.lang.String r0 = r0.name
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.name
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x012a
            android.content.pm.ActivityInfo r0 = r6.activityInfo
            java.lang.String r0 = r0.packageName
            java.lang.String r1 = com.google.android.gms.internal.ads.jv3.m33764a(r3)
            boolean r5 = r0.equals(r1)
            r18 = r5
            goto L_0x012f
        L_0x012a:
            int r4 = r4 + 1
            r0 = r22
            goto L_0x0101
        L_0x012f:
            com.google.android.gms.ads.internal.util.zzae r0 = com.google.android.gms.ads.internal.zzt.zzq()
            long r20 = r0.zzh()
            com.google.android.gms.internal.ads.ej2 r0 = new com.google.android.gms.internal.ads.ej2
            java.lang.String r19 = android.os.Build.MODEL
            r6 = r0
            r17 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj2.mo32149a():com.google.android.gms.internal.ads.ej2");
    }

    public final mb3<ej2> zzb() {
        return this.f32347a.mo33675b(new fj2(this));
    }
}
