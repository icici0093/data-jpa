package study.data_spa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.data_spa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
