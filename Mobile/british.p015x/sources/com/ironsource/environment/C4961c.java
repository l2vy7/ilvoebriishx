package com.ironsource.environment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c */
public class C4961c {

    /* renamed from: a */
    private String f22014a;

    /* renamed from: b */
    private String f22015b;

    /* renamed from: c */
    private int f22016c;

    /* renamed from: d */
    private String f22017d;

    public C4961c(int i, String str, String str2, String str3) {
        this.f22016c = i;
        this.f22015b = str2;
        this.f22014a = str;
        this.f22017d = str3;
    }

    public C4961c(String str, String str2, String str3) {
        this.f22016c = -1;
        this.f22015b = str2;
        this.f22014a = str;
        this.f22017d = str3;
    }

    /* renamed from: a */
    public static long m22739a(Context context) {
        try {
            return m22747e(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public static JSONObject m22740a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                int i = 0;
                if (jSONArray.length() == 0) {
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length) {
                            break;
                        }
                        jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                        i++;
                    }
                } else {
                    List asList = Arrays.asList(packageInfo.requestedPermissions);
                    while (i < jSONArray.length()) {
                        String string = jSONArray.getString(i);
                        int indexOf = asList.indexOf(string);
                        if (indexOf != -1) {
                            jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                        } else {
                            jSONObject.put(string, "notFoundInManifest");
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22741a(android.content.Context r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0033
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x002f }
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r2)     // Catch:{ Exception -> 0x002f }
            java.lang.String[] r0 = r4.requestedPermissions     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x0033
            r0 = 0
        L_0x001a:
            java.lang.String[] r2 = r4.requestedPermissions     // Catch:{ Exception -> 0x002c }
            int r3 = r2.length     // Catch:{ Exception -> 0x002c }
            if (r1 >= r3) goto L_0x002a
            if (r0 != 0) goto L_0x002a
            r2 = r2[r1]     // Catch:{ Exception -> 0x002c }
            boolean r0 = r5.equals(r2)     // Catch:{ Exception -> 0x002c }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x002a:
            r1 = r0
            goto L_0x0033
        L_0x002c:
            r4 = move-exception
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r4 = move-exception
        L_0x0030:
            r4.printStackTrace()
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4961c.m22741a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static long m22742b(Context context) {
        try {
            return m22747e(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m22743b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: c */
    public static String m22744c(Context context) {
        try {
            return m22747e(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m22745c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static String m22746d(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* renamed from: e */
    private static PackageInfo m22747e(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

    /* renamed from: a */
    public String mo20576a() {
        return this.f22014a;
    }

    /* renamed from: b */
    public String mo20577b() {
        return this.f22015b;
    }

    /* renamed from: c */
    public String mo20578c() {
        return this.f22017d;
    }

    /* renamed from: d */
    public void mo20579d() {
        C4977f.m22775a(this);
    }
}
