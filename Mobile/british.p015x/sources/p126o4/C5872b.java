package p126o4;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.C0720q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.C7115f;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C4646v8;
import com.google.android.gms.internal.cast.C8513f;
import com.google.android.gms.internal.cast.C8530g;
import com.google.android.gms.internal.cast.C8546h;
import com.google.android.gms.internal.cast.C8580j;
import com.google.android.gms.internal.cast.C8596k;
import com.google.android.gms.internal.cast.C8629m;
import com.google.android.gms.internal.cast.C8645n;
import com.google.android.gms.internal.cast.C8652n7;
import com.google.android.gms.internal.cast.C8677p;
import com.google.android.gms.internal.cast.C8693q;
import com.google.android.gms.internal.cast.C8708r;
import com.google.android.gms.internal.cast.C8723s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.json.JSONObject;
import p109l4.C10678g;
import p115m4.C10775p;
import p115m4.C10777q;
import p115m4.C10779r;
import p115m4.C5758b;
import p115m4.C5759d;
import p244q4.C10922b;

/* renamed from: o4.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C5872b implements C4580e.C4582b, C10779r<C5759d> {

    /* renamed from: h */
    private static final C10922b f24623h = new C10922b("UIMediaController");

    /* renamed from: a */
    private final Activity f24624a;

    /* renamed from: b */
    private final C10777q f24625b;

    /* renamed from: c */
    private final Map<View, List<C10843a>> f24626c = new HashMap();

    /* renamed from: d */
    private final Set<C8723s> f24627d = new HashSet();

    /* renamed from: e */
    C10844c f24628e = C10844c.m48844a();

    /* renamed from: f */
    private C4580e.C4582b f24629f;

    /* renamed from: g */
    private C4580e f24630g;

    public C5872b(@RecentlyNonNull Activity activity) {
        this.f24624a = activity;
        C5758b f = C5758b.m25465f(activity);
        C4646v8.m21378b(C8652n7.UI_MEDIA_CONTROLLER);
        C10777q c = f != null ? f.mo22535c() : null;
        this.f24625b = c;
        if (c != null) {
            c.mo42951b(this, C5759d.class);
            m25872c0(c.mo42953d());
        }
    }

    /* renamed from: Z */
    private final void m25869Z(int i) {
        boolean z;
        Iterator<C8723s> it = this.f24627d.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            it.next().mo36724h(true);
        }
        C4580e B = mo22775B();
        if (B != null && B.mo17850o()) {
            long h = ((long) i) + this.f24628e.mo43018h();
            C10678g.C10679a aVar = new C10678g.C10679a();
            aVar.mo42832d(h);
            if (!B.mo17852q() || !this.f24628e.mo43014d(h)) {
                z = false;
            }
            aVar.mo42831c(z);
            B.mo17826K(aVar.mo42829a());
        }
    }

    /* renamed from: a0 */
    private final void m25870a0() {
        for (C8723s h : this.f24627d) {
            h.mo36724h(false);
        }
    }

    /* renamed from: b0 */
    private final void m25871b0(int i, boolean z) {
        if (z) {
            for (C8723s g : this.f24627d) {
                g.mo36723g(((long) i) + this.f24628e.mo43018h());
            }
        }
    }

    /* renamed from: c0 */
    private final void m25872c0(C10775p pVar) {
        if (!mo22776C() && pVar != null && pVar.mo42943c()) {
            C5759d dVar = (C5759d) pVar;
            C4580e q = dVar.mo22550q();
            this.f24630g = q;
            if (q != null) {
                q.mo17837b(this);
                C4604n.m20098k(this.f24628e);
                this.f24628e.f49616a = dVar.mo22550q();
                for (List<C10843a> it : this.f24626c.values()) {
                    for (C10843a e : it) {
                        e.mo36474e(dVar);
                    }
                }
                m25875f0();
            }
        }
    }

    /* renamed from: d0 */
    private final void m25873d0() {
        if (mo22776C()) {
            this.f24628e.f49616a = null;
            for (List<C10843a> it : this.f24626c.values()) {
                for (C10843a f : it) {
                    f.mo36475f();
                }
            }
            C4604n.m20098k(this.f24630g);
            this.f24630g.mo17821F(this);
            this.f24630g = null;
        }
    }

    /* renamed from: e0 */
    private final void m25874e0(View view, C10843a aVar) {
        if (this.f24625b != null) {
            List list = this.f24626c.get(view);
            if (list == null) {
                list = new ArrayList();
                this.f24626c.put(view, list);
            }
            list.add(aVar);
            if (mo22776C()) {
                aVar.mo36474e((C5759d) C4604n.m20098k(this.f24625b.mo42953d()));
                m25875f0();
            }
        }
    }

    /* renamed from: f0 */
    private final void m25875f0() {
        for (List<C10843a> it : this.f24626c.values()) {
            for (C10843a c : it) {
                c.mo36473c();
            }
        }
    }

    /* renamed from: A */
    public void mo22774A() {
        C4604n.m20093f("Must be called from the main thread.");
        m25873d0();
        this.f24626c.clear();
        C10777q qVar = this.f24625b;
        if (qVar != null) {
            qVar.mo42956g(this, C5759d.class);
        }
        this.f24629f = null;
    }

    @RecentlyNullable
    /* renamed from: B */
    public C4580e mo22775B() {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24630g;
    }

    @EnsuresNonNullIf(expression = {"remoteMediaClient"}, result = true)
    /* renamed from: C */
    public boolean mo22776C() {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24630g != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo22777D(@RecentlyNonNull View view) {
        C4580e B = mo22775B();
        if (B != null && B.mo17850o() && (this.f24624a instanceof FragmentActivity)) {
            C7115f f2 = C7115f.m29373f2();
            FragmentActivity fragmentActivity = (FragmentActivity) this.f24624a;
            C0720q m = fragmentActivity.mo3505r().mo3598m();
            Fragment j0 = fragmentActivity.mo3505r().mo3592j0("TRACKS_CHOOSER_DIALOG_TAG");
            if (j0 != null) {
                m.mo3678n(j0);
            }
            f2.mo3728d2(m, "TRACKS_CHOOSER_DIALOG_TAG");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo22778E(@RecentlyNonNull View view, long j) {
        C4580e B = mo22775B();
        if (B != null && B.mo17850o()) {
            if (B.mo17835T()) {
                long g = B.mo17842g();
                C10844c cVar = this.f24628e;
                B.mo17824I(Math.min(g + j, ((long) cVar.mo43017g()) + cVar.mo43018h()));
                return;
            }
            B.mo17824I(B.mo17842g() + j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo22779F(@RecentlyNonNull ImageView imageView) {
        C5759d d = C5758b.m25464e(this.f24624a.getApplicationContext()).mo22535c().mo42953d();
        if (d != null && d.mo42943c()) {
            try {
                d.mo22553t(!d.mo22551r());
            } catch (IOException | IllegalArgumentException e) {
                f24623h.mo43192c("Unable to call CastSession.setMute(boolean).", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo22780G(@RecentlyNonNull ImageView imageView) {
        C4580e B = mo22775B();
        if (B != null && B.mo17850o()) {
            B.mo17829N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo22781H(@RecentlyNonNull View view, long j) {
        C4580e B = mo22775B();
        if (B != null && B.mo17850o()) {
            if (B.mo17835T()) {
                long g = B.mo17842g();
                C10844c cVar = this.f24628e;
                B.mo17824I(Math.max(g - j, ((long) cVar.mo43016f()) + cVar.mo43018h()));
                return;
            }
            B.mo17824I(B.mo17842g() - j);
        }
    }

    /* renamed from: I */
    public void mo9072h(@RecentlyNonNull C5759d dVar, int i) {
        m25873d0();
    }

    /* renamed from: J */
    public void mo9075k(@RecentlyNonNull C5759d dVar) {
    }

    /* renamed from: K */
    public void mo9074j(@RecentlyNonNull C5759d dVar, int i) {
        m25873d0();
    }

    /* renamed from: L */
    public void mo9073i(@RecentlyNonNull C5759d dVar, boolean z) {
        m25872c0(dVar);
    }

    /* renamed from: M */
    public void mo9076m(@RecentlyNonNull C5759d dVar, @RecentlyNonNull String str) {
    }

    /* renamed from: N */
    public void mo9071b(@RecentlyNonNull C5759d dVar, int i) {
        m25873d0();
    }

    /* renamed from: O */
    public void mo9077n(@RecentlyNonNull C5759d dVar, @RecentlyNonNull String str) {
        m25872c0(dVar);
    }

    /* renamed from: P */
    public void mo9070a(@RecentlyNonNull C5759d dVar) {
    }

    /* renamed from: Q */
    public void mo9078o(@RecentlyNonNull C5759d dVar, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo22791R(@RecentlyNonNull View view) {
        C4580e B = mo22775B();
        if (B != null && B.mo17850o()) {
            B.mo17818C((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo22792S(@RecentlyNonNull View view) {
        C4580e B = mo22775B();
        if (B != null && B.mo17850o()) {
            B.mo17819D((JSONObject) null);
        }
    }

    /* renamed from: T */
    public void mo22793T(C4580e.C4582b bVar) {
        C4604n.m20093f("Must be called from the main thread.");
        this.f24629f = bVar;
    }

    /* renamed from: U */
    public final void mo22794U(C8723s sVar) {
        this.f24627d.add(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo22795V(@RecentlyNonNull CastSeekBar castSeekBar) {
        m25869Z(castSeekBar.getProgress());
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo22796W(@RecentlyNonNull CastSeekBar castSeekBar) {
        m25870a0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo22797X(@RecentlyNonNull CastSeekBar castSeekBar, int i, boolean z) {
        m25871b0(i, z);
    }

    /* renamed from: Y */
    public final C10844c mo22798Y() {
        return this.f24628e;
    }

    /* renamed from: c */
    public void mo9079c() {
        m25875f0();
        C4580e.C4582b bVar = this.f24629f;
        if (bVar != null) {
            bVar.mo9079c();
        }
    }

    /* renamed from: d */
    public void mo9080d() {
        m25875f0();
        C4580e.C4582b bVar = this.f24629f;
        if (bVar != null) {
            bVar.mo9080d();
        }
    }

    /* renamed from: e */
    public void mo9081e() {
        for (List<C10843a> it : this.f24626c.values()) {
            for (C10843a d : it) {
                d.mo36537d();
            }
        }
        C4580e.C4582b bVar = this.f24629f;
        if (bVar != null) {
            bVar.mo9081e();
        }
    }

    /* renamed from: f */
    public void mo9082f() {
        m25875f0();
        C4580e.C4582b bVar = this.f24629f;
        if (bVar != null) {
            bVar.mo9082f();
        }
    }

    /* renamed from: g */
    public void mo9083g() {
        m25875f0();
        C4580e.C4582b bVar = this.f24629f;
        if (bVar != null) {
            bVar.mo9083g();
        }
    }

    /* renamed from: l */
    public void mo9084l() {
        m25875f0();
        C4580e.C4582b bVar = this.f24629f;
        if (bVar != null) {
            bVar.mo9084l();
        }
    }

    /* renamed from: p */
    public void mo22799p(@RecentlyNonNull ImageView imageView, @RecentlyNonNull ImageHints imageHints, @RecentlyNonNull View view) {
        C4604n.m20093f("Must be called from the main thread.");
        m25874e0(imageView, new C8580j(imageView, this.f24624a, imageHints, 0, view));
    }

    /* renamed from: q */
    public void mo22800q(@RecentlyNonNull ImageView imageView) {
        C4604n.m20093f("Must be called from the main thread.");
        imageView.setOnClickListener(new C10845d(this));
        m25874e0(imageView, new C8629m(imageView, this.f24624a));
    }

    /* renamed from: r */
    public void mo22801r(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Drawable drawable, @RecentlyNonNull Drawable drawable2, @RecentlyNonNull Drawable drawable3, View view, boolean z) {
        C4604n.m20093f("Must be called from the main thread.");
        C4646v8.m21378b(C8652n7.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new C10846e(this));
        m25874e0(imageView, new C8645n(imageView, this.f24624a, drawable, drawable2, drawable3, view, z));
    }

    /* renamed from: s */
    public void mo22802s(@RecentlyNonNull CastSeekBar castSeekBar, long j) {
        C4604n.m20093f("Must be called from the main thread.");
        C4646v8.m21378b(C8652n7.SEEK_CONTROLLER);
        castSeekBar.f28762g = new C10851j(this);
        m25874e0(castSeekBar, new C8513f(castSeekBar, j, this.f24628e));
    }

    /* renamed from: t */
    public void mo22803t(@RecentlyNonNull View view) {
        C4604n.m20093f("Must be called from the main thread.");
        view.setOnClickListener(new C10852k(this));
        m25874e0(view, new C8530g(view, this.f24624a));
    }

    /* renamed from: u */
    public void mo22804u(@RecentlyNonNull View view, long j) {
        C4604n.m20093f("Must be called from the main thread.");
        view.setOnClickListener(new C10849h(this, j));
        m25874e0(view, new C8546h(view, this.f24628e));
    }

    /* renamed from: v */
    public void mo22805v(@RecentlyNonNull View view) {
        C4604n.m20093f("Must be called from the main thread.");
        m25874e0(view, new C8596k(view));
    }

    /* renamed from: w */
    public void mo22806w(@RecentlyNonNull View view, long j) {
        C4604n.m20093f("Must be called from the main thread.");
        view.setOnClickListener(new C10850i(this, j));
        m25874e0(view, new C8677p(view, this.f24628e));
    }

    /* renamed from: x */
    public void mo22807x(@RecentlyNonNull View view, int i) {
        C4604n.m20093f("Must be called from the main thread.");
        view.setOnClickListener(new C10847f(this));
        m25874e0(view, new C8693q(view, i));
    }

    /* renamed from: y */
    public void mo22808y(@RecentlyNonNull View view, int i) {
        C4604n.m20093f("Must be called from the main thread.");
        view.setOnClickListener(new C10848g(this));
        m25874e0(view, new C8708r(view, i));
    }

    /* renamed from: z */
    public void mo22809z(@RecentlyNonNull View view, @RecentlyNonNull C10843a aVar) {
        C4604n.m20093f("Must be called from the main thread.");
        m25874e0(view, aVar);
    }
}
