package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatv extends zzatx {
    public static final Parcelable.Creator<zzatv> CREATOR = new C7576cj();

    /* renamed from: c */
    public final String f42903c;

    /* renamed from: d */
    public final String f42904d;

    /* renamed from: e */
    public final String f42905e;

    zzatv(Parcel parcel) {
        super(CommentFrame.f27470ID);
        this.f42903c = parcel.readString();
        this.f42904d = parcel.readString();
        this.f42905e = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatv.class == obj.getClass()) {
            zzatv zzatv = (zzatv) obj;
            return C7836jm.m33653o(this.f42904d, zzatv.f42904d) && C7836jm.m33653o(this.f42903c, zzatv.f42903c) && C7836jm.m33653o(this.f42905e, zzatv.f42905e);
        }
    }

    public final int hashCode() {
        String str = this.f42903c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f42904d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f42905e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42906b);
        parcel.writeString(this.f42903c);
        parcel.writeString(this.f42905e);
    }

    public zzatv(String str, String str2, String str3) {
        super(CommentFrame.f27470ID);
        this.f42903c = C6540C.LANGUAGE_UNDETERMINED;
        this.f42904d = str2;
        this.f42905e = str3;
    }
}
