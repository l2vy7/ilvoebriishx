package p235n5;

import java.util.Objects;

/* renamed from: n5.f */
final class C10836f extends C10833c {

    /* renamed from: b */
    private final C10834d f49595b = new C10834d();

    C10836f() {
    }

    /* renamed from: a */
    public final void mo42994a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f49595b.mo42995a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
