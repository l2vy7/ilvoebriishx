package p316k9;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import p307g8.C12718d;
import p307g8.C12725i;
import p307g8.C12738v;
import p307g8.C12740x;

/* renamed from: k9.d */
/* compiled from: EntityUtils */
public final class C12823d {
    /* renamed from: a */
    public static void m54369a(C12725i iVar) throws IOException {
        InputStream k;
        if (iVar != null && iVar.mo47781p() && (k = iVar.mo43577k()) != null) {
            k.close();
        }
    }

    /* renamed from: b */
    public static String m54370b(C12725i iVar) throws C12740x {
        C12738v b;
        if (iVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        } else if (iVar.getContentType() == null) {
            return null;
        } else {
            C12718d[] b2 = iVar.getContentType().mo47760b();
            if (b2.length <= 0 || (b = b2[0].mo47767b("charset")) == null) {
                return null;
            }
            return b.getValue();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static byte[] m54371c(C12725i iVar) throws IOException {
        if (iVar != null) {
            InputStream k = iVar.mo43577k();
            if (k == null) {
                return null;
            }
            if (iVar.mo47776b() <= 2147483647L) {
                int b = (int) iVar.mo47776b();
                if (b < 0) {
                    b = 4096;
                }
                C12820a aVar = new C12820a(b);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = k.read(bArr);
                        if (read != -1) {
                            aVar.mo47953c(bArr, 0, read);
                        } else {
                            k.close();
                            return aVar.mo47963n();
                        }
                    }
                } catch (Throwable th) {
                    k.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }

    /* renamed from: d */
    public static String m54372d(C12725i iVar) throws IOException, C12740x {
        return m54373e(iVar, (String) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static String m54373e(C12725i iVar, String str) throws IOException, C12740x {
        if (iVar != null) {
            InputStream k = iVar.mo43577k();
            if (k == null) {
                return null;
            }
            if (iVar.mo47776b() <= 2147483647L) {
                int b = (int) iVar.mo47776b();
                if (b < 0) {
                    b = 4096;
                }
                String b2 = m54370b(iVar);
                if (b2 != null) {
                    str = b2;
                }
                if (str == null) {
                    str = C6540C.ISO88591_NAME;
                }
                InputStreamReader inputStreamReader = new InputStreamReader(k, str);
                C12821b bVar = new C12821b(b);
                try {
                    char[] cArr = new char[1024];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            bVar.mo47970g(cArr, 0, read);
                        } else {
                            inputStreamReader.close();
                            return bVar.toString();
                        }
                    }
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }
}
