package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
public final class C7052c implements Parcelable.Creator<zzr> {
    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = p256v4.C11056a.m49481M(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000f:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0071
            int r1 = p256v4.C11056a.m49472D(r11)
            int r8 = p256v4.C11056a.m49506w(r1)
            r9 = 1
            if (r8 == r9) goto L_0x0065
            r9 = 2
            if (r8 == r9) goto L_0x0054
            r9 = 3
            if (r8 == r9) goto L_0x0048
            r9 = 4
            if (r8 == r9) goto L_0x003c
            r9 = 5
            if (r8 == r9) goto L_0x0030
            p256v4.C11056a.m49480L(r11, r1)
            goto L_0x000f
        L_0x0030:
            java.lang.String r7 = p256v4.C11056a.m49500q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x000f
        L_0x003c:
            java.lang.String r6 = p256v4.C11056a.m49500q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x000f
        L_0x0048:
            java.lang.String r5 = p256v4.C11056a.m49500q(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x000f
        L_0x0054:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzt> r4 = com.google.android.gms.auth.api.accounttransfer.zzt.CREATOR
            android.os.Parcelable r1 = p256v4.C11056a.m49499p(r11, r1, r4)
            r4 = r1
            com.google.android.gms.auth.api.accounttransfer.zzt r4 = (com.google.android.gms.auth.api.accounttransfer.zzt) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x000f
        L_0x0065:
            int r3 = p256v4.C11056a.m49474F(r11, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2.add(r1)
            goto L_0x000f
        L_0x0071:
            int r1 = r11.dataPosition()
            if (r1 != r0) goto L_0x007e
            com.google.android.gms.auth.api.accounttransfer.zzr r11 = new com.google.android.gms.auth.api.accounttransfer.zzr
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x007e:
            v4.a$a r1 = new v4.a$a
            r2 = 37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Overread allowed size end="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0, r11)
            goto L_0x0098
        L_0x0097:
            throw r1
        L_0x0098:
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.C7052c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
