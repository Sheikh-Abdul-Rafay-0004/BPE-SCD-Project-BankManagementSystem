<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>
  <link rel="stylesheet" href="/CSS/stye.css">
  <link rel="stylesheet" href="/CSS/reister.css">
</head>
<body>
 <form action="Register.jsp" method="post">
  
            <br><br><br> 
      <h1>USER SINGUP</h1>
              
              <table >
      <tr style="align-items:center ;">
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm; "> FIRST NAME </th>
          <td> &nbsp; <input type="text" name="First_Name" id="First_Name" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
          
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm; "> LAST NAME </th>
          <td> &nbsp; <input type="text" name="Last_Name" id="Last_Name" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
       
      </tr>
      <tr style="height:2cm ;">    
          
           
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm;"> PHONE NUMBER</th>
          <td> &nbsp; <input type="text" name="Phone_Number" id="Phone_Number" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm; "> CNIC  </th>
          <td> &nbsp; <input type="text" name="CNIC" id="CNIC" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm; "> ADDRESS </th>
          <td> &nbsp; <input type="text" name="Address" id="Address" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
       
      </tr>
      <tr style="height:2cm ;">    
          
           
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm;"> EMIAL</th>
          <td> &nbsp; <input type="text" name="Email" id="Email" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 1cm; "> DATE OF BIRTH </th>
          <td> &nbsp; <input type="text" name="c" id="D_O_B" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
         
      </tr>
      <tr style="height:2cm ;">    
      
          <th style="font-size: 20px ;color: rgb(103, 42, 18); padding-left: 1cm;">ACCOUNT TYPE </th>
          <td> &nbsp;
         <select name = "account_type" id="actype"style="font-size: 25px; background-color:rgb(218, 212, 203);border-style:inset; font-weight: lighter;">
              <option value="b_acoount" id="b_acoount" >business account</option>
              <option value="s_acoount" id="s_acoount" >salary account</option>
              <option value="sav_acoount" id="sav_acoount" >saving account</option>
              <option value="c_acoount" id="c_acoount" >current account</option>
            </select>  
          </td> 
      </tr> <tr style="height:2cm ;">    
          
           
        <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 0.25cm; "> ACCOUNT Number </th>
        <td> &nbsp; <input type="text" name="acc_number" id="acc_id" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
        </td>
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 0.25cm; "> CREATE PASSWORD </th>
          <td> &nbsp; <input type="text" name="pswd" id="pswd" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 0cm; ">AMOUNT</th>
          <td> &nbsp; <input type="text" name="amnt" id="amnt" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
      </tr>
     
       <tr style="height:2cm ;">    
          
           
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 0.25cm; "> Country </th>
          <td> &nbsp; <input type="text" name="country" id="pswd" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
          <th style="font-size: 20px;color: rgb(103, 42, 18); padding-left: 0cm; ">City</th>
          <td> &nbsp; <input type="text" name="cuty" id="amnt" style="font-size: 25px; background-color: rgb(218, 212, 203);border-style:inset;font-weight: lighter;">
          </td>
      </tr>
     <tr style="height:2cm ;">    
      
          <th style="font-size: 20px ;color: rgb(103, 42, 18); padding-left: 1cm;">Occupation</th>
          <td> &nbsp;
         <select name = "occupation" id="actype"style="font-size: 25px; background-color:rgb(218, 212, 203);border-style:inset; font-weight: lighter;">
              <option value="b" id="b_acoount" >business</option>
              <option value="s" id="s_acoount" >job</option>
              <option value="o" id="sav_acoount" >Other</option>
            </select>  
            
          </td> 
      </tr> 
   
      </table>
      <br>
      
      
       <button type="submit"  name="submit">Submit </button> 
      </form>  
      

</body>
</html>