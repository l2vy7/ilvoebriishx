package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new C3732a();

    /* renamed from: h */
    private final ShareOpenGraphAction f13779h;

    /* renamed from: i */
    private final String f13780i;

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$a */
    static class C3732a implements Parcelable.Creator<ShareOpenGraphContent> {
        C3732a() {
        }

        /* renamed from: a */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        /* renamed from: b */
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f13779h = new ShareOpenGraphAction.C3731b().mo12528e(parcel).mo12527d();
        this.f13780i = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public ShareOpenGraphAction mo12531e() {
        return this.f13779h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13779h, 0);
        parcel.writeString(this.f13780i);
    }
}
