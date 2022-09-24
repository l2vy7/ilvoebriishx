package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.ie */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7792ie implements C7680fe {

    /* renamed from: a */
    private final C8224ue[] f33210a;

    /* renamed from: b */
    private final C8373yk f33211b;

    /* renamed from: c */
    private final C8301wk f33212c;

    /* renamed from: d */
    private final Handler f33213d;

    /* renamed from: e */
    private final C8012oe f33214e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<C7571ce> f33215f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    private final C8403ze f33216g;

    /* renamed from: h */
    private final C8367ye f33217h;

    /* renamed from: i */
    private boolean f33218i;

    /* renamed from: j */
    private boolean f33219j = false;

    /* renamed from: k */
    private int f33220k = 1;

    /* renamed from: l */
    private int f33221l;

    /* renamed from: m */
    private int f33222m;

    /* renamed from: n */
    private boolean f33223n;

    /* renamed from: o */
    private C7501af f33224o;

    /* renamed from: p */
    private Object f33225p;

    /* renamed from: q */
    private C7870kk f33226q;

    /* renamed from: r */
    private C8301wk f33227r;

    /* renamed from: s */
    private C8188te f33228s;

    /* renamed from: t */
    private C7901le f33229t;

    /* renamed from: u */
    private long f33230u;

    @SuppressLint({"HandlerLeak"})
    public C7792ie(C8224ue[] ueVarArr, C8373yk ykVar, jr0 jr0, byte[] bArr) {
        String str = C7836jm.f33938e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.f33210a = ueVarArr;
        Objects.requireNonNull(ykVar);
        this.f33211b = ykVar;
        C8301wk wkVar = new C8301wk(new C8018ok[2], (byte[]) null);
        this.f33212c = wkVar;
        this.f33224o = C7501af.f29622a;
        this.f33216g = new C8403ze();
        this.f33217h = new C8367ye();
        this.f33226q = C7870kk.f34351d;
        this.f33227r = wkVar;
        this.f33228s = C8188te.f39400d;
        C7754he heVar = new C7754he(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f33213d = heVar;
        C7901le leVar = new C7901le(0, 0);
        this.f33229t = leVar;
        this.f33214e = new C8012oe(ueVarArr, ykVar, jr0, this.f33219j, 0, heVar, leVar, this, (byte[]) null);
    }

    /* renamed from: a */
    public final void mo31826a(int i) {
        this.f33214e.mo33881w(i);
    }

    /* renamed from: a0 */
    public final void mo31827a0(boolean z) {
        if (this.f33219j != z) {
            this.f33219j = z;
            this.f33214e.mo33883y(z);
            Iterator<C7571ce> it = this.f33215f.iterator();
            while (it.hasNext()) {
                it.next().mo30889w(z, this.f33220k);
            }
        }
    }

    /* renamed from: b */
    public final int mo32620b() {
        if (!this.f33224o.mo30370h() && this.f33221l <= 0) {
            this.f33224o.mo30366d(this.f33229t.f35009a, this.f33217h, false);
        }
        return 0;
    }

    /* renamed from: b0 */
    public final void mo31828b0(int i) {
        this.f33214e.mo33882x(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo32621c(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f33222m--;
                return;
            case 1:
                this.f33220k = message.arg1;
                Iterator<C7571ce> it = this.f33215f.iterator();
                while (it.hasNext()) {
                    it.next().mo30889w(this.f33219j, this.f33220k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f33223n = z;
                Iterator<C7571ce> it2 = this.f33215f.iterator();
                while (it2.hasNext()) {
                    it2.next().zza(this.f33223n);
                }
                return;
            case 3:
                if (this.f33222m == 0) {
                    C8409zk zkVar = (C8409zk) message.obj;
                    this.f33218i = true;
                    this.f33226q = zkVar.f42486a;
                    this.f33227r = zkVar.f42487b;
                    this.f33211b.mo35196b(zkVar.f42488c);
                    Iterator<C7571ce> it3 = this.f33215f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo30885c(this.f33226q, this.f33227r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f33221l - 1;
                this.f33221l = i;
                if (i == 0) {
                    this.f33229t = (C7901le) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<C7571ce> it4 = this.f33215f.iterator();
                        while (it4.hasNext()) {
                            it4.next().zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f33221l == 0) {
                    this.f33229t = (C7901le) message.obj;
                    Iterator<C7571ce> it5 = this.f33215f.iterator();
                    while (it5.hasNext()) {
                        it5.next().zze();
                    }
                    return;
                }
                return;
            case 6:
                C7976ne neVar = (C7976ne) message.obj;
                this.f33221l -= neVar.f35992d;
                if (this.f33222m == 0) {
                    this.f33224o = neVar.f35989a;
                    this.f33225p = neVar.f35990b;
                    this.f33229t = neVar.f35991c;
                    Iterator<C7571ce> it6 = this.f33215f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo30886e(this.f33224o, this.f33225p);
                    }
                    return;
                }
                return;
            case 7:
                C8188te teVar = (C8188te) message.obj;
                if (!this.f33228s.equals(teVar)) {
                    this.f33228s = teVar;
                    Iterator<C7571ce> it7 = this.f33215f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo30888s(teVar);
                    }
                    return;
                }
                return;
            case 8:
                C7536be beVar = (C7536be) message.obj;
                Iterator<C7571ce> it8 = this.f33215f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo30887f(beVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: c0 */
    public final void mo31829c0(C7643ee... eeVarArr) {
        this.f33214e.mo33880v(eeVarArr);
    }

    /* renamed from: d0 */
    public final void mo31830d0(C7571ce ceVar) {
        this.f33215f.remove(ceVar);
    }

    /* renamed from: e0 */
    public final void mo31831e0(long j) {
        mo32620b();
        if (this.f33224o.mo30370h() || this.f33224o.mo30365c() > 0) {
            this.f33221l++;
            if (!this.f33224o.mo30370h()) {
                this.f33224o.mo30369g(0, this.f33216g, false);
                long a = C7500ae.m30300a(j);
                long j2 = this.f33224o.mo30366d(0, this.f33217h, false).f41795c;
                if (j2 != C6540C.TIME_UNSET) {
                    int i = (a > j2 ? 1 : (a == j2 ? 0 : -1));
                }
            }
            this.f33230u = j;
            this.f33214e.mo33879u(this.f33224o, 0, C7500ae.m30300a(j));
            Iterator<C7571ce> it = this.f33215f.iterator();
            while (it.hasNext()) {
                it.next().zze();
            }
            return;
        }
        throw new C8119re(this.f33224o, 0, j);
    }

    /* renamed from: f0 */
    public final void mo31832f0(C8229uj ujVar) {
        if (!this.f33224o.mo30370h() || this.f33225p != null) {
            this.f33224o = C7501af.f29622a;
            this.f33225p = null;
            Iterator<C7571ce> it = this.f33215f.iterator();
            while (it.hasNext()) {
                it.next().mo30886e(this.f33224o, this.f33225p);
            }
        }
        if (this.f33218i) {
            this.f33218i = false;
            this.f33226q = C7870kk.f34351d;
            this.f33227r = this.f33212c;
            this.f33211b.mo35196b((Object) null);
            Iterator<C7571ce> it2 = this.f33215f.iterator();
            while (it2.hasNext()) {
                it2.next().mo30885c(this.f33226q, this.f33227r);
            }
        }
        this.f33222m++;
        this.f33214e.mo33877s(ujVar, true);
    }

    /* renamed from: g0 */
    public final void mo31833g0(C7643ee... eeVarArr) {
        this.f33214e.mo33875q(eeVarArr);
    }

    /* renamed from: h0 */
    public final void mo31834h0(C7571ce ceVar) {
        this.f33215f.add(ceVar);
    }

    public final int zza() {
        return this.f33220k;
    }

    public final long zzb() {
        if (this.f33224o.mo30370h() || this.f33221l > 0) {
            return this.f33230u;
        }
        this.f33224o.mo30366d(this.f33229t.f35009a, this.f33217h, false);
        return C7500ae.m30301b(0) + C7500ae.m30301b(this.f33229t.f35012d);
    }

    public final long zzc() {
        if (this.f33224o.mo30370h() || this.f33221l > 0) {
            return this.f33230u;
        }
        this.f33224o.mo30366d(this.f33229t.f35009a, this.f33217h, false);
        return C7500ae.m30301b(0) + C7500ae.m30301b(this.f33229t.f35011c);
    }

    public final long zzd() {
        if (this.f33224o.mo30370h()) {
            return C6540C.TIME_UNSET;
        }
        C7501af afVar = this.f33224o;
        mo32620b();
        return C7500ae.m30301b(afVar.mo30369g(0, this.f33216g, false).f42441a);
    }

    public final void zzg() {
        this.f33214e.mo33876r();
    }

    public final void zzi() {
        this.f33214e.mo33878t();
        this.f33213d.removeCallbacksAndMessages((Object) null);
    }

    public final void zzp() {
        this.f33214e.mo33884z();
    }

    public final boolean zzq() {
        return this.f33219j;
    }
}
