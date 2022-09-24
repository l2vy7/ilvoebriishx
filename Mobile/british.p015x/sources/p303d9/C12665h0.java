package p303d9;

import com.unity3d.ads.metadata.MediationMetaData;
import p334v8.C12916a;
import p334v8.C12917b;
import p334v8.C12918c;
import p334v8.C12920e;
import p334v8.C12922g;
import p334v8.C12926k;
import p334v8.C12927l;
import p334v8.C12928m;

/* renamed from: d9.h0 */
/* compiled from: RFC2965VersionAttributeHandler */
public class C12665h0 implements C12918c {
    /* renamed from: a */
    public void mo47647a(C12917b bVar, C12920e eVar) throws C12926k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if ((bVar instanceof C12927l) && (bVar instanceof C12916a) && !((C12916a) bVar).mo47668i(MediationMetaData.KEY_VERSION)) {
            throw new C12922g("Violates RFC 2965. Version attribute is required.");
        }
    }

    /* renamed from: b */
    public boolean mo47648b(C12917b bVar, C12920e eVar) {
        return true;
    }

    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        int i;
        if (mVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                mVar.mo47663d(i);
                return;
            }
            throw new C12926k("Invalid cookie version.");
        } else {
            throw new C12926k("Missing value for version attribute");
        }
    }
}
