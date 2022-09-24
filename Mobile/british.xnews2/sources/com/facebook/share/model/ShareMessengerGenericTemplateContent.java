package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new C3722a();

    /* renamed from: h */
    private final boolean f13750h;

    /* renamed from: i */
    private final C3723b f13751i;

    /* renamed from: j */
    private final ShareMessengerGenericTemplateElement f13752j;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    static class C3722a implements Parcelable.Creator<ShareMessengerGenericTemplateContent> {
        C3722a() {
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        /* renamed from: b */
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$b */
    public enum C3723b {
        HORIZONTAL,
        SQUARE
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.f13750h = parcel.readByte() != 0;
        this.f13751i = (C3723b) parcel.readSerializable();
        this.f13752j = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f13750h ? (byte) 1 : 0);
        parcel.writeSerializable(this.f13751i);
        parcel.writeParcelable(this.f13752j, i);
    }
}
