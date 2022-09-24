package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new C7091a0();

    /* renamed from: b */
    private String f28334b;

    /* renamed from: c */
    String f28335c;

    /* renamed from: d */
    private InetAddress f28336d;

    /* renamed from: e */
    private String f28337e;

    /* renamed from: f */
    private String f28338f;

    /* renamed from: g */
    private String f28339g;

    /* renamed from: h */
    private int f28340h;

    /* renamed from: i */
    private List<WebImage> f28341i;

    /* renamed from: j */
    private int f28342j;

    /* renamed from: k */
    private int f28343k;

    /* renamed from: l */
    private String f28344l;

    /* renamed from: m */
    private String f28345m;

    /* renamed from: n */
    private int f28346n;

    /* renamed from: o */
    private final String f28347o;

    /* renamed from: p */
    private byte[] f28348p;

    /* renamed from: q */
    private final String f28349q;

    /* renamed from: r */
    private final boolean f28350r;

    CastDevice(String str, String str2, String str3, String str4, String str5, int i, List<WebImage> list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z) {
        List<WebImage> list2;
        this.f28334b = m29041N0(str);
        String N0 = m29041N0(str2);
        this.f28335c = N0;
        if (!TextUtils.isEmpty(N0)) {
            try {
                this.f28336d = InetAddress.getByName(this.f28335c);
            } catch (UnknownHostException e) {
                String str10 = this.f28335c;
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
                Log.i("CastDevice", sb.toString());
            }
        }
        this.f28337e = m29041N0(str3);
        this.f28338f = m29041N0(str4);
        this.f28339g = m29041N0(str5);
        this.f28340h = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList<>();
        }
        this.f28341i = list2;
        this.f28342j = i2;
        this.f28343k = i3;
        this.f28344l = m29041N0(str6);
        this.f28345m = str7;
        this.f28346n = i4;
        this.f28347o = str8;
        this.f28348p = bArr;
        this.f28349q = str9;
        this.f28350r = z;
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public static CastDevice m29040F0(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* renamed from: N0 */
    private static String m29041N0(String str) {
        return str == null ? "" : str;
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public String mo29180C0() {
        return this.f28334b.startsWith("__cast_nearby__") ? this.f28334b.substring(16) : this.f28334b;
    }

    @RecentlyNonNull
    /* renamed from: D0 */
    public String mo29181D0() {
        return this.f28339g;
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public String mo29182E0() {
        return this.f28337e;
    }

    @RecentlyNonNull
    /* renamed from: G0 */
    public List<WebImage> mo29183G0() {
        return Collections.unmodifiableList(this.f28341i);
    }

    @RecentlyNonNull
    /* renamed from: H0 */
    public String mo29184H0() {
        return this.f28338f;
    }

    /* renamed from: I0 */
    public int mo29185I0() {
        return this.f28340h;
    }

    /* renamed from: J0 */
    public boolean mo29186J0(int i) {
        return (this.f28342j & i) == i;
    }

    /* renamed from: K0 */
    public void mo29187K0(@RecentlyNonNull Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    @RecentlyNonNull
    /* renamed from: L0 */
    public final String mo29188L0() {
        return this.f28345m;
    }

    /* renamed from: M0 */
    public final int mo29189M0() {
        return this.f28342j;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f28334b;
        return str == null ? castDevice.f28334b == null : C10920a.m49143f(str, castDevice.f28334b) && C10920a.m49143f(this.f28336d, castDevice.f28336d) && C10920a.m49143f(this.f28338f, castDevice.f28338f) && C10920a.m49143f(this.f28337e, castDevice.f28337e) && C10920a.m49143f(this.f28339g, castDevice.f28339g) && this.f28340h == castDevice.f28340h && C10920a.m49143f(this.f28341i, castDevice.f28341i) && this.f28342j == castDevice.f28342j && this.f28343k == castDevice.f28343k && C10920a.m49143f(this.f28344l, castDevice.f28344l) && C10920a.m49143f(Integer.valueOf(this.f28346n), Integer.valueOf(castDevice.f28346n)) && C10920a.m49143f(this.f28347o, castDevice.f28347o) && C10920a.m49143f(this.f28345m, castDevice.f28345m) && C10920a.m49143f(this.f28339g, castDevice.mo29181D0()) && this.f28340h == castDevice.mo29185I0() && (((bArr = this.f28348p) == null && castDevice.f28348p == null) || Arrays.equals(bArr, castDevice.f28348p)) && C10920a.m49143f(this.f28349q, castDevice.f28349q) && this.f28350r == castDevice.f28350r;
    }

    public int hashCode() {
        String str = this.f28334b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.f28337e, this.f28334b});
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f28334b, false);
        C11058b.m49537w(parcel, 3, this.f28335c, false);
        C11058b.m49537w(parcel, 4, mo29182E0(), false);
        C11058b.m49537w(parcel, 5, mo29184H0(), false);
        C11058b.m49537w(parcel, 6, mo29181D0(), false);
        C11058b.m49527m(parcel, 7, mo29185I0());
        C11058b.m49510A(parcel, 8, mo29183G0(), false);
        C11058b.m49527m(parcel, 9, this.f28342j);
        C11058b.m49527m(parcel, 10, this.f28343k);
        C11058b.m49537w(parcel, 11, this.f28344l, false);
        C11058b.m49537w(parcel, 12, this.f28345m, false);
        C11058b.m49527m(parcel, 13, this.f28346n);
        C11058b.m49537w(parcel, 14, this.f28347o, false);
        C11058b.m49520f(parcel, 15, this.f28348p, false);
        C11058b.m49537w(parcel, 16, this.f28349q, false);
        C11058b.m49517c(parcel, 17, this.f28350r);
        C11058b.m49516b(parcel, a);
    }
}
