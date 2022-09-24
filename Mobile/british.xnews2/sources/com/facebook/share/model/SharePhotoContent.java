package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, Object> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new C3737a();

    /* renamed from: h */
    private final List<SharePhoto> f13791h;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    static class C3737a implements Parcelable.Creator<SharePhotoContent> {
        C3737a() {
        }

        /* renamed from: a */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        /* renamed from: b */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.f13791h = Collections.unmodifiableList(SharePhoto.C3736b.m12584n(parcel));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SharePhoto.C3736b.m12585s(parcel, i, this.f13791h);
    }
}
