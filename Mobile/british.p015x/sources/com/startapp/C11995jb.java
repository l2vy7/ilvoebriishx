package com.startapp;

import com.startapp.common.parser.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.jb */
/* compiled from: Sta */
public abstract class C11995jb<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "jb";
    private final Class<T> itemClass;

    /* renamed from: com.startapp.jb$a */
    /* compiled from: Sta */
    public class C11996a implements C12442y2<Integer, JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ Object f53178a;

        public C11996a(C11995jb jbVar, Object obj) {
            this.f53178a = obj;
        }

        /* renamed from: a */
        public Object mo45478a(Object obj) {
            try {
                return ((JSONArray) this.f53178a).getJSONObject(((Integer) obj).intValue());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.startapp.jb$b */
    /* compiled from: Sta */
    public class C11997b implements C12442y2<Integer, JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ Object f53179a;

        public C11997b(C11995jb jbVar, Object obj) {
            this.f53179a = obj;
        }

        /* renamed from: a */
        public Object mo45478a(Object obj) {
            try {
                return ((JSONObject) this.f53179a).getJSONObject(((Integer) obj).toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public C11995jb(Class<T> cls) {
        this.itemClass = cls;
    }

    public List<T> parse(Class<List<T>> cls, Object obj) {
        int i;
        C12442y2 y2Var;
        if (obj instanceof JSONArray) {
            i = ((JSONArray) obj).length();
            y2Var = new C11996a(this, obj);
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            i = ((JSONObject) obj).length();
            y2Var = new C11997b(this, obj);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(C11821c5.m52101a(this.itemClass, (JSONObject) y2Var.mo45478a(Integer.valueOf(i2))));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
