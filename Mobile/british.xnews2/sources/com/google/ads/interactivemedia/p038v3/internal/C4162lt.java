package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lt */
/* compiled from: IMASDK */
public final class C4162lt extends C4081it {

    /* renamed from: A */
    private final boolean f17874A;

    /* renamed from: B */
    private boolean f17875B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C4271pu f17876C;

    /* renamed from: b */
    protected final C4156ln[] f17877b;

    /* renamed from: c */
    private final Context f17878c;

    /* renamed from: d */
    private final C4103jo f17879d;

    /* renamed from: e */
    private final C4161ls f17880e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CopyOnWriteArraySet<ane> f17881f;

    /* renamed from: g */
    private final CopyOnWriteArraySet<C4212np> f17882g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<C4272pv> f17883h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C4201ne f17884i;

    /* renamed from: j */
    private final C4076io f17885j;

    /* renamed from: k */
    private final C4080is f17886k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4166lx f17887l;

    /* renamed from: m */
    private final C4172mc f17888m;

    /* renamed from: n */
    private final C4173md f17889n;

    /* renamed from: o */
    private final long f17890o = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;

    /* renamed from: p */
    private AudioTrack f17891p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Surface f17892q;

    /* renamed from: r */
    private boolean f17893r;

    /* renamed from: s */
    private final int f17894s = 1;

    /* renamed from: t */
    private SurfaceHolder f17895t;

    /* renamed from: u */
    private int f17896u;

    /* renamed from: v */
    private int f17897v;

    /* renamed from: w */
    private final int f17898w;

    /* renamed from: x */
    private final C4210nn f17899x;

    /* renamed from: y */
    private final float f17900y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f17901z = false;

