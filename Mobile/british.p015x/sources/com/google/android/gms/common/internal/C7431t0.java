package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p193c5.C6520c;

/* renamed from: com.google.android.gms.common.internal.t0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7431t0 {

    /* renamed from: a */
    private static final Object f29364a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f29365b;

    /* renamed from: c */
    private static String f29366c;

    /* renamed from: d */
    private static int f29367d;

    /* renamed from: a */
    public static int m30071a(Context context) {
        m30072b(context);
        return f29367d;
    }

    /* renamed from: b */
    private static void m30072b(Context context) {
        synchronized (f29364a) {
            if (!f29365b) {
                f29365b = true;
                try {
                    Bundle bundle = C6520c.m28321a(context).mo24352c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f29366c = bundle.getString("com.google.app.id");
                        f29367d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
