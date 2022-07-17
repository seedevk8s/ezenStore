package kr.co.ezenStore.member.dao;

import org.springframework.dao.DataAccessException;

public interface MemberDAO {

	public String selectDuplicatecheck(String id) throws DataAccessException;

}
