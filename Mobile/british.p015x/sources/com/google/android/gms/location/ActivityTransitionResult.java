package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p251s5.C10983n;
import p257v4.C11058b;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C10983n();

    /* renamed from: b */
    private final List<ActivityTransitionEvent> f46071b;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        C4604n.m20099l(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C4604n.m20088a(list.get(i).mo38688D0() >= list.get(i + -1).mo38688D0());
            }
        }
        this.f46071b = Collections.unmodifiableList(list);
    }

    /* renamed from: C0 */
    public List<ActivityTransitionEvent> mo38698C0() {
        return this.f46071b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f46071b.equals(((ActivityTransitionResult) obj).f46071b);
    }

    public int hashCode() {
        return this.f46071b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 1, mo38698C0(), false);
        C11058b.m49516b(parcel, a);
    }
}
