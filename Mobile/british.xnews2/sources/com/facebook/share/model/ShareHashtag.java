package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C3717a();

    /* renamed from: b */
    private final String f13740b;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    static class C3717a implements Parcelable.Creator<ShareHashtag> {
        C3717a() {
        }

        /* renamed from: a */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        /* renamed from: b */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    public static class C3718b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f13741a;

        /* renamed from: b */
        public ShareHashtag mo12480b() {
            return new ShareHashtag(this, (C3717a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3718b mo12481c(Parcel parcel) {
            return mo12482d((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: d */
        public C3718b mo12482d(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : mo12483e(shareHashtag.mo12473a());
        }

        /* renamed from: e */
        public C3718b mo12483e(String str) {
            this.f13741a = str;
            return this;
        }
    }

    /* synthetic */ ShareHashtag(C3718b bVar, C3717a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    public String mo12473a() {
        return this.f13740b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13740b);
    }

    private ShareHashtag(C3718b bVar) {
        this.f13740b = bVar.f13741a;
    }

    ShareHashtag(Parcel parcel) {
        this.f13740b = parcel.readString();
    }
}
