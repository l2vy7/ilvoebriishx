package p152t2;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p004a3.C0066k;
import p173x2.C6386h;

/* renamed from: t2.p */
/* compiled from: TargetTracker */
public final class C6125p implements C6114i {

    /* renamed from: b */
    private final Set<C6386h<?>> f25380b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public void mo23468i() {
        this.f25380b.clear();
    }

    /* renamed from: j */
    public List<C6386h<?>> mo23469j() {
        return C0066k.m257i(this.f25380b);
    }

    /* renamed from: k */
    public void mo23470k(C6386h<?> hVar) {
        this.f25380b.add(hVar);
    }

    /* renamed from: l */
    public void mo23471l(C6386h<?> hVar) {
        this.f25380b.remove(hVar);
    }

    public void onDestroy() {
        for (T onDestroy : C0066k.m257i(this.f25380b)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (T onStart : C0066k.m257i(this.f25380b)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (T onStop : C0066k.m257i(this.f25380b)) {
            onStop.onStop();
        }
    }
}
