package week07.sub07;

import java.util.HashSet;

public class MemberHashMap {
    HashSet<Member> hashSet;

    MemberHashMap()
    {
        hashSet = new HashSet<Member>();
    }
    void addMember(Member m) {
        hashSet.add(m);
    }

    void showAllMember() {
        for (Member m : hashSet)
            System.out.println(m);
        System.out.println();
    }

    void removeMember(int id)
    {
        for (Member m : hashSet)
        {
            if (m.getMemberId() == id)
                hashSet.remove(m);
        }
    }
}
