package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afv */
/* compiled from: IMASDK */
final class afv {

    /* renamed from: a */
    private final afw f14544a;

    /* renamed from: b */
    private final ajg f14545b;

    /* renamed from: c */
    private final ajg f14546c;

    /* renamed from: d */
    private final agn f14547d;

    /* renamed from: e */
    private final Uri[] f14548e;

    /* renamed from: f */
    private final C4120ke[] f14549f;

    /* renamed from: g */
    private final aho f14550g;

    /* renamed from: h */
    private final aco f14551h;

    /* renamed from: i */
    private final List<C4120ke> f14552i;

    /* renamed from: j */
    private final afp f14553j = new afp();

    /* renamed from: k */
    private boolean f14554k;

    /* renamed from: l */
    private byte[] f14555l = amm.f15303f;

    /* renamed from: m */
    private IOException f14556m;

    /* renamed from: n */
    private Uri f14557n;

    /* renamed from: o */
    private boolean f14558o;

    /* renamed from: p */
    private aih f14559p;

    /* renamed from: q */
    private long f14560q = C6540C.TIME_UNSET;

    /* renamed from: r */
    private boolean f14561r;

    public afv(afw afw, aho aho, Uri[] uriArr, C4120ke[] keVarArr, afm afm, akp akp, agn agn, List list) {
        this.f14544a = afw;
        this.f14550g = aho;
        this.f14548e = uriArr;
        this.f14549f = keVarArr;
        this.f14547d = agn;
        this.f14552i = list;
        ajg a = afm.mo13606a();
        this.f14545b = a;
        if (akp != null) {
            a.mo13295b(akp);
        }
        this.f14546c = afm.mo13606a();
        this.f14551h = new aco(keVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((keVarArr[i].f17674e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f14559p = new aft(this.f14551h, awa.m14989a(arrayList));
    }

    /* renamed from: o */
    private final Pair<Long, Integer> m13474o(afx afx, boolean z, ahd ahd, long j, long j2) {
        List<agy> list;
        long j3;
        boolean z2 = true;
        int i = -1;
        if (afx == null || z) {
            long j4 = ahd.f14809p + j;
            if (afx != null && !this.f14558o) {
                j2 = afx.f14244i;
            }
            if (!ahd.f14803j && j2 >= j4) {
                return new Pair<>(Long.valueOf(ahd.f14799f + ((long) ahd.f14806m.size())), -1);
            }
            long j5 = j2 - j;
            List<aha> list2 = ahd.f14806m;
            Long valueOf = Long.valueOf(j5);
            int i2 = 0;
            if (this.f14550g.mo13714l() && afx != null) {
                z2 = false;
            }
            int ak = amm.m14221ak(list2, valueOf, z2);
            long j6 = ((long) ak) + ahd.f14799f;
            if (ak >= 0) {
                aha aha = ahd.f14806m.get(ak);
                if (j5 < aha.f14782g + aha.f14780e) {
                    list = aha.f14777b;
                } else {
                    list = ahd.f14807n;
                }
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    agy agy = list.get(i2);
                    if (j5 >= agy.f14782g + agy.f14780e) {
                        i2++;
                    } else if (agy.f14766a) {
                        j6 += list == ahd.f14807n ? 1 : 0;
                        i = i2;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j6), Integer.valueOf(i));
        } else if (!afx.mo13503j()) {
            return new Pair<>(Long.valueOf(afx.f14289l), Integer.valueOf(afx.f14580o));
        } else {
            if (afx.f14580o == -1) {
                j3 = afx.mo13502i();
            } else {
                j3 = afx.f14289l;
            }
            Long valueOf2 = Long.valueOf(j3);
            int i3 = afx.f14580o;
            if (i3 != -1) {
                i = i3 + 1;
            }
            return new Pair<>(valueOf2, Integer.valueOf(i));
        }
    }

    /* renamed from: p */
    private final ada m13475p(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] b = this.f14553j.mo13610b(uri);
        if (b != null) {
            this.f14553j.mo13611c(uri, b);
            return null;
        }
        ajj ajj = new ajj();
        ajj.mo13811f(uri);
        ajj.mo13807b(1);
        ajk a = ajj.mo13806a();
        ajg ajg = this.f14546c;
        C4120ke keVar = this.f14549f[i];
        int b2 = this.f14559p.mo13615b();
        this.f14559p.mo13616c();
        return new afq(ajg, a, keVar, b2, this.f14555l);
    }

    /* renamed from: q */
    private static Uri m13476q(ahd ahd, ahb ahb) {
        String str;
        if (ahb == null || (str = ahb.f14784i) == null) {
            return null;
        }
        return arh.m14605l(ahd.f14811r, str);
    }

    /* renamed from: a */
    public final void mo13618a() throws IOException {
        IOException iOException = this.f14556m;
        if (iOException == null) {
            Uri uri = this.f14557n;
            if (uri != null && this.f14561r) {
                this.f14550g.mo13712j(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: b */
    public final aco mo13619b() {
        return this.f14551h;
    }

    /* renamed from: c */
    public final void mo13620c(aih aih) {
        this.f14559p = aih;
    }

    /* renamed from: d */
    public final aih mo13621d() {
        return this.f14559p;
    }

    /* renamed from: e */
    public final void mo13622e() {
        this.f14556m = null;
    }

    /* renamed from: f */
    public final void mo13623f(boolean z) {
        this.f14554k = z;
    }

    /* renamed from: g */
    public final int mo13624g(afx afx) {
        List<agy> list;
        if (afx.f14580o == -1) {
            return 1;
        }
        ahd f = this.f14550g.mo13708f(this.f14548e[this.f14551h.mo13446b(afx.f14241f)], false);
        aup.m14890u(f);
        int i = (int) (afx.f14289l - f.f14799f);
        if (i < 0) {
            return 1;
        }
        if (i < f.f14806m.size()) {
            list = f.f14806m.get(i).f14777b;
        } else {
            list = f.f14807n;
        }
        if (afx.f14580o >= list.size()) {
            return 2;
        }
        agy agy = list.get(afx.f14580o);
        if (agy.f14767b) {
            return 0;
        }
        if (amm.m14233c(Uri.parse(arh.m14606m(f.f14811r, agy.f14778c)), afx.f14239d.f15056a)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f9  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13625h(long r29, long r31, java.util.List<com.google.ads.interactivemedia.p039v3.internal.afx> r33, boolean r34, com.google.ads.interactivemedia.p039v3.internal.afr r35) {
        /*
            r28 = this;
            r8 = r28
            r9 = r31
            r11 = r35
            boolean r0 = r33.isEmpty()
            if (r0 == 0) goto L_0x000e
            r15 = 0
            goto L_0x0015
        L_0x000e:
            java.lang.Object r0 = com.google.ads.interactivemedia.p039v3.internal.art.m14630a(r33)
            com.google.ads.interactivemedia.v3.internal.afx r0 = (com.google.ads.interactivemedia.p039v3.internal.afx) r0
            r15 = r0
        L_0x0015:
            if (r15 != 0) goto L_0x0019
            r14 = -1
            goto L_0x0022
        L_0x0019:
            com.google.ads.interactivemedia.v3.internal.aco r0 = r8.f14551h
            com.google.ads.interactivemedia.v3.internal.ke r1 = r15.f14241f
            int r0 = r0.mo13446b(r1)
            r14 = r0
        L_0x0022:
            long r0 = r9 - r29
            long r2 = r8.f14560q
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0032
            long r2 = r2 - r29
            goto L_0x0033
        L_0x0032:
            r2 = r4
        L_0x0033:
            if (r15 == 0) goto L_0x004e
            boolean r6 = r8.f14558o
            if (r6 != 0) goto L_0x004e
            long r6 = r15.f14245j
            long r12 = r15.f14244i
            long r6 = r6 - r12
            long r0 = r0 - r6
            r12 = 0
            long r0 = java.lang.Math.max(r12, r0)
            int r18 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x004e
            long r2 = r2 - r6
            long r2 = java.lang.Math.max(r12, r2)
        L_0x004e:
            r19 = r0
            r21 = r2
            com.google.ads.interactivemedia.v3.internal.adn[] r24 = r8.mo13629l(r15, r9)
            com.google.ads.interactivemedia.v3.internal.aih r0 = r8.f14559p
            r18 = r0
            r23 = r33
            r18.mo13617d(r19, r21, r23, r24)
            com.google.ads.interactivemedia.v3.internal.aih r0 = r8.f14559p
            int r12 = r0.mo13744q()
            r13 = 1
            r6 = 0
            if (r14 == r12) goto L_0x006c
            r18 = 1
            goto L_0x006e
        L_0x006c:
            r18 = 0
        L_0x006e:
            android.net.Uri[] r0 = r8.f14548e
            r7 = r0[r12]
            com.google.ads.interactivemedia.v3.internal.aho r0 = r8.f14550g
            boolean r0 = r0.mo13710h(r7)
            if (r0 != 0) goto L_0x008a
            r11.f14536c = r7
            boolean r0 = r8.f14561r
            android.net.Uri r1 = r8.f14557n
            boolean r1 = r7.equals(r1)
            r0 = r0 & r1
            r8.f14561r = r0
            r8.f14557n = r7
            return
        L_0x008a:
            com.google.ads.interactivemedia.v3.internal.aho r0 = r8.f14550g
            com.google.ads.interactivemedia.v3.internal.ahd r3 = r0.mo13708f(r7, r13)
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r3)
            boolean r0 = r3.f14813t
            r8.f14558o = r0
            boolean r0 = r3.f14803j
            if (r0 == 0) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            long r0 = r3.mo13716b()
            com.google.ads.interactivemedia.v3.internal.aho r2 = r8.f14550g
            long r4 = r2.mo13709g()
            long r4 = r0 - r4
        L_0x00a8:
            r8.f14560q = r4
            long r0 = r3.f14796c
            com.google.ads.interactivemedia.v3.internal.aho r2 = r8.f14550g
            long r4 = r2.mo13709g()
            long r19 = r0 - r4
            r0 = r28
            r1 = r15
            r2 = r18
            r4 = r3
            r13 = r4
            r4 = r19
            r10 = r7
            r9 = 0
            r6 = r31
            android.util.Pair r0 = r0.m13474o(r1, r2, r3, r4, r6)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r3 = r13.f14799f
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0116
            if (r15 == 0) goto L_0x0116
            if (r18 == 0) goto L_0x0116
            android.net.Uri[] r0 = r8.f14548e
            r10 = r0[r14]
            com.google.ads.interactivemedia.v3.internal.aho r0 = r8.f14550g
            r1 = 1
            com.google.ads.interactivemedia.v3.internal.ahd r12 = r0.mo13708f(r10, r1)
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r12)
            long r0 = r12.f14796c
            com.google.ads.interactivemedia.v3.internal.aho r2 = r8.f14550g
            long r2 = r2.mo13709g()
            long r18 = r0 - r2
            r2 = 0
            r0 = r28
            r1 = r15
            r3 = r12
            r4 = r18
            r6 = r31
            android.util.Pair r0 = r0.m13474o(r1, r2, r3, r4, r6)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6 = r0
            goto L_0x011b
        L_0x0116:
            r6 = r0
            r14 = r12
            r12 = r13
            r18 = r19
        L_0x011b:
            long r3 = r12.f14799f
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0247
            long r3 = r1 - r3
            int r0 = (int) r3
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r3 = r12.f14806m
            int r3 = r3.size()
            if (r0 != r3) goto L_0x0148
            r3 = -1
            if (r6 != r3) goto L_0x0130
            r6 = 0
        L_0x0130:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r0 = r12.f14807n
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0146
            com.google.ads.interactivemedia.v3.internal.afu r0 = new com.google.ads.interactivemedia.v3.internal.afu
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r3 = r12.f14807n
            java.lang.Object r3 = r3.get(r6)
            com.google.ads.interactivemedia.v3.internal.ahb r3 = (com.google.ads.interactivemedia.p039v3.internal.ahb) r3
            r0.<init>(r3, r1, r6)
            goto L_0x01a2
        L_0x0146:
            r0 = 0
            goto L_0x01a2
        L_0x0148:
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r3 = r12.f14806m
            java.lang.Object r3 = r3.get(r0)
            com.google.ads.interactivemedia.v3.internal.aha r3 = (com.google.ads.interactivemedia.p039v3.internal.aha) r3
            r4 = -1
            if (r6 != r4) goto L_0x0159
            com.google.ads.interactivemedia.v3.internal.afu r0 = new com.google.ads.interactivemedia.v3.internal.afu
            r0.<init>(r3, r1, r4)
            goto L_0x01a2
        L_0x0159:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r4 = r3.f14777b
            int r4 = r4.size()
            if (r6 >= r4) goto L_0x016f
            com.google.ads.interactivemedia.v3.internal.afu r0 = new com.google.ads.interactivemedia.v3.internal.afu
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r3 = r3.f14777b
            java.lang.Object r3 = r3.get(r6)
            com.google.ads.interactivemedia.v3.internal.ahb r3 = (com.google.ads.interactivemedia.p039v3.internal.ahb) r3
            r0.<init>(r3, r1, r6)
            goto L_0x01a2
        L_0x016f:
            r3 = 1
            int r0 = r0 + r3
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r3 = r12.f14806m
            int r3 = r3.size()
            r4 = 1
            if (r0 >= r3) goto L_0x018c
            com.google.ads.interactivemedia.v3.internal.afu r3 = new com.google.ads.interactivemedia.v3.internal.afu
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r6 = r12.f14806m
            java.lang.Object r0 = r6.get(r0)
            com.google.ads.interactivemedia.v3.internal.ahb r0 = (com.google.ads.interactivemedia.p039v3.internal.ahb) r0
            long r1 = r1 + r4
            r4 = -1
            r3.<init>(r0, r1, r4)
            r0 = r3
            goto L_0x01a2
        L_0x018c:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r0 = r12.f14807n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0146
            com.google.ads.interactivemedia.v3.internal.afu r0 = new com.google.ads.interactivemedia.v3.internal.afu
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r3 = r12.f14807n
            java.lang.Object r3 = r3.get(r9)
            com.google.ads.interactivemedia.v3.internal.ahb r3 = (com.google.ads.interactivemedia.p039v3.internal.ahb) r3
            long r1 = r1 + r4
            r0.<init>(r3, r1, r9)
        L_0x01a2:
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r12.f14803j
            if (r0 != 0) goto L_0x01b8
            r11.f14536c = r10
            boolean r0 = r8.f14561r
            android.net.Uri r1 = r8.f14557n
            boolean r1 = r10.equals(r1)
            r0 = r0 & r1
            r8.f14561r = r0
            r8.f14557n = r10
            return
        L_0x01b8:
            if (r34 != 0) goto L_0x01df
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r0 = r12.f14806m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01c3
            goto L_0x01df
        L_0x01c3:
            com.google.ads.interactivemedia.v3.internal.afu r0 = new com.google.ads.interactivemedia.v3.internal.afu
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r1 = r12.f14806m
            java.lang.Object r1 = com.google.ads.interactivemedia.p039v3.internal.art.m14630a(r1)
            com.google.ads.interactivemedia.v3.internal.ahb r1 = (com.google.ads.interactivemedia.p039v3.internal.ahb) r1
            long r2 = r12.f14799f
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r4 = r12.f14806m
            int r4 = r4.size()
            long r4 = (long) r4
            long r2 = r2 + r4
            r4 = -1
            long r2 = r2 + r4
            r4 = -1
            r0.<init>(r1, r2, r4)
            goto L_0x01e3
        L_0x01df:
            r0 = 1
            r11.f14535b = r0
            return
        L_0x01e3:
            r8.f14561r = r9
            r1 = 0
            r8.f14557n = r1
            com.google.ads.interactivemedia.v3.internal.ahb r1 = r0.f14540a
            com.google.ads.interactivemedia.v3.internal.aha r1 = r1.f14779d
            android.net.Uri r1 = m13476q(r12, r1)
            com.google.ads.interactivemedia.v3.internal.ada r2 = r8.m13475p(r1, r14)
            r11.f14534a = r2
            if (r2 == 0) goto L_0x01f9
            return
        L_0x01f9:
            com.google.ads.interactivemedia.v3.internal.ahb r2 = r0.f14540a
            android.net.Uri r2 = m13476q(r12, r2)
            com.google.ads.interactivemedia.v3.internal.ada r3 = r8.m13475p(r2, r14)
            r11.f14534a = r3
            if (r3 == 0) goto L_0x0208
            return
        L_0x0208:
            com.google.ads.interactivemedia.v3.internal.afw r13 = r8.f14544a
            com.google.ads.interactivemedia.v3.internal.ajg r3 = r8.f14545b
            com.google.ads.interactivemedia.v3.internal.ke[] r4 = r8.f14549f
            r4 = r4[r14]
            java.util.List<com.google.ads.interactivemedia.v3.internal.ke> r5 = r8.f14552i
            com.google.ads.interactivemedia.v3.internal.aih r6 = r8.f14559p
            int r22 = r6.mo13615b()
            com.google.ads.interactivemedia.v3.internal.aih r6 = r8.f14559p
            r6.mo13616c()
            boolean r6 = r8.f14554k
            com.google.ads.interactivemedia.v3.internal.agn r7 = r8.f14547d
            com.google.ads.interactivemedia.v3.internal.afp r9 = r8.f14553j
            byte[] r26 = r9.mo13609a(r2)
            com.google.ads.interactivemedia.v3.internal.afp r2 = r8.f14553j
            byte[] r27 = r2.mo13609a(r1)
            r14 = r3
            r1 = r15
            r15 = r4
            r16 = r18
            r18 = r12
            r19 = r0
            r20 = r10
            r21 = r5
            r23 = r6
            r24 = r7
            r25 = r1
            com.google.ads.interactivemedia.v3.internal.afx r0 = com.google.ads.interactivemedia.p039v3.internal.afx.m13491m(r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r11.f14534a = r0
            return
        L_0x0247:
            com.google.ads.interactivemedia.v3.internal.zy r0 = new com.google.ads.interactivemedia.v3.internal.zy
            r0.<init>()
            r8.f14556m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.afv.mo13625h(long, long, java.util.List, boolean, com.google.ads.interactivemedia.v3.internal.afr):void");
    }

    /* renamed from: i */
    public final void mo13626i(ada ada) {
        if (ada instanceof afq) {
            afq afq = (afq) ada;
            this.f14555l = afq.mo13504a();
            this.f14553j.mo13611c(afq.f14239d.f15056a, (byte[]) aup.m14890u(afq.mo13612e()));
        }
    }

    /* renamed from: j */
    public final boolean mo13627j(ada ada, long j) {
        aih aih = this.f14559p;
        return aih.mo13745r(aih.mo13742o(this.f14551h.mo13446b(ada.f14241f)), j);
    }

    /* renamed from: k */
    public final boolean mo13628k(Uri uri, long j) {
        int o;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f14548e;
            if (i < uriArr.length) {
                if (uriArr[i].equals(uri)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1 || (o = this.f14559p.mo13742o(i)) == -1) {
            return true;
        }
        this.f14561r = uri.equals(this.f14557n) | this.f14561r;
        if (j == C6540C.TIME_UNSET || this.f14559p.mo13745r(o, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final adn[] mo13629l(afx afx, long j) {
        int i;
        int i2;
        List list;
        afx afx2 = afx;
        if (afx2 == null) {
            i = -1;
        } else {
            i = this.f14551h.mo13446b(afx2.f14241f);
        }
        int k = this.f14559p.mo13738k();
        adn[] adnArr = new adn[k];
        boolean z = false;
        int i3 = 0;
        while (i3 < k) {
            int m = this.f14559p.mo13740m(i3);
            Uri uri = this.f14548e[m];
            if (!this.f14550g.mo13710h(uri)) {
                adnArr[i3] = adn.f14290a;
                i2 = i3;
            } else {
                ahd f = this.f14550g.mo13708f(uri, z);
                aup.m14890u(f);
                i2 = i3;
                long g = f.f14796c - this.f14550g.mo13709g();
                ahd ahd = f;
                Pair<Long, Integer> o = m13474o(afx, m != i, f, g, j);
                long longValue = ((Long) o.first).longValue();
                int intValue = ((Integer) o.second).intValue();
                int i4 = (int) (longValue - ahd.f14799f);
                if (i4 < 0 || ahd.f14806m.size() < i4) {
                    list = atz.m14807i();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i4 < ahd.f14806m.size()) {
                        if (intValue != -1) {
                            aha aha = ahd.f14806m.get(i4);
                            if (intValue == 0) {
                                arrayList.add(aha);
                            } else if (intValue < aha.f14777b.size()) {
                                List<agy> list2 = aha.f14777b;
                                arrayList.addAll(list2.subList(intValue, list2.size()));
                            }
                            i4++;
                        }
                        List<aha> list3 = ahd.f14806m;
                        arrayList.addAll(list3.subList(i4, list3.size()));
                        intValue = 0;
                    }
                    if (ahd.f14802i != C6540C.TIME_UNSET) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < ahd.f14807n.size()) {
                            List<agy> list4 = ahd.f14807n;
                            arrayList.addAll(list4.subList(intValue, list4.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                adnArr[i2] = new afs(g, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return adnArr;
    }

    /* renamed from: m */
    public final int mo13630m(long j, List<? extends adl> list) {
        if (this.f14556m != null || this.f14559p.mo13738k() < 2) {
            return list.size();
        }
        return this.f14559p.mo13734h(j, list);
    }

    /* renamed from: n */
    public final void mo13631n(long j, ada ada, List<? extends adl> list) {
        if (this.f14556m == null) {
            this.f14559p.mo13747t();
        }
    }
}
