package defpackage;

/* compiled from: FeedFragment */
class hp$5 extends apj<ih$n> {
    final /* synthetic */ hp a;

    hp$5(hp this$0) {
        this.a = this$0;
    }

    public /* synthetic */ void onNext(Object obj) {
        a((ih$n) obj);
    }

    public void onCompleted() {
    }

    public void onError(Throwable e) {
        rb.a(e);
    }

    public void a(ih$n didJoinGroupFromFeed) {
        this.a.b.notifyDataSetChanged();
    }
}
