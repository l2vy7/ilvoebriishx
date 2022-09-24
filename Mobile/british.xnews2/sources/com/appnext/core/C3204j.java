package com.appnext.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.appnext.base.C3117a;
import com.bumptech.glide.C3319b;
import com.bumptech.glide.C3333i;
import java.lang.ref.WeakReference;
import p064d2.C5154a;
import p081g2.C5292j;
import p081g2.C5316q;
import p118n2.C5849y;
import p168w2.C6309e;
import p168w2.C6310f;
import p173x2.C6386h;

/* renamed from: com.appnext.core.j */
public class C3204j {

    /* renamed from: dR */
    private static volatile C3204j f12368dR;

    /* renamed from: com.appnext.core.j$a */
    public interface C3206a {
        /* renamed from: aw */
        void mo10808aw();
    }

    private C3204j() {
    }

    /* renamed from: ax */
    public static C3204j m10808ax() {
        if (f12368dR == null) {
            synchronized (C3204j.class) {
                if (f12368dR == null) {
                    f12368dR = new C3204j();
                }
            }
        }
        return f12368dR;
    }

    /* renamed from: a */
    public final void mo10810a(Context context, ImageView imageView, String str, C3206a aVar) {
        m10807a(context, imageView, str, 0, false, aVar);
    }

    /* renamed from: b */
    public final void mo10811b(Context context, ImageView imageView, String str, int i, C3206a aVar) {
        m10807a(context, imageView, str, 16, true, aVar);
    }

    /* renamed from: a */
    public final void mo10809a(Context context, ImageView imageView, String str, int i, C3206a aVar) {
        m10807a(context, imageView, str, 16, false, aVar);
    }

    /* renamed from: a */
    private void m10807a(Context context, ImageView imageView, String str, int i, boolean z, C3206a aVar) {
        final WeakReference weakReference = null;
        if (aVar != null) {
            try {
                weakReference = new WeakReference(aVar);
            } catch (Throwable th) {
                C3117a.m10553a("ImageLoader$displayImage", th);
                return;
            }
        }
        if (context != null && imageView != null && !TextUtils.isEmpty(str)) {
            C3333i<Drawable> r0 = C3319b.m11103t(context.getApplicationContext()).mo11159p(str).mo11142r0(new C6309e<Drawable>() {
                /* renamed from: a */
                public final boolean onResourceReady(Drawable drawable, Object obj, C6386h<Drawable> hVar, C5154a aVar, boolean z) {
                    try {
                        WeakReference weakReference = weakReference;
                        if (weakReference == null) {
                            return false;
                        }
                        weakReference.get();
                        return false;
                    } catch (Throwable unused) {
                        return false;
                    }
                }

                public final boolean onLoadFailed(C5316q qVar, Object obj, C6386h<Drawable> hVar, boolean z) {
                    C3206a aVar;
                    try {
                        WeakReference weakReference = weakReference;
                        if (weakReference == null || (aVar = (C3206a) weakReference.get()) == null) {
                            return false;
                        }
                        aVar.mo10808aw();
                        return false;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            });
            C6310f fVar = new C6310f();
            if (i > 0) {
                fVar.mo24047m0(new C5849y(i));
            }
            if (z) {
                fVar.mo24036g(C5292j.f23391a);
            }
            r0.mo11139a(fVar).mo11136C0(imageView);
        }
    }
}
