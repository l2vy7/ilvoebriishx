package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rq1 extends o50 {

    /* renamed from: b */
    private final String f38756b;

    /* renamed from: c */
    private final dm1 f38757c;

    /* renamed from: d */
    private final im1 f38758d;

    public rq1(String str, dm1 dm1, im1 im1) {
        this.f38756b = str;
        this.f38757c = dm1;
        this.f38758d = im1;
    }

    /* renamed from: K4 */
    public final boolean mo33632K4(Bundle bundle) throws RemoteException {
        return this.f38757c.mo31327x(bundle);
    }

    /* renamed from: S2 */
    public final void mo33633S2(Bundle bundle) throws RemoteException {
        this.f38757c.mo31316l(bundle);
    }

    /* renamed from: V5 */
    public final void mo33634V5(Bundle bundle) throws RemoteException {
        this.f38757c.mo31309S(bundle);
    }

    /* renamed from: W2 */
    public final void mo33635W2(C7994nx nxVar) throws RemoteException {
        this.f38757c.mo31319o(nxVar);
    }

    /* renamed from: b4 */
    public final void mo33636b4(m50 m50) throws RemoteException {
        this.f38757c.mo31321q(m50);
    }

    /* renamed from: k4 */
    public final void mo33637k4(C7555by byVar) throws RemoteException {
        this.f38757c.mo31320p(byVar);
    }

    /* renamed from: n */
    public final List<?> mo33638n() throws RemoteException {
        return this.f38758d.mo32674e();
    }

    /* renamed from: q */
    public final boolean mo33639q() {
        return this.f38757c.mo31325u();
    }

    /* renamed from: q5 */
    public final void mo33640q5(C8137rx rxVar) throws RemoteException {
        this.f38757c.mo31306P(rxVar);
    }

    /* renamed from: r */
    public final void mo33641r() throws RemoteException {
        this.f38757c.mo31299I();
    }

    /* renamed from: t */
    public final boolean mo33642t() throws RemoteException {
        return !this.f38758d.mo32676f().isEmpty() && this.f38758d.mo32659S() != null;
    }

    public final void zzA() {
        this.f38757c.mo31312h();
    }

    public final void zzC() {
        this.f38757c.mo31318n();
    }

    public final double zze() throws RemoteException {
        return this.f38758d.mo32648A();
    }

    public final Bundle zzf() throws RemoteException {
        return this.f38758d.mo32652L();
    }

    public final C7663ey zzg() throws RemoteException {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37117i5)).booleanValue()) {
            return null;
        }
        return this.f38757c.mo33838c();
    }

    public final C7774hy zzh() throws RemoteException {
        return this.f38758d.mo32658R();
    }

    public final i30 zzi() throws RemoteException {
        return this.f38758d.mo32660T();
    }

    public final n30 zzj() throws RemoteException {
        return this.f38757c.mo31294A().mo31887a();
    }

    public final q30 zzk() throws RemoteException {
        return this.f38758d.mo32662V();
    }

    public final C10487a zzl() throws RemoteException {
        return this.f38758d.mo32669b0();
    }

    public final C10487a zzm() throws RemoteException {
        return C10489b.m48195m6(this.f38757c);
    }

    public final String zzn() throws RemoteException {
        return this.f38758d.mo32673d0();
    }

    public final String zzo() throws RemoteException {
        return this.f38758d.mo32675e0();
    }

    public final String zzp() throws RemoteException {
        return this.f38758d.mo32677f0();
    }

    public final String zzq() throws RemoteException {
        return this.f38758d.mo32681h0();
    }

    public final String zzr() throws RemoteException {
        return this.f38756b;
    }

    public final String zzs() throws RemoteException {
        return this.f38758d.mo32668b();
    }

    public final String zzt() throws RemoteException {
        return this.f38758d.mo32670c();
    }

    public final List<?> zzv() throws RemoteException {
        if (mo33642t()) {
            return this.f38758d.mo32676f();
        }
        return Collections.emptyList();
    }

    public final void zzx() throws RemoteException {
        this.f38757c.mo31310a();
    }
}
