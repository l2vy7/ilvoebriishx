package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Map;
import p114m4.C10740a0;
import p114m4.C10742b0;
import p114m4.C10746c1;
import p114m4.C10751e1;
import p114m4.C10754f1;
import p114m4.C10760h1;
import p114m4.C10763i1;
import p114m4.C10765j0;
import p114m4.C10791x;
import p114m4.C10793y;
import p198d5.C10487a;
import p234n4.C10820h;
import p234n4.C10821i;
import p234n4.C10823k;

/* renamed from: com.google.android.gms.internal.cast.yc */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8828yc extends C8430a implements C8814xd {
    C8828yc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    /* renamed from: N0 */
    public final C10821i mo36774N0(C10487a aVar, C10823k kVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, aVar);
        C8431a0.m40681f(x, kVar);
        x.writeInt(i);
        x.writeInt(i2);
        C8431a0.m40677b(x, false);
        x.writeLong(2097152);
        x.writeInt(5);
        x.writeInt(333);
        x.writeInt(10000);
        Parcel b2 = mo36362b2(6, x);
        C10821i b22 = C10820h.m48790b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: O1 */
    public final C10754f1 mo36775O1(C10487a aVar, CastOptions castOptions, C8660nf nfVar, Map map) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, aVar);
        C8431a0.m40679d(x, castOptions);
        C8431a0.m40681f(x, nfVar);
        x.writeMap(map);
        Parcel b2 = mo36362b2(1, x);
        C10754f1 b22 = C10751e1.m48641b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: d4 */
    public final C10763i1 mo36776d4(CastOptions castOptions, C10487a aVar, C10746c1 c1Var) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, castOptions);
        C8431a0.m40681f(x, aVar);
        C8431a0.m40681f(x, c1Var);
        Parcel b2 = mo36362b2(3, x);
        C10763i1 b22 = C10760h1.m48657b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: j0 */
    public final C10793y mo36777j0(C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40681f(x, aVar);
        C8431a0.m40681f(x, aVar2);
        C8431a0.m40681f(x, aVar3);
        Parcel b2 = mo36362b2(5, x);
        C10793y b22 = C10791x.m48715b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }

    /* renamed from: r0 */
    public final C10742b0 mo36778r0(String str, String str2, C10765j0 j0Var) throws RemoteException {
        Parcel x = mo36365x();
        x.writeString(str);
        x.writeString(str2);
        C8431a0.m40681f(x, j0Var);
        Parcel b2 = mo36362b2(2, x);
        C10742b0 b22 = C10740a0.m48624b2(b2.readStrongBinder());
        b2.recycle();
        return b22;
    }
}
