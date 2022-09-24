package p173x2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p178y2.C6405b;

/* renamed from: x2.e */
/* compiled from: ImageViewTarget */
public abstract class C6383e<Z> extends C6387i<ImageView, Z> implements C6405b.C6406a {

    /* renamed from: i */
    private Animatable f26274i;

    public C6383e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: m */
    private void m28033m(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f26274i = animatable;
            animatable.start();
            return;
        }
        this.f26274i = null;
    }

    /* renamed from: p */
    private void m28034p(Z z) {
        mo24211o(z);
        m28033m(z);
    }

    /* renamed from: b */
    public void mo23079b(Z z, C6405b<? super Z> bVar) {
        if (bVar == null || !bVar.mo24237a(z, this)) {
            m28034p(z);
        } else {
            m28033m(z);
        }
    }

    /* renamed from: d */
    public void mo24209d(Drawable drawable) {
        super.mo24209d(drawable);
        m28034p((Object) null);
        mo24218n(drawable);
    }

    /* renamed from: f */
    public void mo24210f(Drawable drawable) {
        super.mo24210f(drawable);
        m28034p((Object) null);
        mo24218n(drawable);
    }

    /* renamed from: h */
    public void mo23080h(Drawable drawable) {
        super.mo23080h(drawable);
        Animatable animatable = this.f26274i;
        if (animatable != null) {
            animatable.stop();
        }
        m28034p((Object) null);
        mo24218n(drawable);
    }

    /* renamed from: n */
    public void mo24218n(Drawable drawable) {
        ((ImageView) this.f26277b).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo24211o(Z z);

    public void onStart() {
        Animatable animatable = this.f26274i;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void onStop() {
        Animatable animatable = this.f26274i;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
