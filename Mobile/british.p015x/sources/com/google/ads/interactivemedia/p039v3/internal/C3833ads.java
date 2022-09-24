package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ads */
/* compiled from: IMASDK */
final class C3833ads implements aaz, aci, adf {

    /* renamed from: b */
    private static final Pattern f14302b = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: c */
    private static final Pattern f14303c = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a */
    final int f14304a;

    /* renamed from: d */
    private final akp f14305d;

    /* renamed from: e */
    private final C4286qi f14306e;

    /* renamed from: f */
    private final long f14307f;

    /* renamed from: g */
    private final akj f14308g;

    /* renamed from: h */
    private final acq f14309h;

    /* renamed from: i */
    private final adr[] f14310i;

    /* renamed from: j */
    private final aen f14311j;

    /* renamed from: k */
    private final IdentityHashMap<adg<adp>, aem> f14312k = new IdentityHashMap<>();

    /* renamed from: l */
    private final abj f14313l;

    /* renamed from: m */
    private final C4281qd f14314m;

    /* renamed from: n */
    private aay f14315n;

    /* renamed from: o */
    private adg<adp>[] f14316o = new adg[0];

    /* renamed from: p */
    private aej[] f14317p = new aej[0];

    /* renamed from: q */
    private acj f14318q = C4396uk.m19135d(this.f14316o);

    /* renamed from: r */
    private aep f14319r;

    /* renamed from: s */
    private int f14320s;

    /* renamed from: t */
    private List<aet> f14321t;

    /* renamed from: u */
    private final aef f14322u;

    /* renamed from: v */
    private final ajl f14323v;

    /* renamed from: w */
    private final C4396uk f14324w;

    /* renamed from: x */
    private final aup f14325x;

