package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.startapp.C11840d1;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.k0 */
/* compiled from: Sta */
public class C12002k0 implements C11840d1.C11843b, Parcelable {
    public static final Parcelable.Creator<C12002k0> CREATOR = new C12003a();

    /* renamed from: a */
    public AdDetails f53184a;

    /* renamed from: b */
    public Point f53185b;

    /* renamed from: c */
    public Bitmap f53186c = null;

    /* renamed from: d */
    public Bitmap f53187d = null;

    /* renamed from: e */
    public AtomicBoolean f53188e = new AtomicBoolean(false);

    /* renamed from: f */
    public TrackingParams f53189f;

    /* renamed from: g */
    public C11868d9 f53190g = null;

    /* renamed from: h */
    public Banner3DView f53191h = null;

    /* renamed from: com.startapp.k0$a */
    /* compiled from: Sta */
    public class C12003a implements Parcelable.Creator<C12002k0> {
        public Object createFromParcel(Parcel parcel) {
            return new C12002k0(parcel);
        }

        public Object[] newArray(int i) {
            return new C12002k0[i];
        }
    }

    public C12002k0(Context context, ViewGroup viewGroup, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f53184a = adDetails;
        this.f53189f = trackingParams;
        mo45492a(context, bannerOptions, viewGroup);
    }

    /* renamed from: a */
    public void mo45492a(Context context, BannerOptions bannerOptions, ViewGroup viewGroup) {
        int a = C11975j0.m52484a(context, 1, (float) (bannerOptions.mo45781d() - 5));
        this.f53185b = new Point((int) (bannerOptions.mo45795p() * ((float) C11975j0.m52484a(context, 1, (float) bannerOptions.mo45794o()))), (int) (bannerOptions.mo45782e() * ((float) C11975j0.m52484a(context, 1, (float) bannerOptions.mo45781d()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.mo45794o(), bannerOptions.mo45781d()));
        this.f53191h = banner3DView;
        banner3DView.setText(this.f53184a.mo46264t());
        this.f53191h.setRating(this.f53184a.mo46261q());
        this.f53191h.setDescription(this.f53184a.mo46253i());
        this.f53191h.setButtonText(this.f53184a.mo46272z());
        Bitmap bitmap = this.f53186c;
        if (bitmap != null) {
            this.f53191h.setImage(bitmap, a, a);
        } else {
            this.f53191h.setImage(17301651, a, a);
            new C11840d1(context, this.f53184a.mo46254j(), this, 0).mo45233a();
        }
        Point point = this.f53185b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        viewGroup.addView(this.f53191h, layoutParams);
        this.f53191h.setVisibility(8);
        mo45491a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f53184a, i);
        parcel.writeInt(this.f53185b.x);
        parcel.writeInt(this.f53185b.y);
        parcel.writeParcelable(this.f53186c, i);
        parcel.writeBooleanArray(new boolean[]{this.f53188e.get()});
        parcel.writeSerializable(this.f53189f);
    }

    public C12002k0(Parcel parcel) {
        this.f53184a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f53185b = point;
        point.x = parcel.readInt();
        this.f53185b.y = parcel.readInt();
        this.f53186c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f53188e.set(zArr[0]);
        this.f53189f = (TrackingParams) parcel.readSerializable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r1 = r4.f53185b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45491a() {
        /*
            r4 = this;
            com.startapp.sdk.ads.banner.banner3d.Banner3DView r0 = r4.f53191h
            if (r0 == 0) goto L_0x000d
            android.graphics.Bitmap r0 = m52524a(r0)     // Catch:{ OutOfMemoryError -> 0x000d, all -> 0x0009 }
            goto L_0x000e
        L_0x0009:
            r0 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
        L_0x000d:
            r0 = 0
        L_0x000e:
            r4.f53187d = r0
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            android.graphics.Point r1 = r4.f53185b
            int r2 = r1.x
            if (r2 <= 0) goto L_0x0024
            int r1 = r1.y
            if (r1 <= 0) goto L_0x0024
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r1, r3)
            r4.f53187d = r0
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12002k0.mo45491a():void");
    }

    /* renamed from: a */
    public static Bitmap m52524a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public void mo20798a(Bitmap bitmap, int i) {
        Banner3DView banner3DView;
        if (bitmap != null && (banner3DView = this.f53191h) != null) {
            this.f53186c = bitmap;
            banner3DView.setImage(bitmap);
            mo45491a();
        }
    }
}
