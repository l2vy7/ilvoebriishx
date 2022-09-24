package p141r2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C3319b;
import com.bumptech.glide.C3333i;
import com.bumptech.glide.C3335j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p004a3.C0065j;
import p018c2.C2645a;
import p064d2.C5159f;
import p064d2.C5167l;
import p081g2.C5292j;
import p086h2.C5387e;
import p168w2.C6310f;
import p173x2.C6381c;
import p178y2.C6405b;
import p183z2.C6445b;

/* renamed from: r2.g */
/* compiled from: GifFrameLoader */
class C5987g {

    /* renamed from: a */
    private final C2645a f24953a;

    /* renamed from: b */
    private final Handler f24954b;

    /* renamed from: c */
    private final List<C5989b> f24955c;

    /* renamed from: d */
    final C3335j f24956d;

    /* renamed from: e */
    private final C5387e f24957e;

    /* renamed from: f */
    private boolean f24958f;

    /* renamed from: g */
    private boolean f24959g;

    /* renamed from: h */
    private boolean f24960h;

    /* renamed from: i */
    private C3333i<Bitmap> f24961i;

    /* renamed from: j */
    private C5988a f24962j;

    /* renamed from: k */
    private boolean f24963k;

    /* renamed from: l */
    private C5988a f24964l;

    /* renamed from: m */
    private Bitmap f24965m;

    /* renamed from: n */
    private C5167l<Bitmap> f24966n;

    /* renamed from: o */
    private C5988a f24967o;

    /* renamed from: p */
    private C5991d f24968p;

    /* renamed from: q */
    private int f24969q;

    /* renamed from: r */
    private int f24970r;

    /* renamed from: s */
    private int f24971s;

    /* renamed from: r2.g$a */
    /* compiled from: GifFrameLoader */
    static class C5988a extends C6381c<Bitmap> {

        /* renamed from: e */
        private final Handler f24972e;

        /* renamed from: f */
        final int f24973f;

        /* renamed from: g */
        private final long f24974g;

        /* renamed from: h */
        private Bitmap f24975h;

        C5988a(Handler handler, int i, long j) {
            this.f24972e = handler;
            this.f24973f = i;
            this.f24974g = j;
        }

        /* renamed from: h */
        public void mo23080h(Drawable drawable) {
            this.f24975h = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Bitmap mo23081i() {
            return this.f24975h;
        }

        /* renamed from: j */
        public void mo23079b(Bitmap bitmap, C6405b<? super Bitmap> bVar) {
            this.f24975h = bitmap;
            this.f24972e.sendMessageAtTime(this.f24972e.obtainMessage(1, this), this.f24974g);
        }
    }

    /* renamed from: r2.g$b */
    /* compiled from: GifFrameLoader */
    public interface C5989b {
        /* renamed from: a */
        void mo23042a();
    }

    /* renamed from: r2.g$c */
    /* compiled from: GifFrameLoader */
    private class C5990c implements Handler.Callback {
        C5990c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C5987g.this.mo23075m((C5988a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C5987g.this.f24956d.mo11149l((C5988a) message.obj);
                return false;
            }
        }
    }

    /* renamed from: r2.g$d */
    /* compiled from: GifFrameLoader */
    interface C5991d {
        /* renamed from: a */
        void mo23084a();
    }

    C5987g(C3319b bVar, C2645a aVar, int i, int i2, C5167l<Bitmap> lVar, Bitmap bitmap) {
        this(bVar.mo11093f(), C3319b.m11103t(bVar.mo11095h()), aVar, (Handler) null, m26391i(C3319b.m11103t(bVar.mo11095h()), i, i2), lVar, bitmap);
    }

    /* renamed from: g */
    private static C5159f m26390g() {
        return new C6445b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C3333i<Bitmap> m26391i(C3335j jVar, int i, int i2) {
        return jVar.mo11147j().mo11139a(((C6310f) ((C6310f) C6310f.m27773s0(C5292j.f23392b).mo24054q0(true)).mo24045l0(true)).mo24033d0(i, i2));
    }

    /* renamed from: l */
    private void m26392l() {
        if (this.f24958f && !this.f24959g) {
            if (this.f24960h) {
                C0065j.m244a(this.f24967o == null, "Pending target must be null when starting from the first frame");
                this.f24953a.mo9311f();
                this.f24960h = false;
            }
            C5988a aVar = this.f24967o;
            if (aVar != null) {
                this.f24967o = null;
                mo23075m(aVar);
                return;
            }
            this.f24959g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f24953a.mo9309d());
            this.f24953a.mo9306b();
            this.f24964l = new C5988a(this.f24954b, this.f24953a.mo9312g(), uptimeMillis);
            this.f24961i.mo11139a(C6310f.m27774t0(m26390g())).mo11137E0(this.f24953a).mo11145z0(this.f24964l);
        }
    }

