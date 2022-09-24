package p267y6;

import java.util.Arrays;
import java.util.List;

/* renamed from: y6.r */
/* compiled from: DependencyCycleException */
public class C11134r extends C11135s {

    /* renamed from: b */
    private final List<C11114d<?>> f50124b;

    public C11134r(List<C11114d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f50124b = list;
    }
}
