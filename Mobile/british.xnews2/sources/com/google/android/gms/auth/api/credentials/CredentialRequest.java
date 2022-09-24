package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C7059d();

    /* renamed from: b */
    private final int f28198b;

    /* renamed from: c */
    private final boolean f28199c;

    /* renamed from: d */
    private final String[] f28200d;

    /* renamed from: e */
    private final CredentialPickerConfig f28201e;

    /* renamed from: f */
    private final CredentialPickerConfig f28202f;

    /* renamed from: g */
    private final boolean f28203g;

    /* renamed from: h */
    private final String f28204h;

    /* renamed from: i */
    private final String f28205i;

    /* renamed from: j */
    private final boolean f28206j;

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f28198b = i;
        this.f28199c = z;
        this.f28200d = (String[]) C4604n.m20098k(strArr);
        this.f28201e = credentialPickerConfig == null ? new CredentialPickerConfig.C7055a().mo29047a() : credentialPickerConfig;
        this.f28202f = credentialPickerConfig2 == null ? new CredentialPickerConfig.C7055a().mo29047a() : credentialPickerConfig2;
        if (i < 3) {
            this.f28203g = true;
            this.f28204h = null;
            this.f28205i = null;
        } else {
            this.f28203g = z2;
            this.f28204h = str;
            this.f28205i = str2;
        }
        this.f28206j = z3;
    }

    /* renamed from: C0 */
    public final String[] mo29048C0() {
        return this.f28200d;
    }

    /* renamed from: D0 */
    public final CredentialPickerConfig mo29049D0() {
        return this.f28202f;
    }

    /* renamed from: E0 */
    public final CredentialPickerConfig mo29050E0() {
        return this.f28201e;
    }

    /* renamed from: F0 */
    public final String mo29051F0() {
        return this.f28205i;
    }

    /* renamed from: G0 */
    public final String mo29052G0() {
        return this.f28204h;
    }

    /* renamed from: H0 */
    public final boolean mo29053H0() {
        return this.f28203g;
    }

    /* renamed from: I0 */
    public final boolean mo29054I0() {
        return this.f28199c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, mo29054I0());
        C11058b.m49538x(parcel, 2, mo29048C0(), false);
        C11058b.m49535u(parcel, 3, mo29050E0(), i, false);
        C11058b.m49535u(parcel, 4, mo29049D0(), i, false);
        C11058b.m49517c(parcel, 5, mo29053H0());
        C11058b.m49537w(parcel, 6, mo29052G0(), false);
        C11058b.m49537w(parcel, 7, mo29051F0(), false);
        C11058b.m49527m(parcel, 1000, this.f28198b);
        C11058b.m49517c(parcel, 8, this.f28206j);
        C11058b.m49516b(parcel, a);
    }
}
