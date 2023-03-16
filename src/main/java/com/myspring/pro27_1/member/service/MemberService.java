package com.myspring.pro27_1.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro27_1.member.vo.MemberVO;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 public int addMember(MemberVO membeVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	 public int updateMember(MemberVO membeVO) throws DataAccessException;
}
