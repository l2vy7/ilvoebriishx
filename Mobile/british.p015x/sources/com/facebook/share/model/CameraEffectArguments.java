package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C3709a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f13712b;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    static class C3709a implements Parcelable.Creator<CameraEffectArguments> {
        C3709a() {
        }

        /* renamed from: a */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        /* renamed from: b */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$b */
    public static class C3710b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f13713a = new Bundle();

        /* renamed from: b */
        public CameraEffectArguments mo12449b() {
            return new CameraEffectArguments(this, (C3709a) null);
        }

        /* renamed from: c */
        public C3710b mo12450c(Parcel parcel) {
            return mo12451d((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: d */
        public C3710b mo12451d(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f13713a.putAll(cameraEffectArguments.f13712b);
            }
            return this;
        }
    }

    /* synthetic */ CameraEffectArguments(C3710b bVar, C3709a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f13712b);
    }

    private CameraEffectArguments(C3710b bVar) {
        this.f13712b = bVar.f13713a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.f13712b = parcel.readBundle(getClass().getClassLoader());
    }
}
