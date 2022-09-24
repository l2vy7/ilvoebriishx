package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C4599e {
    @Nullable

    /* renamed from: c */
    private static C4599e f20026c;

    /* renamed from: a */
    private final Context f20027a;

    /* renamed from: b */
    private volatile String f20028b;

    public C4599e(Context context) {
        this.f20027a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4599e m20051a(Context context) {
        C4604n.m20098k(context);
        synchronized (C4599e.class) {
            if (f20026c == null) {
                C7452q.m30110d(context);
                f20026c = new C4599e(context);
            }
        }
        return f20026c;
    }

    @Nullable
    /* renamed from: d */
    static final C7448m m20052d(PackageInfo packageInfo, C7448m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C7449n nVar = new C7449n(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < mVarArr.length; i++) {
            if (mVarArr[i].equals(nVar)) {
                return mVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m20053e(PackageInfo packageInfo, boolean z) {
        C7448m mVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                mVar = m20052d(packageInfo, C7451p.f29402a);
            } else {
                mVar = m20052d(packageInfo, C7451p.f29402a[0]);
            }
            if (mVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.common.C4605w m20054f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            com.google.android.gms.common.w r6 = com.google.android.gms.common.C4605w.m20106c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f20028b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x009c
            boolean r8 = com.google.android.gms.common.C7452q.m30111e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f20027a
            boolean r7 = com.google.android.gms.common.C7355d.m29941g(r7)
            com.google.android.gms.common.w r7 = com.google.android.gms.common.C7452q.m30108b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f20027a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f20027a
            boolean r1 = com.google.android.gms.common.C7355d.m29941g(r1)
            if (r8 != 0) goto L_0x003c
            com.google.android.gms.common.w r7 = com.google.android.gms.common.C4605w.m20106c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            com.google.android.gms.common.n r7 = new com.google.android.gms.common.n
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            com.google.android.gms.common.w r1 = com.google.android.gms.common.C7452q.m30107a(r3, r7, r1, r0)
            boolean r4 = r1.f20072a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            com.google.android.gms.common.w r7 = com.google.android.gms.common.C7452q.m30107a(r3, r7, r0, r2)
            boolean r7 = r7.f20072a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.w r7 = com.google.android.gms.common.C4605w.m20106c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.w r7 = com.google.android.gms.common.C4605w.m20106c(r7)
        L_0x007d:
            boolean r8 = r7.f20072a
            if (r8 == 0) goto L_0x0083
            r5.f20028b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0092
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0097
        L_0x0092:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0097:
            com.google.android.gms.common.w r6 = com.google.android.gms.common.C4605w.m20107d(r6, r7)
            return r6
        L_0x009c:
            com.google.android.gms.common.w r6 = com.google.android.gms.common.C4605w.m20105b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C4599e.m20054f(java.lang.String, boolean, boolean):com.google.android.gms.common.w");
    }

    /* renamed from: b */
    public boolean mo17971b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m20053e(packageInfo, false)) {
            return true;
        }
        if (m20053e(packageInfo, true)) {
            if (C7355d.m29941g(this.f20027a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo17972c(int i) {
        C4605w wVar;
        int length;
        String[] packagesForUid = this.f20027a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            wVar = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C4604n.m20098k(wVar);
                    break;
                }
                wVar = m20054f(packagesForUid[i2], false, false);
                if (wVar.f20072a) {
                    break;
                }
                i2++;
            }
        } else {
            wVar = C4605w.m20106c("no pkgs");
        }
        wVar.mo18009e();
        return wVar.f20072a;
    }
}
