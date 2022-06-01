package week07.sub04;

import java.util.HashSet;

public class MemberHashSet {

    HashSet<Member> hashSet;

    MemberHashSet()
    {
        hashSet = new HashSet<>();
    }
    void addMember(Member m) {
        hashSet.add(m);
    }

    void showAllMember() {
        for (Member m : hashSet)
            System.out.println(m.getMemberName() + " 회원님의 아이디는 " + m.getMemberId() + "입니다");
        System.out.println();
    }

}
