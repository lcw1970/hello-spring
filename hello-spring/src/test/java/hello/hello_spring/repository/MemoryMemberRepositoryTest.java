package hello.hello_spring.repository;

import org.junit.jupiter.api.Test;

import hello.hello_spring.domain.Member;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        System.out.println("result = "+(result == member));
    }
}
