package p310h9;

import p307g8.C12738v;
import p316k9.C12821b;

/* renamed from: h9.e */
/* compiled from: BasicHeaderValueFormatter */
public class C12766e {

    /* renamed from: a */
    public static final C12766e f55438a = new C12766e();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47853a(C12821b bVar, String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = mo47856d(str.charAt(i));
            }
        }
        if (z) {
            bVar.mo47964a('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (mo47857e(charAt)) {
                bVar.mo47964a('\\');
            }
            bVar.mo47964a(charAt);
        }
        if (z) {
            bVar.mo47964a('\"');
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47854b(C12738v vVar) {
        if (vVar == null) {
            return 0;
        }
        int length = vVar.getName().length();
        String value = vVar.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    /* renamed from: c */
    public C12821b mo47855c(C12821b bVar, C12738v vVar, boolean z) {
        if (vVar != null) {
            int b = mo47854b(vVar);
            if (bVar == null) {
                bVar = new C12821b(b);
            } else {
                bVar.mo47974k(b);
            }
            bVar.mo47966c(vVar.getName());
            String value = vVar.getValue();
            if (value != null) {
                bVar.mo47964a('=');
                mo47853a(bVar, value, z);
            }
            return bVar;
        }
        throw new IllegalArgumentException("NameValuePair must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo47856d(char c) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo47857e(char c) {
        return "\"\\".indexOf(c) >= 0;
    }
}
