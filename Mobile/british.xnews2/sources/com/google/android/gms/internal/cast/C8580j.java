package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.C7102a;
import com.google.android.gms.cast.framework.media.C7109c;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.images.WebImage;
import p114m4.C5758b;
import p114m4.C5759d;
import p125o4.C10843a;
import p234n4.C10814b;

/* renamed from: com.google.android.gms.internal.cast.j */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8580j extends C10843a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ImageView f43554b;

    /* renamed from: c */
    private final ImageHints f43555c;

    /* renamed from: d */
    private final Bitmap f43556d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View f43557e;

    /* renamed from: f */
    private final C7102a f43558f;

    /* renamed from: g */
    private final C10814b f43559g;

    public C8580j(ImageView imageView, Context context, ImageHints imageHints, int i, View view) {
        this.f43554b = imageView;
        this.f43555c = imageHints;
        C7102a aVar = null;
        this.f43556d = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.f43557e = view;
        C5758b f = C5758b.m25465f(context);
        if (f != null) {
            CastMediaOptions C0 = f.mo22533a().mo29419C0();
            this.f43558f = C0 != null ? C0.mo29458D0() : aVar;
        } else {
            this.f43558f = null;
        }
        this.f43559g = new C10814b(context.getApplicationContext());
    }

    /* renamed from: i */
    private final void m41016i() {
        Uri uri;
        WebImage b;
        C4580e b2 = mo36472b();
        if (b2 == null || !b2.mo17850o()) {
            m41017j();
            return;
        }
        MediaInfo j = b2.mo17845j();
        if (j == null) {
            uri = null;
        } else {
            C7102a aVar = this.f43558f;
            if (aVar == null || (b = aVar.mo29525b(j.mo29227L0(), this.f43555c)) == null || b.mo29998D0() == null) {
                uri = C7109c.m29363a(j, 0);
            } else {
                uri = b.mo29998D0();
            }
        }
        if (uri == null) {
            m41017j();
        } else {
            this.f43559g.mo42981b(uri);
        }
    }

    /* renamed from: j */
    private final void m41017j() {
        View view = this.f43557e;
        if (view != null) {
            view.setVisibility(0);
            this.f43554b.setVisibility(4);
        }
        Bitmap bitmap = this.f43556d;
        if (bitmap != null) {
            this.f43554b.setImageBitmap(bitmap);
        }
    }

    /* renamed from: c */
    public final void mo36473c() {
        m41016i();
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        this.f43559g.mo42980a(new C8563i(this));
        m41017j();
        m41016i();
    }

    /* renamed from: f */
    public final void mo36475f() {
        this.f43559g.mo42982c();
        m41017j();
        super.mo36475f();
    }
}
