package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i23 {

    /* renamed from: a */
    private final byte[] f33052a;

    /* renamed from: b */
    private int f33053b;

    /* renamed from: c */
    private int f33054c;

    /* renamed from: d */
    final /* synthetic */ j23 f33055d;

    /* synthetic */ i23(j23 j23, byte[] bArr, h23 h23) {
        this.f33055d = j23;
        this.f33052a = bArr;
    }

    /* renamed from: a */
    public final i23 mo32529a(int i) {
        this.f33054c = i;
        return this;
    }

    /* renamed from: b */
    public final i23 mo32530b(int i) {
        this.f33053b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void mo32531c() {
        try {
            j23 j23 = this.f33055d;
            if (j23.f33732b) {
                j23.f33731a.mo33017L(this.f33052a);
                this.f33055d.f33731a.mo33021o(this.f33053b);
                this.f33055d.f33731a.mo33020k(this.f33054c);
                this.f33055d.f33731a.mo33018U((int[]) null);
                this.f33055d.f33731a.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
