package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uk */
/* compiled from: IMASDK */
public final class C4396uk {
    /* renamed from: a */
    public static byte[] m19132a(UUID uuid, byte[] bArr) {
        return m19133b(uuid, (UUID[]) null, bArr);
    }

    /* renamed from: b */
    public static byte[] m19133b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length2);
        allocate.putInt(length2);
        allocate.putInt(Atom.TYPE_pssh);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(r5);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || (length = bArr.length) == 0)) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static UUID m19134c(byte[] bArr) {
        C4395uj l = m19143l(bArr);
        if (l == null) {
            return null;
        }
        return l.f19039a;
    }

    /* renamed from: d */
    public static acj m19135d(acj... acjArr) {
        return new aag(acjArr);
    }

    /* renamed from: e */
    public static int m19136e(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static long m19137f(alw alw, int i, int i2) {
        alw.mo13951i(i);
        if (alw.mo13947e() < 5) {
            return C6540C.TIME_UNSET;
        }
        int w = alw.mo13965w();
        if ((8388608 & w) != 0 || ((w >> 8) & 8191) != i2 || (w & 32) == 0 || alw.mo13957o() < 7 || alw.mo13947e() < 7 || (alw.mo13957o() & 16) != 16) {
            return C6540C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        alw.mo13956n(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* renamed from: g */
    public static void m19138g(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i)));
        }
    }

    /* renamed from: h */
    public static void m19139h(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19140i(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2) {
        /*
            java.lang.String r0 = "Content-Type"
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            if (r2 == 0) goto L_0x001a
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
        L_0x001a:
            int r2 = m19141j(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4396uk.m19140i(java.util.Map):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19141j(java.lang.String r17) {
        /*
            r0 = -1
            if (r17 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14044n(r17)
            int r2 = r1.hashCode()
            r3 = 9
            r4 = 12
            r5 = 14
            r6 = 7
            r7 = 1
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 0
            r12 = 8
            r13 = 13
            r14 = 10
            r15 = 6
            r16 = 11
            switch(r2) {
                case -2123537834: goto L_0x012b;
                case -1662384011: goto L_0x0120;
                case -1662384007: goto L_0x0115;
                case -1662095187: goto L_0x010a;
                case -1606874997: goto L_0x0100;
                case -1487394660: goto L_0x00f5;
                case -1248337486: goto L_0x00ea;
                case -1004728940: goto L_0x00df;
                case -387023398: goto L_0x00d4;
                case -43467528: goto L_0x00c8;
                case 13915911: goto L_0x00bc;
                case 187078296: goto L_0x00b1;
                case 187078297: goto L_0x00a6;
                case 187078669: goto L_0x009b;
                case 187090232: goto L_0x008f;
                case 187091926: goto L_0x0083;
                case 187099443: goto L_0x0077;
                case 1331848029: goto L_0x006b;
                case 1503095341: goto L_0x0060;
                case 1504578661: goto L_0x0055;
                case 1504619009: goto L_0x004a;
                case 1504831518: goto L_0x003e;
                case 1505118770: goto L_0x0032;
                case 2039520277: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0135
        L_0x0026:
            java.lang.String r2 = "video/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 9
            goto L_0x0136
        L_0x0032:
            java.lang.String r2 = "audio/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 12
            goto L_0x0136
        L_0x003e:
            java.lang.String r2 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 14
            goto L_0x0136
        L_0x004a:
            java.lang.String r2 = "audio/flac"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 7
            goto L_0x0136
        L_0x0055:
            java.lang.String r2 = "audio/eac3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 1
            goto L_0x0136
        L_0x0060:
            java.lang.String r2 = "audio/3gpp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 5
            goto L_0x0136
        L_0x006b:
            java.lang.String r2 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 15
            goto L_0x0136
        L_0x0077:
            java.lang.String r2 = "audio/wav"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 21
            goto L_0x0136
        L_0x0083:
            java.lang.String r2 = "audio/ogg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 18
            goto L_0x0136
        L_0x008f:
            java.lang.String r2 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 16
            goto L_0x0136
        L_0x009b:
            java.lang.String r2 = "audio/amr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 4
            goto L_0x0136
        L_0x00a6:
            java.lang.String r2 = "audio/ac4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 3
            goto L_0x0136
        L_0x00b1:
            java.lang.String r2 = "audio/ac3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 0
            goto L_0x0136
        L_0x00bc:
            java.lang.String r2 = "video/x-flv"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 8
            goto L_0x0136
        L_0x00c8:
            java.lang.String r2 = "application/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 13
            goto L_0x0136
        L_0x00d4:
            java.lang.String r2 = "audio/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 10
            goto L_0x0136
        L_0x00df:
            java.lang.String r2 = "text/vtt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 22
            goto L_0x0136
        L_0x00ea:
            java.lang.String r2 = "application/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 17
            goto L_0x0136
        L_0x00f5:
            java.lang.String r2 = "image/jpeg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 23
            goto L_0x0136
        L_0x0100:
            java.lang.String r2 = "audio/amr-wb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 6
            goto L_0x0136
        L_0x010a:
            java.lang.String r2 = "video/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 11
            goto L_0x0136
        L_0x0115:
            java.lang.String r2 = "video/mp2t"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 20
            goto L_0x0136
        L_0x0120:
            java.lang.String r2 = "video/mp2p"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 19
            goto L_0x0136
        L_0x012b:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0135
            r1 = 2
            goto L_0x0136
        L_0x0135:
            r1 = -1
        L_0x0136:
            switch(r1) {
                case 0: goto L_0x0147;
                case 1: goto L_0x0147;
                case 2: goto L_0x0147;
                case 3: goto L_0x0146;
                case 4: goto L_0x0145;
                case 5: goto L_0x0145;
                case 6: goto L_0x0145;
                case 7: goto L_0x0144;
                case 8: goto L_0x0143;
                case 9: goto L_0x0142;
                case 10: goto L_0x0142;
                case 11: goto L_0x0142;
                case 12: goto L_0x0142;
                case 13: goto L_0x0142;
                case 14: goto L_0x0141;
                case 15: goto L_0x0140;
                case 16: goto L_0x0140;
                case 17: goto L_0x0140;
                case 18: goto L_0x013f;
                case 19: goto L_0x013e;
                case 20: goto L_0x013d;
                case 21: goto L_0x013c;
                case 22: goto L_0x013b;
                case 23: goto L_0x013a;
                default: goto L_0x0139;
            }
        L_0x0139:
            return r0
        L_0x013a:
            return r5
        L_0x013b:
            return r13
        L_0x013c:
            return r4
        L_0x013d:
            return r16
        L_0x013e:
            return r14
        L_0x013f:
            return r3
        L_0x0140:
            return r12
        L_0x0141:
            return r6
        L_0x0142:
            return r15
        L_0x0143:
            return r8
        L_0x0144:
            return r9
        L_0x0145:
            return r10
        L_0x0146:
            return r7
        L_0x0147:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4396uk.m19141j(java.lang.String):int");
    }

    /* renamed from: k */
    public static int m19142k(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return -1;
    }

    /* renamed from: l */
    private static C4395uj m19143l(byte[] bArr) {
        alw alw = new alw(bArr);
        if (alw.mo13948f() < 32) {
            return null;
        }
        alw.mo13951i(0);
        if (alw.mo13965w() != alw.mo13947e() + 4 || alw.mo13965w() != 1886614376) {
            return null;
        }
        int e = C4375tq.m19003e(alw.mo13965w());
        if (e > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(e);
            Log.w("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(alw.mo13967y(), alw.mo13967y());
        if (e == 1) {
            alw.mo13954l(alw.mo13934C() * 16);
        }
        int C = alw.mo13934C();
        if (C != alw.mo13947e()) {
            return null;
        }
        byte[] bArr2 = new byte[C];
        alw.mo13956n(bArr2, 0, C);
        return new C4395uj(uuid, e, bArr2);
    }
}
