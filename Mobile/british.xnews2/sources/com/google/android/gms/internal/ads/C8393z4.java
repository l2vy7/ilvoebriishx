package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.z4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8393z4 {
    /* renamed from: a */
    public static X509Certificate[][] m40160a(String str) throws C8285w4, SecurityException, IOException {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> c = C7491a5.m30236c(randomAccessFile);
            if (c != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) c.first;
                long longValue = ((Long) c.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C8285w4("ZIP64 APK not supported");
                    }
                }
                long a = C7491a5.m30234a(byteBuffer2);
                if (a >= longValue) {
                    StringBuilder sb = new StringBuilder(122);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(a);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new C8285w4(sb.toString());
                } else if (C7491a5.m30235b(byteBuffer2) + a != longValue) {
                    throw new C8285w4("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (a >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(a - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new C8285w4(sb2.toString());
                        }
                        int i2 = (int) (8 + j2);
                        long j3 = a - ((long) i2);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                            allocate2.order(byteOrder);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == byteOrder) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i++;
                                                if (slice.remaining() >= 8) {
                                                    long j5 = slice.getLong();
                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                        StringBuilder sb3 = new StringBuilder(76);
                                                        sb3.append("APK Signing Block entry #");
                                                        sb3.append(i);
                                                        sb3.append(" size out of range: ");
                                                        sb3.append(j5);
                                                        throw new C8285w4(sb3.toString());
                                                    }
                                                    int i3 = (int) j5;
                                                    int position2 = slice.position() + i3;
                                                    if (i3 > slice.remaining()) {
                                                        int remaining = slice.remaining();
                                                        StringBuilder sb4 = new StringBuilder(91);
                                                        sb4.append("APK Signing Block entry #");
                                                        sb4.append(i);
                                                        sb4.append(" size out of range: ");
                                                        sb4.append(i3);
                                                        sb4.append(", available: ");
                                                        sb4.append(remaining);
                                                        throw new C8285w4(sb4.toString());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] l = m40171l(randomAccessFile.getChannel(), new C8251v4(m40164e(slice, i3 - 4), longValue2, a, longValue, byteBuffer2, (C8109r4) null));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return l;
                                                    } else {
                                                        slice.position(position2);
                                                    }
                                                } else {
                                                    StringBuilder sb5 = new StringBuilder(70);
                                                    sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                    sb5.append(i);
                                                    throw new C8285w4(sb5.toString());
                                                }
                                            }
                                            throw new C8285w4("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        StringBuilder sb6 = new StringBuilder(41);
                                        sb6.append("end > capacity: ");
                                        sb6.append(capacity);
                                        sb6.append(" > ");
                                        sb6.append(capacity2);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    StringBuilder sb7 = new StringBuilder(38);
                                    sb7.append("end < start: ");
                                    sb7.append(capacity);
                                    sb7.append(" < ");
                                    sb7.append(8);
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            StringBuilder sb8 = new StringBuilder(103);
                            sb8.append("APK Signing Block sizes in header and footer do not match: ");
                            sb8.append(j4);
                            sb8.append(" vs ");
                            sb8.append(j2);
                            throw new C8285w4(sb8.toString());
                        }
                        StringBuilder sb9 = new StringBuilder(59);
                        sb9.append("APK Signing Block offset out of range: ");
                        sb9.append(j3);
                        throw new C8285w4(sb9.toString());
                    }
                    throw new C8285w4("No APK Signing Block before ZIP Central Directory");
                } else {
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(a);
                    throw new C8285w4(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new C8285w4(sb11.toString());
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static int m40161b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static int m40162c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case TsExtractor.TS_STREAM_TYPE_AIT:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* renamed from: d */
    private static String m40163d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    private static ByteBuffer m40164e(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    private static ByteBuffer m40165f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m40164e(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: g */
    private static void m40166g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: h */
    private static void m40167h(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            C8214u4 u4Var = new C8214u4(fileChannel, 0, j);
            C8214u4 u4Var2 = new C8214u4(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j4 = j;
            C7491a5.m30237d(duplicate, j);
            C8143s4 s4Var = new C8143s4(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] k = m40170k(iArr, new C8178t4[]{u4Var, u4Var2, s4Var});
                while (i < size) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual(map.get(Integer.valueOf(i3)), k[i])) {
                        i++;
                    } else {
                        throw new SecurityException(m40163d(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: i */
    private static byte[] m40168i(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: j */
    private static X509Certificate[] m40169j(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair pair;
        String str2;
        String str3;
        ByteBuffer f = m40165f(byteBuffer);
        ByteBuffer f2 = m40165f(byteBuffer);
        byte[] i = m40168i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i2 = -1;
        int i3 = 0;
        while (f2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer f3 = m40165f(f2);
                if (f3.remaining() >= 8) {
                    int i4 = f3.getInt();
                    arrayList.add(Integer.valueOf(i4));
                    if (!(i4 == 513 || i4 == 514 || i4 == 769)) {
                        switch (i4) {
                            case TsExtractor.TS_STREAM_TYPE_AIT:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i2 != -1) {
                        int c = m40162c(i4);
                        int c2 = m40162c(i2);
                        if (c != 1) {
                            if (c2 != 1) {
                            }
                        }
                    }
                    bArr2 = m40168i(f3);
                    i2 = i4;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i3);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i2 != -1) {
            if (i2 == 513 || i2 == 514) {
                str = "EC";
            } else if (i2 != 769) {
                switch (i2) {
                    case TsExtractor.TS_STREAM_TYPE_AIT:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        String valueOf = String.valueOf(Long.toHexString((long) i2));
                        if (valueOf.length() != 0) {
                            str3 = "Unknown signature algorithm: 0x".concat(valueOf);
                        } else {
                            str3 = new String("Unknown signature algorithm: 0x");
                        }
                        throw new IllegalArgumentException(str3);
                }
            } else {
                str = "DSA";
            }
            if (i2 == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i2 == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i2 != 769) {
                switch (i2) {
                    case TsExtractor.TS_STREAM_TYPE_AIT:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString((long) i2));
                        if (valueOf2.length() != 0) {
                            str2 = "Unknown signature algorithm: 0x".concat(valueOf2);
                        } else {
                            str2 = new String("Unknown signature algorithm: 0x");
                        }
                        throw new IllegalArgumentException(str2);
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str4 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i));
                Signature instance = Signature.getInstance(str4);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(f);
                if (instance.verify(bArr2)) {
                    f.clear();
                    ByteBuffer f4 = m40165f(f);
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (f4.hasRemaining()) {
                        i5++;
                        try {
                            ByteBuffer f5 = m40165f(f4);
                            if (f5.remaining() >= 8) {
                                int i6 = f5.getInt();
                                arrayList2.add(Integer.valueOf(i6));
                                if (i6 == i2) {
                                    bArr = m40168i(f5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            StringBuilder sb2 = new StringBuilder(42);
                            sb2.append("Failed to parse digest record #");
                            sb2.append(i5);
                            throw new IOException(sb2.toString(), e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int c3 = m40162c(i2);
                        byte[] put = map.put(Integer.valueOf(c3), bArr);
                        if (put == null || MessageDigest.isEqual(put, bArr)) {
                            ByteBuffer f6 = m40165f(f);
                            ArrayList arrayList3 = new ArrayList();
                            int i7 = 0;
                            while (f6.hasRemaining()) {
                                i7++;
                                byte[] i8 = m40168i(f6);
                                try {
                                    arrayList3.add(new C8321x4((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(i8)), i8));
                                } catch (CertificateException e3) {
                                    StringBuilder sb3 = new StringBuilder(41);
                                    sb3.append("Failed to decode certificate #");
                                    sb3.append(i7);
                                    throw new SecurityException(sb3.toString(), e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(m40163d(c3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str4).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 27);
                sb4.append("Failed to verify ");
                sb4.append(str4);
                sb4.append(" signature");
                throw new SecurityException(sb4.toString(), e4);
            }
        } else if (i3 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    /* renamed from: k */
    private static byte[][] m40170k(int[] iArr, C8178t4[] t4VarArr) throws DigestException {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (t4VarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            int i4 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i5 = 0;
            while (true) {
                length = iArr2.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m40161b(iArr2[i5]) * i4) + 5)];
                bArr2[0] = 90;
                m40166g(i4, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (i6 < iArr2.length) {
                String d = m40163d(iArr2[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(d);
                    i6++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i7 < i; i = 3) {
                C8178t4 t4Var = t4VarArr[i7];
                long j4 = j2;
                long zza = t4Var.zza();
                while (zza > j2) {
                    int min = (int) Math.min(zza, j);
                    m40166g(min, bArr3, 1);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        t4Var.mo34658a(messageDigestArr, j5, min);
                        byte[] bArr4 = bArr3;
                        int i10 = 0;
                        while (i10 < iArr2.length) {
                            int i11 = iArr2[i10];
                            C8178t4 t4Var2 = t4Var;
                            byte[] bArr5 = bArr[i10];
                            int b = m40161b(i11);
                            int i12 = length;
                            MessageDigest messageDigest = messageDigestArr[i10];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * b) + 5, b);
                            if (digest == b) {
                                i10++;
                                t4Var = t4Var2;
                                length = i12;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        C8178t4 t4Var3 = t4Var;
                        int i13 = length;
                        long j6 = (long) min;
                        long j7 = j5 + j6;
                        zza -= j6;
                        i8++;
                        bArr3 = bArr4;
                        j2 = 0;
                        j4 = j7;
                        j = 1048576;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i8);
                        sb2.append(" of section #");
                        sb2.append(i2);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                int i14 = length;
                i2++;
                i7++;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i15 = 0;
            while (i15 < iArr2.length) {
                int i16 = iArr2[i15];
                byte[] bArr8 = bArr[i15];
                String d2 = m40163d(i16);
                try {
                    bArr7[i15] = MessageDigest.getInstance(d2).digest(bArr8);
                    i15++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* renamed from: l */
    private static X509Certificate[][] m40171l(FileChannel fileChannel, C8251v4 v4Var) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f = m40165f(v4Var.f40292a);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m40169j(m40165f(f), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m40167h(hashMap, fileChannel, v4Var.f40293b, v4Var.f40294c, v4Var.f40295d, v4Var.f40296e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
