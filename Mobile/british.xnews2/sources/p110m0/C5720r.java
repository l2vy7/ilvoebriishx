package p110m0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: m0.r */
/* compiled from: OneShotPreDrawListener */
public final class C5720r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f24345b;

    /* renamed from: c */
    private ViewTreeObserver f24346c;

    /* renamed from: d */
    private final Runnable f24347d;

    private C5720r(View view, Runnable runnable) {
        this.f24345b = view;
        this.f24346c = view.getViewTreeObserver();
        this.f24347d = runnable;
    }

    /* renamed from: a */
    public static C5720r m25259a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        C5720r rVar = new C5720r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }

    /* renamed from: b */
    public void mo22474b() {
        if (this.f24346c.isAlive()) {
            this.f24346c.removeOnPreDrawListener(this);
        } else {
            this.f24345b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f24345b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo22474b();
        this.f24347d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f24346c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo22474b();
    }
}
