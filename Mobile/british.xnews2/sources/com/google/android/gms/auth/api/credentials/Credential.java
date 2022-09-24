package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
import p256v4.C11058b;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C7056a();
    @Nonnull

    /* renamed from: b */
    private final String f19913b;

    /* renamed from: c */
    private final String f19914c;

    /* renamed from: d */
    private final Uri f19915d;
    @Nonnull

    /* renamed from: e */
    private final List<IdToken> f19916e;

    /* renamed from: f */
    private final String f19917f;

    /* renamed from: g */
    private final String f19918g;

    /* renamed from: h */
    private final String f19919h;

    /* renamed from: i */
    private final String f19920i;

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> list2;
        String trim = ((String) C4604n.m20099l(str, "credential identifier cannot be null")).trim();
        C4604n.m20095h(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f19914c = str2;
                this.f19915d = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f19916e = list2;
                this.f19913b = trim;
                this.f19917f = str3;
                this.f19918g = str4;
                this.f19919h = str5;
                this.f19920i = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    /* renamed from: C0 */
    public String mo17803C0() {
        return this.f19918g;
    }

    /* renamed from: D0 */
    public String mo17804D0() {
        return this.f19920i;
    }

    /* renamed from: E0 */
    public String mo17805E0() {
        return this.f19919h;
    }

    @Nonnull
    /* renamed from: F0 */
    public String mo17806F0() {
        return this.f19913b;
    }

    @Nonnull
    /* renamed from: G0 */
    public List<IdToken> mo17807G0() {
        return this.f19916e;
    }

    /* renamed from: H0 */
    public String mo17808H0() {
        return this.f19914c;
    }

    /* renamed from: I0 */
    public String mo17809I0() {
        return this.f19917f;
    }

    /* renamed from: J0 */
    public Uri mo17810J0() {
        return this.f19915d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f19913b, credential.f19913b) && TextUtils.equals(this.f19914c, credential.f19914c) && C7408m.m30028a(this.f19915d, credential.f19915d) && TextUtils.equals(this.f19917f, credential.f19917f) && TextUtils.equals(this.f19918g, credential.f19918g);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f19913b, this.f19914c, this.f19915d, this.f19917f, this.f19918g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, mo17806F0(), false);
        C11058b.m49537w(parcel, 2, mo17808H0(), false);
        C11058b.m49535u(parcel, 3, mo17810J0(), i, false);
        C11058b.m49510A(parcel, 4, mo17807G0(), false);
        C11058b.m49537w(parcel, 5, mo17809I0(), false);
        C11058b.m49537w(parcel, 6, mo17803C0(), false);
        C11058b.m49537w(parcel, 9, mo17805E0(), false);
        C11058b.m49537w(parcel, 10, mo17804D0(), false);
        C11058b.m49516b(parcel, a);
    }
}
