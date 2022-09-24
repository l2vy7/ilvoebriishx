package com.ironsource.mediationsdk.utils;

import java.util.Arrays;
import p303e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.utils.j */
public final class C11494j {

    /* renamed from: a */
    public boolean f51603a;

    /* renamed from: b */
    public String f51604b;

    /* renamed from: c */
    public boolean f51605c;

    /* renamed from: d */
    public int[] f51606d;

    /* renamed from: e */
    public int[] f51607e;

    public C11494j() {
        this(false, (String) null, false, (int[]) null, (int[]) null, 31);
    }

    private C11494j(boolean z, String str, boolean z2, int[] iArr, int[] iArr2) {
        C12691c.m53984c(str, "pixelEventsUrl");
        this.f51603a = z;
        this.f51604b = str;
        this.f51605c = z2;
        this.f51606d = iArr;
        this.f51607e = iArr2;
    }

    private /* synthetic */ C11494j(boolean z, String str, boolean z2, int[] iArr, int[] iArr2, int i) {
        this(true, "https://outcome-ssp.supersonicads.com/mediation?adUnit=3", false, (int[]) null, (int[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11494j)) {
            return false;
        }
        C11494j jVar = (C11494j) obj;
        return this.f51603a == jVar.f51603a && C12691c.m53982a(this.f51604b, jVar.f51604b) && this.f51605c == jVar.f51605c && C12691c.m53982a(this.f51606d, jVar.f51606d) && C12691c.m53982a(this.f51607e, jVar.f51607e);
    }

    public final int hashCode() {
        boolean z = this.f51603a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f51604b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f51605c;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        int[] iArr = this.f51606d;
        int hashCode2 = (i3 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f51607e;
        if (iArr2 != null) {
            i2 = Arrays.hashCode(iArr2);
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f51603a + ", pixelEventsUrl=" + this.f51604b + ", pixelEventsCompression=" + this.f51605c + ", pixelOptOut=" + Arrays.toString(this.f51606d) + ", pixelOptIn=" + Arrays.toString(this.f51607e) + ")";
    }
}
