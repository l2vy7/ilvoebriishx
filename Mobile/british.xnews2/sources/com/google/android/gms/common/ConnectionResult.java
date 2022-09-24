package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C7361g();

    /* renamed from: f */
    public static final ConnectionResult f28862f = new ConnectionResult(0);

    /* renamed from: b */
    final int f28863b;

    /* renamed from: c */
    private final int f28864c;

    /* renamed from: d */
    private final PendingIntent f28865d;

    /* renamed from: e */
    private final String f28866e;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f28863b = i;
        this.f28864c = i2;
        this.f28865d = pendingIntent;
        this.f28866e = str;
    }

    /* renamed from: H0 */
    static String m29473H0(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: C0 */
    public int mo29682C0() {
        return this.f28864c;
    }

    /* renamed from: D0 */
    public String mo29683D0() {
        return this.f28866e;
    }

    /* renamed from: E0 */
    public PendingIntent mo29684E0() {
        return this.f28865d;
    }

    /* renamed from: F0 */
    public boolean mo29685F0() {
        return (this.f28864c == 0 || this.f28865d == null) ? false : true;
    }

    /* renamed from: G0 */
    public boolean mo29686G0() {
        return this.f28864c == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f28864c == connectionResult.f28864c && C7408m.m30028a(this.f28865d, connectionResult.f28865d) && C7408m.m30028a(this.f28866e, connectionResult.f28866e);
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f28864c), this.f28865d, this.f28866e);
    }

    public String toString() {
        C7408m.C7409a c = C7408m.m30030c(this);
        c.mo30140a("statusCode", m29473H0(this.f28864c));
        c.mo30140a("resolution", this.f28865d);
        c.mo30140a("message", this.f28866e);
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28863b);
        C11058b.m49527m(parcel, 2, mo29682C0());
        C11058b.m49535u(parcel, 3, mo29684E0(), i, false);
        C11058b.m49537w(parcel, 4, mo29683D0(), false);
        C11058b.m49516b(parcel, a);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
