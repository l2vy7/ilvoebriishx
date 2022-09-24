package com.adcolony.sdk;

import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.j */
class C2827j implements C2750e0 {

    /* renamed from: com.adcolony.sdk.j$a */
    class C2828a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11481a;

        /* renamed from: b */
        final /* synthetic */ String f11482b;

        C2828a(String str, String str2) {
            this.f11481a = str;
            this.f11482b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = C2684a.m9409c().mo9722i().get(this.f11481a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f11481a, this.f11482b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    C2827j() {
        C2684a.m9405a("CustomMessage.controller_send", (C2750e0) this);
    }

    /* renamed from: a */
    public void mo9550a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        C2916s0.m10063a((Runnable) new C2828a(C2976x.m10337i(b, SessionDescription.ATTR_TYPE), C2976x.m10337i(b, "message")));
    }
}
