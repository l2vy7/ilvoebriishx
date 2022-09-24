package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C9700h();

    /* renamed from: b */
    private final int f46062b;

    /* renamed from: c */
    private final int f46063c;

    ActivityTransition(int i, int i2) {
        this.f46062b = i;
        this.f46063c = i2;
    }

    /* renamed from: E0 */
    public static void m44927E0(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C4604n.m20089b(z, sb.toString());
    }

    /* renamed from: C0 */
    public int mo38681C0() {
        return this.f46062b;
    }

    /* renamed from: D0 */
    public int mo38682D0() {
        return this.f46063c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f46062b == activityTransition.f46062b && this.f46063c == activityTransition.f46063c;
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f46062b), Integer.valueOf(this.f46063c));
    }

    public String toString() {
        int i = this.f46062b;
        int i2 = this.f46063c;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, mo38681C0());
        C11058b.m49527m(parcel, 2, mo38682D0());
        C11058b.m49516b(parcel, a);
    }
}
