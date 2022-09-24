package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;

/* renamed from: com.google.android.gms.common.internal.l1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7407l1 implements Handler.Callback {

    /* renamed from: b */
    final /* synthetic */ C7411m1 f29335b;

    /* synthetic */ C7407l1(C7411m1 m1Var, C7404k1 k1Var) {
        this.f29335b = m1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f29335b.f29339f) {
                C7398i1 i1Var = (C7398i1) message.obj;
                C7401j1 j1Var = (C7401j1) this.f29335b.f29339f.get(i1Var);
                if (j1Var != null && j1Var.mo30127i()) {
                    if (j1Var.mo30128j()) {
                        j1Var.mo30125g("GmsClientSupervisor");
                    }
                    this.f29335b.f29339f.remove(i1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f29335b.f29339f) {
                C7398i1 i1Var2 = (C7398i1) message.obj;
                C7401j1 j1Var2 = (C7401j1) this.f29335b.f29339f.get(i1Var2);
                if (j1Var2 != null && j1Var2.mo30119a() == 3) {
                    String valueOf = String.valueOf(i1Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = j1Var2.mo30120b();
                    if (b == null) {
                        b = i1Var2.mo30110b();
                    }
                    if (b == null) {
                        String d = i1Var2.mo30112d();
                        C4604n.m20098k(d);
                        b = new ComponentName(d, C3791bd.UNKNOWN_CONTENT_TYPE);
                    }
                    j1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
