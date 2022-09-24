package p220j4;

import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.C7212h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7305s;
import com.google.android.gms.common.internal.C4604n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p262x4.C11094a;

/* renamed from: j4.d */
public final class C10610d implements Runnable {

    /* renamed from: d */
    private static final C11094a f49165d = new C11094a("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f49166b;

    /* renamed from: c */
    private final C7305s f49167c = new C7305s((C7206f) null);

    private C10610d(String str) {
        C4604n.m20094g(str);
        this.f49166b = str;
    }

    /* renamed from: a */
    public static C7210g<Status> m48372a(String str) {
        if (str == null) {
            return C7212h.m29547a(new Status(4), (C7206f) null);
        }
        C10610d dVar = new C10610d(str);
        new Thread(dVar).start();
        return dVar.f49167c;
    }

    public final void run() {
        Status status = Status.f28884i;
        try {
            String valueOf = String.valueOf(this.f49166b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f28882g;
            } else {
                f49165d.mo43375b("Unable to revoke access!", new Object[0]);
            }
            C11094a aVar = f49165d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo43374a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C11094a aVar2 = f49165d;
            String valueOf2 = String.valueOf(e.toString());
            aVar2.mo43375b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            C11094a aVar3 = f49165d;
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.mo43375b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f49167c.mo29791i(status);
    }
}
