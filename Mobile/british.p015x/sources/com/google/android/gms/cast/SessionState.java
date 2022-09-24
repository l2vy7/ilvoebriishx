package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
import p006a5.C6489l;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class SessionState extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SessionState> CREATOR = new C7184w();

    /* renamed from: b */
    private final MediaLoadRequestData f28514b;

    /* renamed from: c */
    String f28515c;

    /* renamed from: d */
    private final JSONObject f28516d;

    SessionState(MediaLoadRequestData mediaLoadRequestData, JSONObject jSONObject) {
        this.f28514b = mediaLoadRequestData;
        this.f28516d = jSONObject;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public MediaLoadRequestData mo29378C0() {
        return this.f28514b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (!C6489l.m28274a(this.f28516d, sessionState.f28516d)) {
            return false;
        }
        return C7408m.m30028a(this.f28514b, sessionState.f28514b);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28514b, String.valueOf(this.f28516d));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28516d;
        this.f28515c = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, mo29378C0(), i, false);
        C11058b.m49537w(parcel, 3, this.f28515c, false);
        C11058b.m49516b(parcel, a);
    }
}
