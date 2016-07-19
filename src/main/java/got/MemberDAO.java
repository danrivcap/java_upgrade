package got;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by Ken Kousen on 7/18/16.
 */
public interface MemberDAO {
    Member findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAllByHouse(House house);
    Collection<Member> getAll();
}
