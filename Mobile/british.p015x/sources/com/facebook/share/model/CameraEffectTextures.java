package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C3711a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f13714b;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    static class C3711a implements Parcelable.Creator<CameraEffectTextures> {
        C3711a() {
        }

        /* renamed from: a */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        /* renamed from: b */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$b */
    public static class C3712b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f13715a = new Bundle();

        /* renamed from: b */
        public CameraEffectTextures mo12458b() {
            return new CameraEffectTextures(this, (C3711a) null);
        }

        /* renamed from: c */
        public C3712b mo12459c(Parcel parcel) {
            return mo12460d((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: d */
        public C3712b mo12460d(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f13715a.putAll(cameraEffectTextures.f13714b);
            }
            return this;
        }
    }

    /* synthetic */ CameraEffectTextures(C3712b bVar, C3711a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f13714b);
    }

    private CameraEffectTextures(C3712b bVar) {
        this.f13714b = bVar.f13715a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f13714b = parcel.readBundle(getClass().getClassLoader());
    }
}
