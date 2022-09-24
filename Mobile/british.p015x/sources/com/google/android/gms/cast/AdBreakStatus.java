package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p244q4.C10920a;
import p244q4.C10922b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class AdBreakStatus extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdBreakStatus> CREATOR = new C7179r();

    /* renamed from: g */
    private static final C10922b f28321g = new C10922b("AdBreakStatus");

    /* renamed from: b */
    private final long f28322b;

    /* renamed from: c */
    private final long f28323c;

    /* renamed from: d */
    private final String f28324d;

    /* renamed from: e */
    private final String f28325e;

    /* renamed from: f */
    private final long f28326f;

    AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.f28322b = j;
        this.f28323c = j2;
        this.f28324d = str;
        this.f28325e = str2;
        this.f28326f = j3;
    }

    /* renamed from: H0 */
    static AdBreakStatus m29029H0(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long d = C10920a.m49141d((double) jSONObject.getLong("currentBreakTime"));
                long d2 = C10920a.m49141d((double) jSONObject.getLong("currentBreakClipTime"));
                String c = C10920a.m49140c(jSONObject, "breakId");
                String c2 = C10920a.m49140c(jSONObject, "breakClipId");
                long optLong = jSONObject.optLong("whenSkippable", -1);
                return new AdBreakStatus(d, d2, c, c2, optLong != -1 ? C10920a.m49141d((double) optLong) : optLong);
            } catch (JSONException e) {
                f28321g.mo43193d(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public String mo29163C0() {
        return this.f28325e;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29164D0() {
        return this.f28324d;
    }

    /* renamed from: E0 */
    public long mo29165E0() {
        return this.f28323c;
    }

    /* renamed from: F0 */
    public long mo29166F0() {
        return this.f28322b;
    }

    /* renamed from: G0 */
    public long mo29167G0() {
        return this.f28326f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.f28322b == adBreakStatus.f28322b && this.f28323c == adBreakStatus.f28323c && C10920a.m49143f(this.f28324d, adBreakStatus.f28324d) && C10920a.m49143f(this.f28325e, adBreakStatus.f28325e) && this.f28326f == adBreakStatus.f28326f;
    }

    public int hashCode() {
        return C7408m.m30029b(Long.valueOf(this.f28322b), Long.valueOf(this.f28323c), this.f28324d, this.f28325e, Long.valueOf(this.f28326f));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49531q(parcel, 2, mo29166F0());
        C11058b.m49531q(parcel, 3, mo29165E0());
        C11058b.m49537w(parcel, 4, mo29164D0(), false);
        C11058b.m49537w(parcel, 5, mo29163C0(), false);
        C11058b.m49531q(parcel, 6, mo29167G0());
        C11058b.m49516b(parcel, a);
    }
}
