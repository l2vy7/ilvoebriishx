package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.s */
/* compiled from: ViewModelStore */
public class C0794s {

    /* renamed from: a */
    private final HashMap<String, C0789q> f3865a = new HashMap<>();

    /* renamed from: a */
    public final void mo4028a() {
        for (C0789q a : this.f3865a.values()) {
            a.mo4022a();
        }
        this.f3865a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0789q mo4029b(String str) {
        return this.f3865a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo4030c() {
        return new HashSet(this.f3865a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4031d(String str, C0789q qVar) {
        C0789q put = this.f3865a.put(str, qVar);
        if (put != null) {
            put.mo3789d();
        }
    }
}
