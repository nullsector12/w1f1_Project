package wifi.ksy.solo.dao;

import wifi.ksy.solo.model.Member;

public interface MemberDao {
	
	public int insertMember(Member member);
	
	public Member selectByMidx(int midx);
	
	public Member selectById(String id);
	
	public int selectByName(String name);

	
	
}
