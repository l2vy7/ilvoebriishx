package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class Status extends AbstractSafeParcelable implements C7341k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C7352v();

    /* renamed from: g */
    public static final Status f28882g = new Status(0);

    /* renamed from: h */
    public static final Status f28883h = new Status(14);

    /* renamed from: i */
    public static final Status f28884i = new Status(8);

    /* renamed from: j */
    public static final Status f28885j = new Status(15);

    /* renamed from: k */
    public static final Status f28886k = new Status(16);

    /* renamed from: l */
    public static final Status f28887l = new Status(18);

    /* renamed from: m */
    public static final Status f28888m = new Status(17);

    /* renamed from: b */
    final int f28889b;

    /* renamed from: c */
    private final int f28890c;

    /* renamed from: d */
    private final String f28891d;

    /* renamed from: e */
    private final PendingIntent f28892e;

    /* renamed from: f */
    private final ConnectionResult f28893f;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f28889b = i;
        this.f28890c = i2;
        this.f28891d = str;
        this.f28892e = pendingIntent;
        this.f28893f = connectionResult;
    }

    /* renamed from: C0 */
    public ConnectionResult mo29731C0() {
        return this.f28893f;
    }

    /* renamed from: D0 */
    public int mo29732D0() {
        return this.f28890c;
    }

    /* renamed from: E0 */
    public String mo29733E0() {
        return this.f28891d;
    }

    /* renamed from: F0 */
    public boolean mo29734F0() {
        return this.f28892e != null;
    }

    /* renamed from: G0 */
    public boolean mo29735G0() {
        return this.f28890c <= 0;
    }

    /* renamed from: H0 */
    public final String mo29736H0() {
        String str = this.f28891d;
        return str != null ? str : C7205d.m29520a(this.f28890c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f28889b != status.f28889b || this.f28890c != status.f28890c || !C7408m.m30028a(this.f28891d, status.f28891d) || !C7408m.m30028a(this.f28892e, status.f28892e) || !C7408m.m30028a(this.f28893f, status.f28893f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f28889b), Integer.valueOf(this.f28890c), this.f28891d, this.f28892e, this.f28893f);
    }

    /* renamed from: p0 */
    public Status mo29527p0() {
        return this;
    }

    public String toString() {
        C7408m.C7409a c = C7408m.m30030c(this);
        c.mo30140a("statusCode", mo29736H0());
        c.mo30140a("resolution", this.f28892e);
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, mo29732D0());
        C11058b.m49537w(parcel, 2, mo29733E0(), false);
        C11058b.m49535u(parcel, 3, this.f28892e, i, false);
        C11058b.m49535u(parcel, 4, mo29731C0(), i, false);
        C11058b.m49527m(parcel, 1000, this.f28889b);
        C11058b.m49516b(parcel, a);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.mo29684E0(), connectionResult);
    }
}
