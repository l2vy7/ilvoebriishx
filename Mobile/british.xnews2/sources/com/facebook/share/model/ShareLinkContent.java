package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C3719a();
    @Deprecated

    /* renamed from: h */
    private final String f13742h;
    @Deprecated

    /* renamed from: i */
    private final String f13743i;
    @Deprecated

    /* renamed from: j */
    private final Uri f13744j;

    /* renamed from: k */
    private final String f13745k;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    static class C3719a implements Parcelable.Creator<ShareLinkContent> {
        C3719a() {
        }

        /* renamed from: a */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        /* renamed from: b */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f13742h = parcel.readString();
        this.f13743i = parcel.readString();
        this.f13744j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f13745k = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo12484e() {
        return this.f13745k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f13742h);
        parcel.writeString(this.f13743i);
        parcel.writeParcelable(this.f13744j, 0);
        parcel.writeString(this.f13745k);
    }
}
