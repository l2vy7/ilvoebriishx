package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.C3572j;
import com.facebook.C3752u;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3542q;
import com.facebook.internal.C3548r;
import com.facebook.internal.C3552s;
import com.facebook.internal.C3561x;
import com.facebook.login.C3616i;
import com.facebook.login.C3617j;
import com.facebook.login.C3622o;

public class ProfilePictureView extends FrameLayout {

    /* renamed from: l */
    public static final String f13504l = ProfilePictureView.class.getSimpleName();

    /* renamed from: b */
    private String f13505b;

    /* renamed from: c */
    private int f13506c = 0;

    /* renamed from: d */
    private int f13507d = 0;

    /* renamed from: e */
    private boolean f13508e = true;

    /* renamed from: f */
    private Bitmap f13509f;

    /* renamed from: g */
    private ImageView f13510g;

    /* renamed from: h */
    private int f13511h = -1;

    /* renamed from: i */
    private C3548r f13512i;

    /* renamed from: j */
    private C3635b f13513j;

    /* renamed from: k */
    private Bitmap f13514k = null;

    /* renamed from: com.facebook.login.widget.ProfilePictureView$a */
    class C3634a implements C3548r.C3551c {
        C3634a() {
        }

        /* renamed from: a */
        public void mo12069a(C3552s sVar) {
            ProfilePictureView.this.m12247f(sVar);
        }
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$b */
    public interface C3635b {
        /* renamed from: a */
        void mo12332a(C3572j jVar);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12245c(context);
        m12246e(attributeSet);
    }

    /* renamed from: b */
    private int m12244b(boolean z) {
        int i;
        int i2 = this.f13511h;
        if (i2 == -4) {
            i = C3616i.com_facebook_profilepictureview_preset_size_large;
        } else if (i2 == -3) {
            i = C3616i.com_facebook_profilepictureview_preset_size_normal;
        } else if (i2 == -2) {
            i = C3616i.com_facebook_profilepictureview_preset_size_small;
        } else if (i2 != -1 || !z) {
            return 0;
        } else {
            i = C3616i.com_facebook_profilepictureview_preset_size_normal;
        }
        return getResources().getDimensionPixelSize(i);
    }

    /* renamed from: c */
    private void m12245c(Context context) {
        removeAllViews();
        this.f13510g = new ImageView(context);
        this.f13510g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f13510g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f13510g);
    }

    /* renamed from: e */
    private void m12246e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3622o.f13440P);
        setPresetSize(obtainStyledAttributes.getInt(C3622o.f13442R, -1));
        this.f13508e = obtainStyledAttributes.getBoolean(C3622o.f13441Q, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m12247f(C3552s sVar) {
        if (sVar.mo12072c() == this.f13512i) {
            this.f13512i = null;
            Bitmap a = sVar.mo12070a();
            Exception b = sVar.mo12071b();
            if (b != null) {
                C3635b bVar = this.f13513j;
                if (bVar != null) {
                    bVar.mo12332a(new C3572j("Error in downloading profile picture for profileId: " + getProfileId(), (Throwable) b));
                    return;
                }
                C3561x.m11891e(C3752u.REQUESTS, 6, f13504l, b.toString());
            } else if (a != null) {
                setImageBitmap(a);
                if (sVar.mo12073d()) {
                    m12249h(false);
                }
            }
        }
    }

    /* renamed from: g */
    private void m12248g(boolean z) {
        boolean j = m12251j();
        String str = this.f13505b;
        if (str == null || str.length() == 0 || (this.f13507d == 0 && this.f13506c == 0)) {
            m12250i();
        } else if (j || z) {
            m12249h(true);
        }
    }

    /* renamed from: h */
    private void m12249h(boolean z) {
        C3548r f = new C3548r.C3550b(getContext(), C3548r.m11852e(this.f13505b, this.f13507d, this.f13506c, AccessToken.m11207t() ? AccessToken.m11205h().mo11191r() : "")).mo12066g(z).mo12068i(this).mo12067h(new C3634a()).mo12065f();
        C3548r rVar = this.f13512i;
        if (rVar != null) {
            C3542q.m11842c(rVar);
        }
        this.f13512i = f;
        C3542q.m11844e(f);
    }

    /* renamed from: i */
    private void m12250i() {
        C3548r rVar = this.f13512i;
        if (rVar != null) {
            C3542q.m11842c(rVar);
        }
        if (this.f13514k == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), mo12318d() ? C3617j.com_facebook_profile_picture_blank_square : C3617j.com_facebook_profile_picture_blank_portrait));
            return;
        }
        m12251j();
        setImageBitmap(Bitmap.createScaledBitmap(this.f13514k, this.f13507d, this.f13506c, false));
    }

    /* renamed from: j */
    private boolean m12251j() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width < 1 || height < 1) {
            return false;
        }
        int b = m12244b(false);
        if (b != 0) {
            height = b;
            width = height;
        }
        if (width <= height) {
            height = mo12318d() ? width : 0;
        } else {
            width = mo12318d() ? height : 0;
        }
        if (width == this.f13507d && height == this.f13506c) {
            z = false;
        }
        this.f13507d = width;
        this.f13506c = height;
        return z;
    }

    private void setImageBitmap(Bitmap bitmap) {
        ImageView imageView = this.f13510g;
        if (imageView != null && bitmap != null) {
            this.f13509f = bitmap;
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: d */
    public final boolean mo12318d() {
        return this.f13508e;
    }

    public final C3635b getOnErrorListener() {
        return this.f13513j;
    }

    public final int getPresetSize() {
        return this.f13511h;
    }

    public final String getProfileId() {
        return this.f13505b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13512i = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m12248g(false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = m12244b(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = m12244b(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (z2) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f13505b = bundle.getString("ProfilePictureView_profileId");
        this.f13511h = bundle.getInt("ProfilePictureView_presetSize");
        this.f13508e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f13507d = bundle.getInt("ProfilePictureView_width");
        this.f13506c = bundle.getInt("ProfilePictureView_height");
        m12248g(true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f13505b);
        bundle.putInt("ProfilePictureView_presetSize", this.f13511h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f13508e);
        bundle.putInt("ProfilePictureView_width", this.f13507d);
        bundle.putInt("ProfilePictureView_height", this.f13506c);
        bundle.putBoolean("ProfilePictureView_refresh", this.f13512i != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.f13508e = z;
        m12248g(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f13514k = bitmap;
    }

    public final void setOnErrorListener(C3635b bVar) {
        this.f13513j = bVar;
    }

    public final void setPresetSize(int i) {
        if (i == -4 || i == -3 || i == -2 || i == -1) {
            this.f13511h = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    public final void setProfileId(String str) {
        boolean z;
        if (C3481f0.m11604O(this.f13505b) || !this.f13505b.equalsIgnoreCase(str)) {
            m12250i();
            z = true;
        } else {
            z = false;
        }
        this.f13505b = str;
        m12248g(z);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12245c(context);
        m12246e(attributeSet);
    }
}
