// @SOURCE:/home/misanthropic/repos/schoolWork/proConnect/web-app/conf/routes
// @HASH:b4248b2aa92b1bc99b502cb35ffcd63ba0765450
// @DATE:Wed Apr 01 21:00:40 PDT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_DbController_loginUser0 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginUser"))))
        

// @LINE:7
private[this] lazy val controllers_DbController_signUpUser1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signUpUser"))))
        

// @LINE:8
private[this] lazy val controllers_Application_splashPage2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_DbController_home3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginUser"))))
        

// @LINE:10
private[this] lazy val controllers_Application_userAware4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userAware"))))
        

// @LINE:11
private[this] lazy val controllers_DbController_editProfile5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editProfile"))))
        

// @LINE:12
private[this] lazy val controllers_Application_forum6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum"))))
        

// @LINE:13
private[this] lazy val controllers_Application_connections7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("connections"))))
        

// @LINE:16
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:17
private[this] lazy val controllers_WebJarAssets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:20
private[this] lazy val securesocial_controllers_LoginPage_login10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:21
private[this] lazy val securesocial_controllers_LoginPage_logout11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:24
private[this] lazy val securesocial_controllers_Registration_startSignUp12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:25
private[this] lazy val securesocial_controllers_Registration_handleStartSignUp13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:26
private[this] lazy val securesocial_controllers_Registration_signUp14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val securesocial_controllers_Registration_handleSignUp15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val securesocial_controllers_Registration_startResetPassword16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:29
private[this] lazy val securesocial_controllers_Registration_handleStartResetPassword17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:30
private[this] lazy val securesocial_controllers_Registration_resetPassword18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val securesocial_controllers_Registration_handleResetPassword19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val securesocial_controllers_PasswordChange_page20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:33
private[this] lazy val securesocial_controllers_PasswordChange_handlePasswordChange21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:37
private[this] lazy val securesocial_controllers_ProviderController_authenticate22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:38
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val securesocial_controllers_ProviderController_notAuthorized24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-authorized"))))
        
def documentation = List(("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginUser""","""controllers.DbController.loginUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signUpUser""","""controllers.DbController.signUpUser()"""),("""GET""", prefix,"""controllers.Application.splashPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginUser""","""controllers.DbController.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userAware""","""controllers.Application.userAware()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editProfile""","""controllers.DbController.editProfile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum""","""controllers.Application.forum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """connections""","""controllers.Application.connections()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""securesocial.controllers.LoginPage.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.page"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-authorized""","""securesocial.controllers.ProviderController.notAuthorized""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_DbController_loginUser0(params) => {
   call { 
        invokeHandler(controllers.DbController.loginUser(), HandlerDef(this, "controllers.DbController", "loginUser", Nil,"POST", """POST     /login                   controllers.Application.login()""", Routes.prefix + """loginUser"""))
   }
}
        

// @LINE:7
case controllers_DbController_signUpUser1(params) => {
   call { 
        invokeHandler(controllers.DbController.signUpUser(), HandlerDef(this, "controllers.DbController", "signUpUser", Nil,"POST", """""", Routes.prefix + """signUpUser"""))
   }
}
        

// @LINE:8
case controllers_Application_splashPage2(params) => {
   call { 
        invokeHandler(controllers.Application.splashPage(), HandlerDef(this, "controllers.Application", "splashPage", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_DbController_home3(params) => {
   call { 
        invokeHandler(controllers.DbController.home(), HandlerDef(this, "controllers.DbController", "home", Nil,"GET", """""", Routes.prefix + """loginUser"""))
   }
}
        

// @LINE:10
case controllers_Application_userAware4(params) => {
   call { 
        invokeHandler(controllers.Application.userAware(), HandlerDef(this, "controllers.Application", "userAware", Nil,"GET", """""", Routes.prefix + """userAware"""))
   }
}
        

// @LINE:11
case controllers_DbController_editProfile5(params) => {
   call { 
        invokeHandler(controllers.DbController.editProfile, HandlerDef(this, "controllers.DbController", "editProfile", Nil,"GET", """""", Routes.prefix + """editProfile"""))
   }
}
        

// @LINE:12
case controllers_Application_forum6(params) => {
   call { 
        invokeHandler(controllers.Application.forum(), HandlerDef(this, "controllers.Application", "forum", Nil,"GET", """""", Routes.prefix + """forum"""))
   }
}
        

// @LINE:13
case controllers_Application_connections7(params) => {
   call { 
        invokeHandler(controllers.Application.connections(), HandlerDef(this, "controllers.Application", "connections", Nil,"GET", """""", Routes.prefix + """connections"""))
   }
}
        

// @LINE:16
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:17
case controllers_WebJarAssets_at9(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:20
case securesocial_controllers_LoginPage_login10(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
   }
}
        

// @LINE:21
case securesocial_controllers_LoginPage_logout11(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:24
case securesocial_controllers_Registration_startSignUp12(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil,"GET", """ User Registration and password handling (only needed if you are using UsernamePasswordProvider)""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:25
case securesocial_controllers_Registration_handleStartSignUp13(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:26
case securesocial_controllers_Registration_signUp14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]),"GET", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:27
case securesocial_controllers_Registration_handleSignUp15(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]),"POST", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:28
case securesocial_controllers_Registration_startResetPassword16(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil,"GET", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:29
case securesocial_controllers_Registration_handleStartResetPassword17(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil,"POST", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:30
case securesocial_controllers_Registration_resetPassword18(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:31
case securesocial_controllers_Registration_handleResetPassword19(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:32
case securesocial_controllers_PasswordChange_page20(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil,"GET", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:33
case securesocial_controllers_PasswordChange_handlePasswordChange21(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil,"POST", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:37
case securesocial_controllers_ProviderController_authenticate22(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]),"GET", """ Providers entry points""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:38
case securesocial_controllers_ProviderController_authenticateByPost23(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]),"POST", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:39
case securesocial_controllers_ProviderController_notAuthorized24(params) => {
   call { 
        invokeHandler(securesocial.controllers.ProviderController.notAuthorized, HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Nil,"GET", """""", Routes.prefix + """not-authorized"""))
   }
}
        
}

}
     