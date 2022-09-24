package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.cast.h0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8547h0 {

    /* renamed from: a */
    public static final int f43513a;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i = 33554432;
            }
        }
        f43513a = i;
    }

    /* renamed from: a */
    public static PendingIntent m40979a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    /* renamed from: b */
    public static PendingIntent m40980b(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }
}
