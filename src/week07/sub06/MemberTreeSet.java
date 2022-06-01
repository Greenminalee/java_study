package week07.sub06;


import java.util.TreeSet;


public class MemberTreeSet {
    TreeSet<Member> treeSet;

    MemberTreeSet()
    {
        treeSet = new TreeSet<>();
    }
    void addMember(Member m) {
        treeSet.add(m);
    }

    void showAllMember() {
        for (Member m : treeSet)
            System.out.println(m);
        System.out.println();
    }

}
