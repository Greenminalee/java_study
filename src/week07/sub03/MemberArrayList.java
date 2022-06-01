package week07.sub03;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    ArrayList<Member> member;

    public MemberArrayList() {
        this.member = new ArrayList<Member>();
    }

    public ArrayList<Member> getMember() {
        return member;
    }

    public void setMember(ArrayList<Member> member) {
        this.member = member;
    }

    public void addMember(Member m){
        member.add(m);
    }

    public void showAllMember(){
        for (Member m : this.member)
            System.out.println(m.getMemberName() + " 회원님의 아이디는 " + m.getMemberId() + "입니다");
        System.out.println();
    }


    public boolean removeMember(int id){
        Iterator<Member> it = member.iterator();

        while(it.hasNext())
        {
            Member m = it.next();
            if (m.getMemberId() == id) {
                member.remove(m);
                return true;
            }
        }
//        for (int i = 0; i < member.size(); i++)
//        {
//            if (member.get(i).getMemberId() == id) {
//                member.remove(i);
//                return true;
//            }
//        }
        return false;
    }

}
