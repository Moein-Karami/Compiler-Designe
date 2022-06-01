int x
class Student {
    private int a
    private int id
    private Course[10] courses
    private int course_num
    public initialize(int id) {
        Set <int> s;
        self.course_num = 0
        self.id = id
        x1 = 5
    }

    public void voidTmp(int id, Student s) {
        return
        return 0
    }
    public int intTmp(int id, bool cond) {
        return
    }
    public Main mainTmp(int id, Main m) {
        return 0
    }


    public bool coursePassed(int id) {
    Course c
    int i
    int[3] j
    Main[3] mainArr
    C[3] cArr
    Set <int> s;


    # For declaration errors
    fptr <int -> bool> fp
    C c1
    Main main


    #For err9
    int[0] aa
    int[0][1][2][3] aa
    int[1][0][2][3] aa
    int[1][2][0][3] aa


    #For initialization
    fp = self.coursePassed
    # For err1
    x1 = 2
    x = x1.x2
    x = x1+2
    x = x1+x2
    x = x1[10]
    x = x1[x2]
    print(x1)
    print(x1.x2)
    x = self.x1

    self.coursePassed(x1)
    self.coursePassed(self.x1)
    self.coursePassed(x2.x1)
    self.x1()
    self.x1(1)
    self.x1(x1)
    s = Set.new()
    s = Set.new((true))
    s = S.new(x1)
    s = s.new(x1)
    s = s.merge(x1)
    x = s.delete(x1)

    x = x1.include(1)
    x = s.include(x1)
    x = false
    s = x1.merge(s)
    x = x1.delete(11)
    x = x1.include(12)
    x1.each do |i1|{
    }
    x1.each do |i|{
    }
    x1.each do |x1|{
    }
    (1..2).each do |i|{
    }
    (1..x1).each do |i|{
    }
    (x2..x1).each do |i|{
    }
    self.x1.each do |i|{
    }
    self.x1.each do |j|{
    }
    if(x1*2*3*4+5){
        x1.each do |i|{
        }
    }

    x()
    x(1,2,3,4)

    v++ = 2


    #For err2
    x = c1.new()
    x = C.new()
    x = C.aa()
    x = C.aa
    x = C.aa.bb.cc()
    print(C.a)
    print(C)
    print(C.ab())
    print(C.new())

    #For err3
    x = self.ab
    x = self.ab()
    x = self.ab.ac
    x = self.ab.ac()
    x = self.ab(v1,v2,2)
    x = c1.ab
    x = main.ab

    #For err4 and err5
    #Using instance c1 of undefined class C
    x = 1 > c1
    x = 1 == c1
    x = c1++
    x = c1 && true
    x = c1 && 1
    x = 2 && 1
    x = !c1
    x = c1 ? 1 : 1 ? 2 : 3;
    x = c1 ? 1 : 1 ? 2 : 3;
    x = c1 ? 1 : 0;
    x = 0 ? 2 : 3;
    x = false ? 2 : 3;
    if (c1){
    }
    if (1){
    }
    if (true){
    }elsif(c1){
    }
    if (false && true || c1){
    }
    a = c1 == j



    #Using instance main of undefined class Main
    x = 1 > main
    x = 1 == main
    x = main++
    x = main--
    x = main && 1
    x = !main
    x = main ? 1 : 1 ? 2 : 3;
    x = main ? 1 : 0;
    if (main){
        x = !main
    }
    if (true){
        x = !main
        x = main ? 1 : 0;
    }elsif(main){
        x = 2
        x = 1 == main
        x = main++
    }
    a = main == j

    if (false && true || main){
        x = 1 == main
    }

    if (false && true || ((((((((main))))))))){
            x = 1 == main
            x = 1
            main = main
            x = main
    }

    x = (main) * (((((main.ac).av))).y)
    x = (main) / (((((main.ac).av))).y)
    x = (main) = (((((main.ac).av))).y)
    x = (main) = c1.ab
    x = (main) - (((((main.ac).av))).y)
    x = (main) + (((((main.ac).av))).y)
    x = (main) * (((((main.ac).av))).y)++
    x = (main) * main++
    x = (main) * (((((main.ac).av))).y)--

    print(main.ac--)
    x = (main) * (((((main.ac).av))).y ? 1 : 2)
    x = (4) * (((((main.ac).av))).y ? 1 : 2)


    #For err6
    2*3 = 4
    main * 2 = 4
    c1 * 2 = 4
    x * 2 = 4
    c1++ = 4
    x++ = 2

    # erroneous
        # true ? 1 : 4 = 45
        #(main.self) = 1



    #For err7
    x = x++
    x = (1*2)++
    x = (1)++
    x = (main)++
    x = (-10*1)++
    x = (main.x)++
    x = main.x++
    x = main.a++
    x = (((((main.a)))))++
    x = self.a++


    #For err8
    self.coursePassed()
    self.coursePassed(1)
    fp(1)
    fp(1,2,3,4)
    self.fp(1,2,3,4)

    #For err9
    print(12)
    print(x)
    print(c1)
    print(main)
    print(j)
    print(main.x)
    print(main.c1)
    print(main.a)
    print(false)


    #For err10 and err11
    x = self.voidTmp(1)
    x = self.mainTmp(1)
    x = self.mainTmp(1, 0)
    x = self.voidTmp(x)
    x = self.mainTmp(x)
    x = self.voidTmp(x1)
    x = self.mainTmp(x1)
    x = self.voidTmp(main)

    print(self.voidTmp(x))
    print(self.mainTmp(x))
    print(self.mainTmp(x, 0))

    print(self.voidTmp(x1))
    print(self.mainTmp(x1))

    x = self.voidTmp(x1) > 2
    x = self.mainTmp(x1) > 2
    x = self.intTmp(x1) > 2

    if (self.voidTmp(x) > self.voidTmp(x1)){
        x = self.voidTmp(main)
        x = self.voidTmp(c1)
    }
    if (self.voidTmp(x) > self.mainTmp(x1)){
            x = self.voidTmp(main)
            x = self.voidTmp(c1)
    }
    if (self.voidTmp(x) > self.mainTmp(x, 0)){
                x = self.voidTmp(main)
                x = self.voidTmp(c1)
        }
    if (self.intTmp(x) > self.intTmp(x1)){
                x = self.voidTmp(main)
                x = self.voidTmp(c1)
    }
    if (self.mainTmp(x) > self.mainTmp(x1)){
                    x = self.voidTmp(main)
                    x = self.voidTmp(c1)
    }
    x = self.voidTmp(main) ? 1 : 2;
    x = self.mainTmp(main) ? 1 : 2;
    x = self.intTmp(main) ? 1 : 2;

    x = self.voidTmp(main) ? 1 : false;
    x = self.mainTmp(main) ? 1 : false;
    x = self.intTmp(main) ? 1 : false;

    x = self.voidTmp(c1) ? 1 : 2;
    x = self.mainTmp(c1) ? 1 : 2;
    x = self.intTmp(c1) ? 1 : 2;

    x = self.voidTmp(c1) ? 1 : true;
    x = self.mainTmp(c1) ? 1 : true;
    x = self.intTmp(c1) ? 1 : true;

    x = (self.voidTmp(c1)>1) || (self.voidTmp(c1)<1) || (self.voidTmp(c1)==1) || (self.voidTmp(c1)&&1) || (self.voidTmp(c1)||1) || (self.voidTmp(c1)?1:2)

    #For err13
    self.voidTmp(1)
    self.voidTmp(false)

    self.mainTmp(1)
    self.mainTmp(false)
    self.mainTmp(false, false)
    self.mainTmp(false, Set.new())
    self.mainTmp(Set.new(), Set.new())
    self.mainTmp(1, 0)
    self.mainTmp(false, 0)
    self.mainTmp(false, 0)

    self.intTmp(0, 1)
    self.intTmp(0, false)
    self.intTmp(false, 0)
    self.intTmp(false, false)
    self.intTmp(false, 0)
    self.intTmp(0, 0)
    self.intTmp(0, Set.new())
    self.intTmp(Set.new(), Set.new())

    #For err14
    self.initialize(main)
    self.initialize(c1)
    self.initialize(main.a)
    self.initialize(main.x)
    self.initialize(main.x1)
    self.initialize(x1)
    self.initialize(x)

    #For err15
    self.x.each do |i|{
    }
    self.x1.each do |i|{
    }
    x.each do |i|{
    }
    x1.each do |i|{
    }
    j.each do |i|{
    }
    main.each do |i|{
    }
    c1.each do |i|{
    }
    =begin
    self.initialize.each do |i|{
    }
    =end
    fp.each do |i|{
    }
    self.fp.each do |i|{
    }
    Set.new().each do |i|{
    }
    Set.new((1,2,3,4,55)).each do |i|{
    }
    (1..2).each do |i|{
    }


    #For err16
    (main..c1).each do |i|{
    }
    (1..c1).each do |i|{
    }
    (true..false).each do |i|{
    }
    (c1..false).each do |i|{
    }
    (c1..x1).each do |i|{
    }
    (x1..c1).each do |i|{
    }
    (main..x1).each do |i|{
    }
    (main..x).each do |i|{
    }
    (fp..10).each do |i|{
    }
    (false..fp).each do |i|{
    }
    (10..fp).each do |i|{
    }
    (fp..Set.new()).each do |i|{
    }
    (Set.new()..fp).each do |i|{
    }


    #For err17
    (1..2).each do |i|{
    }
    (1..2).each do |x|{
    }
    (1..2).each do |x1|{
    }
    (1..2).each do |main|{
    }

    j.each do |i|{
    }
    j.each do |x|{
    }
    j.each do |x1|{
    }
    j.each do |main|{
    }

    j.each do |i|{
    }
    j.each do |x|{
    }
    j.each do |x1|{
    }
    j.each do |main|{
    }

    mainArr.each do |i|{
    }
    mainArr.each do |x|{
    }
    mainArr.each do |x1|{
    }
    mainArr.each do |main|{
    }

    cArr.each do |i|{
    }
    cArr.each do |x|{
    }
    cArr.each do |x1|{
    }
    cArr.each do |main|{
    }

    #For err18
    x = x.a
    x = main.a
    x = c1.a
    x = x1.a

    #For err19 and err20
    x = x[a]
    x = x[x]
    x = x[c1]
    x = x[main]
    x = x[j]
    x = x[fp]
    x = main[a]
    x = main[x]
    x = main[c1]
    x = main[main]
    x = main[j]
    x = main[fp]
    x = c1[a]
    x = c1[x]
    x = c1[c1]
    x = c1[main]
    x = c1[j]
    x = c1[fp]
    x = x1[a]
    x = x1[x]
    x = x1[c1]
    x = x1[main]
    x = x1[j]
    x = x1[fp]


    #For err21
    s.merge(Set.new())
    x.merge(Set.new())
    main.merge(Set.new())
    Set.new().merge(Set.new())
    s.merge(x)
    x.merge(x)
    main.merge(x)
    Set.new().merge(x)
    fp.merge(x)
    s.merge(x1)
    x.merge(x1)
    main.merge(x1)
    Set.new().merge(x1)
    fp.merge(x1)
    s.merge(c1)
    x.merge(c1)
    main.merge(c1)
    Set.new().merge(c1)
    fp.merge(c1)
    s.merge(main)
    x.merge(main)
    main.merge(main)
    Set.new().merge(main)
    s.merge(fp)
    x.merge(fp)
    main.merge(fp)
    Set.new().merge(fp)
    Set.new().merge(s)
    fp.merge(fp)


    #For err22
    x = Set.new()
    x = Set.new((Set.new(), 1))
    x = Set.new((Set.new(), s))
    x = Set.new((Set.new(), x1))
    x = Set.new((Set.new(), c1))
    x = Set.new((Set.new(), main))
    x = Set.new((s, 1))
    x = Set.new((s, s))
    x = Set.new((s, x1))
    x = Set.new((s, c1))
    x = Set.new((s, main))
    x = Set.new((main, 1))
    x = Set.new((main, s))
    x = Set.new((main, x1))
    x = Set.new((main, c1))
    x = Set.new((main, main))
    x = Set.new((fp, 1))
    x = Set.new((fp, s))
    x = Set.new((fp, x1))
    x = Set.new((fp, c1))
    x = Set.new((fp, main))
    x = Set.new((c1, 1))
    x = Set.new((c1, s))
    x = Set.new((c1, x1))
    x = Set.new((c1, c1))
    x = Set.new((c1, main))
    x = Set.new((x, 1))
    x = Set.new((x, s))
    x = Set.new((x, x1))
    x = Set.new((x, c1))
    x = Set.new((x, main))
    x = Set.new((x1, 1))
    x = Set.new((x1, s))
    x = Set.new((x1, x1))
    x = Set.new((x1, c1))
    x = Set.new((x1, main))
    x = Set.new((self.x.x.x.y, 1))
    x = Set.new((self.x.x.x.y, s))
    x = Set.new((self.x.x.x.y, x1))
    x = Set.new((self.x.x.x.y, c1))
    x = Set.new((self.x.x.x.y, main))

    #For err23
    ss.add(1)
    ss.add(false)
    ss.add(Set.new())
    s.add(s)
    s.add(main)
    s.add(fp)
    s.add(c1)
    s.add(x)
    s.add(x1)
    s.add(self.x.x.x.y)

    #For err24
    x = s.include(1)
    x = s.include(false)
    x = s.include(Set.new())
    x = s.include(s)
    x = s.include(main)
    x = s.include(fp)
    x = s.include(c1)
    x = s.include(x)
    x = s.include(x1)
    x = s.include(self.x.x.x.y)













    x.each do |c|
        if c.getId() == id
            if c.getGrade() > 10
                return true
            else
                return false
    self.courses.each do |id|
        return 0
    return 1
}

public void addCourse(int id, int grade) {
    Course newCourse
    newCourse = Course.new(id)
    self.courses[self.course_num] = newCourse
    }
}
class Course < Main {
    private int grade
    private int id
    public initialize(int id, int grade) {
        self.id = id
        self.grade = grade
    }
    public int getGrade()
        return self.grade
    public int getId()
        return self.id
}
class Main{
    private int a
    public Set <int> ss
    public int a
    public initialize() {
        Student s
        x = 1 + true
        self.ss = Set.new((true,2,3))
        s = Student.new(810198433)
        s.addCourse(810110, 15)
        s.addCourse(810114, 9)
        s.addCourse(810134, 14)
        print(s.coursePassed(810114))
    }
}
