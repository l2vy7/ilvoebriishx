package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C7429s1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import p199d5.C10487a;
import p199d5.C10489b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C7466u();

    /* renamed from: b */
    private final String f20078b;
    @Nullable

    /* renamed from: c */
    private final C7448m f20079c;

    /* renamed from: d */
    private final boolean f20080d;

    /* renamed from: e */
    private final boolean f20081e;

    zzs(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f20078b = str;
        C7449n nVar = null;
        if (iBinder != null) {
            try {
                C10487a zzd = C7429s1.m30069b2(iBinder).zzd();
                if (zzd == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C10489b.m48194f3(zzd);
                }
                if (bArr != null) {
                    nVar = new C7449n(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f20079c = nVar;
        this.f20080d = z;
        this.f20081e = z2;
    }

    zzs(String str, @Nullable C7448m mVar, boolean z, boolean z2) {
        this.f20078b = str;
        this.f20079c = mVar;
        this.f20080d = z;
        this.f20081e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, this.f20078b, false);
        C7448m mVar = this.f20079c;
        if (mVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            mVar = null;
        }
        C11058b.m49526l(parcel, 2, mVar, false);
        C11058b.m49517c(parcel, 3, this.f20080d);
        C11058b.m49517c(parcel, 4, this.f20081e);
        C11058b.m49516b(parcel, a);
    }
}
