package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* compiled from: OnBackPressedCallback */
public abstract class C0201b {

    /* renamed from: a */
    private boolean f524a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0200a> f525b = new CopyOnWriteArrayList<>();

    public C0201b(boolean z) {
        this.f524a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo669a(C0200a aVar) {
        this.f525b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo670b();

    /* renamed from: c */
    public final boolean mo671c() {
        return this.f524a;
    }

    /* renamed from: d */
    public final void mo672d() {
        Iterator<C0200a> it = this.f525b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo673e(C0200a aVar) {
        this.f525b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo674f(boolean z) {
        this.f524a = z;
    }
}
