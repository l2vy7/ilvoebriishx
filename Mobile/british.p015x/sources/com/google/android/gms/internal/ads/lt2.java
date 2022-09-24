package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lt2 implements kt2 {
    @GuardedBy("this")

    /* renamed from: a */
    private final ConcurrentHashMap<tt2, jt2> f35260a;

    /* renamed from: b */
    private final zzffu f35261b;

    /* renamed from: c */
    private final nt2 f35262c = new nt2();

    public lt2(zzffu zzffu) {
        this.f35260a = new ConcurrentHashMap<>(zzffu.f21171g);
        this.f35261b = zzffu;
    }

    /* renamed from: e */
    private final void m34551e() {
        Parcelable.Creator<zzffu> creator = zzffu.CREATOR;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36940N4)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35261b.f21169e);
            sb.append(" PoolCollection");
            sb.append(this.f35262c.mo33756b());
            int i = 0;
            for (Map.Entry next : this.f35260a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((tt2) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((jt2) next.getValue()).mo32980b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((jt2) next.getValue()).mo32980b(); b < this.f35261b.f21171g; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((jt2) next.getValue()).mo32985g());
                sb.append("\n");
            }
            while (i < this.f35261b.f21170f) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            co0.zze(sb.toString());
        }
    }

    @Deprecated
    /* renamed from: a */
    public final tt2 mo33177a(zzbfd zzbfd, String str, zzbfo zzbfo) {
        return new ut2(zzbfd, str, new xi0(this.f35261b.f21167c).mo35758a().f41886k, this.f35261b.f21173i, zzbfo);
    }

    /* renamed from: b */
    public final synchronized boolean mo33178b(tt2 tt2) {
        jt2 jt2 = this.f35260a.get(tt2);
        if (jt2 == null) {
            return true;
        }
        if (jt2.mo32980b() < this.f35261b.f21171g) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized boolean mo33179c(tt2 tt2, st2<?, ?> st2) {
        boolean h;
        jt2 jt2 = this.f35260a.get(tt2);
        st2.f39063d = zzt.zzA().currentTimeMillis();
        if (jt2 == null) {
            zzffu zzffu = this.f35261b;
            jt2 = new jt2(zzffu.f21171g, zzffu.f21172h * 1000);
            int size = this.f35260a.size();
            zzffu zzffu2 = this.f35261b;
            if (size == zzffu2.f21170f) {
                int i = zzffu2.f21178n;
                int i2 = i - 1;
                tt2 tt22 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry next : this.f35260a.entrySet()) {
                            if (((jt2) next.getValue()).mo32981c() < j) {
                                j = ((jt2) next.getValue()).mo32981c();
                                tt22 = (tt2) next.getKey();
                            }
                        }
                        if (tt22 != null) {
                            this.f35260a.remove(tt22);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry next2 : this.f35260a.entrySet()) {
                            if (((jt2) next2.getValue()).mo32982d() < j) {
                                j = ((jt2) next2.getValue()).mo32982d();
                                tt22 = (tt2) next2.getKey();
                            }
                        }
                        if (tt22 != null) {
                            this.f35260a.remove(tt22);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry next3 : this.f35260a.entrySet()) {
                            if (((jt2) next3.getValue()).mo32979a() < i3) {
                                i3 = ((jt2) next3.getValue()).mo32979a();
                                tt22 = (tt2) next3.getKey();
                            }
                        }
                        if (tt22 != null) {
                            this.f35260a.remove(tt22);
                        }
                    }
                    this.f35262c.mo33761g();
                } else {
                    throw null;
                }
            }
            this.f35260a.put(tt2, jt2);
            this.f35262c.mo33758d();
        }
        h = jt2.mo32986h(st2);
        this.f35262c.mo33757c();
        mt2 a = this.f35262c.mo33755a();
        hu2 f = jt2.mo32984f();
        C8236uq E = C7513ar.m30443E();
        C8164sq E2 = C8200tq.m37948E();
        E2.mo34773H(2);
        C8379yq E3 = C8415zq.m40418E();
        E3.mo35957y(a.f35616b);
        E3.mo35955B(a.f35617c);
        E3.mo35956C(f.f32850c);
        E2.mo34772C(E3);
        E.mo35221y(E2);
        st2.f39060a.zzb().mo34668c().mo18434I((C7513ar) E.mo32424p());
        m34551e();
        return h;
    }

    /* renamed from: d */
    public final synchronized st2<?, ?> mo33180d(tt2 tt2) {
        st2<?, ?> st2;
        jt2 jt2 = this.f35260a.get(tt2);
        if (jt2 != null) {
            st2 = jt2.mo32983e();
            if (st2 == null) {
                this.f35262c.mo33759e();
            }
            hu2 f = jt2.mo32984f();
            if (st2 != null) {
                C8236uq E = C7513ar.m30443E();
                C8164sq E2 = C8200tq.m37948E();
                E2.mo34773H(2);
                C8306wq E3 = C8342xq.m39528E();
                E3.mo35657y(f.f32849b);
                E3.mo35656B(f.f32850c);
                E2.mo34774y(E3);
                E.mo35221y(E2);
                st2.f39060a.zzb().mo34668c().mo18438o0((C7513ar) E.mo32424p());
            }
            m34551e();
        } else {
            this.f35262c.mo33760f();
            m34551e();
            st2 = null;
        }
        return st2;
    }

    public final zzffu zza() {
        return this.f35261b;
    }
}
