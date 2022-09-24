package com.google.android.gms.internal.cast;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.media.C4580e;
import java.util.Iterator;
import java.util.List;
import p115m4.C10770m;
import p115m4.C5759d;
import p126o4.C10843a;

/* renamed from: com.google.android.gms.internal.cast.g */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8530g extends C10843a {

    /* renamed from: b */
    private final View f43477b;

    /* renamed from: c */
    private final String f43478c;

    /* renamed from: d */
    private final String f43479d;

    public C8530g(View view, Context context) {
        this.f43477b = view;
        this.f43478c = context.getString(C10770m.f49452c);
        this.f43479d = context.getString(C10770m.f49453d);
        view.setEnabled(false);
    }

    /* renamed from: g */
    private final void m40919g() {
        MediaInfo j;
        List<MediaTrack> K0;
        C4580e b = mo36472b();
        if (b != null && b.mo17850o() && (j = b.mo17845j()) != null && (K0 = j.mo29226K0()) != null && !K0.isEmpty()) {
            Iterator<MediaTrack> it = K0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaTrack next = it.next();
                if (next.mo29369K0() == 2) {
                    i++;
                    if (i > 1) {
                        break;
                    }
                } else if (next.mo29369K0() == 1) {
                    break;
                }
            }
            if (!b.mo17856u()) {
                this.f43477b.setEnabled(true);
                this.f43477b.setContentDescription(this.f43478c);
                return;
            }
        }
        this.f43477b.setEnabled(false);
        this.f43477b.setContentDescription(this.f43479d);
    }

    /* renamed from: c */
    public final void mo36473c() {
        m40919g();
    }

    /* renamed from: d */
    public final void mo36537d() {
        this.f43477b.setEnabled(false);
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        this.f43477b.setEnabled(true);
        m40919g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        this.f43477b.setEnabled(false);
        super.mo36475f();
    }
}
