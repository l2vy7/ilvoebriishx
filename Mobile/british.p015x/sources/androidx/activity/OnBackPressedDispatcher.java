package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f516a;

    /* renamed from: b */
    final ArrayDeque<C0201b> f517b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0773e, C0200a {

        /* renamed from: a */
        private final C0769d f518a;

        /* renamed from: b */
        private final C0201b f519b;

        /* renamed from: c */
        private C0200a f520c;

        LifecycleOnBackPressedCancellable(C0769d dVar, C0201b bVar) {
            this.f518a = dVar;
            this.f519b = bVar;
            dVar.mo3984a(this);
        }

        /* renamed from: c */
        public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
            if (bVar == C0769d.C0771b.ON_START) {
                this.f520c = OnBackPressedDispatcher.this.mo666b(this.f519b);
            } else if (bVar == C0769d.C0771b.ON_STOP) {
                C0200a aVar = this.f520c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == C0769d.C0771b.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f518a.mo3986c(this);
            this.f519b.mo673e(this);
            C0200a aVar = this.f520c;
            if (aVar != null) {
                aVar.cancel();
                this.f520c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0199a implements C0200a {

        /* renamed from: a */
        private final C0201b f522a;

        C0199a(C0201b bVar) {
            this.f522a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f517b.remove(this.f522a);
            this.f522a.mo673e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f516a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo665a(C0775g gVar, C0201b bVar) {
        C0769d a = gVar.mo639a();
        if (a.mo3985b() != C0769d.C0772c.DESTROYED) {
            bVar.mo669a(new LifecycleOnBackPressedCancellable(a, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0200a mo666b(C0201b bVar) {
        this.f517b.add(bVar);
        C0199a aVar = new C0199a(bVar);
        bVar.mo669a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo667c() {
        Iterator<C0201b> descendingIterator = this.f517b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0201b next = descendingIterator.next();
            if (next.mo671c()) {
                next.mo670b();
                return;
            }
        }
        Runnable runnable = this.f516a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
