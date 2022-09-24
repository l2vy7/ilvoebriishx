package british.p015x;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.lang.Thread;
import java.net.URLEncoder;
import p273b9.C11188h;
import p313i9.C12788b;
import p313i9.C12789c;
import p318l8.C12831e;
import p338x8.C12957d;
import p338x8.C12960g;
import p340y8.C12982f;

/* renamed from: british.x.f */
/* compiled from: CustomExceptionHandler */
public class C1787f implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f7703a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: british.x.f$a */
    /* compiled from: CustomExceptionHandler */
    private class C1788a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f7704a;

        /* renamed from: b */
        String f7705b;

        C1788a(String str, String str2) {
            this.f7704a = str;
            this.f7705b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            try {
                C12788b bVar = new C12788b();
                C12789c.m54266h(bVar, 10000);
                C12789c.m54267i(bVar, 60000);
                C11188h hVar = new C11188h(bVar);
                C12831e eVar = new C12831e(C1692config.f7107G5 + "log.e-droid.net/srv/log.php?v=" + 144 + "&vcode=" + 2 + "&idapp=" + 2261075 + "&nivelapi=" + Build.VERSION.SDK_INT + "&dispo=" + URLEncoder.encode(this.f7705b, C6540C.UTF8_NAME));
                C12960g gVar = new C12960g(C12957d.BROWSER_COMPATIBLE);
                gVar.mo48144c("descr", new C12982f(this.f7704a));
                eVar.mo47986B(gVar);
                eVar.mo47794K(RtspHeaders.USER_AGENT, "Android Vinebre Software");
                hVar.mo43518a(eVar);
            } catch (Exception unused) {
            }
            return (byte) 0;
        }
    }

    /* renamed from: a */
    private static String m8301a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (!z || !Character.isLetter(c)) {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            } else {
                sb.append(Character.toUpperCase(c));
                z = false;
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m8302b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m8301a(str2);
        }
        return m8301a(str) + " " + str2;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            new C1788a(Log.getStackTraceString(th), m8302b()).execute(new String[0]);
        } catch (Exception unused) {
        }
        this.f7703a.uncaughtException(thread, th);
    }
}
