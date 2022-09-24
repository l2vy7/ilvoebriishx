package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C7430t();

    /* renamed from: b */
    public final int f29265b;

    /* renamed from: c */
    public final String f29266c;

    public ClientIdentity(int i, String str) {
        this.f29265b = i;
        this.f29266c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f29265b == this.f29265b && C7408m.m30028a(clientIdentity.f29266c, this.f29266c);
    }

    public final int hashCode() {
        return this.f29265b;
    }

    public final String toString() {
        int i = this.f29265b;
        String str = this.f29266c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29265b);
        C11058b.m49537w(parcel, 2, this.f29266c, false);
        C11058b.m49516b(parcel, a);
    }
}
