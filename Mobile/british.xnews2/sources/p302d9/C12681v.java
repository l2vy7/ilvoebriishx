package p302d9;

import java.util.ArrayList;
import java.util.List;
import p307g8.C12714b;
import p307g8.C12716c;
import p307g8.C12718d;
import p310h9.C12777p;
import p310h9.C12782u;
import p316k9.C12821b;
import p333v8.C12917b;
import p333v8.C12920e;
import p333v8.C12926k;

/* renamed from: d9.v */
/* compiled from: NetscapeDraftSpec */
public class C12681v extends C12672o {

    /* renamed from: b */
    private final String[] f55318b;

    public C12681v(String[] strArr) {
        if (strArr != null) {
            this.f55318b = (String[]) strArr.clone();
        } else {
            this.f55318b = new String[]{"EEE, dd-MMM-yy HH:mm:ss z"};
        }
        mo47652i("path", new C12666i());
        mo47652i("domain", new C12679t());
        mo47652i("max-age", new C12664h());
        mo47652i("secure", new C12667j());
        mo47652i("comment", new C12658e());
        mo47652i("expires", new C12662g(this.f55318b));
    }

    /* renamed from: c */
    public int mo47678c() {
        return 0;
    }

    /* renamed from: d */
    public C12716c mo47679d() {
        return null;
    }

    /* renamed from: e */
    public List<C12917b> mo47680e(C12716c cVar, C12920e eVar) throws C12926k {
        C12782u uVar;
        C12821b bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.getName().equalsIgnoreCase("Set-Cookie")) {
            C12680u uVar2 = C12680u.f55317a;
            if (cVar instanceof C12714b) {
                C12714b bVar2 = (C12714b) cVar;
                bVar = bVar2.mo47755a();
                uVar = new C12782u(bVar2.mo47756c(), bVar.mo47978p());
            } else {
                String value = cVar.getValue();
                if (value != null) {
                    bVar = new C12821b(value.length());
                    bVar.mo47966c(value);
                    uVar = new C12782u(0, bVar.mo47978p());
                } else {
                    throw new C12926k("Header value is null");
                }
            }
            return mo47681l(new C12718d[]{uVar2.mo47690a(bVar, uVar)}, eVar);
        } else {
            throw new C12926k("Unrecognized cookie header '" + cVar.toString() + "'");
        }
    }

    /* renamed from: f */
    public List<C12716c> mo47685f(List<C12917b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            C12821b bVar = new C12821b(list.size() * 20);
            bVar.mo47966c("Cookie");
            bVar.mo47966c(": ");
            for (int i = 0; i < list.size(); i++) {
                C12917b bVar2 = list.get(i);
                if (i > 0) {
                    bVar.mo47966c("; ");
                }
                bVar.mo47966c(bVar2.getName());
                String value = bVar2.getValue();
                if (value != null) {
                    bVar.mo47966c("=");
                    bVar.mo47966c(value);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C12777p(bVar));
            return arrayList;
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }

    public String toString() {
        return "netscape";
    }

    public C12681v() {
        this((String[]) null);
    }
}
