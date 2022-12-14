package com.bitcamp.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bitcamp.board.domain.Member;
import com.bitcamp.board.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {

  MemberService memberService;

  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("form")
  public String form(HttpServletRequest req, HttpServletResponse resp) throws Exception {
    return "/member/form.jsp";
  }

  @PostMapping("add")
  public String add(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Member member = new Member();
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));

    memberService.add(member);

    return "redirect:list";

  }

  @GetMapping("list")
  public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setAttribute("members", memberService.list());
    return "/member/list.jsp";
  }

  @GetMapping("detail")
  public String detail(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int no = Integer.parseInt(request.getParameter("no"));
    Member member = memberService.get(no);

    if (member == null) {
      throw new Exception("해당 번호의 회원이 없습니다.");
    }

    request.setAttribute("member", member);
    return "/member/detail.jsp";

  }

  @PostMapping("update")
  public String update(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Member member = new Member();
    member.setNo(Integer.parseInt(request.getParameter("no")));
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));

    if (!memberService.update(member)) {
      throw new Exception("회원 변경 오류입니다!");
    }

    return "redirect:list";

  }

  @GetMapping("delete")
  public String delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int no = Integer.parseInt(request.getParameter("no"));

    if (!memberService.delete(no)) {
      throw new Exception("회원 삭제 오류입니다!");
    }

    return "redirect:list";

  }

}






