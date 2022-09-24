package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C9186i1;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9749d7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzau f46216b;

    /* renamed from: c */
    final /* synthetic */ String f46217c;

    /* renamed from: d */
    final /* synthetic */ C9186i1 f46218d;

    /* renamed from: e */
    final /* synthetic */ C9918t7 f46219e;

    C9749d7(C9918t7 t7Var, zzau zzau, String str, C9186i1 i1Var) {
        this.f46219e = t7Var;
        this.f46216b = zzau;
        this.f46217c = str;
        this.f46218d = i1Var;
    }

    public final void run() {
        C4670h4 h4Var;
        byte[] bArr = null;
        try {
            C9918t7 t7Var = this.f46219e;
            C11030e H = t7Var.f46763d;
            if (H == null) {
                t7Var.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Failed to send event to service to bundle");
                h4Var = this.f46219e.f21269a;
            } else {
                bArr = H.mo38839Q5(this.f46216b, this.f46217c);
                this.f46219e.m45383E();
                h4Var = this.f46219e.f21269a;
            }
        } catch (RemoteException e) {
            this.f46219e.f21269a.mo19276j().mo19282q().mo38857b("Failed to send event to the service to bundle", e);
            h4Var = this.f46219e.f21269a;
        } catch (Throwable th) {
            this.f46219e.f21269a.mo19372N().mo19295F(this.f46218d, bArr);
            throw th;
        }
        h4Var.mo19372N().mo19295F(this.f46218d, bArr);
    }
}
