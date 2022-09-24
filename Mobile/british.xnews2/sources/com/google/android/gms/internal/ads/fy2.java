package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fy2 extends by2 {

    /* renamed from: i */
    private static final Pattern f32037i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final dy2 f32038a;

    /* renamed from: b */
    private final cy2 f32039b;

    /* renamed from: c */
    private final List<ty2> f32040c = new ArrayList();

    /* renamed from: d */
    private b03 f32041d;

    /* renamed from: e */
    private ez2 f32042e;

    /* renamed from: f */
    private boolean f32043f = false;

    /* renamed from: g */
    private boolean f32044g = false;

    /* renamed from: h */
    private final String f32045h;

    fy2(cy2 cy2, dy2 dy2) {
        this.f32039b = cy2;
        this.f32038a = dy2;
        this.f32045h = UUID.randomUUID().toString();
        m32298k((View) null);
        if (dy2.mo31430d() == ey2.HTML || dy2.mo31430d() == ey2.JAVASCRIPT) {
            this.f32042e = new fz2(dy2.mo31429a());
        } else {
            this.f32042e = new hz2(dy2.mo31435i(), (String) null);
        }
        this.f32042e.mo31704j();
        qy2.m36822a().mo34442d(this);
        wy2.m39303a().mo35692d(this.f32042e.mo31695a(), cy2.mo31055b());
    }

    /* renamed from: k */
    private final void m32298k(View view) {
        this.f32041d = new b03(view);
    }

    /* renamed from: b */
    public final void mo30822b(View view, hy2 hy2, String str) {
        ty2 ty2;
        if (this.f32044g) {
            return;
        }
        if (f32037i.matcher("Ad overlay").matches()) {
            Iterator<ty2> it = this.f32040c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ty2 = null;
                    break;
                }
                ty2 = it.next();
                if (ty2.mo35073b().get() == view) {
                    break;
                }
            }
            if (ty2 == null) {
                this.f32040c.add(new ty2(view, hy2, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    /* renamed from: c */
    public final void mo30823c() {
        if (!this.f32044g) {
            this.f32041d.clear();
            if (!this.f32044g) {
                this.f32040c.clear();
            }
            this.f32044g = true;
            wy2.m39303a().mo35691c(this.f32042e.mo31695a());
            qy2.m36822a().mo34443e(this);
            this.f32042e.mo31697c();
            this.f32042e = null;
        }
    }

    /* renamed from: d */
    public final void mo30824d(View view) {
        if (!this.f32044g && mo31961f() != view) {
            m32298k(view);
            this.f32042e.mo31696b();
            Collection<fy2> c = qy2.m36822a().mo34441c();
            if (c != null && c.size() > 0) {
                for (fy2 next : c) {
                    if (next != this && next.mo31961f() == view) {
                        next.f32041d.clear();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo30825e() {
        if (!this.f32043f) {
            this.f32043f = true;
            qy2.m36822a().mo34444f(this);
            this.f32042e.mo31702h(xy2.m39683b().mo35819a());
            this.f32042e.mo31700f(this, this.f32038a);
        }
    }

    /* renamed from: f */
    public final View mo31961f() {
        return (View) this.f32041d.get();
    }

    /* renamed from: g */
    public final ez2 mo31962g() {
        return this.f32042e;
    }

    /* renamed from: h */
    public final String mo31963h() {
        return this.f32045h;
    }

    /* renamed from: i */
    public final List<ty2> mo31964i() {
        return this.f32040c;
    }

    /* renamed from: j */
    public final boolean mo31965j() {
        return this.f32043f && !this.f32044g;
    }
}
