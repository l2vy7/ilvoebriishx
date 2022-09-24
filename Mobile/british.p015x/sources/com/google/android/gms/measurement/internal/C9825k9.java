package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9066a4;
import com.google.android.gms.internal.measurement.C9081b4;
import com.google.android.gms.internal.measurement.C9096c4;
import com.google.android.gms.internal.measurement.C9112d4;
import com.google.android.gms.internal.measurement.C9374u4;
import com.google.android.gms.internal.measurement.C9389v4;
import com.google.android.gms.internal.measurement.C9405w4;
import com.google.android.gms.internal.measurement.C9420x4;
import com.google.android.gms.internal.measurement.C9427xc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p150t.C6077a;
import p256u5.C11050y;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9825k9 {

    /* renamed from: a */
    private String f46413a;

    /* renamed from: b */
    private boolean f46414b;

    /* renamed from: c */
    private C9389v4 f46415c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f46416d;

    /* renamed from: e */
    private BitSet f46417e;

    /* renamed from: f */
    private Map f46418f;

    /* renamed from: g */
    private Map f46419g;

    /* renamed from: h */
    final /* synthetic */ C9880p9 f46420h;

    /* synthetic */ C9825k9(C9880p9 p9Var, String str, C11050y yVar) {
        this.f46420h = p9Var;
        this.f46413a = str;
        this.f46414b = true;
        this.f46416d = new BitSet();
        this.f46417e = new BitSet();
        this.f46418f = new C6077a();
        this.f46419g = new C6077a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9081b4 mo39046a(int i) {
        ArrayList arrayList;
        List list;
        C9066a4 A = C9081b4.m42660A();
        A.mo37308B(i);
        A.mo37310H(this.f46414b);
        C9389v4 v4Var = this.f46415c;
        if (v4Var != null) {
            A.mo37311I(v4Var);
        }
        C9374u4 F = C9389v4.m43730F();
        F.mo38088C(C9978z8.m45536H(this.f46416d));
        F.mo38090I(C9978z8.m45536H(this.f46417e));
        Map map = this.f46418f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f46418f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f46418f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C9096c4 B = C9112d4.m42768B();
                    B.mo37446C(intValue2);
                    B.mo37445B(l.longValue());
                    arrayList2.add((C9112d4) B.mo37840w());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            F.mo38087B(arrayList);
        }
        Map map2 = this.f46419g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f46419g.keySet()) {
                C9405w4 C = C9420x4.m43808C();
                C.mo38121C(num.intValue());
                List list2 = (List) this.f46419g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    C.mo38120B(list2);
                }
                arrayList3.add((C9420x4) C.mo37840w());
            }
            list = arrayList3;
        }
        F.mo38089H(list);
        A.mo37309C(F);
        return (C9081b4) A.mo37840w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo39047c(C9858n9 n9Var) {
        int a = n9Var.mo39069a();
        Boolean bool = n9Var.f46521c;
        if (bool != null) {
            this.f46417e.set(a, bool.booleanValue());
        }
        Boolean bool2 = n9Var.f46522d;
        if (bool2 != null) {
            this.f46416d.set(a, bool2.booleanValue());
        }
        if (n9Var.f46523e != null) {
            Map map = this.f46418f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = n9Var.f46523e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f46418f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (n9Var.f46524f != null) {
            Map map2 = this.f46419g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f46419g.put(valueOf2, list);
            }
            if (n9Var.mo39071c()) {
                list.clear();
            }
            C9427xc.m43850b();
            C4669f z = this.f46420h.f21269a.mo19392z();
            String str = this.f46413a;
            C9893r2 r2Var = C9903s2.f46674Y;
            if (z.mo19337B(str, r2Var) && n9Var.mo39070b()) {
                list.clear();
            }
            C9427xc.m43850b();
            if (this.f46420h.f21269a.mo19392z().mo19337B(this.f46413a, r2Var)) {
                Long valueOf3 = Long.valueOf(n9Var.f46524f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(n9Var.f46524f.longValue() / 1000));
        }
    }

    /* synthetic */ C9825k9(C9880p9 p9Var, String str, C9389v4 v4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C11050y yVar) {
        this.f46420h = p9Var;
        this.f46413a = str;
        this.f46416d = bitSet;
        this.f46417e = bitSet2;
        this.f46418f = map;
        this.f46419g = new C6077a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f46419g.put(num, arrayList);
        }
        this.f46414b = false;
        this.f46415c = v4Var;
    }
}
