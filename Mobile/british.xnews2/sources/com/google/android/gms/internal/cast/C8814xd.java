package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Map;
import p114m4.C10742b0;
import p114m4.C10746c1;
import p114m4.C10754f1;
import p114m4.C10763i1;
import p114m4.C10765j0;
import p114m4.C10793y;
import p198d5.C10487a;
import p234n4.C10821i;
import p234n4.C10823k;

/* renamed from: com.google.android.gms.internal.cast.xd */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public interface C8814xd extends IInterface {
    /* renamed from: N0 */
    C10821i mo36774N0(C10487a aVar, C10823k kVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException;

    /* renamed from: O1 */
    C10754f1 mo36775O1(C10487a aVar, CastOptions castOptions, C8660nf nfVar, Map map) throws RemoteException;

    /* renamed from: d4 */
    C10763i1 mo36776d4(CastOptions castOptions, C10487a aVar, C10746c1 c1Var) throws RemoteException;

    /* renamed from: j0 */
    C10793y mo36777j0(C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException;

    /* renamed from: r0 */
    C10742b0 mo36778r0(String str, String str2, C10765j0 j0Var) throws RemoteException;
}
