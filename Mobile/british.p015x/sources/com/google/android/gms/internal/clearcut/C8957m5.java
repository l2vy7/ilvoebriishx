package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.C4586a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7231d;

/* renamed from: com.google.android.gms.internal.clearcut.m5 */
final class C8957m5 extends C7231d<Status, C8985q5> {

    /* renamed from: t */
    private final zze f44631t;

    C8957m5(zze zze, C7206f fVar) {
        super(C4586a.f19938p, fVar);
        this.f44631t = zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ C7341k mo29539e(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final /* synthetic */ void mo29843q(C7191a.C7193b bVar) throws RemoteException {
        C8985q5 q5Var = (C8985q5) bVar;
        C8978p5 p5Var = new C8978p5(this);
        try {
            zze zze = this.f44631t;
            C4586a.C4589c cVar = zze.f28860k;
            if (cVar != null) {
                C8964n5 n5Var = zze.f28859j;
                if (n5Var.f44663o.length == 0) {
                    n5Var.f44663o = cVar.zza();
                }
            }
            C4586a.C4589c cVar2 = zze.f28861l;
            if (cVar2 != null) {
                C8964n5 n5Var2 = zze.f28859j;
                if (n5Var2.f44670v.length == 0) {
                    n5Var2.f44670v = cVar2.zza();
                }
            }
            C8964n5 n5Var3 = zze.f28859j;
            int c = n5Var3.mo37228c();
            byte[] bArr = new byte[c];
            C9033x4.m42492b(n5Var3, bArr, 0, c);
            zze.f28852c = bArr;
            ((C9013u5) q5Var.getService()).mo37189L1(p5Var, this.f44631t);
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            mo29848w(new Status(10, "MessageProducer"));
        }
    }
}
