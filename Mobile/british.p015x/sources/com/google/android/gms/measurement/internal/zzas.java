package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new C9881q();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f46936b;

    zzas(Bundle bundle) {
        this.f46936b = bundle;
    }

    /* renamed from: D0 */
    public final Bundle mo39355D0() {
        return new Bundle(this.f46936b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public final Double mo39356E0(String str) {
        return Double.valueOf(this.f46936b.getDouble("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public final Long mo39357F0(String str) {
        return Long.valueOf(this.f46936b.getLong("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public final Object mo39358G0(String str) {
        return this.f46936b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public final String mo39359H0(String str) {
        return this.f46936b.getString(str);
    }

    public final Iterator iterator() {
        return new C9870p(this);
    }

    public final String toString() {
        return this.f46936b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49519e(parcel, 2, mo39355D0(), false);
        C11058b.m49516b(parcel, a);
    }

    public final int zza() {
        return this.f46936b.size();
    }
}
