package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C4548b;
import com.google.ads.mediation.C4553e;
import com.google.ads.mediation.C4556f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p131p3.C5904c;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class yd0<NETWORK_EXTRAS extends C4556f, SERVER_PARAMETERS extends C4553e> extends vc0 {

    /* renamed from: b */
    private final C4548b<NETWORK_EXTRAS, SERVER_PARAMETERS> f41787b;

    /* renamed from: c */
    private final NETWORK_EXTRAS f41788c;

    public yd0(C4548b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f41787b = bVar;
        this.f41788c = network_extras;
    }

    /* renamed from: n6 */
    private final SERVER_PARAMETERS m39859n6(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                co0.zzh("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f41787b.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C4553e) serverParametersType.newInstance();
        server_parameters.mo16976a(hashMap);
        return server_parameters;
    }

    /* renamed from: o6 */
    private static final boolean m39860o6(zzbfd zzbfd) {
        if (zzbfd.f42945g) {
            return true;
        }
        C8241uv.m38463b();
        return vn0.m38854m();
    }

    /* renamed from: C0 */
    public final void mo34905C0(C10487a aVar) throws RemoteException {
    }

    /* renamed from: H4 */
    public final void mo34906H4(C10487a aVar, b90 b90, List<zzbtx> list) throws RemoteException {
    }

    /* renamed from: J4 */
    public final void mo34907J4(zzbfd zzbfd, String str, String str2) {
    }

    /* renamed from: R0 */
    public final void mo34908R0(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        C5904c cVar;
        String str3;
        C4548b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f41787b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3 = "Not a MediationBannerAdapter: ".concat(valueOf);
            } else {
                str3 = new String("Not a MediationBannerAdapter: ");
            }
            co0.zzj(str3);
            throw new RemoteException();
        }
        co0.zze("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f41787b;
            be0 be0 = new be0(zc0);
            Activity activity = (Activity) C10489b.m48194f3(aVar);
            C4553e n6 = m39859n6(str);
            int i = 0;
            C5904c[] cVarArr = {C5904c.f24746b, C5904c.f24747c, C5904c.f24748d, C5904c.f24749e, C5904c.f24750f, C5904c.f24751g};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].mo22887b() == zzbfi.f42968f && cVarArr[i].mo22886a() == zzbfi.f42965c) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new C5904c(zza.zzc(zzbfi.f42968f, zzbfi.f42965c, zzbfi.f42964b));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(be0, activity, n6, cVar, ce0.m30977b(zzbfd, m39860o6(zzbfd)), this.f41788c);
        } catch (Throwable th) {
            co0.zzh("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: R5 */
    public final void mo34909R5(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
    }

    /* renamed from: S3 */
    public final void mo34910S3(boolean z) {
    }

    /* renamed from: X1 */
    public final void mo34911X1(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, zc0 zc0) {
    }

    /* renamed from: e6 */
    public final void mo34912e6(C10487a aVar, zzbfd zzbfd, String str, String str2, zc0 zc0) throws RemoteException {
        String str3;
        C4548b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f41787b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3 = "Not a MediationInterstitialAdapter: ".concat(valueOf);
            } else {
                str3 = new String("Not a MediationInterstitialAdapter: ");
            }
            co0.zzj(str3);
            throw new RemoteException();
        }
        co0.zze("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f41787b).requestInterstitialAd(new be0(zc0), (Activity) C10489b.m48194f3(aVar), m39859n6(str), ce0.m30977b(zzbfd, m39860o6(zzbfd)), this.f41788c);
        } catch (Throwable th) {
            co0.zzh("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo34913f() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: h */
    public final fd0 mo34914h() {
        return null;
    }

    /* renamed from: h3 */
    public final void mo34915h3(C10487a aVar) {
    }

    /* renamed from: l4 */
    public final void mo34916l4(zzbfd zzbfd, String str) {
    }

    /* renamed from: l6 */
    public final void mo34917l6(C10487a aVar, zzbfd zzbfd, String str, uj0 uj0, String str2) throws RemoteException {
    }

    /* renamed from: m2 */
    public final void mo34918m2(C10487a aVar) throws RemoteException {
    }

    /* renamed from: o4 */
    public final void mo34919o4(C10487a aVar, zzbfd zzbfd, String str, String str2, zc0 zc0, zzbnw zzbnw, List<String> list) {
    }

    /* renamed from: p3 */
    public final void mo34920p3(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
    }

    /* renamed from: p4 */
    public final void mo34921p4(C10487a aVar, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        mo34912e6(aVar, zzbfd, str, (String) null, zc0);
    }

    /* renamed from: q */
    public final void mo34922q() throws RemoteException {
        String str;
        C4548b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f41787b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str = "Not a MediationInterstitialAdapter: ".concat(valueOf);
            } else {
                str = new String("Not a MediationInterstitialAdapter: ");
            }
            co0.zzj(str);
            throw new RemoteException();
        }
        co0.zze("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f41787b).showInterstitial();
        } catch (Throwable th) {
            co0.zzh("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: r5 */
    public final void mo34923r5(C10487a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, zc0 zc0) throws RemoteException {
        mo34908R0(aVar, zzbfi, zzbfd, str, (String) null, zc0);
    }

    /* renamed from: t4 */
    public final void mo34924t4(C10487a aVar, uj0 uj0, List<String> list) {
    }

    /* renamed from: u */
    public final ed0 mo34925u() {
        return null;
    }

    public final void zzE() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzJ() {
    }

    public final boolean zzK() {
        return false;
    }

    public final boolean zzL() {
        return true;
    }

    public final Bundle zze() {
        return new Bundle();
    }

    public final Bundle zzf() {
        return new Bundle();
    }

    public final Bundle zzg() {
        return new Bundle();
    }

    public final C7774hy zzh() {
        return null;
    }

    public final l40 zzi() {
        return null;
    }

    public final cd0 zzj() {
        return null;
    }

    public final id0 zzk() {
        return null;
    }

    public final zzcab zzl() {
        return null;
    }

    public final zzcab zzm() {
        return null;
    }

    public final C10487a zzn() throws RemoteException {
        String str;
        C4548b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f41787b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str = "Not a MediationBannerAdapter: ".concat(valueOf);
            } else {
                str = new String("Not a MediationBannerAdapter: ");
            }
            co0.zzj(str);
            throw new RemoteException();
        }
        try {
            return C10489b.m48195m6(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            co0.zzh("", th);
            throw new RemoteException();
        }
    }

    public final void zzo() throws RemoteException {
        try {
            this.f41787b.destroy();
        } catch (Throwable th) {
            co0.zzh("", th);
            throw new RemoteException();
        }
    }
}
