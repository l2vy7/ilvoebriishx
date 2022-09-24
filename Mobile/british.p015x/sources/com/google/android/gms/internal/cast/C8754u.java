package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.C4580e;
import p115m4.C10758h;
import p115m4.C10766k;
import p115m4.C10772n;
import p115m4.C10773o;
import p115m4.C5759d;
import p126o4.C10843a;
import p126o4.C10844c;

/* renamed from: com.google.android.gms.internal.cast.u */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8754u extends C10843a implements C4580e.C4585e {

    /* renamed from: b */
    private final TextView f44019b;

    /* renamed from: c */
    private final ImageView f44020c;

    /* renamed from: d */
    private final C10844c f44021d;

    public C8754u(View view, C10844c cVar) {
        this.f44019b = (TextView) view.findViewById(C10766k.live_indicator_text);
        ImageView imageView = (ImageView) view.findViewById(C10766k.live_indicator_dot);
        this.f44020c = imageView;
        this.f44021d = cVar;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes((AttributeSet) null, C10773o.f49480a, C10758h.f49394a, C10772n.f49476a);
        int resourceId = obtainStyledAttributes.getResourceId(C10773o.f49494o, 0);
        obtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        mo36732g();
    }

    /* renamed from: a */
    public final void mo17876a(long j, long j2) {
        mo36732g();
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36732g();
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        if (mo36472b() != null) {
            mo36472b().mo17838c(this, 1000);
        }
        mo36732g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        if (mo36472b() != null) {
            mo36472b().mo17822G(this);
        }
        super.mo36475f();
        mo36732g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36732g() {
        boolean z;
        C4580e b = mo36472b();
        int i = 8;
        if (b == null || !b.mo17850o() || !b.mo17852q()) {
            this.f44019b.setVisibility(8);
            this.f44020c.setVisibility(8);
            return;
        }
        if (!b.mo17835T()) {
            z = b.mo17855t();
        } else {
            z = this.f44021d.mo43015e();
        }
        this.f44019b.setVisibility(0);
        ImageView imageView = this.f44020c;
        if (true == z) {
            i = 0;
        }
        imageView.setVisibility(i);
        C4646v8.m21378b(C8652n7.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
    }
}
