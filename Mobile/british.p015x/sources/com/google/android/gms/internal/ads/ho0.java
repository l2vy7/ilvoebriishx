package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ho0 {
    /* renamed from: a */
    public static Context m32902a(Context context) throws go0 {
        return m32904c(context).mo30248b();
    }

    /* renamed from: b */
    public static <T> T m32903b(Context context, String str, fo0<IBinder, T> fo0) throws go0 {
        try {
            return fo0.zza(m32904c(context).mo30249d(str));
        } catch (Exception e) {
            throw new go0(e);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m32904c(Context context) throws go0 {
        try {
            return DynamiteModule.m30157e(context, DynamiteModule.f29454b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new go0(e);
        }
    }
}
