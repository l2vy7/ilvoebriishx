package p173x2;

import android.graphics.drawable.Drawable;
import p004a3.C0066k;
import p168w2.C6306c;

/* renamed from: x2.c */
/* compiled from: CustomTarget */
public abstract class C6381c<T> implements C6386h<T> {

    /* renamed from: b */
    private final int f26271b;

    /* renamed from: c */
    private final int f26272c;

    /* renamed from: d */
    private C6306c f26273d;

    public C6381c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo24213a(C6385g gVar) {
        gVar.mo24077f(this.f26271b, this.f26272c);
    }

    /* renamed from: c */
    public final void mo24214c(C6306c cVar) {
        this.f26273d = cVar;
    }

    /* renamed from: d */
    public void mo24209d(Drawable drawable) {
    }

    /* renamed from: e */
    public final void mo24215e(C6385g gVar) {
    }

    /* renamed from: f */
    public void mo24210f(Drawable drawable) {
    }

    /* renamed from: g */
    public final C6306c mo24216g() {
        return this.f26273d;
    }

    public void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public C6381c(int i, int i2) {
        if (C0066k.m267s(i, i2)) {
            this.f26271b = i;
            this.f26272c = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
