package p303d9;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p308g8.C12716c;
import p311h9.C12777p;
import p317k9.C12821b;
import p334v8.C12916a;
import p334v8.C12917b;
import p334v8.C12920e;
import p334v8.C12921f;
import p334v8.C12922g;
import p334v8.C12926k;

/* renamed from: d9.y */
/* compiled from: RFC2109Spec */
public class C12684y extends C12672o {

    /* renamed from: d */
    private static final C12921f f55319d = new C12921f();

    /* renamed from: e */
    private static final String[] f55320e = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: b */
    private final String[] f55321b;

    /* renamed from: c */
    private final boolean f55322c;

    public C12684y(String[] strArr, boolean z) {
        if (strArr != null) {
            this.f55321b = (String[]) strArr.clone();
        } else {
            this.f55321b = f55320e;
        }
        this.f55322c = z;
        mo47652i(MediationMetaData.KEY_VERSION, new C12651a0());
        mo47652i("path", new C12666i());
        mo47652i("domain", new C12683x());
        mo47652i("max-age", new C12664h());
        mo47652i("secure", new C12667j());
        mo47652i("comment", new C12658e());
        mo47652i("expires", new C12662g(this.f55321b));
    }

    /* renamed from: m */
    private List<C12716c> m53969m(List<C12917b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C12917b next : list) {
            int c = next.mo47662c();
            C12821b bVar = new C12821b(40);
            bVar.mo47966c("Cookie: ");
            bVar.mo47966c("$Version=");
            bVar.mo47966c(Integer.toString(c));
            bVar.mo47966c("; ");
            mo47682o(bVar, next, c);
            arrayList.add(new C12777p(bVar));
        }
        return arrayList;
    }

    /* renamed from: n */
    private List<C12716c> m53970n(List<C12917b> list) {
        int i = Integer.MAX_VALUE;
        for (C12917b next : list) {
            if (next.mo47662c() < i) {
                i = next.mo47662c();
            }
        }
        C12821b bVar = new C12821b(list.size() * 40);
        bVar.mo47966c("Cookie");
        bVar.mo47966c(": ");
        bVar.mo47966c("$Version=");
        bVar.mo47966c(Integer.toString(i));
        for (C12917b o : list) {
            bVar.mo47966c("; ");
            mo47682o(bVar, o, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C12777p(bVar));
        return arrayList;
    }

    /* renamed from: a */
    public void mo47676a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar != null) {
            String name = bVar.getName();
            if (name.indexOf(32) != -1) {
                throw new C12922g("Cookie name may not contain blanks");
            } else if (!name.startsWith("$")) {
                super.mo47676a(bVar, eVar);
            } else {
                throw new C12922g("Cookie name may not start with $");
            }
        } else {
            throw new IllegalArgumentException("Cookie may not be null");
        }
    }

    /* renamed from: c */
    public int mo47678c() {
        return 1;
    }

    /* renamed from: d */
    public C12716c mo47679d() {
        return null;
    }

    /* renamed from: e */
    public List<C12917b> mo47680e(C12716c cVar, C12920e eVar) throws C12926k {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.getName().equalsIgnoreCase("Set-Cookie")) {
            return mo47681l(cVar.mo47760b(), eVar);
        } else {
            throw new C12926k("Unrecognized cookie header '" + cVar.toString() + "'");
        }
    }

    /* renamed from: f */
    public List<C12716c> mo47685f(List<C12917b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            if (list.size() > 1) {
                ArrayList arrayList = new ArrayList(list);
                Collections.sort(arrayList, f55319d);
                list = arrayList;
            }
            if (this.f55322c) {
                return m53970n(list);
            }
            return m53969m(list);
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo47682o(C12821b bVar, C12917b bVar2, int i) {
        mo47692p(bVar, bVar2.getName(), bVar2.getValue(), i);
        if (bVar2.mo47674y() != null && (bVar2 instanceof C12916a) && ((C12916a) bVar2).mo47668i("path")) {
            bVar.mo47966c("; ");
            mo47692p(bVar, "$Path", bVar2.mo47674y(), i);
        }
        if (bVar2.mo47673w() != null && (bVar2 instanceof C12916a) && ((C12916a) bVar2).mo47668i("domain")) {
            bVar.mo47966c("; ");
            mo47692p(bVar, "$Domain", bVar2.mo47673w(), i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo47692p(C12821b bVar, String str, String str2, int i) {
        bVar.mo47966c(str);
        bVar.mo47966c("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            bVar.mo47964a('\"');
            bVar.mo47966c(str2);
            bVar.mo47964a('\"');
            return;
        }
        bVar.mo47966c(str2);
    }

    public String toString() {
        return "rfc2109";
    }

    public C12684y() {
        this((String[]) null, false);
    }
}
