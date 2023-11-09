package Hello.core;

import Hello.core.member.*;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImp();
        Member member = new Member(1L, "memberA", Grade.VIP);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member + " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
