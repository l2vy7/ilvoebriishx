package com.startapp;

import android.content.Context;
import android.os.Build;

/* renamed from: com.startapp.w7 */
/* compiled from: Sta */
public class C12412w7 {
    /* renamed from: a */
    public static boolean m53716a(Context context) {
        if (Build.VERSION.SDK_INT < 16 || context.checkCallingOrSelfPermission("android.permission.READ_CALL_LOG") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m53717b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }
}
