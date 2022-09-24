package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.C0628n;
import p072f.C5238a;
import p110m0.C5722t;

public class AppCompatImageButton extends ImageButton implements C5722t, C0628n {

    /* renamed from: b */
    private final C0378d f1216b;

    /* renamed from: c */
    private final C0389h f1217c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5238a.f22790D);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            dVar.mo2067b();
        }
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            hVar.mo2155b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            return dVar.mo2068c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            return dVar.mo2069d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            return hVar.mo2156c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            return hVar.mo2157d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1217c.mo2158e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            dVar.mo2071f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            dVar.mo2072g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            hVar.mo2155b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            hVar.mo2155b();
        }
    }

    public void setImageResource(int i) {
        this.f1217c.mo2160g(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            hVar.mo2155b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            dVar.mo2074i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378d dVar = this.f1216b;
        if (dVar != null) {
            dVar.mo2075j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            hVar.mo2161h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0389h hVar = this.f1217c;
        if (hVar != null) {
            hVar.mo2162i(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0377c0.m1949b(context), attributeSet, i);
        C0373a0.m1942a(this, getContext());
        C0378d dVar = new C0378d(this);
        this.f1216b = dVar;
        dVar.mo2070e(attributeSet, i);
        C0389h hVar = new C0389h(this);
        this.f1217c = hVar;
        hVar.mo2159f(attributeSet, i);
    }
}
