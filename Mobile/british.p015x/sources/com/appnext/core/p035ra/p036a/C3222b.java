package com.appnext.core.p035ra.p036a;

import android.content.Context;
import android.os.Bundle;
import com.appnext.core.p035ra.C3220a;
import java.text.SimpleDateFormat;

/* renamed from: com.appnext.core.ra.a.b */
public abstract class C3222b {

    /* renamed from: eN */
    private static SimpleDateFormat f12402eN = new SimpleDateFormat("dd/MM/yyyy");

    /* renamed from: aM */
    private Context f12403aM;

    /* renamed from: eO */
    private Bundle f12404eO;

    public C3222b(Context context, Bundle bundle) {
        this.f12403aM = context;
        this.f12404eO = bundle;
    }

    /* renamed from: aQ */
    protected static SimpleDateFormat m10860aQ() {
        return f12402eN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aM */
    public abstract void mo10834aM();

    /* access modifiers changed from: protected */
    /* renamed from: aN */
    public abstract boolean mo10835aN();

    /* renamed from: aO */
    public final void mo10836aO() {
        if (!mo10835aN() || (mo10835aN() && C3220a.m10855r(this.f12403aM).mo10832aG())) {
            mo10834aM();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public final Bundle mo10837aP() {
        return this.f12404eO;
    }

    /* access modifiers changed from: protected */
    public final Context getContext() {
        return this.f12403aM;
    }
}
