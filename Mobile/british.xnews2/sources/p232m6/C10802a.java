package p232m6;

import android.graphics.Typeface;

/* renamed from: m6.a */
/* compiled from: CancelableFontCallback */
public final class C10802a extends C10810f {

    /* renamed from: a */
    private final Typeface f49532a;

    /* renamed from: b */
    private final C10803a f49533b;

    /* renamed from: c */
    private boolean f49534c;

    /* renamed from: m6.a$a */
    /* compiled from: CancelableFontCallback */
    public interface C10803a {
        /* renamed from: a */
        void mo40937a(Typeface typeface);
    }

    public C10802a(C10803a aVar, Typeface typeface) {
        this.f49532a = typeface;
        this.f49533b = aVar;
    }

    /* renamed from: d */
    private void m48744d(Typeface typeface) {
        if (!this.f49534c) {
            this.f49533b.mo40937a(typeface);
        }
    }

    /* renamed from: a */
    public void mo40176a(int i) {
        m48744d(this.f49532a);
    }

    /* renamed from: b */
    public void mo40177b(Typeface typeface, boolean z) {
        m48744d(typeface);
    }

    /* renamed from: c */
    public void mo42971c() {
        this.f49534c = true;
    }
}
