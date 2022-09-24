package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p244q4.C10920a;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class LaunchOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new C7166g();

    /* renamed from: b */
    private boolean f28371b;

    /* renamed from: c */
    private String f28372c;

    /* renamed from: d */
    private boolean f28373d;

    /* renamed from: e */
    private CredentialsData f28374e;

    public LaunchOptions() {
        this(false, C10920a.m49148k(Locale.getDefault()), false, (CredentialsData) null);
    }

    /* renamed from: C0 */
    public boolean mo29205C0() {
        return this.f28373d;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public CredentialsData mo29206D0() {
        return this.f28374e;
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public String mo29207E0() {
        return this.f28372c;
    }

    /* renamed from: F0 */
    public boolean mo29208F0() {
        return this.f28371b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.f28371b == launchOptions.f28371b && C10920a.m49143f(this.f28372c, launchOptions.f28372c) && this.f28373d == launchOptions.f28373d && C10920a.m49143f(this.f28374e, launchOptions.f28374e);
    }

    public int hashCode() {
        return C7408m.m30029b(Boolean.valueOf(this.f28371b), this.f28372c, Boolean.valueOf(this.f28373d), this.f28374e);
    }

    @RecentlyNonNull
    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", new Object[]{Boolean.valueOf(this.f28371b), this.f28372c, Boolean.valueOf(this.f28373d)});
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 2, mo29208F0());
        C11058b.m49537w(parcel, 3, mo29207E0(), false);
        C11058b.m49517c(parcel, 4, mo29205C0());
        C11058b.m49535u(parcel, 5, mo29206D0(), i, false);
        C11058b.m49516b(parcel, a);
    }

    LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.f28371b = z;
        this.f28372c = str;
        this.f28373d = z2;
        this.f28374e = credentialsData;
    }
}
