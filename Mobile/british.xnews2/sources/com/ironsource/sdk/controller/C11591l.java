package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p293g.C11709e;
import com.ironsource.sdk.p294h.C11712b;
import com.ironsource.sdk.p294h.C11715c;
import com.ironsource.sdk.p298k.C11736c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
final class C11591l {

    /* renamed from: a */
    String f52047a;

    /* renamed from: b */
    C11712b f52048b;

    /* renamed from: com.ironsource.sdk.controller.l$a */
    class C11592a implements C11736c {

        /* renamed from: b */
        private /* synthetic */ C11595o f52049b;

        /* renamed from: c */
        private /* synthetic */ C11594n f52050c;

        C11592a(C11595o oVar, C11594n nVar) {
            this.f52049b = oVar;
            this.f52050c = nVar;
        }

        /* renamed from: a */
        public final void mo44759a(C11715c cVar) {
            try {
                C11595o oVar = this.f52049b;
                C11594n nVar = this.f52050c;
                oVar.mo44762a(nVar, C11591l.m51512d(nVar, cVar.mo45026a()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public final void mo44760a(C11715c cVar, C11709e eVar) {
            try {
                C11595o oVar = this.f52049b;
                C11594n nVar = this.f52050c;
                oVar.mo44763b(nVar, C11591l.m51511c(nVar, eVar.f52425a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    C11591l(String str, C11712b bVar) {
        this.f52047a = str;
        this.f52048b = bVar;
    }

    /* renamed from: a */
    static C11715c m51509a(JSONObject jSONObject, String str) {
        if (!jSONObject.has("filePath") || !jSONObject.has("fileName")) {
            throw new Exception("Missing params for file");
        }
        String string = jSONObject.getString("filePath");
        return new C11715c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    /* renamed from: b */
    static JSONObject m51510b(C11594n nVar, long j) {
        try {
            return nVar.mo44761a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: c */
    static JSONObject m51511c(C11594n nVar, String str) {
        try {
            return nVar.mo44761a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: d */
    static JSONObject m51512d(C11594n nVar, JSONObject jSONObject) {
        try {
            return nVar.mo44761a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: e */
    static C11715c m51513e(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new C11715c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
