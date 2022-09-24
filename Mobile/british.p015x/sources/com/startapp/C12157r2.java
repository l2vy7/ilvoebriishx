package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* renamed from: com.startapp.r2 */
/* compiled from: Sta */
public abstract class C12157r2 implements Parcelable {

    /* renamed from: a */
    public float f54090a;

    /* renamed from: b */
    public float f54091b;

    /* renamed from: c */
    public float f54092c = Float.MAX_VALUE;

    /* renamed from: d */
    public float f54093d = -3.4028235E38f;

    /* renamed from: e */
    public long f54094e = 0;

    public C12157r2() {
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("Position: [");
        a.append(this.f54090a);
        a.append("], Velocity:[");
        a.append(this.f54091b);
        a.append("], MaxPos: [");
        a.append(this.f54092c);
        a.append("], mMinPos: [");
        a.append(this.f54093d);
        a.append("] LastTime:[");
        a.append(this.f54094e);
        a.append("]");
        return a.toString();
    }

    public C12157r2(Parcel parcel) {
        this.f54090a = parcel.readFloat();
        this.f54091b = parcel.readFloat();
        this.f54092c = parcel.readFloat();
        this.f54093d = parcel.readFloat();
        this.f54094e = AnimationUtils.currentAnimationTimeMillis();
    }
}
