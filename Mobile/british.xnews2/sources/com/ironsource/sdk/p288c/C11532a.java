package com.ironsource.sdk.p288c;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.C11515a;
import com.ironsource.sdk.p287b.C11526b;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.a */
public final class C11532a extends FrameLayout implements C11541e {

    /* renamed from: a */
    public C11535c f51856a;

    /* renamed from: b */
    public boolean f51857b = false;

    /* renamed from: c */
    private Activity f51858c;

    /* renamed from: com.ironsource.sdk.c.a$a */
    class C11533a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f51859b;

        /* renamed from: c */
        private /* synthetic */ String f51860c;

        C11533a(String str, String str2) {
            this.f51859b = str;
            this.f51860c = str2;
        }

        public final void run() {
            C11532a aVar = C11532a.this;
            aVar.removeView(aVar.f51856a.f51869f);
            C11532a.this.f51856a.mo44622a(this.f51859b, this.f51860c);
            C11535c unused = C11532a.this.f51856a = null;
        }
    }

    public C11532a(C11535c cVar, Activity activity) {
        super(activity.getApplicationContext());
        C11515a aVar = cVar.f51867d;
        setLayoutParams(new FrameLayout.LayoutParams(aVar.f51790a, aVar.f51791b));
        this.f51858c = activity;
        this.f51856a = cVar;
        addView(cVar.f51869f);
    }

    /* renamed from: a */
    public final WebView mo44621a() {
        return this.f51856a.f51869f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44622a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.sdk.c.c r0 = r3.f51856a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            com.ironsource.sdk.b.b r1 = r0.f51866c     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x002c
            android.webkit.WebView r0 = r0.f51869f     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x000e
            goto L_0x002c
        L_0x000e:
            com.ironsource.sdk.b.a r0 = r1.f51835b     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0020
            com.ironsource.sdk.b.d r0 = r1.f51836c     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0017
            goto L_0x0020
        L_0x0017:
            org.json.JSONObject r0 = r1.mo44605a()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "containerWasRemoved"
            r1.mo44611a((java.lang.String) r2, (org.json.JSONObject) r0)     // Catch:{ all -> 0x002e }
        L_0x0020:
            android.app.Activity r0 = r3.f51858c     // Catch:{ all -> 0x002e }
            com.ironsource.sdk.c.a$a r1 = new com.ironsource.sdk.c.a$a     // Catch:{ all -> 0x002e }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x002e }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p288c.C11532a.mo44622a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo44623a(String str, String str2, String str3) {
        C11535c cVar = this.f51856a;
        if (cVar != null) {
            cVar.mo44623a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo44624a(JSONObject jSONObject, String str, String str2) {
        this.f51856a.mo44624a(jSONObject, str, str2);
    }

    /* renamed from: b */
    public final void mo44625b(JSONObject jSONObject, String str, String str2) {
        this.f51856a.mo44625b(jSONObject, str, str2);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.m51953i("IronSourceAdContainer", "onAttachedToWindow:");
        this.f51857b = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        String str;
        C11526b bVar;
        super.onDetachedFromWindow();
        Logger.m51953i("IronSourceAdContainer", "onDetachedFromWindow:");
        C11535c cVar = this.f51856a;
        if (cVar == null || (bVar = cVar.f51866c) == null) {
            str = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null";
        } else {
            this.f51857b = false;
            try {
                bVar.mo44611a("destroyBanner", new JSONObject().put("adViewId", this.f51856a.f51864a).put("isBNAutoRemove", true).put("isBannerDisplay", this.f51857b));
                return;
            } catch (Exception e) {
                str = e.toString();
            }
        }
        Logger.m51953i("IronSourceAdContainer", str);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        Logger.m51953i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        C11535c cVar = this.f51856a;
        if (cVar != null) {
            try {
                cVar.f51866c.mo44608a("isVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Logger.m51953i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        C11535c cVar = this.f51856a;
        if (cVar != null) {
            try {
                cVar.f51866c.mo44608a("isWindowVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
