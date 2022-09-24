package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;

final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long j, int i, Uri uri2) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[Catch:{ Exception -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.collect.C4766t<com.google.android.exoplayer2.source.rtsp.RtspTrackTiming> parseTrackTiming(java.lang.String r18) throws com.google.android.exoplayer2.ParserException {
        /*
            com.google.common.collect.t$a r0 = new com.google.common.collect.t$a
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r2, r1)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0010:
            if (r4 >= r2) goto L_0x00c4
            r5 = r1[r4]
            r6 = 0
            java.lang.String r7 = ";"
            java.lang.String[] r7 = com.google.android.exoplayer2.util.Util.split(r5, r7)
            int r8 = r7.length
            r12 = 0
            r13 = -1
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0023:
            if (r12 >= r8) goto L_0x0095
            r9 = r7[r12]
            java.lang.String r10 = "="
            java.lang.String[] r10 = com.google.android.exoplayer2.util.Util.splitAtFirst(r9, r10)     // Catch:{ Exception -> 0x008e }
            r11 = r10[r3]     // Catch:{ Exception -> 0x008e }
            r3 = 1
            r10 = r10[r3]     // Catch:{ Exception -> 0x008e }
            int r3 = r11.hashCode()     // Catch:{ Exception -> 0x008e }
            r16 = r1
            r1 = 113759(0x1bc5f, float:1.5941E-40)
            r17 = r2
            r2 = 2
            if (r3 == r1) goto L_0x005f
            r1 = 116079(0x1c56f, float:1.62661E-40)
            if (r3 == r1) goto L_0x0055
            r1 = 1524180539(0x5ad9263b, float:3.05610524E16)
            if (r3 == r1) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            java.lang.String r1 = "rtptime"
            boolean r1 = r11.equals(r1)     // Catch:{ Exception -> 0x008e }
            if (r1 == 0) goto L_0x0069
            r1 = 2
            goto L_0x006a
        L_0x0055:
            java.lang.String r1 = "url"
            boolean r1 = r11.equals(r1)     // Catch:{ Exception -> 0x008e }
            if (r1 == 0) goto L_0x0069
            r1 = 0
            goto L_0x006a
        L_0x005f:
            java.lang.String r1 = "seq"
            boolean r1 = r11.equals(r1)     // Catch:{ Exception -> 0x008e }
            if (r1 == 0) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = -1
        L_0x006a:
            if (r1 == 0) goto L_0x0081
            r3 = 1
            if (r1 == r3) goto L_0x007c
            if (r1 != r2) goto L_0x0076
            long r14 = java.lang.Long.parseLong(r10)     // Catch:{ Exception -> 0x008e }
            goto L_0x0086
        L_0x0076:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ Exception -> 0x008e }
            r0.<init>()     // Catch:{ Exception -> 0x008e }
            throw r0     // Catch:{ Exception -> 0x008e }
        L_0x007c:
            int r13 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x008e }
            goto L_0x0086
        L_0x0081:
            android.net.Uri r1 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x008e }
            r6 = r1
        L_0x0086:
            int r12 = r12 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L_0x0023
        L_0x008e:
            r0 = move-exception
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r1.<init>(r9, r0)
            throw r1
        L_0x0095:
            r16 = r1
            r17 = r2
            if (r6 == 0) goto L_0x00be
            java.lang.String r1 = r6.getScheme()
            if (r1 == 0) goto L_0x00be
            r1 = -1
            if (r13 != r1) goto L_0x00ad
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00be
        L_0x00ad:
            com.google.android.exoplayer2.source.rtsp.RtspTrackTiming r1 = new com.google.android.exoplayer2.source.rtsp.RtspTrackTiming
            r1.<init>(r14, r13, r6)
            r0.mo19883e(r1)
            int r4 = r4 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L_0x0010
        L_0x00be:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r0.<init>((java.lang.String) r5)
            throw r0
        L_0x00c4:
            com.google.common.collect.t r0 = r0.mo19884f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspTrackTiming.parseTrackTiming(java.lang.String):com.google.common.collect.t");
    }
}
