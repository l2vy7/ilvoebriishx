package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p256v4.C11058b;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new C9057i();

    /* renamed from: j */
    static final List<ClientIdentity> f44847j = Collections.emptyList();

    /* renamed from: b */
    private LocationRequest f44848b;

    /* renamed from: c */
    private List<ClientIdentity> f44849c;

    /* renamed from: d */
    private String f44850d;

    /* renamed from: e */
    private boolean f44851e;

    /* renamed from: f */
    private boolean f44852f;

    /* renamed from: g */
    private boolean f44853g;

    /* renamed from: h */
    private String f44854h;

    /* renamed from: i */
    private boolean f44855i = true;

    zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f44848b = locationRequest;
        this.f44849c = list;
        this.f44850d = str;
        this.f44851e = z;
        this.f44852f = z2;
        this.f44853g = z3;
        this.f44854h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C7408m.m30028a(this.f44848b, zzbd.f44848b) && C7408m.m30028a(this.f44849c, zzbd.f44849c) && C7408m.m30028a(this.f44850d, zzbd.f44850d) && this.f44851e == zzbd.f44851e && this.f44852f == zzbd.f44852f && this.f44853g == zzbd.f44853g && C7408m.m30028a(this.f44854h, zzbd.f44854h);
    }

    public final int hashCode() {
        return this.f44848b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44848b);
        if (this.f44850d != null) {
            sb.append(" tag=");
            sb.append(this.f44850d);
        }
        if (this.f44854h != null) {
            sb.append(" moduleId=");
            sb.append(this.f44854h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f44851e);
        sb.append(" clients=");
        sb.append(this.f44849c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f44852f);
        if (this.f44853g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, this.f44848b, i, false);
        C11058b.m49510A(parcel, 5, this.f44849c, false);
        C11058b.m49537w(parcel, 6, this.f44850d, false);
        C11058b.m49517c(parcel, 7, this.f44851e);
        C11058b.m49517c(parcel, 8, this.f44852f);
        C11058b.m49517c(parcel, 9, this.f44853g);
        C11058b.m49537w(parcel, 10, this.f44854h, false);
        C11058b.m49516b(parcel, a);
    }
}
