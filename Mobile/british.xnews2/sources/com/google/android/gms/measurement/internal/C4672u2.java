package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9366tc;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.u2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4672u2 extends C9923u3 {

    /* renamed from: c */
    private String f21348c;

    /* renamed from: d */
    private String f21349d;

    /* renamed from: e */
    private int f21350e;

    /* renamed from: f */
    private String f21351f;

    /* renamed from: g */
    private String f21352g;

    /* renamed from: h */
    private long f21353h;

    /* renamed from: i */
    private final long f21354i;

    /* renamed from: j */
    private List f21355j;

    /* renamed from: k */
    private int f21356k;

    /* renamed from: l */
    private String f21357l;

    /* renamed from: m */
    private String f21358m;

    C4672u2(C4670h4 h4Var, long j) {
        super(h4Var);
        this.f21354i = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018b A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0194 A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024c  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19402k() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.h4 r0 = r11.f21269a
            android.content.Context r0 = r0.mo19277r()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.h4 r1 = r11.f21269a
            android.content.Context r1 = r1.mo19277r()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19282q()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo38857b(r9, r8)
        L_0x0032:
            r8 = r2
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19282q()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo38857b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r4
        L_0x005b:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo19277r()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            com.google.android.gms.measurement.internal.h4 r8 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo19276j()
            com.google.android.gms.measurement.internal.b3 r8 = r8.mo19282q()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo38858c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r11.f21348c = r0
            r11.f21351f = r6
            r11.f21349d = r2
            r11.f21350e = r3
            r11.f21352g = r8
            r2 = 0
            r11.f21353h = r2
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a
            java.lang.String r2 = r2.mo19373O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a
            java.lang.String r2 = r2.mo19374P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            com.google.android.gms.measurement.internal.h4 r6 = r11.f21269a
            int r6 = r6.mo19390x()
            switch(r6) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0141;
                case 2: goto L_0x0131;
                case 3: goto L_0x0121;
                case 4: goto L_0x0111;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19285u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x00e1:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19285u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x00f1:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19288x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x0101:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19286v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x0111:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19285u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x0121:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19285u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x0131:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19286v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x0141:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19285u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo38856a(r8)
            goto L_0x0160
        L_0x0151:
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo19276j()
            com.google.android.gms.measurement.internal.b3 r7 = r7.mo19286v()
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo38856a(r8)
        L_0x0160:
            r11.f21357l = r4
            r11.f21358m = r4
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a
            r7.mo19275g()
            if (r2 == 0) goto L_0x0173
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a
            java.lang.String r2 = r2.mo19373O()
            r11.f21358m = r2
        L_0x0173:
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo19277r()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.h4 r7 = r11.f21269a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r7 = r7.mo19376R()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = p255u5.C11047v.m49451b(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r3 == r7) goto L_0x018c
            r4 = r2
        L_0x018c:
            r11.f21357l = r4     // Catch:{ IllegalStateException -> 0x01db }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r2 != 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo19277r()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.h4 r3 = r11.f21269a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = r3.mo19376R()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.common.internal.C4604n.m20098k(r2)     // Catch:{ IllegalStateException -> 0x01db }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01db }
            if (r7 != 0) goto L_0x01ae
            goto L_0x01b2
        L_0x01ae:
            java.lang.String r3 = p255u5.C11037l.m49435a(r2)     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01b2:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = p255u5.C11037l.m49436b(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x01db }
            r11.f21358m = r2     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01ba:
            if (r6 != 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.h4 r2 = r11.f21269a     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19286v()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f21348c     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r6 = r11.f21357l     // Catch:{ IllegalStateException -> 0x01db }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01db }
            if (r6 == 0) goto L_0x01d5
            java.lang.String r6 = r11.f21358m     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r6 = r11.f21357l     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01d7:
            r2.mo38858c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01ef
        L_0x01db:
            r2 = move-exception
            com.google.android.gms.measurement.internal.h4 r3 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo38858c(r4, r0, r2)
        L_0x01ef:
            r0 = 0
            r11.f21355j = r0
            com.google.android.gms.measurement.internal.h4 r0 = r11.f21269a
            r0.mo19275g()
            com.google.android.gms.measurement.internal.h4 r0 = r11.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo19358y(r2)
            if (r0 != 0) goto L_0x0206
            goto L_0x023b
        L_0x0206:
            int r2 = r0.size()
            if (r2 != 0) goto L_0x021c
            com.google.android.gms.measurement.internal.h4 r0 = r11.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19288x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo38856a(r2)
            goto L_0x023d
        L_0x021c:
            java.util.Iterator r2 = r0.iterator()
        L_0x0220:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.h4 r4 = r11.f21269a
            com.google.android.gms.measurement.internal.d9 r4 = r4.mo19372N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo19305P(r6, r3)
            if (r3 != 0) goto L_0x0220
            goto L_0x023d
        L_0x023b:
            r11.f21355j = r0
        L_0x023d:
            if (r1 == 0) goto L_0x024c
            com.google.android.gms.measurement.internal.h4 r0 = r11.f21269a
            android.content.Context r0 = r0.mo19277r()
            boolean r0 = p192c5.C6518a.m28312a(r0)
            r11.f21356k = r0
            return
        L_0x024c:
            r11.f21356k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4672u2.mo19402k():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo19403m() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo19404n() {
        mo39230d();
        return this.f21356k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo19405o() {
        mo39230d();
        return this.f21350e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d4  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzp mo19406p(java.lang.String r33) {
        /*
            r32 = this;
            r1 = r32
            r32.mo19272b()
            com.google.android.gms.measurement.internal.zzp r31 = new com.google.android.gms.measurement.internal.zzp
            java.lang.String r3 = r32.mo19408s()
            java.lang.String r4 = r32.mo19409t()
            r32.mo39230d()
            java.lang.String r5 = r1.f21349d
            r32.mo39230d()
            int r0 = r1.f21350e
            long r6 = (long) r0
            r32.mo39230d()
            java.lang.String r0 = r1.f21351f
            com.google.android.gms.common.internal.C4604n.m20098k(r0)
            java.lang.String r8 = r1.f21351f
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            r0.mo19350p()
            r32.mo39230d()
            r32.mo19272b()
            long r9 = r1.f21353h
            r11 = 0
            r2 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a
            com.google.android.gms.measurement.internal.d9 r9 = r0.mo19372N()
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a
            android.content.Context r0 = r0.mo19277r()
            com.google.android.gms.measurement.internal.h4 r10 = r1.f21269a
            android.content.Context r10 = r10.mo19277r()
            java.lang.String r10 = r10.getPackageName()
            r9.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20098k(r0)
            com.google.android.gms.common.internal.C4604n.m20094g(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.C4668d9.m21500s()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo38856a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo19310U(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            c5.b r0 = p192c5.C6520c.m28321a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.h4 r10 = r9.f21269a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo19277r()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo24355f(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.C4668d9.m21499q0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo38856a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r9 = r9.f21269a
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19282q()
            java.lang.String r10 = "Package name not found"
            r9.mo38857b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f21353h = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a
            boolean r0 = r0.mo19385n()
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r9 = r9.mo19365F()
            boolean r9 = r9.f21340p
            r10 = 1
            r15 = r9 ^ 1
            r32.mo19272b()
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            boolean r9 = r9.mo19385n()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x017a
        L_0x00f2:
            com.google.android.gms.internal.measurement.C9153fe.m42904b()
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            com.google.android.gms.measurement.internal.f r9 = r9.mo19392z()
            com.google.android.gms.measurement.internal.r2 r12 = com.google.android.gms.measurement.internal.C9903s2.f46681c0
            boolean r9 = r9.mo19337B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19286v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo38856a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a     // Catch:{ ClassNotFoundException -> 0x0178 }
            android.content.Context r9 = r9.mo19277r()     // Catch:{ ClassNotFoundException -> 0x0178 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0178 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0178 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0169 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0169 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0169 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0169 }
            com.google.android.gms.measurement.internal.h4 r10 = r1.f21269a     // Catch:{ Exception -> 0x0169 }
            android.content.Context r10 = r10.mo19277r()     // Catch:{ Exception -> 0x0169 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0169 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0169 }
            if (r11 != 0) goto L_0x0146
            r20 = r10
            goto L_0x017a
        L_0x0146:
            java.lang.String r12 = "getFirebaseInstanceId"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0159 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r12, r10)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0159 }
            r20 = r9
            goto L_0x017a
        L_0x0159:
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19288x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo38856a(r10)
            goto L_0x0178
        L_0x0169:
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19289y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo38856a(r10)
        L_0x0178:
            r20 = 0
        L_0x017a:
            com.google.android.gms.measurement.internal.h4 r9 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r10 = r9.mo19365F()
            com.google.android.gms.measurement.internal.n3 r10 = r10.f21329e
            long r10 = r10.mo39075a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0192
            long r9 = r9.f21299G
            r12 = r3
            r21 = r9
            goto L_0x019b
        L_0x0192:
            r12 = r3
            long r2 = r9.f21299G
            long r2 = java.lang.Math.min(r2, r10)
            r21 = r2
        L_0x019b:
            r32.mo39230d()
            int r11 = r1.f21356k
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a
            com.google.android.gms.measurement.internal.f r2 = r2.mo19392z()
            boolean r23 = r2.mo19336A()
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r2 = r2.mo19365F()
            r2.mo19272b()
            android.content.SharedPreferences r2 = r2.mo19393n()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r24 = r2.getBoolean(r3, r9)
            r32.mo39230d()
            java.lang.String r3 = r1.f21358m
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a
            com.google.android.gms.measurement.internal.f r2 = r2.mo19392z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo19353t(r9)
            if (r2 != 0) goto L_0x01d4
            r25 = 0
            goto L_0x01e0
        L_0x01d4:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r25 = r2
        L_0x01e0:
            r9 = 55005(0xd6dd, double:2.7176E-319)
            r17 = 0
            long r9 = r1.f21354i
            r26 = r9
            java.util.List r2 = r1.f21355j
            r28 = r2
            r29 = 0
            com.google.android.gms.measurement.internal.h4 r2 = r1.f21269a
            com.google.android.gms.measurement.internal.q3 r2 = r2.mo19365F()
            u5.b r2 = r2.mo19395p()
            java.lang.String r30 = r2.mo43336h()
            r2 = r31
            r9 = r3
            r3 = r12
            r10 = r11
            r11 = r13
            r13 = r33
            r14 = r0
            r16 = r20
            r19 = r21
            r21 = r10
            r22 = r23
            r23 = r24
            r24 = r9
            r9 = 55005(0xd6dd, double:2.7176E-319)
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30)
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4672u2.mo19406p(java.lang.String):com.google.android.gms.measurement.internal.zzp");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo19407q() {
        mo39230d();
        return this.f21358m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final String mo19408s() {
        mo39230d();
        C4604n.m20098k(this.f21348c);
        return this.f21348c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final String mo19409t() {
        C9366tc.m43665b();
        if (this.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46703n0)) {
            mo19272b();
        }
        mo39230d();
        C4604n.m20098k(this.f21357l);
        return this.f21357l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final List mo19410u() {
        return this.f21355j;
    }
}
