package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a5.C6487i;
import p006a5.C6492o;
import p006a5.C6495t;
import p192c5.C6520c;
import p251t4.C11013c;
import p251t4.C11014d;

/* renamed from: com.google.android.gms.common.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C7355d {
    @Deprecated

    /* renamed from: a */
    public static final int f29215a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f29216b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f29217c = false;

    /* renamed from: d */
    static boolean f29218d = false;

    /* renamed from: e */
    private static final AtomicBoolean f29219e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m29935a(Context context) {
        if (!f29216b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m29936b(Context context, int i) throws C11014d, C11013c {
        int j = C7353b.m29920h().mo29709j(context, i);
        if (j != 0) {
            Intent d = C7353b.m29920h().mo29705d(context, j, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(j);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (d == null) {
                throw new C11013c(j);
            }
            throw new C11014d(j, "Google Play Services not available", d);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static int m29937c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static String m29938d(int i) {
        return ConnectionResult.m29473H0(i);
    }

    /* renamed from: e */
    public static Context m29939e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Resources m29940f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m29941g(Context context) {
        if (!f29218d) {
            try {
                PackageInfo f = C6520c.m28321a(context).mo24355f("com.google.android.gms", 64);
                C4599e.m20051a(context);
                if (f == null || C4599e.m20053e(f, false) || !C4599e.m20053e(f, true)) {
                    f29217c = false;
                } else {
                    f29217c = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f29218d = true;
            }
        }
        return f29217c || !C6487i.m28266d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    @java.lang.Deprecated
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29942h(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = p251t4.C11015e.f49970a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f29219e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = com.google.android.gms.common.internal.C7431t0.m30071a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f29215a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = p006a5.C6487i.m28268f(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = p006a5.C6487i.m28270h(r10)
            if (r1 != 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            com.google.android.gms.common.internal.C4604n.m20088a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007d
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = 9
            goto L_0x013d
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0130 }
            com.google.android.gms.common.C4599e.m20051a(r10)
            boolean r10 = com.google.android.gms.common.C4599e.m20053e(r9, r3)
            if (r10 != 0) goto L_0x009a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x009a:
            if (r1 == 0) goto L_0x00b3
            com.google.android.gms.common.internal.C4604n.m20098k(r8)
            boolean r10 = com.google.android.gms.common.C4599e.m20053e(r8, r3)
            if (r10 != 0) goto L_0x00b3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b3:
            if (r1 == 0) goto L_0x00d3
            if (r8 == 0) goto L_0x00d3
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d3:
            int r10 = r9.versionCode
            int r10 = p006a5.C6496u.m28294a(r10)
            int r1 = p006a5.C6496u.m28294a(r11)
            if (r10 >= r1) goto L_0x0111
            int r10 = r9.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 82
            r2.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ".  Requires "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = " but found "
            r2.append(r11)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x013d
        L_0x0111:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x0129
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x011a }
            goto L_0x0129
        L_0x011a:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x013d
        L_0x0129:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x012f
            r3 = 3
            goto L_0x013d
        L_0x012f:
            return r4
        L_0x0130:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x013d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C7355d.m29942h(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m29943i(Context context, int i) {
        return C6495t.m28292a(context, i);
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m29944j(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m29948n(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: k */
    public static boolean m29945k(Context context) {
        if (!C6492o.m28282e()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C4604n.m20098k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: l */
    public static boolean m29946l(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: m */
    public static boolean m29947m(Context context, int i, String str) {
        return C6495t.m28293b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: n */
    static boolean m29948n(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C6492o.m28285h()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m29945k(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
