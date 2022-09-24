package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C7060e();

    /* renamed from: b */
    private final int f28207b;

    /* renamed from: c */
    private final CredentialPickerConfig f28208c;

    /* renamed from: d */
    private final boolean f28209d;

    /* renamed from: e */
    private final boolean f28210e;

    /* renamed from: f */
    private final String[] f28211f;

    /* renamed from: g */
    private final boolean f28212g;

    /* renamed from: h */
    private final String f28213h;

    /* renamed from: i */
    private final String f28214i;

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f28207b = i;
        this.f28208c = (CredentialPickerConfig) C4604n.m20098k(credentialPickerConfig);
        this.f28209d = z;
        this.f28210e = z2;
        this.f28211f = (String[]) C4604n.m20098k(strArr);
        if (i < 2) {
            this.f28212g = true;
            this.f28213h = null;
            this.f28214i = null;
            return;
        }
        this.f28212g = z3;
        this.f28213h = str;
        this.f28214i = str2;
    }

    /* renamed from: C0 */
    public final String[] mo29056C0() {
        return this.f28211f;
    }

    /* renamed from: D0 */
    public final CredentialPickerConfig mo29057D0() {
        return this.f28208c;
    }

    /* renamed from: E0 */
    public final String mo29058E0() {
        return this.f28214i;
    }

    /* renamed from: F0 */
    public final String mo29059F0() {
        return this.f28213h;
    }

    /* renamed from: G0 */
    public final boolean mo29060G0() {
        return this.f28209d;
    }

    /* renamed from: H0 */
    public final boolean mo29061H0() {
        return this.f28212g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, mo29057D0(), i, false);
        C11058b.m49517c(parcel, 2, mo29060G0());
        C11058b.m49517c(parcel, 3, this.f28210e);
        C11058b.m49538x(parcel, 4, mo29056C0(), false);
        C11058b.m49517c(parcel, 5, mo29061H0());
        C11058b.m49537w(parcel, 6, mo29059F0(), false);
        C11058b.m49537w(parcel, 7, mo29058E0(), false);
        C11058b.m49527m(parcel, 1000, this.f28207b);
        C11058b.m49516b(parcel, a);
    }
}
