package p330t8;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p332u8.C12910a;

/* renamed from: t8.a */
/* compiled from: AbstractVerifier */
public abstract class C12897a implements C12904h {

    /* renamed from: a */
    private static final String[] f55587a;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f55587a = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: c */
    public static boolean m54558c(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i = length - 3;
        if (str.charAt(i) != '.') {
            return true;
        }
        if (Arrays.binarySearch(f55587a, str.substring(2, i)) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m54559d(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static String[] m54560e(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("CN=");
            if (indexOf >= 0) {
                linkedList.add(nextToken.substring(indexOf + 3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: f */
    private static String[] m54561f(X509Certificate x509Certificate, String str) {
        Collection<List<?>> collection;
        int i = m54562g(str) ? 7 : 2;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Logger.getLogger(C12897a.class.getName()).log(Level.FINE, "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List next : collection) {
                if (((Integer) next.get(0)).intValue() == i) {
                    linkedList.add((String) next.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: g */
    private static boolean m54562g(String str) {
        return str != null && (C12910a.m54591a(str) || C12910a.m54592b(str));
    }

    /* renamed from: a */
    public final void mo48066a(String str, SSLSocket sSLSocket) throws IOException {
        Objects.requireNonNull(str, "host to verify is null");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        mo48067h(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    /* renamed from: h */
    public final void mo48067h(String str, X509Certificate x509Certificate) throws SSLException {
        mo48070b(str, m54560e(x509Certificate), m54561f(x509Certificate, str));
    }

    /* renamed from: i */
    public final void mo48068i(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                sb.append(" <");
                sb.append(lowerCase2);
                sb.append('>');
                if (it.hasNext()) {
                    sb.append(" OR");
                }
                boolean z3 = true;
                if (lowerCase2.startsWith("*.") && lowerCase2.lastIndexOf(46) >= 0 && m54558c(lowerCase2) && !m54562g(str)) {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (!endsWith || !z) {
                        z2 = endsWith;
                        continue;
                    } else {
                        if (m54559d(lowerCase) != m54559d(lowerCase2)) {
                            z3 = false;
                        }
                        z2 = z3;
                        continue;
                    }
                } else {
                    z2 = lowerCase.equals(lowerCase2);
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + sb);
            }
            return;
        }
        throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            mo48067h(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }
}
