package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9341s3 extends C9284o8 implements C9424x9 {
    private C9341s3() {
        super(C9357t3.zza);
    }

    /* renamed from: B */
    public final int mo38018B() {
        return ((C9357t3) this.f45342c).mo38044A();
    }

    /* renamed from: C */
    public final C9325r3 mo38019C(int i) {
        return ((C9357t3) this.f45342c).mo38046C(i);
    }

    /* renamed from: H */
    public final C9341s3 mo38020H() {
        if (this.f45343d) {
            mo37836n();
            this.f45343d = false;
        }
        ((C9357t3) this.f45342c).zzk = C9330r8.m43563v();
        return this;
    }

    /* renamed from: I */
    public final C9341s3 mo38021I(int i, C9295p3 p3Var) {
        if (this.f45343d) {
            mo37836n();
            this.f45343d = false;
        }
        C9357t3.m43635L((C9357t3) this.f45342c, i, (C9325r3) p3Var.mo37840w());
        return this;
    }

    /* renamed from: J */
    public final List mo38022J() {
        return Collections.unmodifiableList(((C9357t3) this.f45342c).mo38048I());
    }

    /* synthetic */ C9341s3(C9279o3 o3Var) {
        super(C9357t3.zza);
    }
}
