package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class ApplicationMetadata extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new C7183v();

    /* renamed from: b */
    String f28327b;

    /* renamed from: c */
    String f28328c;

    /* renamed from: d */
    List<String> f28329d;

    /* renamed from: e */
    String f28330e;

    /* renamed from: f */
    Uri f28331f;

    /* renamed from: g */
    String f28332g;

    /* renamed from: h */
    private String f28333h;

    private ApplicationMetadata() {
        this.f28329d = new ArrayList();
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public String mo29171C0() {
        return this.f28327b;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public List<WebImage> mo29172D0() {
        return null;
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public String mo29173E0() {
        return this.f28328c;
    }

    @RecentlyNonNull
    /* renamed from: F0 */
    public String mo29174F0() {
        return this.f28330e;
    }

    @RecentlyNonNull
    /* renamed from: G0 */
    public List<String> mo29175G0() {
        return Collections.unmodifiableList(this.f28329d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return C10920a.m49143f(this.f28327b, applicationMetadata.f28327b) && C10920a.m49143f(this.f28328c, applicationMetadata.f28328c) && C10920a.m49143f(this.f28329d, applicationMetadata.f28329d) && C10920a.m49143f(this.f28330e, applicationMetadata.f28330e) && C10920a.m49143f(this.f28331f, applicationMetadata.f28331f) && C10920a.m49143f(this.f28332g, applicationMetadata.f28332g) && C10920a.m49143f(this.f28333h, applicationMetadata.f28333h);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28327b, this.f28328c, this.f28329d, this.f28330e, this.f28331f, this.f28332g);
    }

    @RecentlyNonNull
    public String toString() {
        String str = this.f28327b;
        String str2 = this.f28328c;
        List<String> list = this.f28329d;
        int size = list == null ? 0 : list.size();
        String str3 = this.f28330e;
        String valueOf = String.valueOf(this.f28331f);
        String str4 = this.f28332g;
        String str5 = this.f28333h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 118 + length2 + length3 + valueOf.length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29171C0(), false);
        C11058b.m49537w(parcel, 3, mo29173E0(), false);
        C11058b.m49510A(parcel, 4, mo29172D0(), false);
        C11058b.m49539y(parcel, 5, mo29175G0(), false);
        C11058b.m49537w(parcel, 6, mo29174F0(), false);
        C11058b.m49535u(parcel, 7, this.f28331f, i, false);
        C11058b.m49537w(parcel, 8, this.f28332g, false);
        C11058b.m49537w(parcel, 9, this.f28333h, false);
        C11058b.m49516b(parcel, a);
    }

    ApplicationMetadata(String str, String str2, List<WebImage> list, List<String> list2, String str3, Uri uri, String str4, String str5) {
        this.f28327b = str;
        this.f28328c = str2;
        this.f28329d = list2;
        this.f28330e = str3;
        this.f28331f = uri;
        this.f28332g = str4;
        this.f28333h = str5;
    }
}
