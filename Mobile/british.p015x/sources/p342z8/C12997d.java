package p342z8;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p308g8.C12713a0;

/* renamed from: z8.d */
/* compiled from: EnglishReasonPhraseCatalog */
public class C12997d implements C12713a0 {

    /* renamed from: a */
    public static final C12997d f55754a = new C12997d();

    /* renamed from: b */
    private static final String[][] f55755b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        m54802a(200, "OK");
        m54802a(201, "Created");
        m54802a(202, "Accepted");
        m54802a(204, "No Content");
        m54802a(301, "Moved Permanently");
        m54802a(IronSourceConstants.OFFERWALL_AVAILABLE, "Moved Temporarily");
        m54802a(304, "Not Modified");
        m54802a(400, "Bad Request");
        m54802a(401, "Unauthorized");
        m54802a(403, "Forbidden");
        m54802a(404, "Not Found");
        m54802a(500, "Internal Server Error");
        m54802a(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, "Not Implemented");
        m54802a(IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION, "Bad Gateway");
        m54802a(503, "Service Unavailable");
        m54802a(100, "Continue");
        m54802a(307, "Temporary Redirect");
        m54802a(405, "Method Not Allowed");
        m54802a(409, "Conflict");
        m54802a(412, "Precondition Failed");
        m54802a(413, "Request Too Long");
        m54802a(414, "Request-URI Too Long");
        m54802a(415, "Unsupported Media Type");
        m54802a(300, "Multiple Choices");
        m54802a(303, "See Other");
        m54802a(IronSourceConstants.OFFERWALL_OPENED, "Use Proxy");
        m54802a(402, "Payment Required");
        m54802a(406, "Not Acceptable");
        m54802a(407, "Proxy Authentication Required");
        m54802a(408, "Request Timeout");
        m54802a(101, "Switching Protocols");
        m54802a(203, "Non Authoritative Information");
        m54802a(205, "Reset Content");
        m54802a(206, "Partial Content");
        m54802a(504, "Gateway Timeout");
        m54802a(IronSourceError.ERROR_CODE_KEY_NOT_SET, "Http Version Not Supported");
        m54802a(410, "Gone");
        m54802a(411, "Length Required");
        m54802a(416, "Requested Range Not Satisfiable");
        m54802a(417, "Expectation Failed");
        m54802a(102, "Processing");
        m54802a(207, "Multi-Status");
        m54802a(422, "Unprocessable Entity");
        m54802a(419, "Insufficient Space On Resource");
        m54802a(420, "Method Failure");
        m54802a(423, "Locked");
        m54802a(507, "Insufficient Storage");
        m54802a(424, "Failed Dependency");
    }

    protected C12997d() {
    }

    /* renamed from: a */
    private static void m54802a(int i, String str) {
        int i2 = i / 100;
        f55755b[i2][i - (i2 * 100)] = str;
    }
}
