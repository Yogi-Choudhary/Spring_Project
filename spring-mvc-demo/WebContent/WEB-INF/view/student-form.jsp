<%-- <%@ taglib prefix="form" url="http://wwww.springframework.org/tags/form" %> --%>
<!DOCTYPE html>
<html>
  <head>
    <title>Student Registration From</title>
  </head>
  <body>
    
    <form action="processForm" modelAttribute="student">
      
      First name: <input path="firstName" />
      
      <br><br>
      
      Last name: <input path="lastName" />
      
      <br><br>
       
       Country:
       
        <select path="country">
        
         <option items="${student.countryOptions}"/>
         <!--  <option value="India" label="India"/>
          <option value="France" label="France"/>
          <option value="Germany" label="Germany"/>
          <option value="Brazil" label="Brazil"/>
           -->
        </select>
      <br><br>
      
      
      <input type="submit" value="Submit" />
      
    </form>
    
  </body>
</html>