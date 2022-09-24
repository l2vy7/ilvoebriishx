package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C7663ey;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.zzbfm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ResponseInfo {

    /* renamed from: a */
    private final C7663ey f19862a;

    /* renamed from: b */
    private final List<AdapterResponseInfo> f19863b = new ArrayList();

    private ResponseInfo(C7663ey eyVar) {
        this.f19862a = eyVar;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37082e6)).booleanValue() && eyVar != null) {
            try {
                List<zzbfm> zzg = eyVar.zzg();
                if (zzg != null) {
                    for (zzbfm zza : zzg) {
                        AdapterResponseInfo zza2 = AdapterResponseInfo.zza(zza);
                        if (zza2 != null) {
                            this.f19863b.add(zza2);
                        }
                    }
                }
            } catch (RemoteException e) {
                co0.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    public static ResponseInfo zza(C7663ey eyVar) {
        if (eyVar != null) {
            return new ResponseInfo(eyVar);
        }
        return null;
    }

    public static ResponseInfo zzb(C7663ey eyVar) {
        return new ResponseInfo(eyVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.f19863b;
    }

    @RecentlyNullable
    public String getMediationAdapterClassName() {
        try {
            C7663ey eyVar = this.f19862a;
            if (eyVar != null) {
                return eyVar.zze();
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @RecentlyNullable
    public String getResponseId() {
        try {
            C7663ey eyVar = this.f19862a;
            if (eyVar != null) {
                return eyVar.zzf();
            }
            return null;
        } catch (RemoteException e) {
            co0.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return zzc().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @RecentlyNonNull
    public final JSONObject zzc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo zzb : this.f19863b) {
            jSONArray.put(zzb.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }
}
