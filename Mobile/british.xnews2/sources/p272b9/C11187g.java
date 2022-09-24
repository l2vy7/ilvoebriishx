package p272b9;

import p307g8.C12718d;
import p307g8.C12733q;
import p310h9.C12765d;
import p314j9.C12811e;
import p321p8.C12855g;

/* renamed from: b9.g */
/* compiled from: DefaultConnectionKeepAliveStrategy */
public class C11187g implements C12855g {
    /* renamed from: a */
    public long mo43554a(C12733q qVar, C12811e eVar) {
        if (qVar != null) {
            C12765d dVar = new C12765d(qVar.mo47798m("Keep-Alive"));
            while (dVar.hasNext()) {
                C12718d l = dVar.mo47773l();
                String name = l.getName();
                String value = l.getValue();
                if (value != null && name.equalsIgnoreCase("timeout")) {
                    try {
                        return Long.parseLong(value) * 1000;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
