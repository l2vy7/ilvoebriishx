package p098j3;

import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p072e3.C5237f;

/* renamed from: j3.c */
/* compiled from: SuggestedEventViewHierarchy */
class C5514c {

    /* renamed from: a */
    private static final List<Class<? extends View>> f23938a = new ArrayList(Arrays.asList(new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class}));

    /* renamed from: a */
    static List<View> m24586a(View view) {
        ArrayList arrayList = new ArrayList();
        for (Class<? extends View> isInstance : f23938a) {
            if (isInstance.isInstance(view)) {
                return arrayList;
            }
        }
        if (view.isClickable()) {
            arrayList.add(view);
        }
        for (View a : C5237f.m23734b(view)) {
            arrayList.addAll(m24586a(a));
        }
        return arrayList;
    }

    /* renamed from: b */
    static JSONObject m24587b(View view, View view2) {
        JSONObject jSONObject = new JSONObject();
        if (view == view2) {
            try {
                jSONObject.put("is_interacted", true);
            } catch (JSONException unused) {
            }
        }
        m24588c(view, jSONObject);
        JSONArray jSONArray = new JSONArray();
        List<View> b = C5237f.m23734b(view);
        for (int i = 0; i < b.size(); i++) {
            jSONArray.put(m24587b(b.get(i), view2));
        }
        jSONObject.put("childviews", jSONArray);
        return jSONObject;
    }

    /* renamed from: c */
    static void m24588c(View view, JSONObject jSONObject) {
        try {
            String j = C5237f.m23742j(view);
            String h = C5237f.m23740h(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", C5237f.m23735c(view));
            if (!j.isEmpty()) {
                jSONObject.put("text", j);
            }
            if (!h.isEmpty()) {
                jSONObject.put("hint", h);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        }
    }
}
