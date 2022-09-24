package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ua2 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, te0> f20917a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final it1 f20918b;

    public ua2(it1 it1) {
        this.f20918b = it1;
    }

    @CheckForNull
    /* renamed from: a */
    public final te0 mo18884a(String str) {
        if (this.f20917a.containsKey(str)) {
            return this.f20917a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo18885b(String str) {
        try {
            this.f20917a.put(str, this.f20918b.mo32763a(str));
        } catch (RemoteException e) {
            co0.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
