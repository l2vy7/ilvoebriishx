package p082g2;

import java.io.File;
import p065d2.C5157d;
import p065d2.C5163h;
import p092i2.C5445a;

/* renamed from: g2.e */
/* compiled from: DataCacheWriter */
class C5277e<DataType> implements C5445a.C5447b {

    /* renamed from: a */
    private final C5157d<DataType> f23312a;

    /* renamed from: b */
    private final DataType f23313b;

    /* renamed from: c */
    private final C5163h f23314c;

    C5277e(C5157d<DataType> dVar, DataType datatype, C5163h hVar) {
        this.f23312a = dVar;
        this.f23313b = datatype;
        this.f23314c = hVar;
    }

    /* renamed from: a */
    public boolean mo21498a(File file) {
        return this.f23312a.mo21330b(this.f23313b, file, this.f23314c);
    }
}
