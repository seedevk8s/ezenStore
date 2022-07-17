package kr.co.ezenStore.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.ezenStore.common.base.BaseController;
import kr.co.ezenStore.member.dto.MemberDTO;
import kr.co.ezenStore.member.service.MemberService;

@Controller("memberController")
@RequestMapping(value = "/member")
public class MemberControllerImpl extends BaseController implements MemberController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberDTO memberDTO;

	@Override
	@RequestMapping(value = "/duplicatecheck.do", method = RequestMethod.POST)
	public ResponseEntity<String> duplicatecheck(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String result = memberService.duplicatecheck(id);
		ResponseEntity<String> resEntity = new ResponseEntity<String>(result, HttpStatus.OK);
		return resEntity;
	}

	
	@Override
	@RequestMapping(value = "/addMember.do", method = RequestMethod.POST)
	public ResponseEntity<MemberDTO> addMember(@ModelAttribute("member") MemberDTO _memberDTO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
