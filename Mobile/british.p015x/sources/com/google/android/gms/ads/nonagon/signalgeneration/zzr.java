package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.tm0;
import com.google.android.gms.internal.ads.xa3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzr implements xa3<zzah> {

    /* renamed from: a */
    final /* synthetic */ tm0 f28082a;

    /* renamed from: b */
    final /* synthetic */ zzv f28083b;

    zzr(zzv zzv, tm0 tm0) {
        this.f28083b = zzv;
        this.f28082a = tm0;
    }

    public final void zza(Throwable th) {
        String message = th.getMessage();
        zzt.zzo().mo18592s(th, "SignalGeneratorImpl.generateSignals");
        zzv.m28891O6(this.f28083b, "sgf", "sgf_reason", message);
        try {
            tm0 tm0 = this.f28082a;
            String valueOf = String.valueOf(message);
            tm0.mo34123a(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzah zzah = (zzah) obj;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36869E5)).booleanValue()) {
            try {
                this.f28082a.mo34123a("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                co0.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
        } else if (zzah == null) {
            try {
                this.f28082a.mo34122I1((String) null, (String) null, (Bundle) null);
                zzv.m28891O6(this.f28083b, "sgs", "rid", "-1");
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
        } else {
            try {
                String optString = new JSONObject(zzah.zzb).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    co0.zzj("The request ID is empty in request JSON.");
                    this.f28082a.mo34123a("Internal error: request ID is empty in request JSON.");
                    zzv.m28891O6(this.f28083b, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37180p5)).booleanValue()) {
                    this.f28083b.f28099l.zzc(optString, zzah.zzb);
                }
                Bundle bundle = zzah.zzc;
                if (this.f28083b.f28106s && bundle != null && bundle.getInt(this.f28083b.f28108u, -1) == -1) {
                    bundle.putInt(this.f28083b.f28108u, this.f28083b.f28109v.get());
                }
                if (this.f28083b.f28105r && bundle != null && TextUtils.isEmpty(bundle.getString(this.f28083b.f28107t))) {
                    if (TextUtils.isEmpty(this.f28083b.f28111x)) {
                        this.f28083b.f28111x = zzt.zzp().zzd(this.f28083b.f28090c, this.f28083b.f28110w.f43036b);
                    }
                    bundle.putString(this.f28083b.f28107t, this.f28083b.f28111x);
                }
                this.f28082a.mo34122I1(zzah.zza, zzah.zzb, bundle);
                zzv.m28891O6(this.f28083b, "sgs", "rid", optString);
            } catch (JSONException e3) {
                co0.zzj("Failed to create JSON object from the request string.");
                tm0 tm0 = this.f28082a;
                String obj2 = e3.toString();
                StringBuilder sb = new StringBuilder(obj2.length() + 33);
                sb.append("Internal error for request JSON: ");
                sb.append(obj2);
                tm0.mo34123a(sb.toString());
                zzv.m28891O6(this.f28083b, "sgf", "sgf_reason", "request_invalid");
            }
        }
    }
}
