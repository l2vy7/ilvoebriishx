package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C3716a();

    /* renamed from: h */
    private String f13731h;

    /* renamed from: i */
    private CameraEffectArguments f13732i;

    /* renamed from: j */
    private CameraEffectTextures f13733j;

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    static class C3716a implements Parcelable.Creator<ShareCameraEffectContent> {
        C3716a() {
        }

        /* renamed from: a */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        /* renamed from: b */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f13731h = parcel.readString();
        this.f13732i = new CameraEffectArguments.C3710b().mo12450c(parcel).mo12449b();
        this.f13733j = new CameraEffectTextures.C3712b().mo12459c(parcel).mo12458b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f13731h);
        parcel.writeParcelable(this.f13732i, 0);
        parcel.writeParcelable(this.f13733j, 0);
    }
}
