package p071e2;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C3325f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p004a3.C0056c;
import p004a3.C0061f;
import p065d2.C5154a;
import p065d2.C5158e;
import p071e2.C5208d;
import p102k2.C5582g;

/* renamed from: e2.j */
/* compiled from: HttpUrlFetcher */
public class C5218j implements C5208d<InputStream> {

    /* renamed from: h */
    static final C5220b f22732h = new C5219a();

    /* renamed from: b */
    private final C5582g f22733b;

    /* renamed from: c */
    private final int f22734c;

    /* renamed from: d */
    private final C5220b f22735d;

    /* renamed from: e */
    private HttpURLConnection f22736e;

    /* renamed from: f */
    private InputStream f22737f;

    /* renamed from: g */
    private volatile boolean f22738g;

    /* renamed from: e2.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C5219a implements C5220b {
        C5219a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo21456a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: e2.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C5220b {
        /* renamed from: a */
        HttpURLConnection mo21456a(URL url) throws IOException;
    }

    public C5218j(C5582g gVar, int i) {
        this(gVar, i, f22732h);
    }

    /* renamed from: c */
    private InputStream m23674c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f22737f = C0056c.m223d(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f22737f = httpURLConnection.getInputStream();
        }
        return this.f22737f;
    }

    /* renamed from: f */
    private static boolean m23675f(int i) {
        return i / 100 == 2;
    }

    /* renamed from: g */
    private static boolean m23676g(int i) {
        return i / 100 == 3;
    }

    /* renamed from: h */
    private InputStream m23677h(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C5158e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f22736e = this.f22735d.mo21456a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f22736e.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f22736e.setConnectTimeout(this.f22734c);
            this.f22736e.setReadTimeout(this.f22734c);
            this.f22736e.setUseCaches(false);
            this.f22736e.setDoInput(true);
            this.f22736e.setInstanceFollowRedirects(false);
            this.f22736e.connect();
            this.f22737f = this.f22736e.getInputStream();
            if (this.f22738g) {
                return null;
            }
            int responseCode = this.f22736e.getResponseCode();
            if (m23675f(responseCode)) {
                return m23674c(this.f22736e);
            }
            if (m23676g(responseCode)) {
                String headerField = this.f22736e.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo21427b();
                    return m23677h(url3, i + 1, url, map);
                }
                throw new C5158e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new C5158e(responseCode);
            } else {
                throw new C5158e(this.f22736e.getResponseMessage(), responseCode);
            }
        } else {
            throw new C5158e("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    public Class<InputStream> mo21422a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo21427b() {
        InputStream inputStream = this.f22737f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f22736e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f22736e = null;
    }

    public void cancel() {
        this.f22738g = true;
    }

    /* renamed from: d */
    public C5154a mo21430d() {
        return C5154a.REMOTE;
    }

    /* renamed from: e */
    public void mo21431e(C3325f fVar, C5208d.C5209a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C0061f.m231b();
        try {
            aVar.mo21439f(m23677h(this.f22733b.mo22144h(), 0, (URL) null, this.f22733b.mo22143e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C0061f.m230a(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo21438c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C0061f.m230a(b));
            }
            throw th;
        }
    }

    C5218j(C5582g gVar, int i, C5220b bVar) {
        this.f22733b = gVar;
        this.f22734c = i;
        this.f22735d = bVar;
    }
}
