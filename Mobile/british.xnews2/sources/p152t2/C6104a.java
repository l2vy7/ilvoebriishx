package p152t2;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p004a3.C0066k;

/* renamed from: t2.a */
/* compiled from: ActivityFragmentLifecycle */
class C6104a implements C6113h {

    /* renamed from: a */
    private final Set<C6114i> f25345a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f25346b;

    /* renamed from: c */
    private boolean f25347c;

    C6104a() {
    }

    /* renamed from: a */
    public void mo23424a(C6114i iVar) {
        this.f25345a.add(iVar);
        if (this.f25347c) {
            iVar.onDestroy();
        } else if (this.f25346b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    /* renamed from: b */
    public void mo23425b(C6114i iVar) {
        this.f25345a.remove(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo23426c() {
        this.f25347c = true;
        for (T onDestroy : C0066k.m257i(this.f25345a)) {
            onDestroy.onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23427d() {
        this.f25346b = true;
        for (T onStart : C0066k.m257i(this.f25345a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo23428e() {
        this.f25346b = false;
        for (T onStop : C0066k.m257i(this.f25345a)) {
            onStop.onStop();
        }
    }
}
