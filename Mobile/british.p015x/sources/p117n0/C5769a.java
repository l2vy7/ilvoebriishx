package p117n0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: n0.a */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C5769a extends ClickableSpan {

    /* renamed from: b */
    private final int f24448b;

    /* renamed from: c */
    private final C5771c f24449c;

    /* renamed from: d */
    private final int f24450d;

    public C5769a(int i, C5771c cVar, int i2) {
        this.f24448b = i;
        this.f24449c = cVar;
        this.f24450d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f24448b);
        this.f24449c.mo22615R(this.f24450d, bundle);
    }
}
