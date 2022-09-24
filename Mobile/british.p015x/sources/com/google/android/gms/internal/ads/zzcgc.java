package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcgc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcgc> CREATOR = new fl0();

    /* renamed from: b */
    public final String f43028b;

    /* renamed from: c */
    public final String f43029c;

    /* renamed from: d */
    public final boolean f43030d;

    /* renamed from: e */
    public final boolean f43031e;

    /* renamed from: f */
    public final List<String> f43032f;

    /* renamed from: g */
    public final boolean f43033g;

    /* renamed from: h */
    public final boolean f43034h;

    /* renamed from: i */
    public final List<String> f43035i;

    public zzcgc(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f43028b = str;
        this.f43029c = str2;
        this.f43030d = z;
        this.f43031e = z2;
        this.f43032f = list;
        this.f43033g = z3;
        this.f43034h = z4;
        this.f43035i = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: C0 */
    public static zzcgc m40655C0(JSONObject jSONObject) throws JSONException {
        return new zzcgc(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzby.zzc(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzby.zzc(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f43028b, false);
        C11058b.m49537w(parcel, 3, this.f43029c, false);
        C11058b.m49517c(parcel, 4, this.f43030d);
        C11058b.m49517c(parcel, 5, this.f43031e);
        C11058b.m49539y(parcel, 6, this.f43032f, false);
        C11058b.m49517c(parcel, 7, this.f43033g);
        C11058b.m49517c(parcel, 8, this.f43034h);
        C11058b.m49539y(parcel, 9, this.f43035i, false);
        C11058b.m49516b(parcel, a);
    }
}
