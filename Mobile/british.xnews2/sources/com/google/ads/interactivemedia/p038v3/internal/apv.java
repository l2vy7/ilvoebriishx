package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.apv */
/* compiled from: IMASDK */
public final class apv {

    /* renamed from: a */
    apy f15546a;

    /* renamed from: b */
    boolean f15547b;

    public apv(Context context) {
        try {
            try {
                this.f15546a = apx.m14521b(DynamiteModule.m30157e(context, DynamiteModule.f29454b, ModuleDescriptor.MODULE_ID).mo30249d("com.google.android.gms.ads.clearcut.GassDynamiteClearcutLogger"));
                this.f15546a.mo14204i(apj.m14499c(context));
                this.f15547b = true;
            } catch (RemoteException | apn | NullPointerException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
            }
        } catch (Exception e) {
            throw new apn(e);
        } catch (Exception e2) {
            throw new apn(e2);
        }
    }

    /* renamed from: a */
    public final apu mo14199a(byte[] bArr) {
        return new apu(this, bArr);
    }
}
