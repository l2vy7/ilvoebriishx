package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.sdk.p293g.C11702c;
import com.ironsource.sdk.p293g.C11703d;
import com.ironsource.sdk.p296j.C11728e;
import com.ironsource.sdk.p296j.p297a.C11722b;
import com.ironsource.sdk.p296j.p297a.C11723c;
import com.ironsource.sdk.p296j.p297a.C11724d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.p */
public final class C11596p implements C11593m {

    /* renamed from: c */
    private static final Handler f52057c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public String f52058b = "";

    /* renamed from: com.ironsource.sdk.controller.p$a */
    class C11597a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11723c f52059b;

        /* renamed from: c */
        private /* synthetic */ C11702c f52060c;

        C11597a(C11723c cVar, C11702c cVar2) {
            this.f52059b = cVar;
            this.f52060c = cVar2;
        }

        public final void run() {
            this.f52059b.mo44938a(C11703d.C11708e.Interstitial, this.f52060c.f52387b, C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$b */
    class C11598b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11723c f52062b;

        /* renamed from: c */
        private /* synthetic */ String f52063c;

        C11598b(C11723c cVar, String str) {
            this.f52062b = cVar;
            this.f52063c = str;
        }

        public final void run() {
            this.f52062b.mo44957b(this.f52063c, C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$c */
    class C11599c implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11723c f52065b;

        /* renamed from: c */
        private /* synthetic */ C11702c f52066c;

        C11599c(C11723c cVar, C11702c cVar2) {
            this.f52065b = cVar;
            this.f52066c = cVar2;
        }

        public final void run() {
            this.f52065b.mo44957b(this.f52066c.f52387b, C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$d */
    class C11600d implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11557e f52068b;

        C11600d(C11557e eVar) {
            this.f52068b = eVar;
        }

        public final void run() {
            this.f52068b.mo44695b();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$e */
    class C11601e implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11723c f52070b;

        /* renamed from: c */
        private /* synthetic */ JSONObject f52071c;

        C11601e(C11723c cVar, JSONObject jSONObject) {
            this.f52070b = cVar;
            this.f52071c = jSONObject;
        }

        public final void run() {
            this.f52070b.mo44962c(this.f52071c.optString("demandSourceName"), C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$f */
    class C11602f implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11723c f52073b;

        /* renamed from: c */
        private /* synthetic */ C11702c f52074c;

        C11602f(C11723c cVar, C11702c cVar2) {
            this.f52073b = cVar;
            this.f52074c = cVar2;
        }

        public final void run() {
            this.f52073b.mo44962c(this.f52074c.f52387b, C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$g */
    class C11603g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11722b f52076b;

        /* renamed from: c */
        private /* synthetic */ Map f52077c;

        C11603g(C11722b bVar, Map map) {
            this.f52076b = bVar;
            this.f52077c = map;
        }

        public final void run() {
            this.f52076b.mo44966d((String) this.f52077c.get("demandSourceName"), C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$h */
    class C11604h implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11728e f52079b;

        C11604h(C11728e eVar) {
            this.f52079b = eVar;
        }

        public final void run() {
            this.f52079b.onOfferwallInitFail(C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$i */
    class C11605i implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11728e f52081b;

        C11605i(C11728e eVar) {
            this.f52081b = eVar;
        }

        public final void run() {
            this.f52081b.onOWShowFail(C11596p.this.f52058b);
            this.f52081b.onOfferwallInitFail(C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$j */
    class C11606j implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11728e f52083b;

        C11606j(C11728e eVar) {
            this.f52083b = eVar;
        }

        public final void run() {
            this.f52083b.onGetOWCreditsFailed(C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$k */
    class C11607k implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11724d f52085b;

        /* renamed from: c */
        private /* synthetic */ C11702c f52086c;

        C11607k(C11724d dVar, C11702c cVar) {
            this.f52085b = dVar;
            this.f52086c = cVar;
        }

        public final void run() {
            this.f52085b.mo44938a(C11703d.C11708e.RewardedVideo, this.f52086c.f52387b, C11596p.this.f52058b);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.p$l */
    class C11608l implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11724d f52088b;

        /* renamed from: c */
        private /* synthetic */ JSONObject f52089c;

        C11608l(C11724d dVar, JSONObject jSONObject) {
            this.f52088b = dVar;
            this.f52089c = jSONObject;
        }

        public final void run() {
            this.f52088b.mo44943a(this.f52089c.optString("demandSourceName"), C11596p.this.f52058b);
        }
    }

    C11596p(C11557e eVar) {
        f52057c.post(new C11600d(eVar));
    }

    /* renamed from: a */
    public final void mo44703a(Context context) {
    }

    /* renamed from: a */
    public final void mo44704a(C11702c cVar, Map<String, String> map, C11722b bVar) {
        if (bVar != null) {
            f52057c.post(new C11603g(bVar, map));
        }
    }

    /* renamed from: a */
    public final void mo44705a(C11702c cVar, Map<String, String> map, C11723c cVar2) {
        if (cVar2 != null) {
            f52057c.post(new C11599c(cVar2, cVar));
        }
    }

    /* renamed from: a */
    public final void mo44707a(String str, C11723c cVar) {
        if (cVar != null) {
            f52057c.post(new C11598b(cVar, str));
        }
    }

    /* renamed from: a */
    public final void mo44708a(String str, String str2, C11702c cVar, C11722b bVar) {
        if (bVar != null) {
            bVar.mo44938a(C11703d.C11708e.Banner, cVar.f52387b, this.f52058b);
        }
    }

    /* renamed from: a */
    public final void mo44709a(String str, String str2, C11702c cVar, C11723c cVar2) {
        if (cVar2 != null) {
            f52057c.post(new C11597a(cVar2, cVar));
        }
    }

    /* renamed from: a */
    public final void mo44710a(String str, String str2, C11702c cVar, C11724d dVar) {
        if (dVar != null) {
            f52057c.post(new C11607k(dVar, cVar));
        }
    }

    /* renamed from: a */
    public final void mo44711a(String str, String str2, C11728e eVar) {
        if (eVar != null) {
            f52057c.post(new C11606j(eVar));
        }
    }

    /* renamed from: a */
    public final void mo44712a(String str, String str2, Map<String, String> map, C11728e eVar) {
        if (eVar != null) {
            f52057c.post(new C11604h(eVar));
        }
    }

    /* renamed from: a */
    public final void mo44713a(Map<String, String> map, C11728e eVar) {
        if (eVar != null) {
            f52057c.post(new C11605i(eVar));
        }
    }

    /* renamed from: a */
    public final void mo44714a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public final void mo44715a(JSONObject jSONObject, C11723c cVar) {
        if (cVar != null) {
            f52057c.post(new C11601e(cVar, jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo44716a(JSONObject jSONObject, C11724d dVar) {
        if (dVar != null) {
            f52057c.post(new C11608l(dVar, jSONObject));
        }
    }

    /* renamed from: b */
    public final void mo44717b(Context context) {
    }

    /* renamed from: b */
    public final void mo44718b(C11702c cVar, Map<String, String> map, C11723c cVar2) {
        if (cVar2 != null) {
            f52057c.post(new C11602f(cVar2, cVar));
        }
    }

    /* renamed from: c */
    public final C11703d.C11706c mo44719c() {
        return C11703d.C11706c.Native;
    }

    /* renamed from: c */
    public final boolean mo44720c(String str) {
        return false;
    }

    /* renamed from: d */
    public final void mo44721d() {
    }

    public final void destroy() {
    }

    /* renamed from: e */
    public final void mo44723e() {
    }

    /* renamed from: f */
    public final void mo44724f() {
    }

    /* renamed from: g */
    public final void mo44725g() {
    }
}
