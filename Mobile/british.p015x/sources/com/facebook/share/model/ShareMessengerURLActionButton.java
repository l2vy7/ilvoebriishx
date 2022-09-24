package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C3728a();

    /* renamed from: c */
    private final Uri f13770c;

    /* renamed from: d */
    private final Uri f13771d;

    /* renamed from: e */
    private final boolean f13772e;

    /* renamed from: f */
    private final boolean f13773f;

    /* renamed from: g */
    private final C3729b f13774g;

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    static class C3728a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        C3728a() {
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        /* renamed from: b */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$b */
    public enum C3729b {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.f13770c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = true;
        this.f13772e = parcel.readByte() != 0;
        this.f13771d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f13774g = (C3729b) parcel.readSerializable();
        this.f13773f = parcel.readByte() == 0 ? false : z;
    }
}
