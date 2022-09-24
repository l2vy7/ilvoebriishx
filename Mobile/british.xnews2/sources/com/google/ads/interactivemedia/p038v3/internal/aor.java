package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aor */
/* compiled from: IMASDK */
public abstract class aor extends C4071ij implements aos {
    public aor() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14139a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            mo14161b((aox) C4072ik.m17380c(parcel, aox.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo14162c(parcel.readInt());
        }
        return true;
    }
}
