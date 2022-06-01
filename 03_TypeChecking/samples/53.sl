# include

class Sample {
    public initialize() {
        print(true)
    }
    private int x
    private bool y
}

class Main {
    public initialize() {
        int[12] a
        Set<int> ss, ss2
        fptr<int, bool->int> f
        int x, i, j
        bool t
        Sample s
        ss = Set.new()
        x = ss.include(2)
        x = ss.include(t)
        t = ss.include(x)
        t = ss.include(a)
        t = ss.include(a[x])
        t = ss.include(f)
        t = ss.include(f(1,true))
        t = ss.include(s)
        t = ss.include(s.x)
        t = ss.include(s.y)
        t = ss.include(Sample.new())
        t = ss.include(Set.new())
        t = ss.include(ss2)
        t = ss.include(i+j*x)
    }
}

