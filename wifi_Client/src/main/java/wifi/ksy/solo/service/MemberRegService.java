package wifi.ksy.solo.service;


import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wifi.ksy.solo.dao.MemberDao;
import wifi.ksy.solo.model.Member;
import wifi.ksy.solo.model.MemberRegRequest;


@Service
public class MemberRegService {

	private MemberDao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
	
	public String memberReg(
			MemberRegRequest regRequest,
			HttpServletRequest request
			) {
		
		int result = 0;
		String regResult = "";
		
		dao = template.getMapper(MemberDao.class);
				
		Member member = regRequest.toMember();
		
		result = dao.insertMember(member);
		
		if(result != 0) {
			
			// 회원가입 성공 시
			regResult = "<script>" + "alert('가입이 완료되었습니다.');" + "location.href=\"/login/member/loginForm\"</script>";
		} else {
			
			// 회원가입 실패 시
			regResult = "<script>" + "alert('가입에 실패했습니다.');" + "history.go(-1);" + "</script>";
		}
		
		System.out.println(member);
		
		return regResult; 
	}
}
