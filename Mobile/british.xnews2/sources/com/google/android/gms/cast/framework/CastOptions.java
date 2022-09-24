package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.cast.C4638m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class CastOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CastOptions> CREATOR = new C7099a();

    /* renamed from: b */
    private String f28542b;

    /* renamed from: c */
    private final List<String> f28543c;

    /* renamed from: d */
    private boolean f28544d;

    /* renamed from: e */
    private LaunchOptions f28545e;

    /* renamed from: f */
    private final boolean f28546f;

    /* renamed from: g */
    private final CastMediaOptions f28547g;

    /* renamed from: h */
    private final boolean f28548h;

    /* renamed from: i */
    private final double f28549i;

    /* renamed from: j */
    private final boolean f28550j;

    /* renamed from: k */
    private final boolean f28551k;

    /* renamed from: l */
    private final boolean f28552l;

    /* renamed from: com.google.android.gms.cast.framework.CastOptions$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public static final class C7098a {

        /* renamed from: a */
        private String f28553a;

        /* renamed from: b */
        private List<String> f28554b = new ArrayList();

        /* renamed from: c */
        private boolean f28555c;

        /* renamed from: d */
        private LaunchOptions f28556d = new LaunchOptions();

        /* renamed from: e */
        private boolean f28557e = true;

        /* renamed from: f */
        private C4638m0<CastMediaOptions> f28558f = null;

        /* renamed from: g */
        private boolean f28559g = true;

        /* renamed from: h */
        private double f28560h = 0.05000000074505806d;

        @RecentlyNonNull
        /* renamed from: a */
        public CastOptions mo29430a() {
            CastMediaOptions castMediaOptions;
            C4638m0<CastMediaOptions> m0Var = this.f28558f;
            if (m0Var != null) {
                castMediaOptions = m0Var.mo19112a();
            } else {
                castMediaOptions = new CastMediaOptions.C7100a().mo29464a();
            }
            return new CastOptions(this.f28553a, this.f28554b, this.f28555c, this.f28556d, this.f28557e, castMediaOptions, this.f28559g, this.f28560h, false, false, false);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C7098a mo29431b(@RecentlyNonNull CastMediaOptions castMediaOptions) {
            this.f28558f = C4638m0.m21334b(castMediaOptions);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C7098a mo29432c(@RecentlyNonNull String str) {
            this.f28553a = str;
            return this;
        }
    }

    CastOptions(String str, List<String> list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6) {
        int i;
        this.f28542b = true == TextUtils.isEmpty(str) ? "" : str;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        this.f28543c = arrayList;
        if (i > 0) {
            arrayList.addAll(list);
        }
        this.f28544d = z;
        this.f28545e = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.f28546f = z2;
        this.f28547g = castMediaOptions;
        this.f28548h = z3;
        this.f28549i = d;
        this.f28550j = z4;
        this.f28551k = z5;
        this.f28552l = z6;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public CastMediaOptions mo29419C0() {
        return this.f28547g;
    }

    /* renamed from: D0 */
    public boolean mo29420D0() {
        return this.f28548h;
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public LaunchOptions mo29421E0() {
        return this.f28545e;
    }

    @RecentlyNonNull
    /* renamed from: F0 */
    public String mo29422F0() {
        return this.f28542b;
    }

    /* renamed from: G0 */
    public boolean mo29423G0() {
        return this.f28546f;
    }

    /* renamed from: H0 */
    public boolean mo29424H0() {
        return this.f28544d;
    }

    @RecentlyNonNull
    /* renamed from: I0 */
    public List<String> mo29425I0() {
        return Collections.unmodifiableList(this.f28543c);
    }

    /* renamed from: J0 */
    public double mo29426J0() {
        return this.f28549i;
    }

    /* renamed from: K0 */
    public final boolean mo29427K0() {
        return this.f28552l;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29422F0(), false);
        C11058b.m49539y(parcel, 3, mo29425I0(), false);
        C11058b.m49517c(parcel, 4, mo29424H0());
        C11058b.m49535u(parcel, 5, mo29421E0(), i, false);
        C11058b.m49517c(parcel, 6, mo29423G0());
        C11058b.m49535u(parcel, 7, mo29419C0(), i, false);
        C11058b.m49517c(parcel, 8, mo29420D0());
        C11058b.m49522h(parcel, 9, mo29426J0());
        C11058b.m49517c(parcel, 10, this.f28550j);
        C11058b.m49517c(parcel, 11, this.f28551k);
        C11058b.m49517c(parcel, 12, this.f28552l);
        C11058b.m49516b(parcel, a);
    }

    public final boolean zzc() {
        return this.f28551k;
    }
}
