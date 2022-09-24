package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C7058c();

    /* renamed from: b */
    private final int f28190b;

    /* renamed from: c */
    private final boolean f28191c;

    /* renamed from: d */
    private final boolean f28192d;
    @Deprecated

    /* renamed from: e */
    private final boolean f28193e;

    /* renamed from: f */
    private final int f28194f;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C7055a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f28195a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f28196b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f28197c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo29047a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialPickerConfig(int r2, boolean r3, boolean r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f28190b = r2
            r1.f28191c = r3
            r1.f28192d = r4
            r3 = 1
            r4 = 3
            r0 = 2
            if (r2 >= r0) goto L_0x0016
            r1.f28193e = r5
            if (r5 == 0) goto L_0x0013
            r3 = 3
        L_0x0013:
            r1.f28194f = r3
            return
        L_0x0016:
            if (r6 != r4) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r1.f28193e = r3
            r1.f28194f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(int, boolean, boolean, boolean, int):void");
    }

    @Deprecated
    /* renamed from: C0 */
    public final boolean mo29043C0() {
        return this.f28194f == 3;
    }

    /* renamed from: D0 */
    public final boolean mo29044D0() {
        return this.f28191c;
    }

    /* renamed from: E0 */
    public final boolean mo29045E0() {
        return this.f28192d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, mo29044D0());
        C11058b.m49517c(parcel, 2, mo29045E0());
        C11058b.m49517c(parcel, 3, mo29043C0());
        C11058b.m49527m(parcel, 4, this.f28194f);
        C11058b.m49527m(parcel, 1000, this.f28190b);
        C11058b.m49516b(parcel, a);
    }

    private CredentialPickerConfig(C7055a aVar) {
        this(2, aVar.f28195a, aVar.f28196b, false, aVar.f28197c);
    }
}
