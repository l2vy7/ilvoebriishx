package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.C4586a;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.C8964n5;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import p257v4.C11058b;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C7189c();

    /* renamed from: b */
    public zzr f28851b;

    /* renamed from: c */
    public byte[] f28852c;

    /* renamed from: d */
    private int[] f28853d;

    /* renamed from: e */
    private String[] f28854e;

    /* renamed from: f */
    private int[] f28855f;

    /* renamed from: g */
    private byte[][] f28856g;

    /* renamed from: h */
    private ExperimentTokens[] f28857h;

    /* renamed from: i */
    private boolean f28858i;

    /* renamed from: j */
    public final C8964n5 f28859j;

    /* renamed from: k */
    public final C4586a.C4589c f28860k;

    /* renamed from: l */
    public final C4586a.C4589c f28861l;

    public zze(zzr zzr, C8964n5 n5Var, C4586a.C4589c cVar, C4586a.C4589c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.f28851b = zzr;
        this.f28859j = n5Var;
        this.f28860k = cVar;
        this.f28861l = null;
        this.f28853d = iArr;
        this.f28854e = null;
        this.f28855f = iArr2;
        this.f28856g = null;
        this.f28857h = null;
        this.f28858i = z;
    }

    zze(zzr zzr, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.f28851b = zzr;
        this.f28852c = bArr;
        this.f28853d = iArr;
        this.f28854e = strArr;
        this.f28859j = null;
        this.f28860k = null;
        this.f28861l = null;
        this.f28855f = iArr2;
        this.f28856g = bArr2;
        this.f28857h = experimentTokensArr;
        this.f28858i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zze = (zze) obj;
            return C7408m.m30028a(this.f28851b, zze.f28851b) && Arrays.equals(this.f28852c, zze.f28852c) && Arrays.equals(this.f28853d, zze.f28853d) && Arrays.equals(this.f28854e, zze.f28854e) && C7408m.m30028a(this.f28859j, zze.f28859j) && C7408m.m30028a(this.f28860k, zze.f28860k) && C7408m.m30028a(this.f28861l, zze.f28861l) && Arrays.equals(this.f28855f, zze.f28855f) && Arrays.deepEquals(this.f28856g, zze.f28856g) && Arrays.equals(this.f28857h, zze.f28857h) && this.f28858i == zze.f28858i;
        }
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f28851b, this.f28852c, this.f28853d, this.f28854e, this.f28859j, this.f28860k, this.f28861l, this.f28855f, this.f28856g, this.f28857h, Boolean.valueOf(this.f28858i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f28851b);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f28852c;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f28853d));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f28854e));
        sb.append(", LogEvent: ");
        sb.append(this.f28859j);
        sb.append(", ExtensionProducer: ");
        sb.append(this.f28860k);
        sb.append(", VeProducer: ");
        sb.append(this.f28861l);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f28855f));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f28856g));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f28857h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f28858i);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, this.f28851b, i, false);
        C11058b.m49520f(parcel, 3, this.f28852c, false);
        C11058b.m49528n(parcel, 4, this.f28853d, false);
        C11058b.m49538x(parcel, 5, this.f28854e, false);
        C11058b.m49528n(parcel, 6, this.f28855f, false);
        C11058b.m49521g(parcel, 7, this.f28856g, false);
        C11058b.m49517c(parcel, 8, this.f28858i);
        C11058b.m49540z(parcel, 9, this.f28857h, i, false);
        C11058b.m49516b(parcel, a);
    }
}