    /* renamed from: n */
    private void m26393n() {
        Bitmap bitmap = this.f24965m;
        if (bitmap != null) {
            this.f24957e.mo21827c(bitmap);
            this.f24965m = null;
        }
    }

    /* renamed from: p */
    private void m26394p() {
        if (!this.f24958f) {
            this.f24958f = true;
            this.f24963k = false;
            m26392l();
        }
    }

    /* renamed from: q */
    private void m26395q() {
        this.f24958f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo23066a() {
        this.f24955c.clear();
        m26393n();
        m26395q();
        C5988a aVar = this.f24962j;
        if (aVar != null) {
            this.f24956d.mo11149l(aVar);
            this.f24962j = null;
        }
        C5988a aVar2 = this.f24964l;
        if (aVar2 != null) {
            this.f24956d.mo11149l(aVar2);
            this.f24964l = null;
        }
        C5988a aVar3 = this.f24967o;
        if (aVar3 != null) {
            this.f24956d.mo11149l(aVar3);
            this.f24967o = null;
        }
        this.f24953a.clear();
        this.f24963k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo23067b() {
        return this.f24953a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo23068c() {
        C5988a aVar = this.f24962j;
        return aVar != null ? aVar.mo23081i() : this.f24965m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo23069d() {
        C5988a aVar = this.f24962j;
        if (aVar != null) {
            return aVar.f24973f;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo23070e() {
        return this.f24965m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23071f() {
        return this.f24953a.mo9307c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo23072h() {
        return this.f24971s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo23073j() {
        return this.f24953a.mo9314h() + this.f24969q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo23074k() {
        return this.f24970r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo23075m(C5988a aVar) {
        C5991d dVar = this.f24968p;
        if (dVar != null) {
            dVar.mo23084a();
        }
        this.f24959g = false;
        if (this.f24963k) {
            this.f24954b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f24958f) {
            this.f24967o = aVar;
        } else {
            if (aVar.mo23081i() != null) {
                m26393n();
                C5988a aVar2 = this.f24962j;
                this.f24962j = aVar;
                for (int size = this.f24955c.size() - 1; size >= 0; size--) {
                    this.f24955c.get(size).mo23042a();
                }
                if (aVar2 != null) {
                    this.f24954b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m26392l();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d2.l, d2.l<android.graphics.Bitmap>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23076o(p064d2.C5167l<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = p004a3.C0065j.m247d(r3)
            d2.l r0 = (p064d2.C5167l) r0
            r2.f24966n = r0
            java.lang.Object r0 = p004a3.C0065j.m247d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f24965m = r0
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r2.f24961i
            w2.f r1 = new w2.f
            r1.<init>()
            w2.a r3 = r1.mo24047m0(r3)
            com.bumptech.glide.i r3 = r0.mo11139a(r3)
            r2.f24961i = r3
            int r3 = p004a3.C0066k.m255g(r4)
            r2.f24969q = r3
            int r3 = r4.getWidth()
            r2.f24970r = r3
            int r3 = r4.getHeight()
            r2.f24971s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p141r2.C5987g.mo23076o(d2.l, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo23077r(C5989b bVar) {
        if (this.f24963k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f24955c.contains(bVar)) {
            boolean isEmpty = this.f24955c.isEmpty();
            this.f24955c.add(bVar);
            if (isEmpty) {
                m26394p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo23078s(C5989b bVar) {
        this.f24955c.remove(bVar);
        if (this.f24955c.isEmpty()) {
            m26395q();
        }
    }

    C5987g(C5387e eVar, C3335j jVar, C2645a aVar, Handler handler, C3333i<Bitmap> iVar, C5167l<Bitmap> lVar, Bitmap bitmap) {
        this.f24955c = new ArrayList();
        this.f24956d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C5990c()) : handler;
        this.f24957e = eVar;
        this.f24954b = handler;
        this.f24961i = iVar;
        this.f24953a = aVar;
        mo23076o(lVar, bitmap);
    }
}
