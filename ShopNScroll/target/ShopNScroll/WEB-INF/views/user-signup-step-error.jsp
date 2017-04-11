<!-- HEADER -->
<%@ include file="component-header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="container-fluid text-center well-sm sitewise-header">
<div class="row">
<a href="home"><button class="btn btn-warning btn-arrow-right pull-left" style="outline:none;"><b>Home</b></button></a>
<button class="btn btn-warning btn-arrow-right pull-left" style="background-color: rgba(0,0,0,1.0);outline:none;">SignUp</button>
</div>
</div>

<div class="container text-center">
<br>
<div class="row">
<div class="col-xs-0 col-sm-1 col-md-3 col-lg-3"></div>
<div class="col-xs-12 col-sm-10 col-md-6 col-lg-6 login-signup-panels">
<br>

<h2><b style="color:rgba(92,184,92,1.0);">Sorry - Account Cannot Be Created</b></h2>
<h4><b>Please Try To SignUp Again.</b></h4>
<br>
<a href="reg">
<button id="login" name="login" class="signup-button btn btn-lg btn-warning text-center">SignUp Again</button>
</a>

</div>
<div class="col-xs-0 col-sm-1 col-md-3 col-lg-3"></div>
</div>

</div>
<!-- FOOTER  -->
<%@ include file="component-footer.jsp" %>