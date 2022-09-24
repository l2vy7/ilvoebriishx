package p168w2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C3325f;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Map;
import p004a3.C0055b;
import p004a3.C0065j;
import p004a3.C0066k;
import p064d2.C5159f;
import p064d2.C5163h;
import p064d2.C5167l;
import p081g2.C5292j;
import p118n2.C5815i;
import p118n2.C5816j;
import p118n2.C5823l;
import p118n2.C5838q;
import p168w2.C6304a;
import p183z2.C6444a;

/* renamed from: w2.a */
/* compiled from: BaseRequestOptions */
public abstract class C6304a<T extends C6304a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f25995A;

    /* renamed from: b */
    private int f25996b;

    /* renamed from: c */
    private float f25997c = 1.0f;

    /* renamed from: d */
    private C5292j f25998d = C5292j.f23395e;

    /* renamed from: e */
    private C3325f f25999e = C3325f.NORMAL;

    /* renamed from: f */
    private Drawable f26000f;

    /* renamed from: g */
    private int f26001g;

    /* renamed from: h */
    private Drawable f26002h;

    /* renamed from: i */
    private int f26003i;

    /* renamed from: j */
    private boolean f26004j = true;

    /* renamed from: k */
    private int f26005k = -1;

    /* renamed from: l */
    private int f26006l = -1;

    /* renamed from: m */
    private C5159f f26007m = C6444a.m28132c();

    /* renamed from: n */
    private boolean f26008n;

    /* renamed from: o */
    private boolean f26009o = true;

    /* renamed from: p */
    private Drawable f26010p;

    /* renamed from: q */
    private int f26011q;

    /* renamed from: r */
    private C5163h f26012r = new C5163h();

    /* renamed from: s */
    private Map<Class<?>, C5167l<?>> f26013s = new C0055b();

    /* renamed from: t */
    private Class<?> f26014t = Object.class;

    /* renamed from: u */
    private boolean f26015u;

    /* renamed from: v */
    private Resources.Theme f26016v;

    /* renamed from: w */
    private boolean f26017w;

    /* renamed from: x */
    private boolean f26018x;

    /* renamed from: y */
    private boolean f26019y;

    /* renamed from: z */
    private boolean f26020z = true;

    /* renamed from: R */
    private boolean m27689R(int i) {
        return m27690S(this.f25996b, i);
    }

    /* renamed from: S */
    private static boolean m27690S(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d2.l, d2.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m27691b0(p118n2.C5823l r2, p064d2.C5167l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            w2.a r2 = r1.m27692f0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.m27691b0(n2.l, d2.l):w2.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d2.l, d2.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m27692f0(p118n2.C5823l r1, p064d2.C5167l<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            w2.a r1 = r0.mo24053p0(r1, r2)
            goto L_0x000b
        L_0x0007:
            w2.a r1 = r0.mo24031c0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f26020z = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.m27692f0(n2.l, d2.l, boolean):w2.a");
    }

    /* renamed from: g0 */
    private T m27693g0() {
        return this;
    }

    /* renamed from: h0 */
    private T m27694h0() {
        if (!this.f26015u) {
            return m27693g0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: B */
    public final int mo24010B() {
        return this.f26003i;
    }

    /* renamed from: C */
    public final C3325f mo24011C() {
        return this.f25999e;
    }

    /* renamed from: H */
    public final Class<?> mo24012H() {
        return this.f26014t;
    }

    /* renamed from: I */
    public final C5159f mo24013I() {
        return this.f26007m;
    }

    /* renamed from: J */
    public final float mo24014J() {
        return this.f25997c;
    }

    /* renamed from: K */
    public final Resources.Theme mo24015K() {
        return this.f26016v;
    }

    /* renamed from: L */
    public final Map<Class<?>, C5167l<?>> mo24016L() {
        return this.f26013s;
    }

    /* renamed from: M */
    public final boolean mo24017M() {
        return this.f25995A;
    }

    /* renamed from: N */
    public final boolean mo24018N() {
        return this.f26018x;
    }

    /* renamed from: O */
    public final boolean mo24019O() {
        return this.f26004j;
    }

    /* renamed from: P */
    public final boolean mo24020P() {
        return m27689R(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo24021Q() {
        return this.f26020z;
    }

    /* renamed from: T */
    public final boolean mo24022T() {
        return this.f26009o;
    }

    /* renamed from: U */
    public final boolean mo24023U() {
        return this.f26008n;
    }

    /* renamed from: V */
    public final boolean mo24024V() {
        return m27689R(2048);
    }

    /* renamed from: W */
    public final boolean mo24025W() {
        return C0066k.m267s(this.f26006l, this.f26005k);
    }

    /* renamed from: X */
    public T mo24026X() {
        this.f26015u = true;
        return m27693g0();
    }

    /* renamed from: Y */
    public T mo24027Y() {
        return mo24031c0(C5823l.f24544e, new C5815i());
    }

    /* renamed from: Z */
    public T mo24028Z() {
        return m27691b0(C5823l.f24543d, new C5816j());
    }

    /* renamed from: a */
    public T mo11139a(C6304a<?> aVar) {
        if (this.f26017w) {
            return clone().mo11139a(aVar);
        }
        if (m27690S(aVar.f25996b, 2)) {
            this.f25997c = aVar.f25997c;
        }
        if (m27690S(aVar.f25996b, 262144)) {
            this.f26018x = aVar.f26018x;
        }
        if (m27690S(aVar.f25996b, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.f25995A = aVar.f25995A;
        }
        if (m27690S(aVar.f25996b, 4)) {
            this.f25998d = aVar.f25998d;
        }
        if (m27690S(aVar.f25996b, 8)) {
            this.f25999e = aVar.f25999e;
        }
        if (m27690S(aVar.f25996b, 16)) {
            this.f26000f = aVar.f26000f;
            this.f26001g = 0;
            this.f25996b &= -33;
        }
        if (m27690S(aVar.f25996b, 32)) {
            this.f26001g = aVar.f26001g;
            this.f26000f = null;
            this.f25996b &= -17;
        }
        if (m27690S(aVar.f25996b, 64)) {
            this.f26002h = aVar.f26002h;
            this.f26003i = 0;
            this.f25996b &= -129;
        }
        if (m27690S(aVar.f25996b, 128)) {
            this.f26003i = aVar.f26003i;
            this.f26002h = null;
            this.f25996b &= -65;
        }
        if (m27690S(aVar.f25996b, 256)) {
            this.f26004j = aVar.f26004j;
        }
        if (m27690S(aVar.f25996b, 512)) {
            this.f26006l = aVar.f26006l;
            this.f26005k = aVar.f26005k;
        }
        if (m27690S(aVar.f25996b, 1024)) {
            this.f26007m = aVar.f26007m;
        }
        if (m27690S(aVar.f25996b, 4096)) {
            this.f26014t = aVar.f26014t;
        }
        if (m27690S(aVar.f25996b, 8192)) {
            this.f26010p = aVar.f26010p;
            this.f26011q = 0;
            this.f25996b &= -16385;
        }
        if (m27690S(aVar.f25996b, 16384)) {
            this.f26011q = aVar.f26011q;
            this.f26010p = null;
            this.f25996b &= -8193;
        }
        if (m27690S(aVar.f25996b, 32768)) {
            this.f26016v = aVar.f26016v;
        }
        if (m27690S(aVar.f25996b, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
            this.f26009o = aVar.f26009o;
        }
        if (m27690S(aVar.f25996b, 131072)) {
            this.f26008n = aVar.f26008n;
        }
        if (m27690S(aVar.f25996b, 2048)) {
            this.f26013s.putAll(aVar.f26013s);
            this.f26020z = aVar.f26020z;
        }
        if (m27690S(aVar.f25996b, 524288)) {
            this.f26019y = aVar.f26019y;
        }
        if (!this.f26009o) {
            this.f26013s.clear();
            int i = this.f25996b & -2049;
            this.f25996b = i;
            this.f26008n = false;
            this.f25996b = i & -131073;
            this.f26020z = true;
        }
        this.f25996b |= aVar.f25996b;
        this.f26012r.mo21341d(aVar.f26012r);
        return m27694h0();
    }

    /* renamed from: a0 */
    public T mo24029a0() {
        return m27691b0(C5823l.f24542c, new C5838q());
    }

    /* renamed from: b */
    public T mo24030b() {
        if (!this.f26015u || this.f26017w) {
            this.f26017w = true;
            return mo24026X();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t = (C6304a) super.clone();
            C5163h hVar = new C5163h();
            t.f26012r = hVar;
            hVar.mo21341d(this.f26012r);
            C0055b bVar = new C0055b();
            t.f26013s = bVar;
            bVar.putAll(this.f26013s);
            t.f26015u = false;
            t.f26017w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d2.l, d2.l<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo24031c0(p118n2.C5823l r2, p064d2.C5167l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f26017w
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.mo24031c0(r2, r3)
            return r2
        L_0x000d:
            r1.mo24037h(r2)
            r2 = 0
            w2.a r2 = r1.mo24049n0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.mo24031c0(n2.l, d2.l):w2.a");
    }

    /* renamed from: d */
    public T mo24032d(Class<?> cls) {
        if (this.f26017w) {
            return clone().mo24032d(cls);
        }
        this.f26014t = (Class) C0065j.m247d(cls);
        this.f25996b |= 4096;
        return m27694h0();
    }

    /* renamed from: d0 */
    public T mo24033d0(int i, int i2) {
        if (this.f26017w) {
            return clone().mo24033d0(i, i2);
        }
        this.f26006l = i;
        this.f26005k = i2;
        this.f25996b |= 512;
        return m27694h0();
    }

    /* renamed from: e0 */
    public T mo24034e0(C3325f fVar) {
        if (this.f26017w) {
            return clone().mo24034e0(fVar);
        }
        this.f25999e = (C3325f) C0065j.m247d(fVar);
        this.f25996b |= 8;
        return m27694h0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6304a)) {
            return false;
        }
        C6304a aVar = (C6304a) obj;
        if (Float.compare(aVar.f25997c, this.f25997c) == 0 && this.f26001g == aVar.f26001g && C0066k.m251c(this.f26000f, aVar.f26000f) && this.f26003i == aVar.f26003i && C0066k.m251c(this.f26002h, aVar.f26002h) && this.f26011q == aVar.f26011q && C0066k.m251c(this.f26010p, aVar.f26010p) && this.f26004j == aVar.f26004j && this.f26005k == aVar.f26005k && this.f26006l == aVar.f26006l && this.f26008n == aVar.f26008n && this.f26009o == aVar.f26009o && this.f26018x == aVar.f26018x && this.f26019y == aVar.f26019y && this.f25998d.equals(aVar.f25998d) && this.f25999e == aVar.f25999e && this.f26012r.equals(aVar.f26012r) && this.f26013s.equals(aVar.f26013s) && this.f26014t.equals(aVar.f26014t) && C0066k.m251c(this.f26007m, aVar.f26007m) && C0066k.m251c(this.f26016v, aVar.f26016v)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public T mo24036g(C5292j jVar) {
        if (this.f26017w) {
            return clone().mo24036g(jVar);
        }
        this.f25998d = (C5292j) C0065j.m247d(jVar);
        this.f25996b |= 4;
        return m27694h0();
    }

    /* renamed from: h */
    public T mo24037h(C5823l lVar) {
        return mo24040i0(C5823l.f24547h, C0065j.m247d(lVar));
    }

    public int hashCode() {
        return C0066k.m262n(this.f26016v, C0066k.m262n(this.f26007m, C0066k.m262n(this.f26014t, C0066k.m262n(this.f26013s, C0066k.m262n(this.f26012r, C0066k.m262n(this.f25999e, C0066k.m262n(this.f25998d, C0066k.m263o(this.f26019y, C0066k.m263o(this.f26018x, C0066k.m263o(this.f26009o, C0066k.m263o(this.f26008n, C0066k.m261m(this.f26006l, C0066k.m261m(this.f26005k, C0066k.m263o(this.f26004j, C0066k.m262n(this.f26010p, C0066k.m261m(this.f26011q, C0066k.m262n(this.f26002h, C0066k.m261m(this.f26003i, C0066k.m262n(this.f26000f, C0066k.m261m(this.f26001g, C0066k.m258j(this.f25997c)))))))))))))))))))));
    }

    /* renamed from: i */
    public final C5292j mo24039i() {
        return this.f25998d;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d2.g<Y>, d2.g, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo24040i0(p064d2.C5160g<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f26017w
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.mo24040i0(r2, r3)
            return r2
        L_0x000d:
            p004a3.C0065j.m247d(r2)
            p004a3.C0065j.m247d(r3)
            d2.h r0 = r1.f26012r
            r0.mo21342e(r2, r3)
            w2.a r2 = r1.m27694h0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.mo24040i0(d2.g, java.lang.Object):w2.a");
    }

    /* renamed from: j0 */
    public T mo24041j0(C5159f fVar) {
        if (this.f26017w) {
            return clone().mo24041j0(fVar);
        }
        this.f26007m = (C5159f) C0065j.m247d(fVar);
        this.f25996b |= 1024;
        return m27694h0();
    }

    /* renamed from: k */
    public final int mo24042k() {
        return this.f26001g;
    }

    /* renamed from: k0 */
    public T mo24043k0(float f) {
        if (this.f26017w) {
            return clone().mo24043k0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f25997c = f;
        this.f25996b |= 2;
        return m27694h0();
    }

    /* renamed from: l */
    public final Drawable mo24044l() {
        return this.f26000f;
    }

    /* renamed from: l0 */
    public T mo24045l0(boolean z) {
        if (this.f26017w) {
            return clone().mo24045l0(true);
        }
        this.f26004j = !z;
        this.f25996b |= 256;
        return m27694h0();
    }

    /* renamed from: m */
    public final Drawable mo24046m() {
        return this.f26010p;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d2.l, d2.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo24047m0(p064d2.C5167l<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            w2.a r2 = r1.mo24049n0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.mo24047m0(d2.l):w2.a");
    }

    /* renamed from: n */
    public final int mo24048n() {
        return this.f26011q;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d2.l, d2.l<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo24049n0(p064d2.C5167l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f26017w
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r2.clone()
            w2.a r3 = r0.mo24049n0(r3, r4)
            return r3
        L_0x000d:
            n2.o r0 = new n2.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo24051o0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo24051o0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            d2.l r0 = r0.mo22732c()
            r2.mo24051o0(r1, r0, r4)
            java.lang.Class<r2.c> r0 = p141r2.C5982c.class
            r2.f r1 = new r2.f
            r1.<init>(r3)
            r2.mo24051o0(r0, r1, r4)
            w2.a r3 = r2.m27694h0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.mo24049n0(d2.l, boolean):w2.a");
    }

    /* renamed from: o */
    public final boolean mo24050o() {
        return this.f26019y;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [d2.l, d2.l<Y>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo24051o0(java.lang.Class<Y> r2, p064d2.C5167l<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f26017w
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.mo24051o0(r2, r3, r4)
            return r2
        L_0x000d:
            p004a3.C0065j.m247d(r2)
            p004a3.C0065j.m247d(r3)
            java.util.Map<java.lang.Class<?>, d2.l<?>> r0 = r1.f26013s
            r0.put(r2, r3)
            int r2 = r1.f25996b
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f25996b = r2
            r3 = 1
            r1.f26009o = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f25996b = r2
            r0 = 0
            r1.f26020z = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f25996b = r2
            r1.f26008n = r3
        L_0x0032:
            w2.a r2 = r1.m27694h0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.mo24051o0(java.lang.Class, d2.l, boolean):w2.a");
    }

    /* renamed from: p */
    public final C5163h mo24052p() {
        return this.f26012r;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d2.l, d2.l<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo24053p0(p118n2.C5823l r2, p064d2.C5167l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f26017w
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.mo24053p0(r2, r3)
            return r2
        L_0x000d:
            r1.mo24037h(r2)
            w2.a r2 = r1.mo24047m0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p168w2.C6304a.mo24053p0(n2.l, d2.l):w2.a");
    }

    /* renamed from: q0 */
    public T mo24054q0(boolean z) {
        if (this.f26017w) {
            return clone().mo24054q0(z);
        }
        this.f25995A = z;
        this.f25996b |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        return m27694h0();
    }

    /* renamed from: s */
    public final int mo24055s() {
        return this.f26005k;
    }

    /* renamed from: w */
    public final int mo24056w() {
        return this.f26006l;
    }

    /* renamed from: y */
    public final Drawable mo24057y() {
        return this.f26002h;
    }
}
