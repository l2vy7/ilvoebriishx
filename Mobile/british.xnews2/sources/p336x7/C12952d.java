package p336x7;

import java.util.HashMap;
import java.util.Map;

/* renamed from: x7.d */
/* compiled from: SignalsStorage */
public class C12952d {

    /* renamed from: a */
    private Map<String, C12949b> f55664a = new HashMap();

    /* renamed from: a */
    public Map<String, C12949b> mo48122a() {
        return this.f55664a;
    }

    /* renamed from: b */
    public C12949b mo48123b(String str) {
        return this.f55664a.get(str);
    }

    /* renamed from: c */
    public void mo48124c(String str, C12949b bVar) {
        this.f55664a.put(str, bVar);
    }
}
