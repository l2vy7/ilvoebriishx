package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C4548b;
import com.google.ads.mediation.C4556f;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class qc0 extends sc0 {

    /* renamed from: c */
    private static final xe0 f37967c = new xe0();

    /* renamed from: b */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f37968b;

    /* renamed from: a */
    public final wc0 mo34307a(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, qc0.class.getClassLoader());
            if (C4548b.class.isAssignableFrom(cls)) {
                C4548b bVar = (C4548b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new yd0(bVar, (C4556f) this.f37968b.get(bVar.getAdditionalParametersType()));
            } else if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new td0((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new td0((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                co0.zzj(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            co0.zzk(sb2.toString(), th);
        }
        throw new RemoteException();
    }

    /* renamed from: b */
    public final boolean mo34308b(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, qc0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            co0.zzj(sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo34309c(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, qc0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            co0.zzj(sb.toString());
            return false;
        }
    }

    /* renamed from: o6 */
    public final void mo34310o6(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f37968b = map;
    }

    /* renamed from: z */
    public final te0 mo34311z(String str) throws RemoteException {
        try {
            return new ef0((RtbAdapter) Class.forName(str, false, xe0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
