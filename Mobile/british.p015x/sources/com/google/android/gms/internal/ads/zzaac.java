package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaac extends zzzu {
    public static final Parcelable.Creator<zzaac> CREATOR = new C7557c();

    /* renamed from: c */
    public final String f42847c;

    /* renamed from: d */
    public final String f42848d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzaac(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.d13.f20195a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f42847c = r0
            java.lang.String r3 = r3.readString()
            r2.f42848d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaac.<init>(android.os.Parcel):void");
    }

    /* renamed from: a */
    private static List<Integer> m40606a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaac.class == obj.getClass()) {
            zzaac zzaac = (zzaac) obj;
            return d13.m20317p(this.f43118b, zzaac.f43118b) && d13.m20317p(this.f42847c, zzaac.f42847c) && d13.m20317p(this.f42848d, zzaac.f42848d);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36161g0(com.google.android.gms.internal.ads.C7840jr r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f43118b
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 1
            r6 = 2
            switch(r1) {
                case 82815: goto L_0x00fc;
                case 82878: goto L_0x00f1;
                case 82897: goto L_0x00e6;
                case 83253: goto L_0x00dc;
                case 83254: goto L_0x00d2;
                case 83255: goto L_0x00c7;
                case 83341: goto L_0x00bc;
                case 83378: goto L_0x00b2;
                case 83536: goto L_0x00a7;
                case 83552: goto L_0x009c;
                case 2567331: goto L_0x0091;
                case 2569357: goto L_0x0085;
                case 2569891: goto L_0x0079;
                case 2570401: goto L_0x006d;
                case 2570410: goto L_0x0061;
                case 2571565: goto L_0x0055;
                case 2575251: goto L_0x004a;
                case 2581512: goto L_0x003f;
                case 2581513: goto L_0x0034;
                case 2581514: goto L_0x0028;
                case 2583398: goto L_0x001c;
                case 2590194: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0106
        L_0x0010:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 11
            goto L_0x0107
        L_0x001c:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 9
            goto L_0x0107
        L_0x0028:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 19
            goto L_0x0107
        L_0x0034:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 5
            goto L_0x0107
        L_0x003f:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 3
            goto L_0x0107
        L_0x004a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 1
            goto L_0x0107
        L_0x0055:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 21
            goto L_0x0107
        L_0x0061:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 15
            goto L_0x0107
        L_0x006d:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 14
            goto L_0x0107
        L_0x0079:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 13
            goto L_0x0107
        L_0x0085:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 17
            goto L_0x0107
        L_0x0091:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 7
            goto L_0x0107
        L_0x009c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 10
            goto L_0x0107
        L_0x00a7:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 20
            goto L_0x0107
        L_0x00b2:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 0
            goto L_0x0107
        L_0x00bc:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 8
            goto L_0x0107
        L_0x00c7:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 18
            goto L_0x0107
        L_0x00d2:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 4
            goto L_0x0107
        L_0x00dc:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 2
            goto L_0x0107
        L_0x00e6:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 12
            goto L_0x0107
        L_0x00f1:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 16
            goto L_0x0107
        L_0x00fc:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 6
            goto L_0x0107
        L_0x0106:
            r0 = -1
        L_0x0107:
            switch(r0) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x01e5;
                case 2: goto L_0x01df;
                case 3: goto L_0x01df;
                case 4: goto L_0x01d9;
                case 5: goto L_0x01d9;
                case 6: goto L_0x01d3;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01ab;
                case 9: goto L_0x01ab;
                case 10: goto L_0x019d;
                case 11: goto L_0x019d;
                case 12: goto L_0x017a;
                case 13: goto L_0x017a;
                case 14: goto L_0x014c;
                case 15: goto L_0x011e;
                case 16: goto L_0x0118;
                case 17: goto L_0x0118;
                case 18: goto L_0x0112;
                case 19: goto L_0x0112;
                case 20: goto L_0x010c;
                case 21: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x01ea
        L_0x010c:
            java.lang.String r0 = r7.f42848d
            r8.mo32939A(r0)
            return
        L_0x0112:
            java.lang.String r0 = r7.f42848d
            r8.mo32946p(r0)
            return
        L_0x0118:
            java.lang.String r0 = r7.f42848d
            r8.mo32945o(r0)
            return
        L_0x011e:
            java.lang.String r0 = r7.f42848d
            java.util.List r0 = m40606a(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0142
            if (r1 == r6) goto L_0x0139
            if (r1 == r3) goto L_0x0130
            goto L_0x01ea
        L_0x0130:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo32951u(r1)
        L_0x0139:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo32952v(r1)
        L_0x0142:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.mo32953w(r0)
            return
        L_0x014c:
            java.lang.String r0 = r7.f42848d
            java.util.List r0 = m40606a(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0170
            if (r1 == r6) goto L_0x0167
            if (r1 == r3) goto L_0x015e
            goto L_0x01ea
        L_0x015e:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo32948r(r1)
        L_0x0167:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.mo32949s(r1)
        L_0x0170:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.mo32950t(r0)
            return
        L_0x017a:
            java.lang.String r0 = r7.f42848d     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            java.lang.String r0 = r0.substring(r6, r2)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            java.lang.String r1 = r7.f42848d     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            java.lang.String r1 = r1.substring(r4, r6)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            r8.mo32949s(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
            r8.mo32948r(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x019c }
        L_0x019c:
            return
        L_0x019d:
            java.lang.String r0 = r7.f42848d     // Catch:{ NumberFormatException -> 0x01aa }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01aa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01aa }
            r8.mo32950t(r0)     // Catch:{ NumberFormatException -> 0x01aa }
        L_0x01aa:
            return
        L_0x01ab:
            java.lang.String r0 = r7.f42848d
            java.lang.String r1 = "/"
            java.lang.String[] r0 = com.google.android.gms.internal.ads.d13.m20273D(r0, r1)
            r1 = r0[r4]     // Catch:{ NumberFormatException -> 0x01d2 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01d2 }
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x01d2 }
            if (r2 <= r5) goto L_0x01c7
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x01d2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01d2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01d2 }
            goto L_0x01c8
        L_0x01c7:
            r0 = 0
        L_0x01c8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01d2 }
            r8.mo32956z(r1)     // Catch:{ NumberFormatException -> 0x01d2 }
            r8.mo32955y(r0)     // Catch:{ NumberFormatException -> 0x01d2 }
        L_0x01d2:
            return
        L_0x01d3:
            java.lang.String r0 = r7.f42848d
            r8.mo32943m(r0)
            return
        L_0x01d9:
            java.lang.String r0 = r7.f42848d
            r8.mo32942l(r0)
            return
        L_0x01df:
            java.lang.String r0 = r7.f42848d
            r8.mo32944n(r0)
            return
        L_0x01e5:
            java.lang.String r0 = r7.f42848d
            r8.mo32954x(r0)
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaac.mo36161g0(com.google.android.gms.internal.ads.jr):void");
    }

    public final int hashCode() {
        int hashCode = (this.f43118b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f42847c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42848d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f42847c;
        String str3 = this.f42848d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43118b);
        parcel.writeString(this.f42847c);
        parcel.writeString(this.f42848d);
    }

    public zzaac(String str, String str2, String str3) {
        super(str);
        this.f42847c = str2;
        this.f42848d = str3;
    }
}
