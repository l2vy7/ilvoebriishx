package com.adcolony.sdk;

import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f10540a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f10541b;

    /* renamed from: com.adcolony.sdk.AdColonyCustomMessage$a */
    class C2683a implements Runnable {
        C2683a() {
        }

        public void run() {
            AdColony.m9333c();
            JSONObject b = C2976x.m10319b();
            C2976x.m10313a(b, SessionDescription.ATTR_TYPE, AdColonyCustomMessage.this.f10540a);
            C2976x.m10313a(b, "message", AdColonyCustomMessage.this.f10541b);
            new C2714c0("CustomMessage.native_send", 1, b).mo9612d();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (C2916s0.m10083e(str) || C2916s0.m10083e(str2)) {
            this.f10540a = str;
            this.f10541b = str2;
        }
    }

    public String getMessage() {
        return this.f10541b;
    }

    public String getType() {
        return this.f10540a;
    }

    public void send() {
        try {
            AdColony.f10472a.execute(new C2683a());
        } catch (RejectedExecutionException unused) {
        }
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f10540a = str;
        this.f10541b = str2;
        return this;
    }
}
