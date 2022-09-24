package com.google.ads.interactivemedia.p038v3.internal;

import com.ironsource.sdk.p288c.C11539d;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afi */
/* compiled from: IMASDK */
public final class afi {

    /* renamed from: a */
    private final String[] f14516a;

    /* renamed from: b */
    private final int[] f14517b;

    /* renamed from: c */
    private final String[] f14518c;

    /* renamed from: d */
    private final int f14519d;

    private afi(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f14516a = strArr;
        this.f14517b = iArr;
        this.f14518c = strArr2;
        this.f14519d = i;
    }

    /* renamed from: a */
    public static afi m13447a(String str) {
        String str2;
        String str3;
        String str4;
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                String valueOf = String.valueOf(strArr[i2]);
                String valueOf2 = String.valueOf(str.substring(i));
                if (valueOf2.length() != 0) {
                    str4 = valueOf.concat(valueOf2);
                } else {
                    str4 = new String(valueOf);
                }
                strArr[i2] = str4;
                i = str.length();
            } else if (indexOf != i) {
                String valueOf3 = String.valueOf(strArr[i2]);
                String valueOf4 = String.valueOf(str.substring(i, indexOf));
                strArr[i2] = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = String.valueOf(strArr[i2]).concat("$");
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith(C11539d.f51879a) && !str2.endsWith("x")) {
                            str2 = str2.concat(C11539d.f51879a);
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals(RtspHeaders.BANDWIDTH)) {
                                c = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i2] = 2;
                    } else if (c == 1) {
                        iArr[i2] = 3;
                    } else if (c != 2) {
                        if (str.length() != 0) {
                            str3 = "Invalid template: ".concat(str);
                        } else {
                            str3 = new String("Invalid template: ");
                        }
                        throw new IllegalArgumentException(str3);
                    } else {
                        iArr[i2] = 4;
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return new afi(strArr, iArr, strArr2, i2);
    }

    /* renamed from: b */
    public final String mo13601b(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f14519d;
            if (i2 < i3) {
                sb.append(this.f14516a[i2]);
                int i4 = this.f14517b[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else if (i4 == 2) {
                    sb.append(String.format(Locale.US, this.f14518c[i2], new Object[]{Long.valueOf(j)}));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, this.f14518c[i2], new Object[]{Integer.valueOf(i)}));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, this.f14518c[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.f14516a[i3]);
                return sb.toString();
            }
        }
    }
}
