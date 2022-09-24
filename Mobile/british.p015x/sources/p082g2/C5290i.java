package p082g2;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p004a3.C0065j;
import p065d2.C5163h;
import p065d2.C5165j;
import p071e2.C5210e;
import p105l0.C5645e;
import p147s2.C6021e;

/* renamed from: g2.i */
/* compiled from: DecodePath */
public class C5290i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f23386a;

    /* renamed from: b */
    private final List<? extends C5165j<DataType, ResourceType>> f23387b;

    /* renamed from: c */
    private final C6021e<ResourceType, Transcode> f23388c;

    /* renamed from: d */
    private final C5645e<List<Throwable>> f23389d;

    /* renamed from: e */
    private final String f23390e;

    /* renamed from: g2.i$a */
    /* compiled from: DecodePath */
    interface C5291a<ResourceType> {
        /* renamed from: a */
        C5323v<ResourceType> mo21537a(C5323v<ResourceType> vVar);
    }

    public C5290i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C5165j<DataType, ResourceType>> list, C6021e<ResourceType, Transcode> eVar, C5645e<List<Throwable>> eVar2) {
        this.f23386a = cls;
        this.f23387b = list;
        this.f23388c = eVar;
        this.f23389d = eVar2;
        this.f23390e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C5323v<ResourceType> m23882b(C5210e<DataType> eVar, int i, int i2, C5163h hVar) throws C5316q {
        List list = (List) C0065j.m247d(this.f23389d.acquire());
        try {
            return m23883c(eVar, i, i2, hVar, list);
        } finally {
            this.f23389d.mo7110a(list);
        }
    }

    /* renamed from: c */
    private C5323v<ResourceType> m23883c(C5210e<DataType> eVar, int i, int i2, C5163h hVar, List<Throwable> list) throws C5316q {
        int size = this.f23387b.size();
        C5323v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C5165j jVar = (C5165j) this.f23387b.get(i3);
            try {
                if (jVar.mo21344a(eVar.mo21440a(), hVar)) {
                    vVar = jVar.mo21345b(eVar.mo21440a(), i, i2, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C5316q(this.f23390e, (List<Throwable>) new ArrayList(list));
    }

    /* renamed from: a */
    public C5323v<Transcode> mo21547a(C5210e<DataType> eVar, int i, int i2, C5163h hVar, C5291a<ResourceType> aVar) throws C5316q {
        return this.f23388c.mo23148a(aVar.mo21537a(m23882b(eVar, i, i2, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f23386a + ", decoders=" + this.f23387b + ", transcoder=" + this.f23388c + '}';
    }
}
