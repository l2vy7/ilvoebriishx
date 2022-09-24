package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C7351u();

    /* renamed from: b */
    final int f28880b;

    /* renamed from: c */
    private final String f28881c;

    Scope(int i, String str) {
        C4604n.m20095h(str, "scopeUri must not be null or empty");
        this.f28880b = i;
        this.f28881c = str;
    }

    /* renamed from: C0 */
    public String mo29726C0() {
        return this.f28881c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f28881c.equals(((Scope) obj).f28881c);
    }

    public int hashCode() {
        return this.f28881c.hashCode();
    }

    public String toString() {
        return this.f28881c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28880b);
        C11058b.m49537w(parcel, 2, mo29726C0(), false);
        C11058b.m49516b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
