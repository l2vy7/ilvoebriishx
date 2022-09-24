package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdBreakClipInfo> CREATOR = new C7090a();

    /* renamed from: o */
    public static final long f28300o = -1;

    /* renamed from: b */
    private final String f28301b;

    /* renamed from: c */
    private final String f28302c;

    /* renamed from: d */
    private final long f28303d;

    /* renamed from: e */
    private final String f28304e;

    /* renamed from: f */
    private final String f28305f;

    /* renamed from: g */
    private final String f28306g;

    /* renamed from: h */
    private String f28307h;

    /* renamed from: i */
    private final String f28308i;

    /* renamed from: j */
    private final String f28309j;

    /* renamed from: k */
    private final long f28310k;

    /* renamed from: l */
    private final String f28311l;

    /* renamed from: m */
    private final VastAdsRequest f28312m;

    /* renamed from: n */
    private JSONObject f28313n;

    AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.f28301b = str;
        this.f28302c = str2;
        this.f28303d = j;
        this.f28304e = str3;
        this.f28305f = str4;
        this.f28306g = str5;
        this.f28307h = str6;
        this.f28308i = str7;
        this.f28309j = str8;
        this.f28310k = j2;
        this.f28311l = str9;
        this.f28312m = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f28313n = new JSONObject(this.f28307h);
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e.getMessage()}));
                this.f28307h = null;
                this.f28313n = new JSONObject();
            }
        } else {
            this.f28313n = new JSONObject();
        }
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public String mo29137C0() {
        return this.f28306g;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29138D0() {
        return this.f28308i;
    }

    @RecentlyNullable
    /* renamed from: E0 */
    public String mo29139E0() {
        return this.f28304e;
    }

    /* renamed from: F0 */
    public long mo29140F0() {
        return this.f28303d;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public String mo29141G0() {
        return this.f28311l;
    }

    @RecentlyNonNull
    /* renamed from: H0 */
    public String mo29142H0() {
        return this.f28301b;
    }

    @RecentlyNullable
    /* renamed from: I0 */
    public String mo29143I0() {
        return this.f28309j;
    }

    @RecentlyNullable
    /* renamed from: J0 */
    public String mo29144J0() {
        return this.f28305f;
    }

    @RecentlyNullable
    /* renamed from: K0 */
    public String mo29145K0() {
        return this.f28302c;
    }

    @RecentlyNullable
    /* renamed from: L0 */
    public VastAdsRequest mo29146L0() {
        return this.f28312m;
    }

    /* renamed from: M0 */
    public long mo29147M0() {
        return this.f28310k;
    }

    @RecentlyNonNull
    /* renamed from: N0 */
    public final JSONObject mo29148N0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f28301b);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, C10920a.m49139b(this.f28303d));
            long j = this.f28310k;
            if (j != -1) {
                jSONObject.put("whenSkippable", C10920a.m49139b(j));
            }
            String str = this.f28308i;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f28305f;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f28302c;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.f28304e;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f28306g;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f28313n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f28309j;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f28311l;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            VastAdsRequest vastAdsRequest = this.f28312m;
            if (vastAdsRequest != null) {
                jSONObject.put("vastAdsRequest", vastAdsRequest.mo29400F0());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return C10920a.m49143f(this.f28301b, adBreakClipInfo.f28301b) && C10920a.m49143f(this.f28302c, adBreakClipInfo.f28302c) && this.f28303d == adBreakClipInfo.f28303d && C10920a.m49143f(this.f28304e, adBreakClipInfo.f28304e) && C10920a.m49143f(this.f28305f, adBreakClipInfo.f28305f) && C10920a.m49143f(this.f28306g, adBreakClipInfo.f28306g) && C10920a.m49143f(this.f28307h, adBreakClipInfo.f28307h) && C10920a.m49143f(this.f28308i, adBreakClipInfo.f28308i) && C10920a.m49143f(this.f28309j, adBreakClipInfo.f28309j) && this.f28310k == adBreakClipInfo.f28310k && C10920a.m49143f(this.f28311l, adBreakClipInfo.f28311l) && C10920a.m49143f(this.f28312m, adBreakClipInfo.f28312m);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28301b, this.f28302c, Long.valueOf(this.f28303d), this.f28304e, this.f28305f, this.f28306g, this.f28307h, this.f28308i, this.f28309j, Long.valueOf(this.f28310k), this.f28311l, this.f28312m);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29142H0(), false);
        C11058b.m49537w(parcel, 3, mo29145K0(), false);
        C11058b.m49531q(parcel, 4, mo29140F0());
        C11058b.m49537w(parcel, 5, mo29139E0(), false);
        C11058b.m49537w(parcel, 6, mo29144J0(), false);
        C11058b.m49537w(parcel, 7, mo29137C0(), false);
        C11058b.m49537w(parcel, 8, this.f28307h, false);
        C11058b.m49537w(parcel, 9, mo29138D0(), false);
        C11058b.m49537w(parcel, 10, mo29143I0(), false);
        C11058b.m49531q(parcel, 11, mo29147M0());
        C11058b.m49537w(parcel, 12, mo29141G0(), false);
        C11058b.m49535u(parcel, 13, mo29146L0(), i, false);
        C11058b.m49516b(parcel, a);
    }
}
