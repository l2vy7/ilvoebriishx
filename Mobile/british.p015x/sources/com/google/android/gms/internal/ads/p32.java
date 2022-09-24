package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p32 {

    /* renamed from: h */
    private static final SparseArray<C8238us> f37315h;

    /* renamed from: a */
    private final Context f37316a;

    /* renamed from: b */
    private final r91 f37317b;

    /* renamed from: c */
    private final TelephonyManager f37318c;

    /* renamed from: d */
    private final i32 f37319d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final e32 f37320e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzg f37321f;

    /* renamed from: g */
    private int f37322g;

    static {
        SparseArray<C8238us> sparseArray = new SparseArray<>();
        f37315h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), C8238us.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        C8238us usVar = C8238us.CONNECTING;
        sparseArray.put(ordinal, usVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), usVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), usVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), C8238us.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        C8238us usVar2 = C8238us.DISCONNECTED;
        sparseArray.put(ordinal2, usVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), usVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), usVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), usVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), usVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), C8238us.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), usVar);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), usVar);
    }

    p32(Context context, r91 r91, i32 i32, e32 e32, zzg zzg) {
        this.f37316a = context;
        this.f37317b = r91;
        this.f37319d = i32;
        this.f37320e = e32;
        this.f37318c = (TelephonyManager) context.getSystemService("phone");
        this.f37321f = zzg;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C7915ls m35942a(p32 p32, Bundle bundle) {
        C7620ds E = C7915ls.m34536E();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            p32.f37322g = 2;
        } else {
            p32.f37322g = 1;
            if (i == 0) {
                E.mo31401B(2);
            } else if (i != 1) {
                E.mo31401B(1);
            } else {
                E.mo31401B(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            E.mo31402y(i3);
        }
        return (C7915ls) E.mo32424p();
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ byte[] m35946f(p32 p32, boolean z, ArrayList arrayList, C7915ls lsVar, C8238us usVar) {
        C8061ps M = C8097qs.m36670M();
        M.mo34180y(arrayList);
        boolean z2 = true;
        M.mo34175L(m35947g(zzt.zzq().zza(p32.f37316a.getContentResolver()) != 0));
        M.mo34176M(zzt.zzq().zzq(p32.f37316a, p32.f37318c));
        M.mo34173J(p32.f37319d.mo32541d());
        M.mo34172I(p32.f37319d.mo32539b());
        M.mo34169B(p32.f37319d.mo32538a());
        M.mo34170C(usVar);
        M.mo34171H(lsVar);
        M.mo34177N(p32.f37322g);
        M.mo34178O(m35947g(z));
        M.mo34174K(zzt.zzA().currentTimeMillis());
        if (zzt.zzq().zzb(p32.f37316a.getContentResolver()) == 0) {
            z2 = false;
        }
        M.mo34179P(m35947g(z2));
        return ((C8097qs) M.mo32424p()).mo33365g();
    }

    /* renamed from: g */
    private static final int m35947g(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: e */
    public final void mo34044e(boolean z) {
        bb3.m30658r(this.f37317b.mo34520b(), new o32(this, z), po0.f37727f);
    }
}
