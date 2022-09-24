package p269a8;

import java.util.HashMap;
import java.util.Map;

/* renamed from: a8.d */
/* compiled from: SignalsStorage */
public class C11156d {

    /* renamed from: a */
    private Map<String, C11153b> f50173a = new HashMap();

    /* renamed from: a */
    public Map<String, C11153b> mo43458a() {
        return this.f50173a;
    }

    /* renamed from: b */
    public C11153b mo43459b(String str) {
        return this.f50173a.get(str);
    }

    /* renamed from: c */
    public void mo43460c(String str, C11153b bVar) {
        this.f50173a.put(str, bVar);
    }
}
