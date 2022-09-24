package p174x3;

/* renamed from: x3.b */
/* compiled from: Retries */
public final class C6391b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m28072a(int i, TInput tinput, C6390a<TInput, TResult, TException> aVar, C6392c<TInput, TResult> cVar) throws Throwable {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo16997a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo16997a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
