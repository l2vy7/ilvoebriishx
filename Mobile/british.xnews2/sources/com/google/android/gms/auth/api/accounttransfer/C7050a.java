package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
public final class C7050a implements Parcelable.Creator<zzl> {
    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = p256v4.C11056a.m49481M(r10)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r6 = r4
            r5 = 0
        L_0x000e:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0063
            int r1 = p256v4.C11056a.m49472D(r10)
            int r7 = p256v4.C11056a.m49506w(r1)
            r8 = 1
            if (r7 == r8) goto L_0x0057
            r8 = 2
            if (r7 == r8) goto L_0x0049
            r8 = 3
            if (r7 == r8) goto L_0x003d
            r8 = 4
            if (r7 == r8) goto L_0x002c
            p256v4.C11056a.m49480L(r10, r1)
            goto L_0x000e
        L_0x002c:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzo> r6 = com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR
            android.os.Parcelable r1 = p256v4.C11056a.m49499p(r10, r1, r6)
            r6 = r1
            com.google.android.gms.auth.api.accounttransfer.zzo r6 = (com.google.android.gms.auth.api.accounttransfer.zzo) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000e
        L_0x003d:
            int r5 = p256v4.C11056a.m49474F(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000e
        L_0x0049:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzr> r4 = com.google.android.gms.auth.api.accounttransfer.zzr.CREATOR
            java.util.ArrayList r4 = p256v4.C11056a.m49504u(r10, r1, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000e
        L_0x0057:
            int r3 = p256v4.C11056a.m49474F(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000e
        L_0x0063:
            int r1 = r10.dataPosition()
            if (r1 != r0) goto L_0x0070
            com.google.android.gms.auth.api.accounttransfer.zzl r10 = new com.google.android.gms.auth.api.accounttransfer.zzl
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L_0x0070:
            v4.a$a r1 = new v4.a$a
            r2 = 37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Overread allowed size end="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0, r10)
            goto L_0x008a
        L_0x0089:
            throw r1
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.C7050a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
