package p165w;

import java.util.ArrayList;
import p160v.C6212c;

/* renamed from: w.m */
/* compiled from: WidgetContainer */
public class C6258m extends C6246e {

    /* renamed from: G0 */
    public ArrayList<C6246e> f25907G0 = new ArrayList<>();

    /* renamed from: L0 */
    public ArrayList<C6246e> mo23941L0() {
        return this.f25907G0;
    }

    /* renamed from: M0 */
    public void mo23861M0() {
        ArrayList<C6246e> arrayList = this.f25907G0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C6246e eVar = this.f25907G0.get(i);
                if (eVar instanceof C6258m) {
                    ((C6258m) eVar).mo23861M0();
                }
            }
        }
    }

    /* renamed from: N0 */
    public void mo23942N0(C6246e eVar) {
        this.f25907G0.remove(eVar);
        eVar.mo23856x0((C6246e) null);
    }

    /* renamed from: O0 */
    public void mo23943O0() {
        this.f25907G0.clear();
    }

    /* renamed from: Z */
    public void mo23816Z() {
        this.f25907G0.clear();
        super.mo23816Z();
    }

    /* renamed from: b0 */
    public void mo23818b0(C6212c cVar) {
        super.mo23818b0(cVar);
        int size = this.f25907G0.size();
        for (int i = 0; i < size; i++) {
            this.f25907G0.get(i).mo23818b0(cVar);
        }
    }

    /* renamed from: c */
    public void mo23944c(C6246e eVar) {
        this.f25907G0.add(eVar);
        if (eVar.mo23795H() != null) {
            ((C6258m) eVar.mo23795H()).mo23942N0(eVar);
        }
        eVar.mo23856x0(this);
    }
}
