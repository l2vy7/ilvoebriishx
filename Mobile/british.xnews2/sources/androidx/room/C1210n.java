package androidx.room;

import java.io.File;
import p090i1.C5437c;

/* renamed from: androidx.room.n */
/* compiled from: SQLiteCopyOpenHelperFactory */
class C1210n implements C5437c.C5441c {

    /* renamed from: a */
    private final String f5526a;

    /* renamed from: b */
    private final File f5527b;

    /* renamed from: c */
    private final C5437c.C5441c f5528c;

    C1210n(String str, File file, C5437c.C5441c cVar) {
        this.f5526a = str;
        this.f5527b = file;
        this.f5528c = cVar;
    }

    /* renamed from: a */
    public C5437c mo5959a(C5437c.C5439b bVar) {
        return new C1209m(bVar.f23793a, this.f5526a, this.f5527b, bVar.f23795c.f23792a, this.f5528c.mo5959a(bVar));
    }
}
