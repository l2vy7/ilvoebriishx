package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new C3724a();

    /* renamed from: b */
    private final String f13756b;

    /* renamed from: c */
    private final String f13757c;

    /* renamed from: d */
    private final Uri f13758d;

    /* renamed from: e */
    private final ShareMessengerActionButton f13759e;

    /* renamed from: f */
    private final ShareMessengerActionButton f13760f;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$a */
    static class C3724a implements Parcelable.Creator<ShareMessengerGenericTemplateElement> {
        C3724a() {
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        /* renamed from: b */
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f13756b = parcel.readString();
        this.f13757c = parcel.readString();
        this.f13758d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f13759e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f13760f = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13756b);
        parcel.writeString(this.f13757c);
        parcel.writeParcelable(this.f13758d, i);
        parcel.writeParcelable(this.f13759e, i);
        parcel.writeParcelable(this.f13760f, i);
    }
}
