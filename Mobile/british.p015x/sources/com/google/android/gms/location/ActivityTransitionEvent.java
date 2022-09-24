package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p251s5.C10981l;
import p257v4.C11058b;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C10981l();

    /* renamed from: b */
    private final int f46064b;

    /* renamed from: c */
    private final int f46065c;

    /* renamed from: d */
    private final long f46066d;

    public ActivityTransitionEvent(int i, int i2, long j) {
        DetectedActivity.m44934E0(i);
        ActivityTransition.m44927E0(i2);
        this.f46064b = i;
        this.f46065c = i2;
        this.f46066d = j;
    }

    /* renamed from: C0 */
    public int mo38687C0() {
        return this.f46064b;
    }

    /* renamed from: D0 */
    public long mo38688D0() {
        return this.f46066d;
    }

    /* renamed from: E0 */
    public int mo38689E0() {
        return this.f46065c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f46064b == activityTransitionEvent.f46064b && this.f46065c == activityTransitionEvent.f46065c && this.f46066d == activityTransitionEvent.f46066d;
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f46064b), Integer.valueOf(this.f46065c), Long.valueOf(this.f46066d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f46064b;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f46065c;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f46066d;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, mo38687C0());
        C11058b.m49527m(parcel, 2, mo38689E0());
        C11058b.m49531q(parcel, 3, mo38688D0());
        C11058b.m49516b(parcel, a);
    }
}
