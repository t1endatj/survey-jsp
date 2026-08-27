package com.mycompany.survey.resources;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SurveyList extends HttpServlet{
    @Override protected void doPost(HttpServletRequest request,HttpServletResponse respone)
            throws ServletException,IOException {
        String url="/index.html";
        
        String action = request.getParameter("action");
        if(action == null){
            action = "join";
        }
        if (action.equals("join")) {
            url = "/index.html";
        }else if(action.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");

            String source = request.getParameter("source");

            String announcements = request.getParameter("announcements");
            String emailAnnouncements = request.getParameter("emailAnnouncements");

            String contact = request.getParameter("contact");
            
            User user = new User(
                firstName,lastName,email,dateOfBirth,source,announcements != null,emailAnnouncements != null,contact
            );
            
            user.setAnnouncements(announcements != null);
            user.setEmailAnnouncements(emailAnnouncements != null);
            user.setContact(contact);
            
            request.setAttribute("user", user);            
            
            url = "/thanks.jsp";
            
            getServletContext().getRequestDispatcher(url).forward(request, respone);
            
        }
    }
    @Override protected void doGet(HttpServletRequest request,HttpServletResponse respone)
       throws ServletException,IOException {
                doPost(request ,respone);
    }   
}
