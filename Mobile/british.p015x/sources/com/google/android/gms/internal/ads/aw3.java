package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class aw3 extends vw3 {

    /* renamed from: A */
    private int f29777A;

    /* renamed from: B */
    private long f29778B;

    /* renamed from: C */
    private final rv3 f29779C;

    /* renamed from: D */
    private u64 f29780D;

    /* renamed from: b */
    final z74 f29781b;

    /* renamed from: c */
    final k60 f29782c;

    /* renamed from: d */
    private final hx3[] f29783d;

    /* renamed from: e */
    private final y74 f29784e;

    /* renamed from: f */
    private final y42 f29785f;

    /* renamed from: g */
    private final kw3 f29786g;

    /* renamed from: h */
    private final eb2<l70> f29787h;

    /* renamed from: i */
    private final CopyOnWriteArraySet<wl3> f29788i;

    /* renamed from: j */
    private final gf0 f29789j;

    /* renamed from: k */
    private final List<zv3> f29790k;

    /* renamed from: l */
    private final boolean f29791l = true;

    /* renamed from: m */
    private final o54 f29792m;

    /* renamed from: n */
    private final a04 f29793n;

    /* renamed from: o */
    private final Looper f29794o;

    /* renamed from: p */
    private final i84 f29795p;

    /* renamed from: q */
    private final ov1 f29796q;

    /* renamed from: r */
    private int f29797r;

    /* renamed from: s */
    private int f29798s;

    /* renamed from: t */
    private boolean f29799t;

    /* renamed from: u */
    private int f29800u;

    /* renamed from: v */
    private kx3 f29801v;

    /* renamed from: w */
    private k60 f29802w;

    /* renamed from: x */
    private C7916lt f29803x;

    /* renamed from: y */
    private C7916lt f29804y;

    /* renamed from: z */
    private bx3 f29805z;

    @SuppressLint({"HandlerLeak"})
    public aw3(hx3[] hx3Arr, y74 y74, o54 o54, nw3 nw3, i84 i84, a04 a04, boolean z, kx3 kx3, long j, long j2, qf3 qf3, long j3, boolean z2, ov1 ov1, Looper looper, kb0 kb0, k60 k60, byte[] bArr) {
        hx3[] hx3Arr2 = hx3Arr;
        i84 i842 = i84;
        a04 a042 = a04;
        ov1 ov12 = ov1;
        Looper looper2 = looper;
        kb0 kb02 = kb0;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = d13.f20199e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = hx3Arr2.length;
        this.f29783d = hx3Arr2;
        Objects.requireNonNull(y74);
        this.f29784e = y74;
        this.f29792m = o54;
        this.f29795p = i842;
        this.f29793n = a042;
        kx3 kx32 = kx3;
        this.f29801v = kx32;
        this.f29794o = looper2;
        this.f29796q = ov12;
        eb2<l70> eb2 = new eb2<>(looper2, ov12, new qv3(kb02));
        this.f29787h = eb2;
        this.f29788i = new CopyOnWriteArraySet<>();
        this.f29790k = new ArrayList();
        this.f29780D = new u64(0);
        z74 z74 = r16;
        z74 z742 = new z74(new jx3[2], new e74[2], iw0.f33535b, (Object) null, (byte[]) null);
        this.f29781b = z742;
        this.f29789j = new gf0();
        i40 i40 = new i40();
        i40.mo32548c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19, 29);
        i40.mo32549d(28, true);
        i40.mo32547b(k60);
        k60 e = i40.mo32550e();
        this.f29782c = e;
        i40 i402 = new i40();
        i402.mo32547b(e);
        i402.mo32546a(3);
        i402.mo32546a(9);
        this.f29802w = i402.mo32550e();
        C7916lt ltVar = C7916lt.f35237t;
        this.f29803x = ltVar;
        this.f29804y = ltVar;
        this.f29777A = -1;
        this.f29785f = ov12.mo34015a(looper2, (Handler.Callback) null);
        rv3 rv3 = r5;
        rv3 rv32 = new rv3(this);
        this.f29779C = rv32;
        this.f29805z = bx3.m30859h(z742);
        a042.mo18045c0(kb02, looper2);
        eb2.mo31513b(a042);
        i842.mo32573a(new Handler(looper2), a042);
        kw3 kw3 = r1;
        kw3 kw32 = new kw3(hx3Arr, y74, z74, nw3, i84, 0, false, a04, kx32, qf3, 500, false, looper, ov1, rv3, (byte[]) null);
        this.f29786g = kw3;
    }

    /* renamed from: o */
    private final int m30496o() {
        if (this.f29805z.f30151a.mo32145o()) {
            return this.f29777A;
        }
        bx3 bx3 = this.f29805z;
        return bx3.f30151a.mo32144n(bx3.f30152b.f34474a, this.f29789j).f32286c;
    }

    /* renamed from: p */
    private final long m30497p(bx3 bx3) {
        if (bx3.f30151a.mo32145o()) {
            return xy3.m39691c(this.f29778B);
        }
        if (bx3.f30152b.mo33183b()) {
            return bx3.f30169s;
        }
        gi0 gi0 = bx3.f30151a;
        c54 c54 = bx3.f30152b;
        long j = bx3.f30169s;
        m30499r(gi0, c54, j);
        return j;
    }

    /* renamed from: q */
    private static long m30498q(bx3 bx3) {
        gh0 gh0 = new gh0();
        gf0 gf0 = new gf0();
        bx3.f30151a.mo32144n(bx3.f30152b.f34474a, gf0);
        long j = bx3.f30153c;
        if (j != C6540C.TIME_UNSET) {
            return j;
        }
        long j2 = bx3.f30151a.mo31485e(gf0.f32286c, gh0, 0).f32319k;
        return 0;
    }

    /* renamed from: r */
    private final long m30499r(gi0 gi0, c54 c54, long j) {
        gi0.mo32144n(c54.f34474a, this.f29789j);
        return j;
    }

    /* renamed from: s */
    private final Pair<Object, Long> m30500s(gi0 gi0, int i, long j) {
        if (gi0.mo32145o()) {
            this.f29777A = i;
            if (j == C6540C.TIME_UNSET) {
                j = 0;
            }
            this.f29778B = j;
            return null;
        }
        if (i == -1 || i >= gi0.mo31951c()) {
            i = gi0.mo32136g(false);
            long j2 = gi0.mo31485e(i, this.f40574a, 0).f32319k;
            j = xy3.m39692d(0);
        }
        return gi0.mo32142l(this.f40574a, this.f29789j, i, xy3.m39691c(j));
    }

    /* renamed from: t */
    private final bx3 m30501t(bx3 bx3, gi0 gi0, Pair<Object, Long> pair) {
        c54 c54;
        cm0 cm0;
        z74 z74;
        c54 c542;
        List list;
        bx3 bx32;
        long j;
        gi0 gi02 = gi0;
        Pair<Object, Long> pair2 = pair;
        nu1.m20745d(gi0.mo32145o() || pair2 != null);
        gi0 gi03 = bx3.f30151a;
        bx3 g = bx3.mo30820g(gi0);
        if (gi0.mo32145o()) {
            c54 i = bx3.m30860i();
            long c = xy3.m39691c(this.f29778B);
            bx3 a = g.mo30815b(i, c, c, c, 0, cm0.f30416d, this.f29781b, p63.m20814A()).mo30814a(i);
            a.f30167q = a.f30169s;
            return a;
        }
        Object obj = g.f30152b.f34474a;
        int i2 = d13.f20195a;
        boolean z = !obj.equals(pair2.first);
        if (z) {
            c54 = new c54(pair2.first);
        } else {
            c54 = g.f30152b;
        }
        c54 c543 = c54;
        long longValue = ((Long) pair2.second).longValue();
        long c2 = xy3.m39691c(zzj());
        if (!gi03.mo32145o()) {
            gi03.mo32144n(obj, this.f29789j);
        }
        if (z || longValue < c2) {
            c54 c544 = c543;
            nu1.m20747f(!c544.mo33183b());
            if (z) {
                cm0 = cm0.f30416d;
            } else {
                cm0 = g.f30158h;
            }
            cm0 cm02 = cm0;
            if (z) {
                c542 = c544;
                z74 = this.f29781b;
            } else {
                c542 = c544;
                z74 = g.f30159i;
            }
            z74 z742 = z74;
            if (z) {
                list = p63.m20814A();
            } else {
                list = g.f30160j;
            }
            bx3 a2 = g.mo30815b(c542, longValue, longValue, longValue, 0, cm02, z742, list).mo30814a(c542);
            a2.f30167q = longValue;
            return a2;
        }
        if (longValue == c2) {
            int a3 = gi02.mo32133a(g.f30161k.f34474a);
            if (a3 != -1 && gi02.mo31484d(a3, this.f29789j, false).f32286c == gi02.mo32144n(c543.f34474a, this.f29789j).f32286c) {
                return g;
            }
            gi02.mo32144n(c543.f34474a, this.f29789j);
            if (c543.mo33183b()) {
                j = this.f29789j.mo32107f(c543.f34475b, c543.f34476c);
            } else {
                j = this.f29789j.f32287d;
            }
            bx32 = g.mo30815b(c543, g.f30169s, g.f30169s, g.f30154d, j - g.f30169s, g.f30158h, g.f30159i, g.f30160j).mo30814a(c543);
            bx32.f30167q = j;
        } else {
            c54 c545 = c543;
            nu1.m20747f(!c545.mo33183b());
            long max = Math.max(0, g.f30168r - (longValue - c2));
            long j2 = g.f30167q;
            if (g.f30161k.equals(g.f30152b)) {
                j2 = longValue + max;
            }
            bx32 = g.mo30815b(c545, longValue, longValue, longValue, max, g.f30158h, g.f30159i, g.f30160j);
            bx32.f30167q = j2;
        }
        return bx32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0428, code lost:
        if (r4.mo31485e(zzg(), r0.f40574a, 0).f32315g != false) goto L_0x042a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0269  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30502u(com.google.android.gms.internal.ads.bx3 r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            com.google.android.gms.internal.ads.bx3 r3 = r0.f29805z
            r0.f29805z = r1
            com.google.android.gms.internal.ads.gi0 r4 = r3.f30151a
            com.google.android.gms.internal.ads.gi0 r5 = r1.f30151a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.gi0 r6 = r3.f30151a
            com.google.android.gms.internal.ads.gi0 r7 = r1.f30151a
            boolean r8 = r7.mo32145o()
            r10 = 3
            r11 = 0
            r13 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r15 = 0
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.mo32145o()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r14)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.mo32145o()
            boolean r9 = r6.mo32145o()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.c54 r8 = r3.f30152b
            java.lang.Object r8 = r8.f34474a
            com.google.android.gms.internal.ads.gf0 r9 = r0.f29789j
            com.google.android.gms.internal.ads.gf0 r8 = r6.mo32144n(r8, r9)
            int r8 = r8.f32286c
            com.google.android.gms.internal.ads.gh0 r9 = r0.f40574a
            com.google.android.gms.internal.ads.gh0 r6 = r6.mo31485e(r8, r9, r11)
            java.lang.Object r6 = r6.f32309a
            com.google.android.gms.internal.ads.c54 r8 = r1.f30152b
            java.lang.Object r8 = r8.f34474a
            com.google.android.gms.internal.ads.gf0 r9 = r0.f29789j
            com.google.android.gms.internal.ads.gf0 r8 = r7.mo32144n(r8, r9)
            int r8 = r8.f32286c
            com.google.android.gms.internal.ads.gh0 r9 = r0.f40574a
            com.google.android.gms.internal.ads.gh0 r7 = r7.mo31485e(r8, r9, r11)
            java.lang.Object r7 = r7.f32309a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r45 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r4 = 1
            goto L_0x008a
        L_0x0081:
            if (r45 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r4 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4 = 3
        L_0x008a:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r45 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.c54 r4 = r3.f30152b
            long r6 = r4.f34477d
            com.google.android.gms.internal.ads.c54 r4 = r1.f30152b
            long r8 = r4.f34477d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r14)
        L_0x00c0:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.lt r7 = r0.f29803x
            if (r6 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.gi0 r7 = r1.f30151a
            boolean r7 = r7.mo32145o()
            if (r7 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.gi0 r7 = r1.f30151a
            com.google.android.gms.internal.ads.c54 r9 = r1.f30152b
            java.lang.Object r9 = r9.f34474a
            com.google.android.gms.internal.ads.gf0 r14 = r0.f29789j
            com.google.android.gms.internal.ads.gf0 r7 = r7.mo32144n(r9, r14)
            int r7 = r7.f32286c
            com.google.android.gms.internal.ads.gi0 r9 = r1.f30151a
            com.google.android.gms.internal.ads.gh0 r14 = r0.f40574a
            com.google.android.gms.internal.ads.gh0 r7 = r9.mo31485e(r7, r14, r11)
            com.google.android.gms.internal.ads.ho r7 = r7.f32310b
            goto L_0x00f6
        L_0x00f5:
            r7 = 0
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.lt r9 = r7.f32789e
            goto L_0x00fd
        L_0x00fb:
            com.google.android.gms.internal.ads.lt r9 = com.google.android.gms.internal.ads.C7916lt.f35237t
        L_0x00fd:
            r39 = r9
            r9 = r7
            r7 = r39
            goto L_0x0104
        L_0x0103:
            r9 = 0
        L_0x0104:
            if (r6 != 0) goto L_0x0110
            java.util.List<com.google.android.gms.internal.ads.zzdd> r14 = r3.f30160j
            java.util.List<com.google.android.gms.internal.ads.zzdd> r10 = r1.f30160j
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x013e
        L_0x0110:
            com.google.android.gms.internal.ads.jr r7 = r7.mo33399a()
            java.util.List<com.google.android.gms.internal.ads.zzdd> r10 = r1.f30160j
            r14 = 0
        L_0x0117:
            int r8 = r10.size()
            if (r14 >= r8) goto L_0x013a
            java.lang.Object r8 = r10.get(r14)
            com.google.android.gms.internal.ads.zzdd r8 = (com.google.android.gms.internal.ads.zzdd) r8
            r13 = 0
        L_0x0124:
            int r11 = r8.mo36273a()
            if (r13 >= r11) goto L_0x0134
            com.google.android.gms.internal.ads.zzdc r11 = r8.mo36274b(r13)
            r11.mo36161g0(r7)
            int r13 = r13 + 1
            goto L_0x0124
        L_0x0134:
            int r14 = r14 + 1
            r11 = 0
            r13 = -1
            goto L_0x0117
        L_0x013a:
            com.google.android.gms.internal.ads.lt r7 = r7.mo32940B()
        L_0x013e:
            com.google.android.gms.internal.ads.lt r8 = r0.f29803x
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f29803x = r7
            com.google.android.gms.internal.ads.gi0 r7 = r3.f30151a
            com.google.android.gms.internal.ads.gi0 r10 = r1.f30151a
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x015d
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r7 = r0.f29787h
            com.google.android.gms.internal.ads.lv3 r10 = new com.google.android.gms.internal.ads.lv3
            r11 = r42
            r10.<init>(r1, r11)
            r7.mo31515d(r15, r10)
        L_0x015d:
            r7 = 11
            if (r45 == 0) goto L_0x0289
            com.google.android.gms.internal.ads.gf0 r10 = new com.google.android.gms.internal.ads.gf0
            r10.<init>()
            com.google.android.gms.internal.ads.gi0 r11 = r3.f30151a
            boolean r11 = r11.mo32145o()
            if (r11 != 0) goto L_0x019c
            com.google.android.gms.internal.ads.c54 r11 = r3.f30152b
            java.lang.Object r11 = r11.f34474a
            com.google.android.gms.internal.ads.gi0 r12 = r3.f30151a
            r12.mo32144n(r11, r10)
            int r12 = r10.f32286c
            com.google.android.gms.internal.ads.gi0 r13 = r3.f30151a
            int r13 = r13.mo32133a(r11)
            com.google.android.gms.internal.ads.gi0 r14 = r3.f30151a
            com.google.android.gms.internal.ads.gh0 r15 = r0.f40574a
            r16 = r6
            r5 = 0
            com.google.android.gms.internal.ads.gh0 r14 = r14.mo31485e(r12, r15, r5)
            java.lang.Object r5 = r14.f32309a
            com.google.android.gms.internal.ads.gh0 r6 = r0.f40574a
            com.google.android.gms.internal.ads.ho r6 = r6.f32310b
            r18 = r5
            r20 = r6
            r21 = r11
            r19 = r12
            r22 = r13
            goto L_0x01a8
        L_0x019c:
            r16 = r6
            r19 = r49
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = -1
        L_0x01a8:
            if (r2 != 0) goto L_0x01db
            long r5 = r10.f32287d
            com.google.android.gms.internal.ads.c54 r11 = r3.f30152b
            boolean r11 = r11.mo33183b()
            if (r11 == 0) goto L_0x01c3
            com.google.android.gms.internal.ads.c54 r5 = r3.f30152b
            int r6 = r5.f34475b
            int r5 = r5.f34476c
            long r5 = r10.mo32107f(r6, r5)
            long r10 = m30498q(r3)
            goto L_0x01ed
        L_0x01c3:
            com.google.android.gms.internal.ads.c54 r10 = r3.f30152b
            int r10 = r10.f34478e
            r11 = -1
            if (r10 == r11) goto L_0x01ec
            com.google.android.gms.internal.ads.bx3 r10 = r0.f29805z
            com.google.android.gms.internal.ads.c54 r10 = r10.f30152b
            boolean r10 = r10.mo33183b()
            if (r10 == 0) goto L_0x01ec
            com.google.android.gms.internal.ads.bx3 r5 = r0.f29805z
            long r5 = m30498q(r5)
            goto L_0x01ec
        L_0x01db:
            com.google.android.gms.internal.ads.c54 r5 = r3.f30152b
            boolean r5 = r5.mo33183b()
            if (r5 == 0) goto L_0x01ea
            long r5 = r3.f30169s
            long r10 = m30498q(r3)
            goto L_0x01ed
        L_0x01ea:
            long r5 = r3.f30169s
        L_0x01ec:
            r10 = r5
        L_0x01ed:
            com.google.android.gms.internal.ads.ja0 r12 = new com.google.android.gms.internal.ads.ja0
            long r23 = com.google.android.gms.internal.ads.xy3.m39692d(r5)
            long r25 = com.google.android.gms.internal.ads.xy3.m39692d(r10)
            com.google.android.gms.internal.ads.c54 r5 = r3.f30152b
            int r6 = r5.f34475b
            int r5 = r5.f34476c
            r17 = r12
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r27, r28)
            int r5 = r40.zzg()
            com.google.android.gms.internal.ads.bx3 r6 = r0.f29805z
            com.google.android.gms.internal.ads.gi0 r6 = r6.f30151a
            boolean r6 = r6.mo32145o()
            if (r6 != 0) goto L_0x0244
            com.google.android.gms.internal.ads.bx3 r6 = r0.f29805z
            com.google.android.gms.internal.ads.c54 r10 = r6.f30152b
            java.lang.Object r10 = r10.f34474a
            com.google.android.gms.internal.ads.gi0 r6 = r6.f30151a
            com.google.android.gms.internal.ads.gf0 r11 = r0.f29789j
            r6.mo32144n(r10, r11)
            com.google.android.gms.internal.ads.bx3 r6 = r0.f29805z
            com.google.android.gms.internal.ads.gi0 r6 = r6.f30151a
            int r6 = r6.mo32133a(r10)
            com.google.android.gms.internal.ads.bx3 r11 = r0.f29805z
            com.google.android.gms.internal.ads.gi0 r11 = r11.f30151a
            com.google.android.gms.internal.ads.gh0 r13 = r0.f40574a
            r14 = 0
            com.google.android.gms.internal.ads.gh0 r11 = r11.mo31485e(r5, r13, r14)
            java.lang.Object r11 = r11.f32309a
            com.google.android.gms.internal.ads.gh0 r13 = r0.f40574a
            com.google.android.gms.internal.ads.ho r13 = r13.f32310b
            r32 = r6
            r31 = r10
            r28 = r11
            r30 = r13
            goto L_0x024c
        L_0x0244:
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = -1
        L_0x024c:
            long r33 = com.google.android.gms.internal.ads.xy3.m39692d(r47)
            com.google.android.gms.internal.ads.ja0 r6 = new com.google.android.gms.internal.ads.ja0
            com.google.android.gms.internal.ads.bx3 r10 = r0.f29805z
            com.google.android.gms.internal.ads.c54 r10 = r10.f30152b
            boolean r10 = r10.mo33183b()
            if (r10 == 0) goto L_0x0269
            com.google.android.gms.internal.ads.bx3 r10 = r0.f29805z
            long r10 = m30498q(r10)
            long r10 = com.google.android.gms.internal.ads.xy3.m39692d(r10)
            r35 = r10
            goto L_0x026b
        L_0x0269:
            r35 = r33
        L_0x026b:
            com.google.android.gms.internal.ads.bx3 r10 = r0.f29805z
            com.google.android.gms.internal.ads.c54 r10 = r10.f30152b
            int r11 = r10.f34475b
            int r10 = r10.f34476c
            r27 = r6
            r29 = r5
            r37 = r11
            r38 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37, r38)
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r5 = r0.f29787h
            com.google.android.gms.internal.ads.nv3 r10 = new com.google.android.gms.internal.ads.nv3
            r10.<init>(r2, r12, r6)
            r5.mo31515d(r7, r10)
            goto L_0x028b
        L_0x0289:
            r16 = r6
        L_0x028b:
            if (r16 == 0) goto L_0x0298
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.tv3 r5 = new com.google.android.gms.internal.ads.tv3
            r5.<init>(r9, r4)
            r4 = 1
            r2.mo31515d(r4, r5)
        L_0x0298:
            com.google.android.gms.internal.ads.vk3 r2 = r3.f30156f
            com.google.android.gms.internal.ads.vk3 r4 = r1.f30156f
            r5 = 10
            if (r2 == r4) goto L_0x02b8
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.xv3 r4 = new com.google.android.gms.internal.ads.xv3
            r4.<init>(r1)
            r2.mo31515d(r5, r4)
            com.google.android.gms.internal.ads.vk3 r2 = r1.f30156f
            if (r2 == 0) goto L_0x02b8
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.yv3 r4 = new com.google.android.gms.internal.ads.yv3
            r4.<init>(r1)
            r2.mo31515d(r5, r4)
        L_0x02b8:
            com.google.android.gms.internal.ads.z74 r2 = r3.f30159i
            com.google.android.gms.internal.ads.z74 r4 = r1.f30159i
            if (r2 == r4) goto L_0x02e4
            com.google.android.gms.internal.ads.y74 r2 = r0.f29784e
            java.lang.Object r4 = r4.f42340d
            r2.mo35589b(r4)
            com.google.android.gms.internal.ads.cn0 r2 = new com.google.android.gms.internal.ads.cn0
            com.google.android.gms.internal.ads.z74 r4 = r1.f30159i
            com.google.android.gms.internal.ads.e74[] r4 = r4.f42341e
            r6 = 0
            r2.<init>(r4, r6)
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r4 = r0.f29787h
            com.google.android.gms.internal.ads.mv3 r6 = new com.google.android.gms.internal.ads.mv3
            r6.<init>(r1, r2)
            r2 = 2
            r4.mo31515d(r2, r6)
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r4 = r0.f29787h
            com.google.android.gms.internal.ads.yn3 r6 = new com.google.android.gms.internal.ads.yn3
            r6.<init>(r1)
            r4.mo31515d(r2, r6)
        L_0x02e4:
            if (r8 == 0) goto L_0x02f4
            com.google.android.gms.internal.ads.lt r2 = r0.f29803x
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r4 = r0.f29787h
            com.google.android.gms.internal.ads.vv3 r6 = new com.google.android.gms.internal.ads.vv3
            r6.<init>(r2)
            r2 = 14
            r4.mo31515d(r2, r6)
        L_0x02f4:
            boolean r2 = r3.f30157g
            boolean r4 = r1.f30157g
            if (r2 == r4) goto L_0x0305
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.zo3 r4 = new com.google.android.gms.internal.ads.zo3
            r4.<init>(r1)
            r6 = 3
            r2.mo31515d(r6, r4)
        L_0x0305:
            int r2 = r3.f30155e
            int r4 = r1.f30155e
            if (r2 != r4) goto L_0x0311
            boolean r2 = r3.f30162l
            boolean r4 = r1.f30162l
            if (r2 == r4) goto L_0x031c
        L_0x0311:
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.zp3 r4 = new com.google.android.gms.internal.ads.zp3
            r4.<init>(r1)
            r6 = -1
            r2.mo31515d(r6, r4)
        L_0x031c:
            int r2 = r3.f30155e
            int r4 = r1.f30155e
            r6 = 4
            if (r2 == r4) goto L_0x032d
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.zq3 r4 = new com.google.android.gms.internal.ads.zq3
            r4.<init>(r1)
            r2.mo31515d(r6, r4)
        L_0x032d:
            boolean r2 = r3.f30162l
            boolean r4 = r1.f30162l
            r8 = 5
            if (r2 == r4) goto L_0x0340
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.dv3 r4 = new com.google.android.gms.internal.ads.dv3
            r9 = r43
            r4.<init>(r1, r9)
            r2.mo31515d(r8, r4)
        L_0x0340:
            int r2 = r3.f30163m
            int r4 = r1.f30163m
            r9 = 6
            if (r2 == r4) goto L_0x0351
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.as3 r4 = new com.google.android.gms.internal.ads.as3
            r4.<init>(r1)
            r2.mo31515d(r9, r4)
        L_0x0351:
            boolean r2 = m30503v(r3)
            boolean r4 = m30503v(r41)
            r10 = 7
            if (r2 == r4) goto L_0x0366
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.bt3 r4 = new com.google.android.gms.internal.ads.bt3
            r4.<init>(r1)
            r2.mo31515d(r10, r4)
        L_0x0366:
            com.google.android.gms.internal.ads.h20 r2 = r3.f30164n
            com.google.android.gms.internal.ads.h20 r4 = r1.f30164n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x037c
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.cu3 r4 = new com.google.android.gms.internal.ads.cu3
            r4.<init>(r1)
            r11 = 12
            r2.mo31515d(r11, r4)
        L_0x037c:
            if (r44 == 0) goto L_0x0386
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.pv3 r4 = com.google.android.gms.internal.ads.pv3.f37776a
            r11 = -1
            r2.mo31515d(r11, r4)
        L_0x0386:
            com.google.android.gms.internal.ads.k60 r2 = r0.f29802w
            com.google.android.gms.internal.ads.k60 r4 = r0.f29782c
            com.google.android.gms.internal.ads.i40 r11 = new com.google.android.gms.internal.ads.i40
            r11.<init>()
            r11.mo32547b(r4)
            boolean r4 = r40.zzp()
            r12 = 1
            r4 = r4 ^ r12
            r12 = 3
            r11.mo32549d(r12, r4)
            boolean r4 = r40.mo35509e()
            if (r4 == 0) goto L_0x03aa
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03aa
            r4 = 1
            goto L_0x03ab
        L_0x03aa:
            r4 = 0
        L_0x03ab:
            r11.mo32549d(r6, r4)
            boolean r4 = r40.mo35507c()
            if (r4 == 0) goto L_0x03bc
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03bc
            r4 = 1
            goto L_0x03bd
        L_0x03bc:
            r4 = 0
        L_0x03bd:
            r11.mo32549d(r8, r4)
            com.google.android.gms.internal.ads.bx3 r4 = r0.f29805z
            com.google.android.gms.internal.ads.gi0 r4 = r4.f30151a
            boolean r4 = r4.mo32145o()
            if (r4 != 0) goto L_0x03e4
            boolean r4 = r40.mo35507c()
            if (r4 != 0) goto L_0x03dc
            boolean r4 = r40.mo35508d()
            if (r4 == 0) goto L_0x03dc
            boolean r4 = r40.mo35509e()
            if (r4 == 0) goto L_0x03e4
        L_0x03dc:
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03e4
            r4 = 1
            goto L_0x03e5
        L_0x03e4:
            r4 = 0
        L_0x03e5:
            r11.mo32549d(r9, r4)
            boolean r4 = r40.mo35506b()
            if (r4 == 0) goto L_0x03f6
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03f6
            r4 = 1
            goto L_0x03f7
        L_0x03f6:
            r4 = 0
        L_0x03f7:
            r11.mo32549d(r10, r4)
            com.google.android.gms.internal.ads.bx3 r4 = r0.f29805z
            com.google.android.gms.internal.ads.gi0 r4 = r4.f30151a
            boolean r4 = r4.mo32145o()
            if (r4 != 0) goto L_0x0432
            boolean r4 = r40.mo35506b()
            if (r4 != 0) goto L_0x042a
            boolean r4 = r40.mo35508d()
            if (r4 == 0) goto L_0x0432
            com.google.android.gms.internal.ads.bx3 r4 = r0.f29805z
            com.google.android.gms.internal.ads.gi0 r4 = r4.f30151a
            boolean r6 = r4.mo32145o()
            if (r6 != 0) goto L_0x0432
            int r6 = r40.zzg()
            com.google.android.gms.internal.ads.gh0 r8 = r0.f40574a
            r9 = 0
            com.google.android.gms.internal.ads.gh0 r4 = r4.mo31485e(r6, r8, r9)
            boolean r4 = r4.f32315g
            if (r4 == 0) goto L_0x0432
        L_0x042a:
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x0432
            r4 = 1
            goto L_0x0433
        L_0x0432:
            r4 = 0
        L_0x0433:
            r6 = 8
            r11.mo32549d(r6, r4)
            r4 = 9
            boolean r6 = r40.zzp()
            r8 = 1
            r6 = r6 ^ r8
            r11.mo32549d(r4, r6)
            boolean r4 = r40.mo35509e()
            if (r4 == 0) goto L_0x0451
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x0451
            r4 = 1
            goto L_0x0452
        L_0x0451:
            r4 = 0
        L_0x0452:
            r11.mo32549d(r5, r4)
            boolean r4 = r40.mo35509e()
            if (r4 == 0) goto L_0x0463
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x0463
            r5 = 1
            goto L_0x0464
        L_0x0463:
            r5 = 0
        L_0x0464:
            r11.mo32549d(r7, r5)
            com.google.android.gms.internal.ads.k60 r4 = r11.mo32550e()
            r0.f29802w = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x047f
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            com.google.android.gms.internal.ads.wv3 r4 = new com.google.android.gms.internal.ads.wv3
            r4.<init>(r0)
            r5 = 13
            r2.mo31515d(r5, r4)
        L_0x047f:
            com.google.android.gms.internal.ads.eb2<com.google.android.gms.internal.ads.l70> r2 = r0.f29787h
            r2.mo31514c()
            boolean r2 = r3.f30165o
            boolean r4 = r1.f30165o
            if (r2 == r4) goto L_0x04a2
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.gms.internal.ads.wl3> r2 = r0.f29788i
            java.util.Iterator r2 = r2.iterator()
        L_0x0490:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.wl3 r4 = (com.google.android.gms.internal.ads.wl3) r4
            boolean r5 = r1.f30165o
            r4.mo33783a(r5)
            goto L_0x0490
        L_0x04a2:
            boolean r2 = r3.f30166p
            boolean r3 = r1.f30166p
            if (r2 == r3) goto L_0x04c0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.gms.internal.ads.wl3> r2 = r0.f29788i
            java.util.Iterator r2 = r2.iterator()
        L_0x04ae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c0
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.wl3 r3 = (com.google.android.gms.internal.ads.wl3) r3
            boolean r4 = r1.f30166p
            r3.mo33791v(r4)
            goto L_0x04ae
        L_0x04c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aw3.m30502u(com.google.android.gms.internal.ads.bx3, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: v */
    private static boolean m30503v(bx3 bx3) {
        return bx3.f30155e == 3 && bx3.f30162l && bx3.f30163m == 0;
    }

    /* renamed from: A */
    public final Looper mo30517A() {
        return this.f29794o;
    }

    /* renamed from: B */
    public final ex3 mo30518B(dx3 dx3) {
        return new ex3(this.f29786g, dx3, this.f29805z.f30151a, zzg(), this.f29796q, this.f29786g.mo33194O());
    }

    /* renamed from: C */
    public final void mo30519C(wl3 wl3) {
        this.f29788i.add(wl3);
    }

    /* renamed from: D */
    public final void mo30520D(l70 l70) {
        this.f29787h.mo31513b(l70);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ void mo30521E(iw3 iw3) {
        long j;
        boolean z;
        long j2;
        int i = this.f29797r - iw3.f33546c;
        this.f29797r = i;
        boolean z2 = true;
        if (iw3.f33547d) {
            this.f29798s = iw3.f33548e;
            this.f29799t = true;
        }
        if (iw3.f33549f) {
            this.f29800u = iw3.f33550g;
        }
        if (i == 0) {
            gi0 gi0 = iw3.f33545b.f30151a;
            if (!this.f29805z.f30151a.mo32145o() && gi0.mo32145o()) {
                this.f29777A = -1;
                this.f29778B = 0;
            }
            if (!gi0.mo32145o()) {
                List<gi0> y = ((fx3) gi0).mo31959y();
                nu1.m20747f(y.size() == this.f29790k.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    this.f29790k.get(i2).f42603b = y.get(i2);
                }
            }
            if (this.f29799t) {
                if (iw3.f33545b.f30152b.equals(this.f29805z.f30152b) && iw3.f33545b.f30154d == this.f29805z.f30169s) {
                    z2 = false;
                }
                if (z2) {
                    if (gi0.mo32145o() || iw3.f33545b.f30152b.mo33183b()) {
                        j2 = iw3.f33545b.f30154d;
                    } else {
                        bx3 bx3 = iw3.f33545b;
                        c54 c54 = bx3.f30152b;
                        j2 = bx3.f30154d;
                        m30499r(gi0, c54, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f29799t = false;
            m30502u(iw3.f33545b, 1, this.f29800u, false, z, this.f29798s, j, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo30522F(iw3 iw3) {
        this.f29785f.mo35874d(new sv3(this, iw3));
    }

    /* renamed from: a */
    public final void mo30523a(int i, long j) {
        int i2 = i;
        long j2 = j;
        gi0 gi0 = this.f29805z.f30151a;
        if (i2 < 0 || (!gi0.mo32145o() && i2 >= gi0.mo31951c())) {
            throw new C8317x0(gi0, i, j2);
        }
        int i3 = 1;
        this.f29797r++;
        if (!zzp()) {
            if (this.f29805z.f30155e != 1) {
                i3 = 2;
            }
            int zzg = zzg();
            bx3 t = m30501t(this.f29805z.mo30819f(i3), gi0, m30500s(gi0, i, j2));
            this.f29786g.mo33197U(gi0, i, xy3.m39691c(j));
            m30502u(t, 0, 1, true, true, 1, m30497p(t), zzg);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        iw3 iw3 = new iw3(this.f29805z);
        iw3.mo32779a(1);
        this.f29779C.f38789a.mo30522F(iw3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo30524f(l70 l70) {
        l70.mo18064u(this.f29802w);
    }

    /* renamed from: h */
    public final void mo30525h() {
        bx3 bx3 = this.f29805z;
        if (bx3.f30155e == 1) {
            bx3 e = bx3.mo30818e((vk3) null);
            bx3 f = e.mo30819f(true != e.f30151a.mo32145o() ? 2 : 4);
            this.f29797r++;
            this.f29786g.mo33196T();
            m30502u(f, 1, 1, false, false, 5, C6540C.TIME_UNSET, -1);
        }
    }

    /* renamed from: i */
    public final void mo30526i() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = d13.f20199e;
        String a = d84.m31326a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f29786g.mo33200X()) {
            eb2<l70> eb2 = this.f29787h;
            eb2.mo31515d(10, ov3.f36610a);
            eb2.mo31514c();
        }
        this.f29787h.mo31516e();
        this.f29785f.mo35873c((Object) null);
        a04 a04 = this.f29793n;
        if (a04 != null) {
            this.f29795p.mo32574c(a04);
        }
        bx3 f = this.f29805z.mo30819f(1);
        this.f29805z = f;
        bx3 a2 = f.mo30814a(f.f30152b);
        this.f29805z = a2;
        a2.f30167q = a2.f30169s;
        this.f29805z.f30168r = 0;
    }

    /* renamed from: j */
    public final void mo30527j(List<f54> list, boolean z) {
        m30496o();
        zzk();
        this.f29797r++;
        if (!this.f29790k.isEmpty()) {
            int size = this.f29790k.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f29790k.remove(i);
            }
            this.f29780D = this.f29780D.mo35138h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            yw3 yw3 = new yw3(list.get(i2), this.f29791l);
            arrayList.add(yw3);
            this.f29790k.add(i2, new zv3(yw3.f42017b, yw3.f42016a.mo18985D()));
        }
        this.f29780D = this.f29780D.mo35137g(0, arrayList.size());
        fx3 fx3 = new fx3(this.f29790k, this.f29780D, (u64) null);
        if (fx3.mo32145o() || fx3.mo31951c() >= 0) {
            int g = fx3.mo32136g(false);
            bx3 t = m30501t(this.f29805z, fx3, m30500s(fx3, g, C6540C.TIME_UNSET));
            int i3 = t.f30155e;
            if (!(g == -1 || i3 == 1)) {
                i3 = (fx3.mo32145o() || g >= fx3.mo31951c()) ? 4 : 2;
            }
            bx3 f = t.mo30819f(i3);
            this.f29786g.mo33201Y(arrayList, g, xy3.m39691c(C6540C.TIME_UNSET), this.f29780D);
            m30502u(f, 0, 1, false, !this.f29805z.f30152b.f34474a.equals(f.f30152b.f34474a) && !this.f29805z.f30151a.mo32145o(), 4, m30497p(f), -1);
            return;
        }
        throw new C8317x0(fx3, -1, C6540C.TIME_UNSET);
    }

    /* renamed from: k */
    public final void mo30528k(boolean z, int i, int i2) {
        bx3 bx3 = this.f29805z;
        if (bx3.f30162l != z || bx3.f30163m != i) {
            this.f29797r++;
            bx3 d = bx3.mo30817d(z, i);
            this.f29786g.mo33198V(z, i);
            m30502u(d, 0, i2, false, false, 5, C6540C.TIME_UNSET, -1);
        }
    }

    /* renamed from: l */
    public final void mo30529l(boolean z, vk3 vk3) {
        bx3 bx3 = this.f29805z;
        bx3 a = bx3.mo30814a(bx3.f30152b);
        a.f30167q = a.f30169s;
        a.f30168r = 0;
        bx3 f = a.mo30819f(1);
        if (vk3 != null) {
            f = f.mo30818e(vk3);
        }
        bx3 bx32 = f;
        this.f29797r++;
        this.f29786g.mo33199W();
        m30502u(bx32, 0, 1, false, bx32.f30151a.mo32145o() && !this.f29805z.f30151a.mo32145o(), 4, m30497p(bx32), -1);
    }

    /* renamed from: m */
    public final boolean mo30530m() {
        return this.f29805z.f30166p;
    }

    /* renamed from: n */
    public final boolean mo30531n() {
        return this.f29805z.f30162l;
    }

    /* renamed from: w */
    public final int mo30532w() {
        return this.f29805z.f30155e;
    }

    /* renamed from: x */
    public final int mo30533x() {
        int length = this.f29783d.length;
        return 2;
    }

    /* renamed from: y */
    public final long mo30534y() {
        if (zzp()) {
            bx3 bx3 = this.f29805z;
            if (bx3.f30161k.equals(bx3.f30152b)) {
                return xy3.m39692d(this.f29805z.f30167q);
            }
            return mo30535z();
        } else if (this.f29805z.f30151a.mo32145o()) {
            return this.f29778B;
        } else {
            bx3 bx32 = this.f29805z;
            long j = 0;
            if (bx32.f30161k.f34477d != bx32.f30152b.f34477d) {
                return xy3.m39692d(bx32.f30151a.mo31485e(zzg(), this.f40574a, 0).f32320l);
            }
            long j2 = bx32.f30167q;
            if (this.f29805z.f30161k.mo33183b()) {
                bx3 bx33 = this.f29805z;
                bx33.f30151a.mo32144n(bx33.f30161k.f34474a, this.f29789j).mo32108g(this.f29805z.f30161k.f34475b);
            } else {
                j = j2;
            }
            bx3 bx34 = this.f29805z;
            m30499r(bx34.f30151a, bx34.f30161k, j);
            return xy3.m39692d(j);
        }
    }

    /* renamed from: z */
    public final long mo30535z() {
        if (!zzp()) {
            gi0 gi0 = this.f29805z.f30151a;
            if (gi0.mo32145o()) {
                return C6540C.TIME_UNSET;
            }
            return xy3.m39692d(gi0.mo31485e(zzg(), this.f40574a, 0).f32320l);
        }
        bx3 bx3 = this.f29805z;
        c54 c54 = bx3.f30152b;
        bx3.f30151a.mo32144n(c54.f34474a, this.f29789j);
        return xy3.m39692d(this.f29789j.mo32107f(c54.f34475b, c54.f34476c));
    }

    public final int zze() {
        if (zzp()) {
            return this.f29805z.f30152b.f34475b;
        }
        return -1;
    }

    public final int zzf() {
        if (zzp()) {
            return this.f29805z.f30152b.f34476c;
        }
        return -1;
    }

    public final int zzg() {
        int o = m30496o();
        if (o == -1) {
            return 0;
        }
        return o;
    }

    public final int zzh() {
        if (this.f29805z.f30151a.mo32145o()) {
            return 0;
        }
        bx3 bx3 = this.f29805z;
        return bx3.f30151a.mo32133a(bx3.f30152b.f34474a);
    }

    public final int zzi() {
        return 0;
    }

    public final long zzj() {
        if (!zzp()) {
            return zzk();
        }
        bx3 bx3 = this.f29805z;
        bx3.f30151a.mo32144n(bx3.f30152b.f34474a, this.f29789j);
        bx3 bx32 = this.f29805z;
        if (bx32.f30153c != C6540C.TIME_UNSET) {
            return xy3.m39692d(0) + xy3.m39692d(this.f29805z.f30153c);
        }
        long j = bx32.f30151a.mo31485e(zzg(), this.f40574a, 0).f32319k;
        return xy3.m39692d(0);
    }

    public final long zzk() {
        return xy3.m39692d(m30497p(this.f29805z));
    }

    public final long zzl() {
        return xy3.m39692d(this.f29805z.f30168r);
    }

    public final gi0 zzm() {
        return this.f29805z.f30151a;
    }

    public final boolean zzo() {
        return false;
    }

    public final boolean zzp() {
        return this.f29805z.f30152b.mo33183b();
    }
}
