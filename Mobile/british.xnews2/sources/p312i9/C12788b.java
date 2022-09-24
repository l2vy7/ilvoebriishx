package p312i9;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i9.b */
/* compiled from: BasicHttpParams */
public class C12788b extends C12787a implements Serializable, Cloneable {

    /* renamed from: b */
    private final HashMap f55478b = new HashMap();

    /* renamed from: c */
    public C12790d mo43552c(String str, Object obj) {
        this.f55478b.put(str, obj);
        return this;
    }

    public Object clone() throws CloneNotSupportedException {
        C12788b bVar = (C12788b) super.clone();
        mo47934l(bVar);
        return bVar;
    }

    /* renamed from: i */
    public Object mo43553i(String str) {
        return this.f55478b.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo47934l(C12790d dVar) {
        for (Map.Entry entry : this.f55478b.entrySet()) {
            if (entry.getKey() instanceof String) {
                dVar.mo43552c((String) entry.getKey(), entry.getValue());
            }
        }
    }
}
