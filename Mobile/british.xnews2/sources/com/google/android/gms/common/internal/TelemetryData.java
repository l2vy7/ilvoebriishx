package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C7433u();

    /* renamed from: b */
    private final int f20029b;
    @Nullable

    /* renamed from: c */
    private List<MethodInvocation> f20030c;

    public TelemetryData(int i, @Nullable List<MethodInvocation> list) {
        this.f20029b = i;
        this.f20030c = list;
    }

    /* renamed from: C0 */
    public final int mo17973C0() {
        return this.f20029b;
    }

    /* renamed from: D0 */
    public final List<MethodInvocation> mo17974D0() {
        return this.f20030c;
    }

    /* renamed from: E0 */
    public final void mo17975E0(MethodInvocation methodInvocation) {
        if (this.f20030c == null) {
            this.f20030c = new ArrayList();
        }
        this.f20030c.add(methodInvocation);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f20029b);
        C11058b.m49510A(parcel, 2, this.f20030c, false);
        C11058b.m49516b(parcel, a);
    }
}
