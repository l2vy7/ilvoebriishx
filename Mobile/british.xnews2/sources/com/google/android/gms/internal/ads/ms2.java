package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ms2 {
    /* renamed from: a */
    public static Bundle m34887a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* renamed from: b */
    public static void m34888b(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    /* renamed from: c */
    public static void m34889c(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: d */
    public static void m34890d(Bundle bundle, String str, List<String> list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList(list));
        }
    }

    /* renamed from: e */
    public static void m34891e(Bundle bundle, String str, Boolean bool, boolean z) {
        if (z) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* renamed from: f */
    public static void m34892f(Bundle bundle, String str, Integer num, boolean z) {
        if (z) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* renamed from: g */
    public static void m34893g(Bundle bundle, String str, String str2, boolean z) {
        if (z) {
            bundle.putString(str, str2);
        }
    }
}
