package p331u7;

import java.util.HashMap;
import java.util.Map;

/* renamed from: u7.d */
/* compiled from: SignalsStorage */
public class C12909d {

    /* renamed from: a */
    private Map<String, C12906b> f55604a = new HashMap();

    /* renamed from: a */
    public Map<String, C12906b> mo48085a() {
        return this.f55604a;
    }

    /* renamed from: b */
    public C12906b mo48086b(String str) {
        return this.f55604a.get(str);
    }

    /* renamed from: c */
    public void mo48087c(String str, C12906b bVar) {
        this.f55604a.put(str, bVar);
    }
}
