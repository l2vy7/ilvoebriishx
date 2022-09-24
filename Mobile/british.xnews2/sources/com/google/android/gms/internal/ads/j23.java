package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j23 {

    /* renamed from: a */
    final m23 f33731a;

    /* renamed from: b */
    final boolean f33732b;

    private j23(m23 m23) {
        this.f33731a = m23;
        this.f33732b = m23 != null;
    }

    /* renamed from: b */
    public static j23 m33512b(Context context, String str, String str2) {
        m23 m23;
        try {
            IBinder d = DynamiteModule.m30157e(context, DynamiteModule.f29454b, ModuleDescriptor.MODULE_ID).mo30249d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (d == null) {
                m23 = null;
            } else {
                IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                m23 = queryLocalInterface instanceof m23 ? (m23) queryLocalInterface : new k23(d);
            }
            try {
                m23.mo33019Z4(C10489b.m48195m6(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new j23(m23);
            } catch (RemoteException | p13 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new j23(new n23());
            }
        } catch (Exception e) {
            throw new p13(e);
        } catch (Exception e2) {
            throw new p13(e2);
        }
    }

    /* renamed from: c */
    public static j23 m33513c() {
        n23 n23 = new n23();
        Log.d("GASS", "Clearcut logging disabled");
        return new j23(n23);
    }

    /* renamed from: a */
    public final i23 mo32819a(byte[] bArr) {
        return new i23(this, bArr, (h23) null);
    }
}
