package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C7416o1;
import p006a5.C6487i;
import p193c5.C6520c;
import p232m5.C10800d;
import p252t4.C11013c;
import p252t4.C11014d;

/* renamed from: com.google.android.gms.common.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C7353b {

    /* renamed from: a */
    public static final int f29212a = C7355d.f29215a;

    /* renamed from: b */
    private static final C7353b f29213b = new C7353b();

    C7353b() {
    }

    /* renamed from: h */
    public static C7353b m29920h() {
        return f29213b;
    }

    /* renamed from: a */
    public void mo29972a(Context context) {
        C7355d.m29935a(context);
    }

    /* renamed from: b */
    public int mo29973b(Context context) {
        return C7355d.m29937c(context);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo29974c(int i) {
        return mo29705d((Context) null, i, (String) null);
    }

    /* renamed from: d */
    public Intent mo29705d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C6487i.m28268f(context)) {
                return C7416o1.m30049a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f29212a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C6520c.m28321a(context).mo24355f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C7416o1.m30050b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C7416o1.m30051c("com.google.android.gms");
        }
    }

    /* renamed from: e */
    public PendingIntent mo29706e(Context context, int i, int i2) {
        return mo29975f(context, i, i2, (String) null);
    }

    /* renamed from: f */
    public PendingIntent mo29975f(Context context, int i, int i2, String str) {
        Intent d = mo29705d(context, i, str);
        if (d == null) {
            return null;
        }
        return C10800d.m48743a(context, i2, d, C10800d.f49531a | 134217728);
    }

    /* renamed from: g */
    public String mo29707g(int i) {
        return C7355d.m29938d(i);
    }

    /* renamed from: i */
    public int mo29708i(Context context) {
        return mo29709j(context, f29212a);
    }

    /* renamed from: j */
    public int mo29709j(Context context, int i) {
        int h = C7355d.m29942h(context, i);
        if (C7355d.m29944j(context, h)) {
            return 18;
        }
        return h;
    }

    /* renamed from: k */
    public boolean mo29976k(Context context, int i) {
        return C7355d.m29944j(context, i);
    }

    /* renamed from: l */
    public boolean mo29977l(Context context, String str) {
        return C7355d.m29948n(context, str);
    }

    /* renamed from: m */
    public boolean mo29710m(int i) {
        return C7355d.m29946l(i);
    }

    /* renamed from: n */
    public void mo29978n(Context context, int i) throws C11014d, C11013c {
        C7355d.m29936b(context, i);
    }
}
