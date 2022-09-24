package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new C3741a();

    /* renamed from: h */
    private final String f13798h;

    /* renamed from: i */
    private final String f13799i;

    /* renamed from: j */
    private final SharePhoto f13800j;

    /* renamed from: k */
    private final ShareVideo f13801k;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    static class C3741a implements Parcelable.Creator<ShareVideoContent> {
        C3741a() {
        }

        /* renamed from: a */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        /* renamed from: b */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f13798h = parcel.readString();
        this.f13799i = parcel.readString();
        SharePhoto.C3736b l = new SharePhoto.C3736b().mo12559l(parcel);
        if (l.mo12558k() == null && l.mo12557j() == null) {
            this.f13800j = null;
        } else {
            this.f13800j = l.mo12556i();
        }
        this.f13801k = new ShareVideo.C3740b().mo12579g(parcel).mo12578f();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f13798h);
        parcel.writeString(this.f13799i);
        parcel.writeParcelable(this.f13800j, 0);
        parcel.writeParcelable(this.f13801k, 0);
    }
}
