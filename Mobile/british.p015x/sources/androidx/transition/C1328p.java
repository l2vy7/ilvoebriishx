package androidx.transition;

import android.view.ViewGroup;
import p112m1.C5746b;

/* renamed from: androidx.transition.p */
/* compiled from: Scene */
public class C1328p {

    /* renamed from: a */
    private ViewGroup f5923a;

    /* renamed from: b */
    private Runnable f5924b;

    /* renamed from: b */
    public static C1328p m7126b(ViewGroup viewGroup) {
        return (C1328p) viewGroup.getTag(C5746b.transition_current_scene);
    }

    /* renamed from: c */
    static void m7127c(ViewGroup viewGroup, C1328p pVar) {
        viewGroup.setTag(C5746b.transition_current_scene, pVar);
    }

    /* renamed from: a */
    public void mo6377a() {
        Runnable runnable;
        if (m7126b(this.f5923a) == this && (runnable = this.f5924b) != null) {
            runnable.run();
        }
    }
}
