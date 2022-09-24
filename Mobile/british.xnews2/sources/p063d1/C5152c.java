package p063d1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: d1.c */
/* compiled from: ZipUtil */
final class C5152c {

    /* renamed from: d1.c$a */
    /* compiled from: ZipUtil */
    static class C5153a {

        /* renamed from: a */
        long f22577a;

        /* renamed from: b */
        long f22578b;

        C5153a() {
        }
    }

    /* renamed from: a */
    static long m23466a(RandomAccessFile randomAccessFile, C5153a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f22578b;
        randomAccessFile.seek(aVar.f22577a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    static C5153a m23467b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C5153a aVar = new C5153a();
                    aVar.f22578b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f22577a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    static long m23468c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m23466a(randomAccessFile, m23467b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
