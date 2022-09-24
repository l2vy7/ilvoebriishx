package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ye */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C8830ye extends C8661o implements C8660nf {
    public C8830ye() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29574x(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x008c;
                case 2: goto L_0x0079;
                case 3: goto L_0x006a;
                case 4: goto L_0x0053;
                case 5: goto L_0x0048;
                case 6: goto L_0x0040;
                case 7: goto L_0x0034;
                case 8: goto L_0x0024;
                case 9: goto L_0x0018;
                case 10: goto L_0x000d;
                case 11: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            r1.zzk()
            r4.writeNoException()
            goto L_0x00b6
        L_0x000d:
            r4.writeNoException()
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r4.writeInt(r2)
            goto L_0x00b6
        L_0x0018:
            java.lang.String r2 = r1.zzj()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x00b6
        L_0x0024:
            java.lang.String r2 = r3.readString()
            android.os.Bundle r2 = r1.mo36448f0(r2)
            r4.writeNoException()
            com.google.android.gms.internal.cast.C8431a0.m40680e(r4, r2)
            goto L_0x00b6
        L_0x0034:
            boolean r2 = r1.zzh()
            r4.writeNoException()
            com.google.android.gms.internal.cast.C8431a0.m40677b(r4, r2)
            goto L_0x00b6
        L_0x0040:
            r1.zzg()
            r4.writeNoException()
            goto L_0x00b6
        L_0x0048:
            java.lang.String r2 = r3.readString()
            r1.mo36445c(r2)
            r4.writeNoException()
            goto L_0x00b6
        L_0x0053:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.cast.C8431a0.m40678c(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            int r3 = r3.readInt()
            boolean r2 = r1.mo36442G2(r2, r3)
            r4.writeNoException()
            com.google.android.gms.internal.cast.C8431a0.m40677b(r4, r2)
            goto L_0x00b6
        L_0x006a:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.cast.C8431a0.m40678c(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.mo36447e(r2)
            r4.writeNoException()
            goto L_0x00b6
        L_0x0079:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.cast.C8431a0.m40678c(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            int r3 = r3.readInt()
            r1.mo36443V0(r2, r3)
            r4.writeNoException()
            goto L_0x00b6
        L_0x008c:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.cast.C8431a0.m40678c(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x009c
            r3 = 0
            goto L_0x00b0
        L_0x009c:
            java.lang.String r5 = "com.google.android.gms.cast.framework.internal.IMediaRouterCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.cast.C8692pf
            if (r0 == 0) goto L_0x00aa
            r3 = r5
            com.google.android.gms.internal.cast.pf r3 = (com.google.android.gms.internal.cast.C8692pf) r3
            goto L_0x00b0
        L_0x00aa:
            com.google.android.gms.internal.cast.of r5 = new com.google.android.gms.internal.cast.of
            r5.<init>(r3)
            r3 = r5
        L_0x00b0:
            r1.mo36446d3(r2, r3)
            r4.writeNoException()
        L_0x00b6:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C8830ye.mo29574x(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
