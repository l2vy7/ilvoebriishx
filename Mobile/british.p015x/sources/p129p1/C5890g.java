package p129p1;

import android.text.TextUtils;
import androidx.work.C1430g;
import androidx.work.C1483m;
import androidx.work.C1486o;
import androidx.work.C1488p;
import androidx.work.C1500v;
import androidx.work.C1504y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p173x1.C6356b;

/* renamed from: p1.g */
/* compiled from: WorkContinuationImpl */
public class C5890g extends C1500v {

    /* renamed from: j */
    private static final String f24673j = C1483m.m7773f("WorkContinuationImpl");

    /* renamed from: a */
    private final C5892i f24674a;

    /* renamed from: b */
    private final String f24675b;

    /* renamed from: c */
    private final C1430g f24676c;

    /* renamed from: d */
    private final List<? extends C1504y> f24677d;

    /* renamed from: e */
    private final List<String> f24678e;

    /* renamed from: f */
    private final List<String> f24679f;

    /* renamed from: g */
    private final List<C5890g> f24680g;

    /* renamed from: h */
    private boolean f24681h;

    /* renamed from: i */
    private C1488p f24682i;

    public C5890g(C5892i iVar, List<? extends C1504y> list) {
        this(iVar, (String) null, C1430g.KEEP, list, (List<C5890g>) null);
    }

    /* renamed from: k */
    private static boolean m25977k(C5890g gVar, Set<String> set) {
        set.addAll(gVar.mo22845e());
        Set<String> n = m25978n(gVar);
        for (String contains : set) {
            if (n.contains(contains)) {
                return true;
            }
        }
        List<C5890g> g = gVar.mo22847g();
        if (g != null && !g.isEmpty()) {
            for (C5890g k : g) {
                if (m25977k(k, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.mo22845e());
        return false;
    }

    /* renamed from: n */
    public static Set<String> m25978n(C5890g gVar) {
        HashSet hashSet = new HashSet();
        List<C5890g> g = gVar.mo22847g();
        if (g != null && !g.isEmpty()) {
            for (C5890g e : g) {
                hashSet.addAll(e.mo22845e());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public C1488p mo7031a() {
        if (!this.f24681h) {
            C6356b bVar = new C6356b(this);
            this.f24674a.mo22868x().mo24233b(bVar);
            this.f24682i = bVar.mo24181d();
        } else {
            C1483m.m7771c().mo7017h(f24673j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f24678e)}), new Throwable[0]);
        }
        return this.f24682i;
    }

    /* renamed from: c */
    public C1500v mo7033c(List<C1486o> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new C5890g(this.f24674a, this.f24675b, C1430g.KEEP, list, Collections.singletonList(this));
    }

    /* renamed from: d */
    public C1430g mo22844d() {
        return this.f24676c;
    }

    /* renamed from: e */
    public List<String> mo22845e() {
        return this.f24678e;
    }

    /* renamed from: f */
    public String mo22846f() {
        return this.f24675b;
    }

    /* renamed from: g */
    public List<C5890g> mo22847g() {
        return this.f24680g;
    }

    /* renamed from: h */
    public List<? extends C1504y> mo22848h() {
        return this.f24677d;
    }

    /* renamed from: i */
    public C5892i mo22849i() {
        return this.f24674a;
    }

    /* renamed from: j */
    public boolean mo22850j() {
        return m25977k(this, new HashSet());
    }

    /* renamed from: l */
    public boolean mo22851l() {
        return this.f24681h;
    }

    /* renamed from: m */
    public void mo22852m() {
        this.f24681h = true;
    }

    public C5890g(C5892i iVar, String str, C1430g gVar, List<? extends C1504y> list) {
        this(iVar, str, gVar, list, (List<C5890g>) null);
    }

    public C5890g(C5892i iVar, String str, C1430g gVar, List<? extends C1504y> list, List<C5890g> list2) {
        this.f24674a = iVar;
        this.f24675b = str;
        this.f24676c = gVar;
        this.f24677d = list;
        this.f24680g = list2;
        this.f24678e = new ArrayList(list.size());
        this.f24679f = new ArrayList();
        if (list2 != null) {
            for (C5890g gVar2 : list2) {
                this.f24679f.addAll(gVar2.f24679f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C1504y) list.get(i)).mo7049a();
            this.f24678e.add(a);
            this.f24679f.add(a);
        }
    }
}
