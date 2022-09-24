package p320o8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Stack;
import p307g8.C12728l;

/* renamed from: o8.b */
/* compiled from: URIUtils */
public class C12845b {
    /* renamed from: a */
    public static URI m54421a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    /* renamed from: b */
    public static C12728l m54422b(URI uri) {
        int indexOf;
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        int port = uri.getPort();
        String host = uri.getHost();
        if (host == null && (host = uri.getAuthority()) != null) {
            int indexOf2 = host.indexOf(64);
            if (indexOf2 >= 0) {
                int i = indexOf2 + 1;
                host = host.length() > i ? host.substring(i) : null;
            }
            if (host != null && (indexOf = host.indexOf(58)) >= 0) {
                int i2 = indexOf + 1;
                if (i2 < host.length()) {
                    port = Integer.parseInt(host.substring(i2));
                }
                host = host.substring(0, indexOf);
            }
        }
        String scheme = uri.getScheme();
        if (host != null) {
            return new C12728l(host, port, scheme);
        }
        return null;
    }

    /* renamed from: c */
    private static String m54423c(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        return i > 1 ? str.substring(i - 1) : str;
    }

    /* renamed from: d */
    private static URI m54424d(URI uri) {
        String path = uri.getPath();
        if (path == null || path.indexOf("/.") == -1) {
            return uri;
        }
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() != 0 && !".".equals(split[i])) {
                if (!"..".equals(split[i])) {
                    stack.push(split[i]);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            sb.append('/');
            sb.append((String) it.next());
        }
        try {
            return new URI(uri.getScheme(), uri.getAuthority(), sb.toString(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static URI m54425e(URI uri, URI uri2) {
        if (uri == null) {
            throw new IllegalArgumentException("Base URI may nor be null");
        } else if (uri2 != null) {
            String uri3 = uri2.toString();
            if (uri3.startsWith("?")) {
                return m54426f(uri, uri2);
            }
            boolean z = uri3.length() == 0;
            if (z) {
                uri2 = URI.create("#");
            }
            URI resolve = uri.resolve(uri2);
            if (z) {
                String uri4 = resolve.toString();
                resolve = URI.create(uri4.substring(0, uri4.indexOf(35)));
            }
            return m54424d(resolve);
        } else {
            throw new IllegalArgumentException("Reference URI may nor be null");
        }
    }

    /* renamed from: f */
    private static URI m54426f(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        return URI.create(uri3 + uri2.toString());
    }

    /* renamed from: g */
    public static URI m54427g(URI uri, C12728l lVar) throws URISyntaxException {
        return m54428h(uri, lVar, false);
    }

    /* renamed from: h */
    public static URI m54428h(URI uri, C12728l lVar, boolean z) throws URISyntaxException {
        if (uri != null) {
            String str = null;
            if (lVar != null) {
                String c = lVar.mo47784c();
                String a = lVar.mo47782a();
                int b = lVar.mo47783b();
                String c2 = m54423c(uri.getRawPath());
                String rawQuery = uri.getRawQuery();
                if (!z) {
                    str = uri.getRawFragment();
                }
                return m54421a(c, a, b, c2, rawQuery, str);
            }
            String c3 = m54423c(uri.getRawPath());
            String rawQuery2 = uri.getRawQuery();
            if (!z) {
                str = uri.getRawFragment();
            }
            return m54421a((String) null, (String) null, -1, c3, rawQuery2, str);
        }
        throw new IllegalArgumentException("URI may nor be null");
    }
}
