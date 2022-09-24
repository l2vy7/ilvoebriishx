package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C7368e();

    /* renamed from: b */
    final int f29250b;

    /* renamed from: c */
    private final Uri f29251c;

    /* renamed from: d */
    private final int f29252d;

    /* renamed from: e */
    private final int f29253e;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f29250b = i;
        this.f29251c = uri;
        this.f29252d = i2;
        this.f29253e = i3;
    }

    /* renamed from: C0 */
    public int mo29997C0() {
        return this.f29253e;
    }

    /* renamed from: D0 */
    public Uri mo29998D0() {
        return this.f29251c;
    }

    /* renamed from: E0 */
    public int mo29999E0() {
        return this.f29252d;
    }

    /* renamed from: F0 */
    public JSONObject mo30000F0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f29251c.toString());
            jSONObject.put("width", this.f29252d);
            jSONObject.put("height", this.f29253e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C7408m.m30028a(this.f29251c, webImage.f29251c) && this.f29252d == webImage.f29252d && this.f29253e == webImage.f29253e;
        }
    }

    public int hashCode() {
        return C7408m.m30029b(this.f29251c, Integer.valueOf(this.f29252d), Integer.valueOf(this.f29253e));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f29252d), Integer.valueOf(this.f29253e), this.f29251c.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29250b);
        C11058b.m49535u(parcel, 2, mo29998D0(), i, false);
        C11058b.m49527m(parcel, 3, mo29999E0());
        C11058b.m49527m(parcel, 4, mo29997C0());
        C11058b.m49516b(parcel, a);
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0012 }
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0012 }
        L_0x0012:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }
}
