package p081g2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p004a3.C0065j;
import p064d2.C5163h;
import p070e2.C5210e;
import p081g2.C5290i;
import p104l0.C5645e;

/* renamed from: g2.t */
/* compiled from: LoadPath */
public class C5320t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f23481a;

    /* renamed from: b */
    private final C5645e<List<Throwable>> f23482b;

    /* renamed from: c */
    private final List<? extends C5290i<Data, ResourceType, Transcode>> f23483c;

    /* renamed from: d */
    private final String f23484d;

    public C5320t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C5290i<Data, ResourceType, Transcode>> list, C5645e<List<Throwable>> eVar) {
        this.f23481a = cls;
        this.f23482b = eVar;
        this.f23483c = (List) C0065j.m246c(list);
        this.f23484d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C5323v<Transcode> m23983b(C5210e<Data> eVar, C5163h hVar, int i, int i2, C5290i.C5291a<ResourceType> aVar, List<Throwable> list) throws C5316q {
        List<Throwable> list2 = list;
        int size = this.f23483c.size();
        C5323v<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((C5290i) this.f23483c.get(i3)).mo21547a(eVar, i, i2, hVar, aVar);
            } catch (C5316q e) {
                list2.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C5316q(this.f23484d, (List<Throwable>) new ArrayList(list2));
    }

    /* renamed from: a */
    public C5323v<Transcode> mo21618a(C5210e<Data> eVar, C5163h hVar, int i, int i2, C5290i.C5291a<ResourceType> aVar) throws C5316q {
        List list = (List) C0065j.m247d(this.f23482b.acquire());
        try {
            return m23983b(eVar, hVar, i, i2, aVar, list);
        } finally {
            this.f23482b.mo7110a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f23483c.toArray()) + '}';
    }
}