    public C3833ads(int i, aep aep, int i2, aef aef, akp akp, C4286qi qiVar, C4281qd qdVar, aup aup, abj abj, long j, akj akj, ajl ajl, C4396uk ukVar, ael ael, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        List<aeo> list;
        int i3;
        int i4;
        boolean[] zArr;
        C4120ke[] keVarArr;
        aes t;
        aep aep2 = aep;
        C4286qi qiVar2 = qiVar;
        ajl ajl2 = ajl;
        this.f14304a = i;
        this.f14319r = aep2;
        this.f14320s = i2;
        this.f14322u = aef;
        this.f14305d = akp;
        this.f14306e = qiVar2;
        this.f14314m = qdVar;
        this.f14325x = aup;
        this.f14313l = abj;
        this.f14307f = j;
        this.f14308g = akj;
        this.f14323v = ajl2;
        this.f14324w = ukVar;
        this.f14311j = new aen(aep2, ael, ajl2);
        int i5 = 0;
        aeu c = aep.mo13566c(i2);
        List<aet> list2 = c.f14472d;
        this.f14321t = list2;
        List<aeo> list3 = c.f14471c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(list3.get(i6).f14431a, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            aeo aeo = list3.get(i7);
            aes s = m13221s(aeo.f14435e);
            s = s == null ? m13221s(aeo.f14436f) : s;
            int i8 = (s == null || (i8 = sparseIntArray.get(Integer.parseInt(s.f14463b), -1)) == -1) ? i7 : i8;
            if (i8 == i7 && (t = m13222t(aeo.f14436f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String parseInt : amm.m14256z(t.f14463b, ",")) {
                    int i9 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i9 != -1) {
                        i8 = Math.min(i8, i9);
                    }
                }
            }
            if (i8 != i7) {
                List list4 = (List) sparseArray.get(i7);
                List list5 = (List) sparseArray.get(i8);
                list5.addAll(list4);
                sparseArray.put(i7, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] a = awa.m14989a((Collection) arrayList.get(i10));
            iArr[i10] = a;
            Arrays.sort(a);
        }
        boolean[] zArr2 = new boolean[size2];
        C4120ke[][] keVarArr2 = new C4120ke[size2][];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr2 = iArr[i11];
            int length = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                List<aez> list6 = list3.get(iArr2[i13]).f14433c;
                while (i5 < list6.size()) {
                    if (!list6.get(i5).f14489e.isEmpty()) {
                        zArr2[i11] = true;
                        i12++;
                        break;
                    }
                    i5++;
                }
                i13++;
                i5 = 0;
            }
            int[] iArr3 = iArr[i11];
            int length2 = iArr3.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    keVarArr = new C4120ke[0];
                    break;
                }
                int i15 = iArr3[i14];
                aeo aeo2 = list3.get(i15);
                List<aes> list7 = list3.get(i15).f14434d;
                int[] iArr4 = iArr3;
                int i16 = 0;
                while (i16 < list7.size()) {
                    aes aes = list7.get(i16);
                    int i17 = length2;
                    List<aes> list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(aes.f14462a)) {
                        C4119kd kdVar = new C4119kd();
                        kdVar.mo16120ae(MimeTypes.APPLICATION_CEA608);
                        int i18 = aeo2.f14431a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i18);
                        sb.append(":cea608");
                        kdVar.mo16107S(sb.toString());
                        keVarArr = m13223u(aes, f14302b, kdVar.mo16115a());
                        break;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(aes.f14462a)) {
                        C4119kd kdVar2 = new C4119kd();
                        kdVar2.mo16120ae(MimeTypes.APPLICATION_CEA708);
                        int i19 = aeo2.f14431a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i19);
                        sb2.append(":cea708");
                        kdVar2.mo16107S(sb2.toString());
                        keVarArr = m13223u(aes, f14303c, kdVar2.mo16115a());
                        break;
                    } else {
                        i16++;
                        length2 = i17;
                        list7 = list8;
                    }
                }
                int i20 = length2;
                i14++;
                iArr3 = iArr4;
            }
            keVarArr2[i11] = keVarArr;
            if (keVarArr.length != 0) {
                i12++;
            }
            i11++;
            i5 = 0;
        }
        int size3 = i12 + size2 + list2.size();
        aco[] acoArr = new aco[size3];
        adr[] adrArr = new adr[size3];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr5 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i23 = size2;
            int i24 = 0;
            while (i24 < length3) {
                arrayList3.addAll(list3.get(iArr5[i24]).f14433c);
                i24++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            C4120ke[] keVarArr3 = new C4120ke[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size4;
                C4120ke keVar = ((aez) arrayList3.get(i25)).f14486b;
                keVarArr3[i25] = keVar.mo16128c(qiVar2.mo16575b(keVar));
                i25++;
                size4 = i26;
                arrayList3 = arrayList3;
            }
            aeo aeo3 = list3.get(iArr5[0]);
            int i27 = i22 + 1;
            if (zArr2[i21]) {
                list = list3;
                i3 = i27;
                i27++;
            } else {
                list = list3;
                i3 = -1;
            }
            if (keVarArr2[i21].length != 0) {
                int i28 = i27;
                i27++;
                i4 = i28;
            } else {
                i4 = -1;
            }
            acoArr[i22] = new aco(keVarArr3);
            adrArr[i22] = adr.m13216a(aeo3.f14432b, iArr5, i22, i3, i4);
            int i29 = -1;
            if (i3 != -1) {
                C4119kd kdVar3 = new C4119kd();
                int i30 = aeo3.f14431a;
                zArr = zArr2;
                StringBuilder sb3 = new StringBuilder(16);
                sb3.append(i30);
                sb3.append(":emsg");
                kdVar3.mo16107S(sb3.toString());
                kdVar3.mo16120ae(MimeTypes.APPLICATION_EMSG);
                acoArr[i3] = new aco(kdVar3.mo16115a());
                adrArr[i3] = adr.m13217b(iArr5, i22);
                i29 = -1;
            } else {
                zArr = zArr2;
            }
            if (i4 != i29) {
                acoArr[i4] = new aco(keVarArr2[i21]);
                adrArr[i4] = adr.m13218c(iArr5, i22);
            }
            i21++;
            size2 = i23;
            iArr = iArr6;
            qiVar2 = qiVar;
            zArr2 = zArr;
            i22 = i27;
            list3 = list;
        }
        int i31 = 0;
        while (i31 < list2.size()) {
            C4119kd kdVar4 = new C4119kd();
            kdVar4.mo16107S(list2.get(i31).mo13577a());
            kdVar4.mo16120ae(MimeTypes.APPLICATION_EMSG);
            acoArr[i22] = new aco(kdVar4.mo16115a());
            adrArr[i22] = adr.m13219d(i31);
            i31++;
            i22++;
        }
        Pair create = Pair.create(new acq(acoArr), adrArr);
        this.f14309h = (acq) create.first;
        this.f14310i = (adr[]) create.second;
    }

    /* renamed from: r */
    private final int m13220r(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f14310i[i2].f14299e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f14310i[i5].f14297c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: s */
    private static aes m13221s(List<aes> list) {
        return m13222t(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: t */
    private static aes m13222t(List<aes> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            aes aes = list.get(i);
            if (str.equals(aes.f14462a)) {
                return aes;
            }
        }
        return null;
    }

    /* renamed from: u */
    private static C4120ke[] m13223u(aes aes, Pattern pattern, C4120ke keVar) {
        String str = aes.f14463b;
        if (str == null) {
            return new C4120ke[]{keVar};
        }
        String[] z = amm.m14256z(str, ";");
        C4120ke[] keVarArr = new C4120ke[z.length];
        for (int i = 0; i < z.length; i++) {
            Matcher matcher = pattern.matcher(z[i]);
            if (!matcher.matches()) {
                return new C4120ke[]{keVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C4119kd a = keVar.mo16126a();
            String str2 = keVar.f17670a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
            sb.append(str2);
            sb.append(":");
            sb.append(parseInt);
            a.mo16107S(sb.toString());
            a.mo16094F(parseInt);
            a.mo16110V(matcher.group(2));
            keVarArr[i] = a.mo16115a();
        }
        return keVarArr;
    }

    /* renamed from: a */
    public final void mo13228a(aay aay, long j) {
        this.f14315n = aay;
        aay.mo13237j(this);
    }

    /* renamed from: b */
    public final void mo13229b() throws IOException {
        this.f14308g.mo13518a();
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        this.f14318q.mo13230bd(j);
    }

    /* renamed from: c */
    public final acq mo13231c() {
        return this.f14309h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.google.ads.interactivemedia.v3.internal.adh, com.google.ads.interactivemedia.v3.internal.adp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo13232d(com.google.ads.interactivemedia.p039v3.internal.aih[] r36, boolean[] r37, com.google.ads.interactivemedia.p039v3.internal.ach[] r38, boolean[] r39, long r40) {
        /*
            r35 = this;
            r15 = r35
            r0 = r36
            r13 = r40
            int r1 = r0.length
            int[] r12 = new int[r1]
            r11 = 0
            r1 = 0
        L_0x000b:
            int r2 = r0.length
            r10 = -1
            if (r1 >= r2) goto L_0x0025
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0020
            com.google.ads.interactivemedia.v3.internal.acq r3 = r15.f14309h
            com.google.ads.interactivemedia.v3.internal.aco r2 = r2.mo13737j()
            int r2 = r3.mo13454b(r2)
            r12[r1] = r2
            goto L_0x0022
        L_0x0020:
            r12[r1] = r10
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r2 = r0.length
            r17 = 0
            if (r1 >= r2) goto L_0x004d
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0033
            boolean r2 = r37[r1]
            if (r2 != 0) goto L_0x004a
        L_0x0033:
            r2 = r38[r1]
            boolean r3 = r2 instanceof com.google.ads.interactivemedia.p039v3.internal.adg
            if (r3 == 0) goto L_0x003f
            com.google.ads.interactivemedia.v3.internal.adg r2 = (com.google.ads.interactivemedia.p039v3.internal.adg) r2
            r2.mo13491j(r15)
            goto L_0x0048
        L_0x003f:
            boolean r3 = r2 instanceof com.google.ads.interactivemedia.p039v3.internal.ade
            if (r3 == 0) goto L_0x0048
            com.google.ads.interactivemedia.v3.internal.ade r2 = (com.google.ads.interactivemedia.p039v3.internal.ade) r2
            r2.mo13485a()
        L_0x0048:
            r38[r1] = r17
        L_0x004a:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x004d:
            r1 = 0
        L_0x004e:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x0089
            r2 = r38[r1]
            boolean r3 = r2 instanceof com.google.ads.interactivemedia.p039v3.internal.aao
            if (r3 != 0) goto L_0x005c
            boolean r2 = r2 instanceof com.google.ads.interactivemedia.p039v3.internal.ade
            if (r2 == 0) goto L_0x0086
        L_0x005c:
            int r2 = r15.m13220r(r1, r12)
            if (r2 != r10) goto L_0x0067
            r2 = r38[r1]
            boolean r8 = r2 instanceof com.google.ads.interactivemedia.p039v3.internal.aao
            goto L_0x0077
        L_0x0067:
            r3 = r38[r1]
            boolean r4 = r3 instanceof com.google.ads.interactivemedia.p039v3.internal.ade
            if (r4 == 0) goto L_0x0076
            com.google.ads.interactivemedia.v3.internal.ade r3 = (com.google.ads.interactivemedia.p039v3.internal.ade) r3
            com.google.ads.interactivemedia.v3.internal.adg r3 = r3.f14249a
            r2 = r38[r2]
            if (r3 != r2) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            if (r8 != 0) goto L_0x0086
            r2 = r38[r1]
            boolean r3 = r2 instanceof com.google.ads.interactivemedia.p039v3.internal.ade
            if (r3 == 0) goto L_0x0084
            com.google.ads.interactivemedia.v3.internal.ade r2 = (com.google.ads.interactivemedia.p039v3.internal.ade) r2
            r2.mo13485a()
        L_0x0084:
            r38[r1] = r17
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x004e
        L_0x0089:
            r9 = 0
        L_0x008a:
            int r1 = r0.length
            r2 = 2
            if (r9 >= r1) goto L_0x01c7
            r1 = r0[r9]
            if (r1 != 0) goto L_0x009a
            r21 = r9
            r34 = r12
            r5 = r15
        L_0x0097:
            r4 = 0
            goto L_0x01b9
        L_0x009a:
            r3 = r38[r9]
            if (r3 != 0) goto L_0x01a6
            r39[r9] = r8
            r3 = r12[r9]
            com.google.ads.interactivemedia.v3.internal.adr[] r4 = r15.f14310i
            r3 = r4[r3]
            int r4 = r3.f14297c
            if (r4 != 0) goto L_0x0180
            int r2 = r3.f14300f
            if (r2 == r10) goto L_0x00b1
            r27 = 1
            goto L_0x00b3
        L_0x00b1:
            r27 = 0
        L_0x00b3:
            if (r27 == 0) goto L_0x00bd
            com.google.ads.interactivemedia.v3.internal.acq r4 = r15.f14309h
            com.google.ads.interactivemedia.v3.internal.aco r2 = r4.mo13453a(r2)
            r4 = 1
            goto L_0x00c0
        L_0x00bd:
            r2 = r17
            r4 = 0
        L_0x00c0:
            int r5 = r3.f14301g
            if (r5 == r10) goto L_0x00ce
            com.google.ads.interactivemedia.v3.internal.acq r6 = r15.f14309h
            com.google.ads.interactivemedia.v3.internal.aco r6 = r6.mo13453a(r5)
            int r7 = r6.f14188a
            int r4 = r4 + r7
            goto L_0x00d0
        L_0x00ce:
            r6 = r17
        L_0x00d0:
            com.google.ads.interactivemedia.v3.internal.ke[] r7 = new com.google.ads.interactivemedia.p039v3.internal.C4120ke[r4]
            int[] r4 = new int[r4]
            if (r27 == 0) goto L_0x00e1
            com.google.ads.interactivemedia.v3.internal.ke r2 = r2.mo13445a(r11)
            r7[r11] = r2
            r2 = 5
            r4[r11] = r2
            r2 = 1
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r5 == r10) goto L_0x00ff
            r5 = 0
        L_0x00ea:
            int r10 = r6.f14188a
            if (r5 >= r10) goto L_0x00ff
            com.google.ads.interactivemedia.v3.internal.ke r10 = r6.mo13445a(r5)
            r7[r2] = r10
            r18 = 3
            r4[r2] = r18
            r11.add(r10)
            int r2 = r2 + r8
            int r5 = r5 + 1
            goto L_0x00ea
        L_0x00ff:
            com.google.ads.interactivemedia.v3.internal.aep r2 = r15.f14319r
            boolean r2 = r2.f14440d
            if (r2 == 0) goto L_0x010f
            if (r27 == 0) goto L_0x010f
            com.google.ads.interactivemedia.v3.internal.aen r2 = r15.f14311j
            com.google.ads.interactivemedia.v3.internal.aem r2 = r2.mo13558b()
            r10 = r2
            goto L_0x0111
        L_0x010f:
            r10 = r17
        L_0x0111:
            com.google.ads.interactivemedia.v3.internal.aef r2 = r15.f14322u
            com.google.ads.interactivemedia.v3.internal.akj r5 = r15.f14308g
            com.google.ads.interactivemedia.v3.internal.aep r6 = r15.f14319r
            int r8 = r15.f14320s
            r31 = r9
            int[] r9 = r3.f14295a
            r32 = r12
            int r12 = r3.f14296b
            long r13 = r15.f14307f
            com.google.ads.interactivemedia.v3.internal.akp r0 = r15.f14305d
            r18 = r2
            r19 = r5
            r20 = r6
            r21 = r8
            r22 = r9
            r23 = r1
            r24 = r12
            r25 = r13
            r28 = r11
            r29 = r10
            r30 = r0
            com.google.ads.interactivemedia.v3.internal.adp r5 = r18.mo13539a(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30)
            com.google.ads.interactivemedia.v3.internal.adg r0 = new com.google.ads.interactivemedia.v3.internal.adg
            int r2 = r3.f14296b
            com.google.ads.interactivemedia.v3.internal.ajl r8 = r15.f14323v
            com.google.ads.interactivemedia.v3.internal.qi r11 = r15.f14306e
            com.google.ads.interactivemedia.v3.internal.qd r12 = r15.f14314m
            com.google.ads.interactivemedia.v3.internal.aup r13 = r15.f14325x
            com.google.ads.interactivemedia.v3.internal.abj r14 = r15.f14313l
            r18 = 0
            r19 = 0
            r20 = 0
            r1 = r0
            r3 = r4
            r4 = r7
            r6 = r35
            r7 = r8
            r21 = r31
            r8 = r40
            r33 = r10
            r10 = r11
            r11 = r12
            r34 = r32
            r12 = r13
            r13 = r14
            r14 = r18
            r15 = r19
            r16 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)
            r5 = r35
            monitor-enter(r35)
            java.util.IdentityHashMap<com.google.ads.interactivemedia.v3.internal.adg<com.google.ads.interactivemedia.v3.internal.adp>, com.google.ads.interactivemedia.v3.internal.aem> r1 = r5.f14312k     // Catch:{ all -> 0x017d }
            r2 = r33
            r1.put(r0, r2)     // Catch:{ all -> 0x017d }
            monitor-exit(r35)     // Catch:{ all -> 0x017d }
            r38[r21] = r0
            goto L_0x0097
        L_0x017d:
            r0 = move-exception
            monitor-exit(r35)     // Catch:{ all -> 0x017d }
            throw r0
        L_0x0180:
            r21 = r9
            r34 = r12
            r5 = r15
            if (r4 != r2) goto L_0x0097
            java.util.List<com.google.ads.interactivemedia.v3.internal.aet> r0 = r5.f14321t
            int r2 = r3.f14298d
            java.lang.Object r0 = r0.get(r2)
            com.google.ads.interactivemedia.v3.internal.aet r0 = (com.google.ads.interactivemedia.p039v3.internal.aet) r0
            com.google.ads.interactivemedia.v3.internal.aco r1 = r1.mo13737j()
            r4 = 0
            com.google.ads.interactivemedia.v3.internal.ke r1 = r1.mo13445a(r4)
            com.google.ads.interactivemedia.v3.internal.aej r2 = new com.google.ads.interactivemedia.v3.internal.aej
            com.google.ads.interactivemedia.v3.internal.aep r3 = r5.f14319r
            boolean r3 = r3.f14440d
            r2.<init>(r0, r1, r3)
            r38[r21] = r2
            goto L_0x01b9
        L_0x01a6:
            r21 = r9
            r34 = r12
            r5 = r15
            r4 = 0
            boolean r0 = r3 instanceof com.google.ads.interactivemedia.p039v3.internal.adg
            if (r0 == 0) goto L_0x01b9
            com.google.ads.interactivemedia.v3.internal.adg r3 = (com.google.ads.interactivemedia.p039v3.internal.adg) r3
            com.google.ads.interactivemedia.v3.internal.adh r0 = r3.mo13488f()
            r0.mo13510j(r1)
        L_0x01b9:
            int r9 = r21 + 1
            r0 = r36
            r13 = r40
            r15 = r5
            r12 = r34
            r8 = 1
            r10 = -1
            r11 = 0
            goto L_0x008a
        L_0x01c7:
            r34 = r12
            r5 = r15
            r4 = 0
            r0 = r36
            r11 = 0
        L_0x01ce:
            int r1 = r0.length
            if (r11 >= r1) goto L_0x0214
            r1 = r38[r11]
            if (r1 != 0) goto L_0x0209
            r1 = r0[r11]
            if (r1 == 0) goto L_0x0209
            r1 = r34
            r3 = r1[r11]
            com.google.ads.interactivemedia.v3.internal.adr[] r6 = r5.f14310i
            r3 = r6[r3]
            int r6 = r3.f14297c
            r7 = 1
            if (r6 != r7) goto L_0x0206
            int r6 = r5.m13220r(r11, r1)
            r8 = -1
            if (r6 != r8) goto L_0x01f7
            com.google.ads.interactivemedia.v3.internal.aao r3 = new com.google.ads.interactivemedia.v3.internal.aao
            r3.<init>()
            r38[r11] = r3
            r9 = r40
            goto L_0x020f
        L_0x01f7:
            r6 = r38[r6]
            com.google.ads.interactivemedia.v3.internal.adg r6 = (com.google.ads.interactivemedia.p039v3.internal.adg) r6
            int r3 = r3.f14296b
            r9 = r40
            com.google.ads.interactivemedia.v3.internal.ade r3 = r6.mo13487a(r9, r3)
            r38[r11] = r3
            goto L_0x020f
        L_0x0206:
            r9 = r40
            goto L_0x020e
        L_0x0209:
            r9 = r40
            r1 = r34
            r7 = 1
        L_0x020e:
            r8 = -1
        L_0x020f:
            int r11 = r11 + 1
            r34 = r1
            goto L_0x01ce
        L_0x0214:
            r9 = r40
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11 = 0
        L_0x0221:
            if (r11 >= r2) goto L_0x023b
            r3 = r38[r11]
            boolean r4 = r3 instanceof com.google.ads.interactivemedia.p039v3.internal.adg
            if (r4 == 0) goto L_0x022f
            com.google.ads.interactivemedia.v3.internal.adg r3 = (com.google.ads.interactivemedia.p039v3.internal.adg) r3
            r0.add(r3)
            goto L_0x0238
        L_0x022f:
            boolean r4 = r3 instanceof com.google.ads.interactivemedia.p039v3.internal.aej
            if (r4 == 0) goto L_0x0238
            com.google.ads.interactivemedia.v3.internal.aej r3 = (com.google.ads.interactivemedia.p039v3.internal.aej) r3
            r1.add(r3)
        L_0x0238:
            int r11 = r11 + 1
            goto L_0x0221
        L_0x023b:
            int r2 = r0.size()
            com.google.ads.interactivemedia.v3.internal.adg[] r2 = new com.google.ads.interactivemedia.p039v3.internal.adg[r2]
            r5.f14316o = r2
            r0.toArray(r2)
            int r0 = r1.size()
            com.google.ads.interactivemedia.v3.internal.aej[] r0 = new com.google.ads.interactivemedia.p039v3.internal.aej[r0]
            r5.f14317p = r0
            r1.toArray(r0)
            com.google.ads.interactivemedia.v3.internal.adg<com.google.ads.interactivemedia.v3.internal.adp>[] r0 = r5.f14316o
            com.google.ads.interactivemedia.v3.internal.acj r0 = com.google.ads.interactivemedia.p039v3.internal.C4396uk.m19135d(r0)
            r5.f14318q = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C3833ads.mo13232d(com.google.ads.interactivemedia.v3.internal.aih[], boolean[], com.google.ads.interactivemedia.v3.internal.ach[], boolean[], long):long");
    }

    /* renamed from: f */
    public final long mo13233f() {
        return C6540C.TIME_UNSET;
    }

    /* renamed from: g */
    public final long mo13234g() {
        return this.f14318q.mo13234g();
    }

    /* renamed from: h */
    public final long mo13235h(long j) {
        for (adg<adp> i : this.f14316o) {
            i.mo13490i(j);
        }
        for (aej g : this.f14317p) {
            g.mo13553g(j);
        }
        return j;
    }

    /* renamed from: i */
    public final long mo13236i(long j, C4159lq lqVar) {
        for (adg<adp> adg : this.f14316o) {
            if (adg.f14254a == 2) {
                return adg.mo13489h(j, lqVar);
            }
        }
        return j;
    }

    /* renamed from: j */
    public final synchronized void mo13486j(adg<adp> adg) {
        aem remove = this.f14312k.remove(adg);
        if (remove != null) {
            remove.mo13556i();
        }
    }

    /* renamed from: k */
    public final long mo13238k() {
        return this.f14318q.mo13238k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13239l(acj acj) {
        this.f14315n.mo13239l(this);
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        return this.f14318q.mo13240m(j);
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        return this.f14318q.mo13241n();
    }

    /* renamed from: o */
    public final void mo13511o(aep aep, int i) {
        this.f14319r = aep;
        this.f14320s = i;
        this.f14311j.mo13557a(aep);
        adg<adp>[] adgArr = this.f14316o;
        if (adgArr != null) {
            for (adg<adp> f : adgArr) {
                f.mo13488f().mo13509i(aep, i);
            }
            this.f14315n.mo13239l(this);
        }
        this.f14321t = aep.mo13566c(i).f14472d;
        for (aej aej : this.f14317p) {
            Iterator<aet> it = this.f14321t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aet next = it.next();
                if (next.mo13577a().equals(aej.mo13551a())) {
                    aej.mo13552f(next, aep.f14440d && i == aep.mo13565b() + -1);
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo13243p(long j) {
        for (adg<adp> u : this.f14316o) {
            u.mo13493u(j);
        }
    }

    /* renamed from: q */
    public final void mo13512q() {
        this.f14311j.mo13559c();
        for (adg<adp> j : this.f14316o) {
            j.mo13491j(this);
        }
        this.f14315n = null;
    }
}
