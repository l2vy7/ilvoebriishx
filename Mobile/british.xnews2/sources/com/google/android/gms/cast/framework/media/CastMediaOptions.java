package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p198d5.C10489b;
import p243q4.C10922b;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class CastMediaOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CastMediaOptions> CREATOR = new C7117g();

    /* renamed from: h */
    private static final C10922b f28579h = new C10922b("CastMediaOptions");

    /* renamed from: b */
    private final String f28580b;

    /* renamed from: c */
    private final String f28581c;

    /* renamed from: d */
    private final C7130m0 f28582d;

    /* renamed from: e */
    private final NotificationOptions f28583e;

    /* renamed from: f */
    private final boolean f28584f;

    /* renamed from: g */
    private final boolean f28585g;

    /* renamed from: com.google.android.gms.cast.framework.media.CastMediaOptions$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public static final class C7100a {

        /* renamed from: a */
        private String f28586a = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";

        /* renamed from: b */
        private String f28587b;

        /* renamed from: c */
        private C7102a f28588c;

        /* renamed from: d */
        private NotificationOptions f28589d = new NotificationOptions.C7101a().mo29521a();

        /* renamed from: e */
        private boolean f28590e = true;

        /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.cast.framework.media.m0] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.cast.framework.media.CastMediaOptions mo29464a() {
            /*
                r8 = this;
                com.google.android.gms.cast.framework.media.a r0 = r8.f28588c
                if (r0 != 0) goto L_0x0006
                r0 = 0
                goto L_0x000a
            L_0x0006:
                com.google.android.gms.cast.framework.media.m0 r0 = r0.mo29526c()
            L_0x000a:
                r4 = r0
                com.google.android.gms.cast.framework.media.CastMediaOptions r0 = new com.google.android.gms.cast.framework.media.CastMediaOptions
                java.lang.String r2 = r8.f28586a
                java.lang.String r3 = r8.f28587b
                com.google.android.gms.cast.framework.media.NotificationOptions r5 = r8.f28589d
                r6 = 0
                boolean r7 = r8.f28590e
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.CastMediaOptions.C7100a.mo29464a():com.google.android.gms.cast.framework.media.CastMediaOptions");
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C7100a mo29465b(@RecentlyNonNull String str) {
            this.f28587b = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C7100a mo29466c(NotificationOptions notificationOptions) {
            this.f28589d = notificationOptions;
            return this;
        }
    }

    CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        C7130m0 m0Var;
        this.f28580b = str;
        this.f28581c = str2;
        if (iBinder == null) {
            m0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof C7130m0) {
                m0Var = (C7130m0) queryLocalInterface;
            } else {
                m0Var = new C7141s(iBinder);
            }
        }
        this.f28582d = m0Var;
        this.f28583e = notificationOptions;
        this.f28584f = z;
        this.f28585g = z2;
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public String mo29457C0() {
        return this.f28581c;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public C7102a mo29458D0() {
        C7130m0 m0Var = this.f28582d;
        if (m0Var == null) {
            return null;
        }
        try {
            return (C7102a) C10489b.m48194f3(m0Var.zzf());
        } catch (RemoteException e) {
            f28579h.mo43191b(e, "Unable to call %s on %s.", "getWrappedClientObject", C7130m0.class.getSimpleName());
            return null;
        }
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public String mo29459E0() {
        return this.f28580b;
    }

    /* renamed from: F0 */
    public boolean mo29460F0() {
        return this.f28585g;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public NotificationOptions mo29461G0() {
        return this.f28583e;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29459E0(), false);
        C11058b.m49537w(parcel, 3, mo29457C0(), false);
        C7130m0 m0Var = this.f28582d;
        if (m0Var == null) {
            iBinder = null;
        } else {
            iBinder = m0Var.asBinder();
        }
        C11058b.m49526l(parcel, 4, iBinder, false);
        C11058b.m49535u(parcel, 5, mo29461G0(), i, false);
        C11058b.m49517c(parcel, 6, this.f28584f);
        C11058b.m49517c(parcel, 7, mo29460F0());
        C11058b.m49516b(parcel, a);
    }

    public final boolean zza() {
        return this.f28584f;
    }
}
