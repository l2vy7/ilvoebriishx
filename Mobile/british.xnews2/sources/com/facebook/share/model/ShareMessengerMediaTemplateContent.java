package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new C3725a();

    /* renamed from: h */
    private final C3726b f13761h;

    /* renamed from: i */
    private final String f13762i;

    /* renamed from: j */
    private final Uri f13763j;

    /* renamed from: k */
    private final ShareMessengerActionButton f13764k;

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    static class C3725a implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        C3725a() {
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        /* renamed from: b */
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$b */
    public enum C3726b {
        IMAGE,
        VIDEO
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f13761h = (C3726b) parcel.readSerializable();
        this.f13762i = parcel.readString();
        this.f13763j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f13764k = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f13761h);
        parcel.writeString(this.f13762i);
        parcel.writeParcelable(this.f13763j, i);
        parcel.writeParcelable(this.f13764k, i);
    }
}
