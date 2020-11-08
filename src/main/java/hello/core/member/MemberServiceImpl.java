package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 추상체(인터페이스), 구현체에 모두 의존한다. bad
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}