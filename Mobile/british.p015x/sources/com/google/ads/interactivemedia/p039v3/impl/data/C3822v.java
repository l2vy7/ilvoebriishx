package com.google.ads.interactivemedia.p039v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.v */
/* compiled from: IMASDK */
final class C3822v extends C3783aw {
    private final String detailedReason;
    private final FriendlyObstructionPurpose purpose;
    private final View view;

    private C3822v(View view2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view2;
        this.purpose = friendlyObstructionPurpose;
        this.detailedReason = str;
    }

    public String detailedReason() {
        return this.detailedReason;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.detailedReason;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.ads.interactivemedia.p039v3.impl.data.C3783aw
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.ads.interactivemedia.v3.impl.data.aw r5 = (com.google.ads.interactivemedia.p039v3.impl.data.C3783aw) r5
            android.view.View r1 = r4.view
            android.view.View r3 = r5.view()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose r1 = r4.purpose
            com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose r3 = r5.purpose()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r4.detailedReason
            if (r1 != 0) goto L_0x002e
            java.lang.String r5 = r5.detailedReason()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            java.lang.String r5 = r5.detailedReason()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.impl.data.C3822v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode()) * 1000003;
        String str = this.detailedReason;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        String valueOf = String.valueOf(this.view);
        String valueOf2 = String.valueOf(this.purpose);
        String str = this.detailedReason;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 57 + valueOf2.length() + String.valueOf(str).length());
        sb.append("FriendlyObstructionImpl{view=");
        sb.append(valueOf);
        sb.append(", purpose=");
        sb.append(valueOf2);
        sb.append(", detailedReason=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public View view() {
        return this.view;
    }
}
