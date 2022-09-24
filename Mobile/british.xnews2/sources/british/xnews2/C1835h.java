package british.xnews2;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: british.xnews2.h */
/* compiled from: IcyStreamMeta */
public class C1835h {

    /* renamed from: a */
    protected URL f7812a;

    /* renamed from: b */
    private Map<String, String> f7813b;

    public C1835h(URL url) {
        mo7742g(url);
    }

    /* renamed from: d */
    public static Map<String, String> m8323d(String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split(";");
        Pattern compile = Pattern.compile("^([a-zA-Z]+)=\\'([^\\']*)\\'$");
        for (String matcher : split) {
            Matcher matcher2 = compile.matcher(matcher);
            if (matcher2.find()) {
                hashMap.put(matcher2.group(1), matcher2.group(2));
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    private void m8324f() throws IOException {
        int i;
        URLConnection openConnection = this.f7812a.openConnection();
        openConnection.setRequestProperty(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        openConnection.setRequestProperty(RtspHeaders.CONNECTION, "close");
        openConnection.connect();
        Map<String, List<String>> headerFields = openConnection.getHeaderFields();
        InputStream inputStream = openConnection.getInputStream();
        if (headerFields == null || !headerFields.containsKey("icy-metaint")) {
            StringBuilder sb = new StringBuilder();
            String str = "";
            while (true) {
                char read = (char) inputStream.read();
                if (read == 65535) {
                    break;
                }
                str = str + read;
                sb.append(read);
                if (str.length() > 4000 || (sb.length() > 5 && sb.substring(sb.length() - 4, sb.length()).equals("\r\n\r\n"))) {
                    break;
                }
            }
            Matcher matcher = Pattern.compile("\\r\\n(icy-metaint):\\s*(.*)\\r\\n").matcher(sb.toString());
            i = matcher.find() ? Integer.parseInt(matcher.group(2)) : 0;
        } else {
            i = Integer.parseInt((String) headerFields.get("icy-metaint").get(0));
        }
        if (i != 0) {
            int i2 = 4080;
            StringBuilder sb2 = new StringBuilder();
            int i3 = 0;
            do {
                int read2 = inputStream.read();
                if (read2 == -1) {
                    break;
                }
                boolean z = true;
                i3++;
                int i4 = i + 1;
                if (i3 == i4) {
                    i2 = read2 * 16;
                }
                if (i3 <= i4 || i3 >= i + i2) {
                    z = false;
                }
                if (z && read2 != 0) {
                    sb2.append((char) read2);
                }
            } while (i3 <= i + i2);
            this.f7813b = m8323d(sb2.toString());
            inputStream.close();
        }
    }

    /* renamed from: a */
    public String mo7738a() throws IOException {
        Map<String, String> b = mo7739b();
        if (b == null || !b.containsKey("StreamTitle")) {
            return "";
        }
        try {
            String str = b.get("StreamTitle");
            return str.substring(0, str.indexOf("-")).trim();
        } catch (StringIndexOutOfBoundsException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public Map<String, String> mo7739b() throws IOException {
        if (this.f7813b == null) {
            mo7741e();
        }
        return this.f7813b;
    }

    /* renamed from: c */
    public String mo7740c() throws IOException {
        Map<String, String> b = mo7739b();
        if (b == null || !b.containsKey("StreamTitle")) {
            return "";
        }
        try {
            String str = b.get("StreamTitle");
            return str.substring(str.indexOf("-") + 1).trim();
        } catch (StringIndexOutOfBoundsException unused) {
            return "";
        }
    }

    /* renamed from: e */
    public void mo7741e() throws IOException {
        m8324f();
    }

    /* renamed from: g */
    public void mo7742g(URL url) {
        this.f7813b = null;
        this.f7812a = url;
    }
}
