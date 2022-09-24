package p332u8;

import java.util.regex.Pattern;

/* renamed from: u8.a */
/* compiled from: InetAddressUtils */
public class C12910a {

    /* renamed from: a */
    private static final Pattern f55605a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f55606b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f55607c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m54591a(String str) {
        return f55605a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m54592b(String str) {
        return m54594d(str) || m54593c(str);
    }

    /* renamed from: c */
    public static boolean m54593c(String str) {
        return f55607c.matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m54594d(String str) {
        return f55606b.matcher(str).matches();
    }
}
