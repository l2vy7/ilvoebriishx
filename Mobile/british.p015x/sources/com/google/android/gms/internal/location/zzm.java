package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;
import p257v4.C11058b;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C9059k();

    /* renamed from: e */
    static final List<ClientIdentity> f44871e = Collections.emptyList();

    /* renamed from: f */
    static final zzj f44872f = new zzj();

    /* renamed from: b */
    private zzj f44873b;

    /* renamed from: c */
    private List<ClientIdentity> f44874c;

    /* renamed from: d */
    private String f44875d;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f44873b = zzj;
        this.f44874c = list;
        this.f44875d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C7408m.m30028a(this.f44873b, zzm.f44873b) && C7408m.m30028a(this.f44874c, zzm.f44874c) && C7408m.m30028a(this.f44875d, zzm.f44875d);
    }

    public final int hashCode() {
        return this.f44873b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, this.f44873b, i, false);
        C11058b.m49510A(parcel, 2, this.f44874c, false);
        C11058b.m49537w(parcel, 3, this.f44875d, false);
        C11058b.m49516b(parcel, a);
    }
}
