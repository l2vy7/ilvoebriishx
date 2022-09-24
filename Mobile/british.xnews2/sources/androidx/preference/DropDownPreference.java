package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: T */
    private final Context f4678T;

    /* renamed from: U */
    private final ArrayAdapter f4679U;

    /* renamed from: V */
    private Spinner f4680V;

    /* renamed from: W */
    private final AdapterView.OnItemSelectedListener f4681W;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C1045a implements AdapterView.OnItemSelectedListener {
        C1045a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo4866T()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo4867U()) && DropDownPreference.this.mo4890a(charSequence)) {
                    DropDownPreference.this.mo4868W(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1070c.f4776c);
    }

    /* renamed from: Z */
    private void m5355Z() {
        this.f4679U.clear();
        if (mo4864R() != null) {
            for (CharSequence charSequence : mo4864R()) {
                this.f4679U.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo4849A() {
        super.mo4849A();
        ArrayAdapter arrayAdapter = this.f4679U;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4848C() {
        this.f4680V.performClick();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public ArrayAdapter mo4850Y() {
        return new ArrayAdapter(this.f4678T, 17367049);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4681W = new C1045a();
        this.f4678T = context;
        this.f4679U = mo4850Y();
        m5355Z();
    }
}
