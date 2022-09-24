package com.google.ads.interactivemedia.p039v3.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ls */
/* compiled from: IMASDK */
final class C4161ls implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ano, C4226oc, C4079ir, C4075in, C4163lu, C4149lg, C4090jb {

    /* renamed from: a */
    final /* synthetic */ C4162lt f17873a;

    /* synthetic */ C4161ls(C4162lt ltVar) {
        this.f17873a = ltVar;
    }

    /* renamed from: A */
    public final void mo14117A(String str) {
        this.f17873a.f17884i.mo14117A(str);
    }

    /* renamed from: B */
    public final void mo14118B(C4266pp ppVar) {
        this.f17873a.f17884i.mo14118B(ppVar);
    }

    /* renamed from: C */
    public final void mo14119C(long j, int i) {
        this.f17873a.f17884i.mo14119C(j, i);
    }

    /* renamed from: D */
    public final void mo14120D(Exception exc) {
        this.f17873a.f17884i.mo14120D(exc);
    }

    /* renamed from: E */
    public final void mo16278E(C4266pp ppVar) {
        this.f17873a.f17884i.mo16278E(ppVar);
    }

    /* renamed from: F */
    public final void mo16279F(String str, long j, long j2) {
        this.f17873a.f17884i.mo16279F(str, j, j2);
    }

    /* renamed from: G */
    public final void mo16280G(C4120ke keVar, C4270pt ptVar) {
        this.f17873a.f17884i.mo16280G(keVar, ptVar);
    }

    /* renamed from: H */
    public final void mo16281H(long j) {
        this.f17873a.f17884i.mo16281H(j);
    }

    /* renamed from: I */
    public final void mo16282I(int i, long j, long j2) {
        this.f17873a.f17884i.mo16282I(i, j, j2);
    }

    /* renamed from: J */
    public final void mo16283J(String str) {
        this.f17873a.f17884i.mo16283J(str);
    }

    /* renamed from: K */
    public final void mo16284K(C4266pp ppVar) {
        this.f17873a.f17884i.mo16284K(ppVar);
    }

    /* renamed from: L */
    public final void mo16285L(boolean z) {
        if (this.f17873a.f17901z != z) {
            this.f17873a.f17901z = z;
            C4162lt.m18001F(this.f17873a);
        }
    }

    /* renamed from: M */
    public final void mo16286M(Exception exc) {
        this.f17873a.f17884i.mo16286M(exc);
    }

    /* renamed from: N */
    public final void mo16287N(Exception exc) {
        this.f17873a.f17884i.mo16287N(exc);
    }

    /* renamed from: a */
    public final void mo15987a() {
    }

    /* renamed from: b */
    public final void mo15988b() {
        C4162lt.m18011P(this.f17873a);
    }

    /* renamed from: c */
    public final void mo14121c(C4266pp ppVar) {
        this.f17873a.f17884i.mo14121c(ppVar);
    }

    /* renamed from: d */
    public final void mo14122d(String str, long j, long j2) {
        this.f17873a.f17884i.mo14122d(str, j, j2);
    }

    /* renamed from: e */
    public final void mo14123e(C4120ke keVar, C4270pt ptVar) {
        this.f17873a.f17884i.mo14123e(keVar, ptVar);
    }

    /* renamed from: f */
    public final void mo14124f(int i, long j) {
        this.f17873a.f17884i.mo14124f(i, j);
    }

    /* renamed from: g */
    public final void mo16232g(C4129kn knVar, int i) {
    }

    /* renamed from: h */
    public final void mo16233h(acq acq, ail ail) {
    }

    /* renamed from: i */
    public final void mo16234i(List list) {
    }

    /* renamed from: j */
    public final void mo16235j(boolean z) {
    }

    /* renamed from: k */
    public final void mo16236k(boolean z, int i) {
    }

    /* renamed from: l */
    public final void mo16237l(int i) {
        C4162lt.m18011P(this.f17873a);
    }

    /* renamed from: m */
    public final void mo16238m(boolean z, int i) {
        C4162lt.m18011P(this.f17873a);
    }

    /* renamed from: n */
    public final void mo16239n(int i) {
    }

    /* renamed from: o */
    public final void mo16240o(boolean z) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f17873a.m18015U(new Surface(surfaceTexture), true);
        this.f17873a.m18016V(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f17873a.m18015U((Surface) null, true);
        this.f17873a.m18016V(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f17873a.m18016V(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo16241p(C4089ja jaVar) {
    }

    /* renamed from: q */
    public final void mo16242q(int i) {
    }

    /* renamed from: r */
    public final void mo16243r(C4146ld ldVar) {
    }

    /* renamed from: s */
    public final void mo16244s() {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f17873a.m18016V(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f17873a.m18015U(surfaceHolder.getSurface(), false);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f17873a.m18015U((Surface) null, false);
        this.f17873a.m18016V(0, 0);
    }

    /* renamed from: t */
    public final void mo16245t() {
    }

    /* renamed from: u */
    public final void mo16246u() {
    }

    /* renamed from: v */
    public final void mo16247v() {
    }

    /* renamed from: w */
    public final void mo16248w(int i) {
    }

    /* renamed from: x */
    public final void mo16249x() {
    }

    /* renamed from: y */
    public final void mo14125y(int i, int i2, int i3, float f) {
        this.f17873a.f17884i.mo14125y(i, i2, i3, f);
        Iterator it = this.f17873a.f17881f.iterator();
        while (it.hasNext()) {
            ((ane) it.next()).mo14088c(i, i2, f);
        }
    }

    /* renamed from: z */
    public final void mo14126z(Surface surface, long j) {
        this.f17873a.f17884i.mo14126z(surface, j);
        if (this.f17873a.f17892q == surface) {
            Iterator it = this.f17873a.f17881f.iterator();
            while (it.hasNext()) {
                ((ane) it.next()).mo14086a();
            }
        }
    }
}
