package com.facebook;

/* renamed from: com.facebook.k */
/* compiled from: FacebookGraphResponseException */
public class C3574k extends C3572j {

    /* renamed from: b */
    private final C3655r f13293b;

    public C3574k(C3655r rVar, String str) {
        super(str);
        this.f13293b = rVar;
    }

    public final String toString() {
        C3655r rVar = this.f13293b;
        FacebookRequestError g = rVar != null ? rVar.mo12380g() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (g != null) {
            sb.append("httpResponseCode: ");
            sb.append(g.mo11231i());
            sb.append(", facebookErrorCode: ");
            sb.append(g.mo11225d());
            sb.append(", facebookErrorType: ");
            sb.append(g.mo11228f());
            sb.append(", message: ");
            sb.append(g.mo11227e());
            sb.append("}");
        }
        return sb.toString();
    }
}
