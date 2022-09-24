package p273b9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p308g8.C12714b;
import p308g8.C12716c;
import p308g8.C12733q;
import p310h8.C12750a;
import p310h8.C12752c;
import p310h8.C12755f;
import p310h8.C12759j;
import p314j8.C12794b;
import p315j9.C12810d;
import p315j9.C12811e;
import p317k9.C12821b;

/* renamed from: b9.a */
/* compiled from: AbstractAuthenticationHandler */
public abstract class C11181a implements C12794b {

    /* renamed from: b */
    private static final List<String> f50234b = Collections.unmodifiableList(Arrays.asList(new String[]{"negotiate", "NTLM", "Digest", "Basic"}));

    /* renamed from: a */
    private final Log f50235a = LogFactory.getLog(getClass());

    /* renamed from: c */
    public C12750a mo43502c(Map<String, C12716c> map, C12733q qVar, C12811e eVar) throws C12755f {
        C12752c cVar = (C12752c) eVar.mo43606b("http.authscheme-registry");
        if (cVar != null) {
            List<String> e = mo43504e(qVar, eVar);
            if (e == null) {
                e = f50234b;
            }
            if (this.f50235a.isDebugEnabled()) {
                Log log = this.f50235a;
                log.debug("Authentication schemes in the order of preference: " + e);
            }
            C12750a aVar = null;
            Iterator<String> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (map.get(next.toLowerCase(Locale.ENGLISH)) != null) {
                    if (this.f50235a.isDebugEnabled()) {
                        Log log2 = this.f50235a;
                        log2.debug(next + " authentication scheme selected");
                    }
                    try {
                        aVar = cVar.mo47822a(next, qVar.mo47801s());
                        break;
                    } catch (IllegalStateException unused) {
                        if (this.f50235a.isWarnEnabled()) {
                            Log log3 = this.f50235a;
                            log3.warn("Authentication scheme " + next + " not supported");
                        }
                    }
                } else if (this.f50235a.isDebugEnabled()) {
                    Log log4 = this.f50235a;
                    log4.debug("Challenge for " + next + " authentication scheme not available");
                }
            }
            if (aVar != null) {
                return aVar;
            }
            throw new C12755f("Unable to respond to any of these challenges: " + map);
        }
        throw new IllegalStateException("AuthScheme registry not set in HTTP context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<String> mo43503d() {
        return f50234b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<String> mo43504e(C12733q qVar, C12811e eVar) {
        return mo43503d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Map<String, C12716c> mo43505f(C12716c[] cVarArr) throws C12759j {
        C12821b bVar;
        int i;
        HashMap hashMap = new HashMap(cVarArr.length);
        for (C12714b bVar2 : cVarArr) {
            if (bVar2 instanceof C12714b) {
                C12714b bVar3 = bVar2;
                bVar = bVar3.mo47755a();
                i = bVar3.mo47756c();
            } else {
                String value = bVar2.getValue();
                if (value != null) {
                    bVar = new C12821b(value.length());
                    bVar.mo47966c(value);
                    i = 0;
                } else {
                    throw new C12759j("Header value is null");
                }
            }
            while (i < bVar.mo47978p() && C12810d.m54317a(bVar.mo47972i(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < bVar.mo47978p() && !C12810d.m54317a(bVar.mo47972i(i2))) {
                i2++;
            }
            hashMap.put(bVar.mo47979q(i, i2).toLowerCase(Locale.ENGLISH), bVar2);
        }
        return hashMap;
    }
}
