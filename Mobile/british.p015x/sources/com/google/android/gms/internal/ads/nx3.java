package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nx3 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ua4, s04, y64, e44, y83, v43, sx3, l70, wl3 {

    /* renamed from: b */
    final /* synthetic */ qx3 f36168b;

    /* synthetic */ nx3(qx3 qx3, mx3 mx3) {
        this.f36168b = qx3;
    }

    /* renamed from: B */
    public final void mo18016B(int i, long j) {
        this.f36168b.f38335i.mo18016B(i, j);
    }

    /* renamed from: C */
    public final void mo18017C(Exception exc) {
        this.f36168b.f38335i.mo18017C(exc);
    }

    /* renamed from: D */
    public final void mo18018D(boolean z, int i) {
        qx3.m36805t(this.f36168b);
    }

    /* renamed from: E */
    public final void mo18019E(mc3 mc3) {
        this.f36168b.f38335i.mo18019E(mc3);
        this.f36168b.f38342p = null;
        this.f36168b.f38350x = null;
    }

    /* renamed from: F */
    public final /* synthetic */ void mo18020F(gi0 gi0, int i) {
    }

    /* renamed from: H */
    public final void mo18022H(String str, long j, long j2) {
        this.f36168b.f38335i.mo18022H(str, j, j2);
    }

    /* renamed from: L */
    public final void mo18026L(C8281w wVar, nd3 nd3) {
        this.f36168b.f38342p = wVar;
        this.f36168b.f38335i.mo18026L(wVar, nd3);
    }

    /* renamed from: M */
    public final /* synthetic */ void mo18027M(iw0 iw0) {
    }

    /* renamed from: O */
    public final /* synthetic */ void mo18029O(C7916lt ltVar) {
    }

    /* renamed from: P */
    public final void mo18030P(String str) {
        this.f36168b.f38335i.mo18030P(str);
    }

    /* renamed from: Q */
    public final /* synthetic */ void mo18031Q(C7764ho hoVar, int i) {
    }

    /* renamed from: R */
    public final /* synthetic */ void mo18032R(cm0 cm0, cn0 cn0) {
    }

    /* renamed from: S */
    public final /* synthetic */ void mo18033S(f00 f00) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo33783a(boolean z) {
    }

    /* renamed from: b */
    public final void mo18042b(mc3 mc3) {
        this.f36168b.f38349w = mc3;
        this.f36168b.f38335i.mo18042b(mc3);
    }

    /* renamed from: c */
    public final void mo18044c(Exception exc) {
        this.f36168b.f38335i.mo18044c(exc);
    }

    /* renamed from: d */
    public final void mo18046d(String str, long j, long j2) {
        this.f36168b.f38335i.mo18046d(str, j, j2);
    }

    /* renamed from: e */
    public final void mo18048e(int i, long j, long j2) {
        this.f36168b.f38335i.mo18048e(i, j, j2);
    }

    /* renamed from: g */
    public final void mo18050g(boolean z) {
        if (this.f36168b.f38322B != z) {
            this.f36168b.f38322B = z;
            qx3.m36800o(this.f36168b);
        }
    }

    /* renamed from: h */
    public final void mo18051h(ky0 ky0) {
        this.f36168b.f38327G = ky0;
        this.f36168b.f38335i.mo18051h(ky0);
        Iterator it = this.f36168b.f38334h.iterator();
        while (it.hasNext()) {
            ((m80) it.next()).mo18051h(ky0);
        }
    }

    /* renamed from: j */
    public final void mo18053j(mc3 mc3) {
        this.f36168b.f38335i.mo18053j(mc3);
        this.f36168b.f38341o = null;
        this.f36168b.f38349w = null;
    }

    /* renamed from: k */
    public final void mo18054k(Object obj, long j) {
        this.f36168b.f38335i.mo18054k(obj, j);
        if (this.f36168b.f38344r == obj) {
            Iterator it = this.f36168b.f38334h.iterator();
            while (it.hasNext()) {
                ((m80) it.next()).mo18049f();
            }
        }
    }

    /* renamed from: m */
    public final void mo18056m(Exception exc) {
        this.f36168b.f38335i.mo18056m(exc);
    }

    /* renamed from: n */
    public final void mo18057n(long j) {
        this.f36168b.f38335i.mo18057n(j);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo18058o(int i) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        qx3.m36802q(this.f36168b, surfaceTexture);
        this.f36168b.m36779I(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f36168b.m36782L((Object) null);
        this.f36168b.m36779I(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f36168b.m36779I(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo18059p(int i) {
        qx3.m36805t(this.f36168b);
    }

    /* renamed from: q */
    public final void mo18060q(boolean z) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo18061r(h20 h20) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo18062s(ja0 ja0, ja0 ja02, int i) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f36168b.m36779I(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f36168b.m36779I(0, 0);
    }

    /* renamed from: t */
    public final /* synthetic */ void mo18063t(boolean z, int i) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo18064u(k60 k60) {
    }

    /* renamed from: v */
    public final void mo33791v(boolean z) {
        qx3.m36805t(this.f36168b);
    }

    /* renamed from: w */
    public final void mo18066w(C8281w wVar, nd3 nd3) {
        this.f36168b.f38341o = wVar;
        this.f36168b.f38335i.mo18066w(wVar, nd3);
    }

    /* renamed from: x */
    public final /* synthetic */ void mo18067x(boolean z) {
    }

    /* renamed from: y */
    public final void mo18068y(long j, int i) {
        this.f36168b.f38335i.mo18068y(j, i);
    }

    /* renamed from: z */
    public final void mo18069z(mc3 mc3) {
        this.f36168b.f38350x = mc3;
        this.f36168b.f38335i.mo18069z(mc3);
    }

    public final /* synthetic */ void zzm() {
    }

    public final void zzw(String str) {
        this.f36168b.f38335i.zzw(str);
    }
}
