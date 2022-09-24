package p314j9;

import java.io.IOException;
import p307g8.C12725i;
import p307g8.C12726j;
import p307g8.C12727k;
import p307g8.C12731o;
import p307g8.C12732p;
import p307g8.C12736t;
import p307g8.C12742z;
import p312i9.C12791e;

/* renamed from: j9.j */
/* compiled from: RequestExpectContinue */
public class C12816j implements C12732p {
    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        C12725i b;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if ((oVar instanceof C12726j) && (b = ((C12726j) oVar).mo43574b()) != null && b.mo47776b() != 0) {
            C12742z a = oVar.mo43589y().mo47757a();
            if (C12791e.m54284g(oVar.mo47801s()) && !a.mo47820i(C12736t.f55406f)) {
                oVar.mo47802w("Expect", "100-continue");
            }
        }
    }
}
