package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Hide;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.anu */
/* compiled from: IMASDK */
public class anu {

    /* renamed from: a */
    protected ant f15457a;

    protected anu() {
    }

    /* renamed from: a */
    public final boolean mo14140a(Uri uri) throws RemoteException {
        return this.f15457a.mo14130e(apj.m14499c(uri));
    }

    /* renamed from: b */
    public final Uri mo14141b(Uri uri, Context context) throws anv, RemoteException {
        C3847api g = this.f15457a.mo14132g(apj.m14499c(uri), apj.m14499c(context));
        if (g != null) {
            return (Uri) apj.m14500d(g);
        }
        throw new anv();
    }

    /* renamed from: c */
    public final String mo14142c(Context context) throws RemoteException {
        return this.f15457a.mo14134i(apj.m14499c(context), (byte[]) null);
    }
}
