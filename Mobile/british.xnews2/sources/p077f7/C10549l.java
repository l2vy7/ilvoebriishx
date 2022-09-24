package p077f7;

import android.os.Bundle;

/* renamed from: f7.l */
final class C10549l extends C10550m<Void> {
    C10549l(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo42672c() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo42673d(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo42674a(null);
        } else {
            mo42675b(new C10551n(4, "Invalid response to one way request"));
        }
    }
}
