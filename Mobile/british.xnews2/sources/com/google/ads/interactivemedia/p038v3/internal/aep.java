package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aep */
/* compiled from: IMASDK */
public final class aep implements C4540zt<aep> {

    /* renamed from: a */
    public final long f14437a;

    /* renamed from: b */
    public final long f14438b;

    /* renamed from: c */
    public final long f14439c;

    /* renamed from: d */
    public final boolean f14440d;

    /* renamed from: e */
    public final long f14441e;

    /* renamed from: f */
    public final long f14442f;

    /* renamed from: g */
    public final long f14443g;

    /* renamed from: h */
    public final long f14444h;

    /* renamed from: i */
    public final afj f14445i;

    /* renamed from: j */
    public final afg f14446j;

    /* renamed from: k */
    public final Uri f14447k;

    /* renamed from: l */
    public final aev f14448l;

    /* renamed from: m */
    private final List<aeu> f14449m;

    public aep(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, aev aev, afj afj, afg afg, Uri uri, List<aeu> list) {
        this.f14437a = j;
        this.f14438b = j2;
        this.f14439c = j3;
        this.f14440d = z;
        this.f14441e = j4;
        this.f14442f = j5;
        this.f14443g = j6;
        this.f14444h = j7;
        this.f14448l = aev;
        this.f14445i = afj;
        this.f14447k = uri;
        this.f14446j = afg;
        this.f14449m = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13564a(List list) {
        aep aep = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C4543zw());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (i < mo13565b()) {
            if (((C4543zw) linkedList.peek()).f19782a != i) {
                long d = aep.mo13567d(i);
                if (d != C6540C.TIME_UNSET) {
                    j += d;
                }
            } else {
                aeu c = aep.mo13566c(i);
                List<aeo> list2 = c.f14471c;
                C4543zw zwVar = (C4543zw) linkedList.poll();
                int i2 = zwVar.f19782a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = zwVar.f19783b;
                    aeo aeo = list2.get(i3);
                    List<aez> list3 = aeo.f14433c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(zwVar.f19784c));
                        zwVar = (C4543zw) linkedList.poll();
                        if (!(zwVar.f19782a == i2 && zwVar.f19783b == i3)) {
                            List<aeo> list4 = list2;
                            arrayList2.add(new aeo(aeo.f14431a, aeo.f14432b, arrayList3, aeo.f14434d, aeo.f14435e, aeo.f14436f));
                        }
                        arrayList3.add(list3.get(zwVar.f19784c));
                        zwVar = (C4543zw) linkedList.poll();
                        break;
                    } while (zwVar.f19783b == i3);
                    List<aeo> list42 = list2;
                    arrayList2.add(new aeo(aeo.f14431a, aeo.f14432b, arrayList3, aeo.f14434d, aeo.f14435e, aeo.f14436f));
                    if (zwVar.f19782a != i2) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(zwVar);
                arrayList.add(new aeu(c.f14469a, c.f14470b - j, arrayList2, c.f14472d));
            }
            i++;
            aep = this;
        }
        long j2 = aep.f14438b;
        return new aep(aep.f14437a, j2 != C6540C.TIME_UNSET ? j2 - j : -9223372036854775807L, aep.f14439c, aep.f14440d, aep.f14441e, aep.f14442f, aep.f14443g, aep.f14444h, aep.f14448l, aep.f14445i, aep.f14446j, aep.f14447k, arrayList);
    }

    /* renamed from: b */
    public final int mo13565b() {
        return this.f14449m.size();
    }

    /* renamed from: c */
    public final aeu mo13566c(int i) {
        return this.f14449m.get(i);
    }

    /* renamed from: d */
    public final long mo13567d(int i) {
        if (i != this.f14449m.size() - 1) {
            return this.f14449m.get(i + 1).f14470b - this.f14449m.get(i).f14470b;
        }
        long j = this.f14438b;
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        return j - this.f14449m.get(i).f14470b;
    }

    /* renamed from: e */
    public final long mo13568e(int i) {
        return C4083iv.m17452b(mo13567d(i));
    }
}