    @Deprecated
    protected C4162lt(Context context, C3993fm fmVar, aio aio, abl abl, C4085ix ixVar, aiz aiz, C4201ne neVar, aks aks, Looper looper) {
        C4160lr lrVar = new C4160lr(context, fmVar);
        lrVar.mo16276s(aio);
        lrVar.mo16275r(abl);
        lrVar.mo16273p(ixVar);
        lrVar.mo16271n(aiz);
        lrVar.mo16270m(neVar);
        lrVar.mo16277t();
        lrVar.mo16272o(aks);
        lrVar.mo16274q(looper);
        Context applicationContext = lrVar.f17857a.getApplicationContext();
        this.f17878c = applicationContext;
        C4201ne b = lrVar.f17862f;
        this.f17884i = b;
        C4210nn c = lrVar.f17864h;
        this.f17899x = c;
        C4161ls lsVar = new C4161ls(this);
        this.f17880e = lsVar;
        this.f17881f = new CopyOnWriteArraySet<>();
        this.f17882g = new CopyOnWriteArraySet<>();
        new CopyOnWriteArraySet();
        new CopyOnWriteArraySet();
        this.f17883h = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(lrVar.f17863g);
        C4156ln[] a = lrVar.f17870n.mo15845a(handler, lsVar, lsVar);
        this.f17877b = a;
        this.f17900y = 1.0f;
        if (amm.f15298a < 21) {
            AudioTrack audioTrack = this.f17891p;
            if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                this.f17891p.release();
                this.f17891p = null;
            }
            if (this.f17891p == null) {
                this.f17891p = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
            }
            this.f17898w = this.f17891p.getAudioSessionId();
        } else {
            this.f17898w = C4083iv.m17453c(applicationContext);
        }
        Collections.emptyList();
        this.f17874A = true;
        aio e = lrVar.f17859c;
        C4085ix k = lrVar.f17871o;
        aiz f = lrVar.f17861e;
        boolean g = lrVar.f17866j;
        C4159lq h = lrVar.f17867k;
        C4084iw l = lrVar.f17872p;
        aks i = lrVar.f17858b;
        Looper d = lrVar.f17863g;
        C4103jo joVar = r0;
        C4160lr lrVar2 = lrVar;
        C4161ls lsVar2 = lsVar;
        C4103jo joVar2 = new C4103jo(a, e, k, f, b, g, h, l, 500, i, d, this);
        C4103jo joVar3 = joVar;
        this.f17879d = joVar3;
        joVar3.mo16001e(lsVar2);
        joVar3.mo16002f(lsVar2);
        Handler handler2 = handler;
        C4076io ioVar = new C4076io(lrVar2.f17857a, handler2, lsVar2);
        this.f17885j = ioVar;
        ioVar.mo15928a();
        C4080is isVar = new C4080is(lrVar2.f17857a, handler2, lsVar2);
        this.f17886k = isVar;
        isVar.mo15932b((C4210nn) null);
        C4166lx lxVar = new C4166lx(lrVar2.f17857a, handler2, lsVar2);
        this.f17887l = lxVar;
        lxVar.mo16310a(3);
        C4172mc mcVar = new C4172mc(lrVar2.f17857a);
        this.f17888m = mcVar;
        mcVar.mo16338a(false);
        C4173md mdVar = new C4173md(lrVar2.f17857a);
        this.f17889n = mdVar;
        mdVar.mo16340a(false);
        this.f17876C = m18020Z(lxVar);
        m18019Y(1, 102, Integer.valueOf(this.f17898w));
        m18019Y(2, 102, Integer.valueOf(this.f17898w));
        m18019Y(1, 3, c);
        m18019Y(2, 4, 1);
        m18019Y(1, 101, Boolean.valueOf(this.f17901z));
    }

    /* renamed from: F */
    static /* synthetic */ void m18001F(C4162lt ltVar) {
        ltVar.f17884i.mo16285L(ltVar.f17901z);
        Iterator<C4212np> it = ltVar.f17882g.iterator();
        while (it.hasNext()) {
            it.next().mo16371a();
        }
    }

    /* renamed from: P */
    static /* synthetic */ void m18011P(C4162lt ltVar) {
        int i = ltVar.mo16302i();
        boolean z = false;
        if (i == 2 || i == 3) {
            ltVar.m18018X();
            boolean c = ltVar.f17879d.mo15999c();
            C4172mc mcVar = ltVar.f17888m;
            if (ltVar.mo16305l() && !c) {
                z = true;
            }
            mcVar.mo16339b(z);
            ltVar.f17889n.mo16341b(ltVar.mo16305l());
            return;
        }
        ltVar.f17888m.mo16339b(false);
        ltVar.f17889n.mo16341b(false);
    }

    /* renamed from: T */
    private final void m18014T() {
        SurfaceHolder surfaceHolder = this.f17895t;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f17880e);
            this.f17895t = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final void m18015U(Surface surface, boolean z) {
        ArrayList<C4153lk> arrayList = new ArrayList<>();
        C4156ln[] lnVarArr = this.f17877b;
        int length = lnVarArr.length;
        for (int i = 0; i < 2; i++) {
            C4156ln lnVar = lnVarArr[i];
            if (lnVar.mo15945a() == 2) {
                C4153lk l = this.f17879d.mo16008l(lnVar);
                l.mo16263n(1);
                l.mo16262m(surface);
                l.mo16261l();
                arrayList.add(l);
            }
        }
        Surface surface2 = this.f17892q;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (C4153lk j : arrayList) {
                    j.mo16259j(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f17879d.mo15998F(C4089ja.m17488b(new C4117kb(3)));
            }
            if (this.f17893r) {
                this.f17892q.release();
            }
        }
        this.f17892q = surface;
        this.f17893r = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public final void m18016V(int i, int i2) {
        if (i != this.f17896u || i2 != this.f17897v) {
            this.f17896u = i;
            this.f17897v = i2;
            this.f17884i.mo16358U(i, i2);
            Iterator<ane> it = this.f17881f.iterator();
            while (it.hasNext()) {
                it.next().mo14087b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final void m18017W(boolean z, int i, int i2) {
        int i3 = 1;
        boolean z2 = z && i != -1;
        if (!z2 || i == 1) {
            i3 = 0;
        }
        this.f17879d.mo16005i(z2, i3, i2);
    }

    /* renamed from: X */
    private final void m18018X() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() == this.f17879d.mo16000d()) {
            return;
        }
        if (!this.f17874A) {
            if (this.f17875B) {
                illegalStateException = null;
            } else {
                illegalStateException = new IllegalStateException();
            }
            ali.m14022a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
            this.f17875B = true;
            return;
        }
        throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public final void m18019Y(int i, int i2, Object obj) {
        C4156ln[] lnVarArr = this.f17877b;
        int length = lnVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            C4156ln lnVar = lnVarArr[i3];
            if (lnVar.mo15945a() == i) {
                C4153lk l = this.f17879d.mo16008l(lnVar);
                l.mo16263n(i2);
                l.mo16262m(obj);
                l.mo16261l();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static C4271pu m18020Z(C4166lx lxVar) {
        return new C4271pu(lxVar.mo16311b(), lxVar.mo16312c());
    }

    /* access modifiers changed from: private */
    /* renamed from: aa */
    public static int m18021aa(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: ab */
    private final void m18022ab() {
        m18019Y(2, 8, (Object) null);
    }

    /* renamed from: A */
    public final void mo15993A() {
        m18018X();
    }

    /* renamed from: B */
    public final void mo15994B() {
        m18018X();
    }

    /* renamed from: C */
    public final void mo15995C(int i) {
        m18018X();
        this.f17884i.mo16357T();
        this.f17879d.mo15995C(i);
    }

    /* renamed from: E */
    public final void mo15997E() {
        m18018X();
        this.f17886k.mo15933c(mo16305l(), 1);
        this.f17879d.mo15997E();
        Collections.emptyList();
    }

    /* renamed from: S */
    public final void mo16295S() {
        m18018X();
        m18014T();
        m18015U((Surface) null, false);
        m18016V(0, 0);
    }

    /* renamed from: c */
    public final void mo16296c(SurfaceHolder surfaceHolder) {
        m18018X();
        m18014T();
        if (surfaceHolder != null) {
            m18022ab();
        }
        this.f17895t = surfaceHolder;
        if (surfaceHolder == null) {
            m18015U((Surface) null, false);
            m18016V(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f17880e);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m18015U((Surface) null, false);
            m18016V(0, 0);
            return;
        }
        m18015U(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m18016V(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: d */
    public final void mo16297d(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        m18018X();
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        mo16296c(surfaceHolder);
    }

    /* renamed from: e */
    public final void mo16298e(C4203ng ngVar) {
        aup.m14890u(ngVar);
        this.f17884i.mo16352O(ngVar);
    }

    /* renamed from: f */
    public final void mo16299f(C4203ng ngVar) {
        this.f17884i.mo16353P(ngVar);
    }

    /* renamed from: g */
    public final void mo16300g(ane ane) {
        aup.m14890u(ane);
        this.f17881f.add(ane);
    }

    /* renamed from: h */
    public final void mo16301h(ane ane) {
        this.f17881f.remove(ane);
    }

    /* renamed from: i */
    public final int mo16302i() {
        m18018X();
        return this.f17879d.mo16003g();
    }

    @Deprecated
    /* renamed from: j */
    public final void mo16303j(abd abd) {
        m18018X();
        List singletonList = Collections.singletonList(abd);
        m18018X();
        this.f17879d.mo15996D(singletonList);
        m18018X();
        boolean l = mo16305l();
        int c = this.f17886k.mo15933c(l, 2);
        m18017W(l, c, m18021aa(l, c));
        this.f17879d.mo16004h();
    }

    /* renamed from: k */
    public final void mo16304k(boolean z) {
        m18018X();
        int c = this.f17886k.mo15933c(z, mo16302i());
        m18017W(z, c, m18021aa(z, c));
    }

    /* renamed from: l */
    public final boolean mo16305l() {
        m18018X();
        return this.f17879d.mo16006j();
    }

    /* renamed from: m */
    public final int mo16009m() {
        m18018X();
        return this.f17879d.mo16009m();
    }

    /* renamed from: n */
    public final int mo16010n() {
        m18018X();
        return this.f17879d.mo16010n();
    }

    /* renamed from: o */
    public final void mo16306o() {
        AudioTrack audioTrack;
        m18018X();
        if (amm.f15298a < 21 && (audioTrack = this.f17891p) != null) {
            audioTrack.release();
            this.f17891p = null;
        }
        this.f17885j.mo15928a();
        this.f17887l.mo16313d();
        this.f17888m.mo16339b(false);
        this.f17889n.mo16341b(false);
        this.f17886k.mo15934d();
        this.f17879d.mo16007k();
        this.f17884i.mo16355R();
        m18014T();
        Surface surface = this.f17892q;
        if (surface != null) {
            if (this.f17893r) {
                surface.release();
            }
            this.f17892q = null;
        }
        Collections.emptyList();
    }

    /* renamed from: p */
    public final long mo16012p() {
        m18018X();
        return this.f17879d.mo16012p();
    }

    /* renamed from: q */
    public final long mo16013q() {
        m18018X();
        return this.f17879d.mo16013q();
    }

    /* renamed from: r */
    public final boolean mo16014r() {
        m18018X();
        return this.f17879d.mo16014r();
    }

    /* renamed from: s */
    public final int mo16015s() {
        m18018X();
        return this.f17879d.mo16015s();
    }

    /* renamed from: t */
    public final int mo16016t() {
        m18018X();
        return this.f17879d.mo16016t();
    }

    /* renamed from: u */
    public final long mo16017u() {
        m18018X();
        return this.f17879d.mo16017u();
    }

    /* renamed from: v */
    public final C4171mb mo16018v() {
        m18018X();
        return this.f17879d.mo16018v();
    }

    /* renamed from: w */
    public final long mo16307w() {
        m18018X();
        return this.f17879d.mo16011o();
    }
}
