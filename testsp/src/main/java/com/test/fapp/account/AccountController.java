package com.test.fapp.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class AccountController {
	//입력되는 주송에 매칭이 되는 html 정보를 정의
	// html로 데이터 전송
	//
	@Autowired 
	AccountService accountService;
	
	@RequestMapping(value = "/accountXdmList")
	public String accountXdmList(Model model) {
		List<AccountDto> accountDtos = new ArrayList<>();

		accountDtos = accountService.selectList(); //이걸 return값으로 보내줘여함 아래 함수를 통해 보내
		
		model.addAttribute("list", accountDtos); //model이라는 객체에 에러가 뜸 이걸 고치기 위해서 
												//public String accountXdmList() 에 Model model를 넣어줌.
												//spring에서 model은 자바에 있는 데이터를 html에 전달하는역할(규칙)
												//  list 변수에  accountDtos을 담음
		return "account/accountXdmList";
	}	
	
	@RequestMapping(value = "/accountXdmView")
		public String accountXdmView(Model model, AccountDto accountDto) {
		
//		System.out.println("accountDto.getSeq():" + accountDto.getSeq()); 
		
		
		model.addAttribute("item", accountService.selectView(accountDto)); // 한개만 뽑으려고 하기때문에 list가 아니라item으로 
		return "account/test"; // item 값을 던져주는
	}
	
	@RequestMapping(value = "/accountXdmForm")
	public String accountXdmForm() {
			
		return "account/accountXdmForm"; // item 값을 던져주는
	}
	
	@RequestMapping(value = "/accountXdmInst")
	public String accountXdmInst(AccountDto accountDto) {
		
		System.out.println(accountDto.getSeq());
		
		accountService.insert(accountDto);
		System.out.println(accountDto.getSeq());
		return "redirect:/accountXdmList"; // item 값을 던져주는
	}
	
//	@RequestMapping(value ="accountXdmDelet")
//	public String requestMethodName(@RequestParam String param) {
////		accountService.delet();
//		return "redirect:/accountXdmList";
//	}
	
	
}
