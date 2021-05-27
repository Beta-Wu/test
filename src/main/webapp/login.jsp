<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/login.css"/>

<html>
<head><title>登录页面</title></head>
<body>
<div class="login">
<form action="${pageContext.request.contextPath }/login.do" onsubmit="return custCheck()">
<!-- <form action="#" method="post"><h1><a href="index.html"><img src="img/temp/logo.png"></a></h1> -->
<h1>登录</h1>
<p></p>
<div class="msg-warn hide"><b></b>公共场所不建议自动登录，以防账号丢失</div>
      
<p><input type="text" name="phone" value="" placeholder="手机号" required/></p>
<p><input type="password" name="password" value="" placeholder="密码 " required/></p>

<!-- <p><select name="identity"  >
     <option value="">--------请选择身份---------------</option>
     <option value="customer">顾客</option>
     <option value="merchant">商家</option>
   </select>
</p> -->

<h4>身份: <select name="identity">
     <option value="customer">顾客</option>
     <option value="merchant">商家</option>
   </select>
</h4>
<!--     <div class="radio-sex">
        <input type="radio" id="sex1" name="sex">顾客
        <label for="sex1"></label>
        
    </div>
    <div class="radio-sex">
        <input type="radio" id="sex2" name="sex">
        <label for="sex2"></label>商家
    </div> -->

<!-- <div class="select dowebok">
    <span class="placeholder">请选择</span>
    <ul>
        <li>百度</li>
        <li>谷歌</li>
        <li>雅虎</li>
        <li>新浪</li>
    </ul>
</div> -->

<p><input type="submit" name="" value="登  录"></p>
<p class="txt">若无账号？<a class="" href="register.jsp">免费注册</a></p>
</form>
</div>
</body>
</html>

<%-- 
     <tr><td><font color="red">${error_message}</font></td></tr> 
     <tr><td>手机号:</td><td><input type="text" name="phone" required/></td></tr>
     <tr><td></td><tr>
     <tr><td></td><tr>
     <tr><td>密码:</td><td><input type="password" name="password" required/></td> </tr>
     <tr><td></td><tr>
     <tr><td></td><tr>
     <tr><td>身份:</td>
     <td><select name="identity">
     <option value="customer">顾客</option>
     <option value="merchant">商家</option>
     </select>      
     </table>
     <input type="checkbox" name="check" value="check"/>自动登录<br>
     
    <label><input type="submit" value="登录"/>
     <input type="reset" value="取消"/>
     <br>
     <input type="button" name="register" value="注  册" onclick="window.location.href='${pageContext.request.contextPath }/register.jsp'">
    </label> 
 </fieldset>
</div>
</form>
</div>
</body>
</html> --%>