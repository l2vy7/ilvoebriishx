package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import p251s5.C10982m;
import p257v4.C11058b;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C10982m();

    /* renamed from: e */
    public static final Comparator<ActivityTransition> f46067e = new C9701i();

    /* renamed from: b */
    private final List<ActivityTransition> f46068b;

    /* renamed from: c */
    private final String f46069c;

    /* renamed from: d */
    private final List<ClientIdentity> f46070d;

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2) {
        C4604n.m20099l(list, "transitions can't be null");
        C4604n.m20089b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f46067e);
        for (ActivityTransition next : list) {
            C4604n.m20089b(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f46068b = Collections.unmodifiableList(list);
        this.f46069c = str;
        this.f46070d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return C7408m.m30028a(this.f46068b, activityTransitionRequest.f46068b) && C7408m.m30028a(this.f46069c, activityTransitionRequest.f46069c) && C7408m.m30028a(this.f46070d, activityTransitionRequest.f46070d);
        }
    }

    public int hashCode() {
        int hashCode = this.f46068b.hashCode() * 31;
        String str = this.f46069c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f46070d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f46068b);
        String str = this.f46069c;
        String valueOf2 = String.valueOf(this.f46070d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61 + String.valueOf(str).length() + valueOf2.length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 1, this.f46068b, false);
        C11058b.m49537w(parcel, 2, this.f46069c, false);
        C11058b.m49510A(parcel, 3, this.f46070d, false);
        C11058b.m49516b(parcel, a);
    }
}
