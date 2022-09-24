package p303d9;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import p308g8.C12714b;
import p308g8.C12716c;
import p308g8.C12718d;
import p311h9.C12777p;
import p311h9.C12782u;
import p317k9.C12821b;
import p334v8.C12917b;
import p334v8.C12920e;
import p334v8.C12926k;

/* renamed from: d9.m */
/* compiled from: BrowserCompatSpec */
public class C12670m extends C12672o {
    @Deprecated

    /* renamed from: c */
    protected static final String[] f55310c = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* renamed from: d */
    private static final String[] f55311d = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* renamed from: b */
    private final String[] f55312b;

    public C12670m(String[] strArr) {
        if (strArr != null) {
            this.f55312b = (String[]) strArr.clone();
        } else {
            this.f55312b = f55311d;
        }
        mo47652i("path", new C12666i());
        mo47652i("domain", new C12660f());
        mo47652i("max-age", new C12664h());
        mo47652i("secure", new C12667j());
        mo47652i("comment", new C12658e());
        mo47652i("expires", new C12662g(this.f55312b));
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
            C12718d[] b = cVar.mo47760b();
            boolean z = false;
            boolean z2 = false;
            for (C12718d dVar : b) {
                if (dVar.mo47767b(MediationMetaData.KEY_VERSION) != null) {
                    z2 = true;
                }
                if (dVar.mo47767b("expires") != null) {
                    z = true;
                }
            }
            if (z || !z2) {
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
                b = new C12718d[]{uVar2.mo47690a(bVar, uVar)};
            }
            return mo47681l(b, eVar);
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
                bVar.mo47966c("=");
                String value = bVar2.getValue();
                if (value != null) {
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
        return "compatibility";
    }

    public C12670m() {
        this((String[]) null);
    }
}
