package p098j3;

import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3420m;
import com.facebook.internal.C3481f0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p072e3.C5237f;
import p088h3.C5410b;

/* renamed from: j3.f */
/* compiled from: ViewOnClickListener */
public final class C5518f implements View.OnClickListener {

    /* renamed from: f */
    private static final String f23948f = C5518f.class.getCanonicalName();

    /* renamed from: g */
    private static final Set<Integer> f23949g = new HashSet();

    /* renamed from: b */
    private View.OnClickListener f23950b;

    /* renamed from: c */
    private WeakReference<View> f23951c;

    /* renamed from: d */
    private WeakReference<View> f23952d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f23953e;

    /* renamed from: j3.f$a */
    /* compiled from: ViewOnClickListener */
    static class C5519a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f23954b;

        /* renamed from: c */
        final /* synthetic */ String f23955c;

        C5519a(String str, String str2) {
            this.f23954b = str;
            this.f23955c = str2;
        }

        public void run() {
            C5518f.m24607f(this.f23954b, this.f23955c, new float[0]);
        }
    }

    /* renamed from: j3.f$b */
    /* compiled from: ViewOnClickListener */
    class C5520b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ JSONObject f23956b;

        /* renamed from: c */
        final /* synthetic */ String f23957c;

        /* renamed from: d */
        final /* synthetic */ String f23958d;

        C5520b(JSONObject jSONObject, String str, String str2) {
            this.f23956b = jSONObject;
            this.f23957c = str;
            this.f23958d = str2;
        }

        public void run() {
            String q;
            try {
                String lowerCase = C3481f0.m11650r(C3642m.m12279e()).toLowerCase();
                float[] a = C5512a.m24568a(this.f23956b, lowerCase);
                String c = C5512a.m24570c(this.f23957c, C5518f.this.f23953e, lowerCase);
                if (a != null && (q = C5410b.m24351q("SUGGEST_EVENT", a, c)) != null) {
                    C5513b.m24582a(this.f23958d, q);
                    if (!q.equals("other")) {
                        C5518f.m24607f(q, this.f23957c, a);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private C5518f(View view, View view2, String str) {
        this.f23950b = C5237f.m23738f(view);
        this.f23952d = new WeakReference<>(view);
        this.f23951c = new WeakReference<>(view2);
        this.f23953e = str.toLowerCase().replace("activity", "");
    }

    /* renamed from: c */
    static void m24604c(View view, View view2, String str) {
        int hashCode = view.hashCode();
        Set<Integer> set = f23949g;
        if (!set.contains(Integer.valueOf(hashCode))) {
            C5237f.m23749q(view, new C5518f(view, view2, str));
            set.add(Integer.valueOf(hashCode));
        }
    }

    /* renamed from: d */
    private void m24605d(String str, String str2, JSONObject jSONObject) {
        C3481f0.m11637k0(new C5520b(jSONObject, str2, str));
    }

    /* renamed from: e */
    private void m24606e() {
        View view = (View) this.f23951c.get();
        View view2 = (View) this.f23952d.get();
        if (view != null && view2 != null) {
            try {
                String b = C5513b.m24583b(view2);
                if (b != null) {
                    String j = C5237f.m23742j(view2);
                    if (!m24608g(b, j)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("view", C5514c.m24587b(view, view2));
                        jSONObject.put("screenname", this.f23953e);
                        m24605d(b, j, jSONObject);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m24607f(String str, String str2, float[] fArr) {
        if (C5515d.m24592d(str)) {
            new C3420m(C3642m.m12279e()).mo11846g(str, str2);
        } else if (C5515d.m24591c(str)) {
            m24609h(str, str2, fArr);
        }
    }

    /* renamed from: g */
    private static boolean m24608g(String str, String str2) {
        String d = C5513b.m24585d(str);
        if (d == null) {
            return false;
        }
        if (d.equals("other")) {
            return true;
        }
        C3481f0.m11637k0(new C5519a(d, str2));
        return true;
    }

    /* renamed from: h */
    private static void m24609h(String str, String str2, float[] fArr) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("event_name", str);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            for (float append : fArr) {
                sb.append(append);
                sb.append(",");
            }
            jSONObject.put("dense", sb.toString());
            jSONObject.put("button_text", str2);
            bundle.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
            GraphRequest L = GraphRequest.m11254L((AccessToken) null, String.format(Locale.US, "%s/suggested_events", new Object[]{C3642m.m12280f()}), (JSONObject) null, (GraphRequest.C3360f) null);
            L.mo11246a0(bundle);
            L.mo11250g();
        } catch (JSONException unused) {
        }
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f23950b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        m24606e();
    }
}
