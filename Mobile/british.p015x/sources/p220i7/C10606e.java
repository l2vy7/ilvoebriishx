package p220i7;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: i7.e */
/* compiled from: RandomFidGenerator */
public class C10606e {

    /* renamed from: a */
    private static final byte f49157a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f49158b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m48353b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m48354c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo42718a() {
        byte[] c = m48354c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f49158b & c[0]) | f49157a);
        return m48353b(c);
    }
}
