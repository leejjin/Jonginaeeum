package com.paper.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paper.dao.community.CommunityDao;
import com.paper.dao.community.CommunityDaoImpl;

import model.Community;

@WebServlet(urlPatterns = {"/community/commuList", "/community/commuWrite", "/community/commuWriteInsert"})
public class CommuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex+1);
		String dispatchUrl = "/jsp/community/community_list.jsp";
		
		CommunityDao commuDao = new CommunityDaoImpl();
		
		if(action.equals("commuList")) {
			dispatchUrl = "/jsp/community/community_list.jsp";
		}else if(action.equals("commuWrite")){
			dispatchUrl = "/jsp/community/community_write.jsp";
		}else if(action.equals("commuWriteInsert")) {
			
			//객체 생성 및 넣기
			Community community = new Community();
			community.setEmail(request.getParameter("email"));
			community.setCommu_title(request.getParameter("commu_title"));
			community.setCommu_content(request.getParameter("daumeditor"));
			
			commuDao.insert(community);			
			dispatchUrl = "commuList";
			
		}

		

		RequestDispatcher dispatcher = request.getRequestDispatcher(dispatchUrl);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}
