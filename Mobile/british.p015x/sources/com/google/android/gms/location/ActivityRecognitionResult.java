package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p251s5.C10980k;
import p257v4.C11058b;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C10980k();

    /* renamed from: b */
    private List<DetectedActivity> f46057b;

    /* renamed from: c */
    private long f46058c;

    /* renamed from: d */
    private long f46059d;

    /* renamed from: e */
    private int f46060e;

    /* renamed from: f */
    private Bundle f46061f;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        C4604n.m20089b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C4604n.m20089b((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f46057b = list;
        this.f46058c = j;
        this.f46059d = j2;
        this.f46060e = i;
        this.f46061f = bundle;
    }

    /* renamed from: C0 */
    private static boolean m44926C0(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m44926C0(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f46058c == activityRecognitionResult.f46058c && this.f46059d == activityRecognitionResult.f46059d && this.f46060e == activityRecognitionResult.f46060e && C7408m.m30028a(this.f46057b, activityRecognitionResult.f46057b) && m44926C0(this.f46061f, activityRecognitionResult.f46061f);
        }
    }

    public int hashCode() {
        return C7408m.m30029b(Long.valueOf(this.f46058c), Long.valueOf(this.f46059d), Integer.valueOf(this.f46060e), this.f46057b, this.f46061f);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f46057b);
        long j = this.f46058c;
        long j2 = this.f46059d;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 1, this.f46057b, false);
        C11058b.m49531q(parcel, 2, this.f46058c);
        C11058b.m49531q(parcel, 3, this.f46059d);
        C11058b.m49527m(parcel, 4, this.f46060e);
        C11058b.m49519e(parcel, 5, this.f46061f, false);
        C11058b.m49516b(parcel, a);
    }
}
