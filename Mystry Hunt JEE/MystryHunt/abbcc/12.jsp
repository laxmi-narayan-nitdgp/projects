<%-- 
    Document   : 12
    Created on : Aug 1, 2012, 7:55:39 AM
    Author     : hiddenprivacy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form name="f1" action="middle.jsp">
            <div>
                <label>enter your favrite programming language(java)</label>
                <input type="text" name="ans" required/>
                <input type="hidden" value="12" name="hdd" />
                
                <input type="submit" value="Submit Answer"/>
            </div>
            
        </form>
    </body>
</html>
