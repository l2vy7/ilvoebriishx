package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class io2 {
    /* renamed from: a */
    public static <T> void m33342a(AtomicReference<T> atomicReference, ho2<T> ho2) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                ho2.zza(t);
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                co0.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
