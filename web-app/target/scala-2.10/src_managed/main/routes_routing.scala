// @SOURCE:/home/misanthropic/repos/schoolWork/proConnect/web-app/conf/routes
// @HASH:6336cae14bf447854a60d214606b750c3aa3c2d9
// @DATE:Sun Apr 19 21:59:41 PDT 2015


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
private[this] lazy val controllers_Application_splashPage0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_DbController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginUser"))))
        

// @LINE:8
private[this] lazy val controllers_Application_userAware2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userAware"))))
        

// @LINE:9
private[this] lazy val controllers_DbController_editProfile3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editProfile"))))
        

// @LINE:10
private[this] lazy val controllers_Application_forum4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum"))))
        

// @LINE:11
private[this] lazy val controllers_Application_connections5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("connections"))))
        

// @LINE:12
private[this] lazy val controllers_Application_about6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:13
private[this] lazy val controllers_Application_help7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("help"))))
        

// @LINE:14
private[this] lazy val controllers_Application_message8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
        

// @LINE:15
private[this] lazy val controllers_Application_search9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:16
private[this] lazy val controllers_Android_androidLogin10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidLogin"))))
        

// @LINE:17
private[this] lazy val controllers_Android_androidCreateAccount11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidCreateAccount"))))
        

// @LINE:18
private[this] lazy val controllers_NewsFeed_feedZilla12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedZilla"))))
        

// @LINE:21
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:22
private[this] lazy val controllers_WebJarAssets_at14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:25
private[this] lazy val securesocial_controllers_LoginPage_login15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:26
private[this] lazy val securesocial_controllers_LoginPage_logout16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:29
private[this] lazy val securesocial_controllers_Registration_startSignUp17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:30
private[this] lazy val securesocial_controllers_Registration_handleStartSignUp18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:31
private[this] lazy val securesocial_controllers_Registration_signUp19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val securesocial_controllers_Registration_handleSignUp20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:33
private[this] lazy val securesocial_controllers_Registration_startResetPassword21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:34
private[this] lazy val securesocial_controllers_Registration_handleStartResetPassword22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:35
private[this] lazy val securesocial_controllers_Registration_resetPassword23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val securesocial_controllers_Registration_handleResetPassword24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val securesocial_controllers_PasswordChange_page25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:38
private[this] lazy val securesocial_controllers_PasswordChange_handlePasswordChange26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:42
private[this] lazy val securesocial_controllers_ProviderController_authenticate27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:43
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val securesocial_controllers_ProviderController_notAuthorized29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-authorized"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.splashPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginUser""","""controllers.DbController.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userAware""","""controllers.Application.userAware()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editProfile""","""controllers.DbController.editProfile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum""","""controllers.Application.forum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """connections""","""controllers.Application.connections()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """help""","""controllers.Application.help()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.Application.message()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidLogin""","""controllers.Android.androidLogin(name:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidCreateAccount""","""controllers.Android.androidCreateAccount(name:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedZilla""","""controllers.NewsFeed.feedZilla()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""securesocial.controllers.LoginPage.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.page"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-authorized""","""securesocial.controllers.ProviderController.notAuthorized""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_splashPage0(params) => {
   call { 
        invokeHandler(controllers.Application.splashPage(), HandlerDef(this, "controllers.Application", "splashPage", Nil,"GET", """POST     /login                   controllers.Application.login()""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_DbController_home1(params) => {
   call { 
        invokeHandler(controllers.DbController.home(), HandlerDef(this, "controllers.DbController", "home", Nil,"GET", """""", Routes.prefix + """loginUser"""))
   }
}
        

// @LINE:8
case controllers_Application_userAware2(params) => {
   call { 
        invokeHandler(controllers.Application.userAware(), HandlerDef(this, "controllers.Application", "userAware", Nil,"GET", """""", Routes.prefix + """userAware"""))
   }
}
        

// @LINE:9
case controllers_DbController_editProfile3(params) => {
   call { 
        invokeHandler(controllers.DbController.editProfile, HandlerDef(this, "controllers.DbController", "editProfile", Nil,"GET", """""", Routes.prefix + """editProfile"""))
   }
}
        

// @LINE:10
case controllers_Application_forum4(params) => {
   call { 
        invokeHandler(controllers.Application.forum(), HandlerDef(this, "controllers.Application", "forum", Nil,"GET", """""", Routes.prefix + """forum"""))
   }
}
        

// @LINE:11
case controllers_Application_connections5(params) => {
   call { 
        invokeHandler(controllers.Application.connections(), HandlerDef(this, "controllers.Application", "connections", Nil,"GET", """""", Routes.prefix + """connections"""))
   }
}
        

// @LINE:12
case controllers_Application_about6(params) => {
   call { 
        invokeHandler(controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:13
case controllers_Application_help7(params) => {
   call { 
        invokeHandler(controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Nil,"GET", """""", Routes.prefix + """help"""))
   }
}
        

// @LINE:14
case controllers_Application_message8(params) => {
   call { 
        invokeHandler(controllers.Application.message(), HandlerDef(this, "controllers.Application", "message", Nil,"GET", """""", Routes.prefix + """message"""))
   }
}
        

// @LINE:15
case controllers_Application_search9(params) => {
   call { 
        invokeHandler(controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Nil,"GET", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:16
case controllers_Android_androidLogin10(params) => {
   call(params.fromQuery[String]("name", None), params.fromQuery[String]("password", None)) { (name, password) =>
        invokeHandler(controllers.Android.androidLogin(name, password), HandlerDef(this, "controllers.Android", "androidLogin", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """androidLogin"""))
   }
}
        

// @LINE:17
case controllers_Android_androidCreateAccount11(params) => {
   call(params.fromQuery[String]("name", None), params.fromQuery[String]("password", None)) { (name, password) =>
        invokeHandler(controllers.Android.androidCreateAccount(name, password), HandlerDef(this, "controllers.Android", "androidCreateAccount", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """androidCreateAccount"""))
   }
}
        

// @LINE:18
case controllers_NewsFeed_feedZilla12(params) => {
   call { 
        invokeHandler(controllers.NewsFeed.feedZilla(), HandlerDef(this, "controllers.NewsFeed", "feedZilla", Nil,"GET", """""", Routes.prefix + """feedZilla"""))
   }
}
        

// @LINE:21
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:22
case controllers_WebJarAssets_at14(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:25
case securesocial_controllers_LoginPage_login15(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
   }
}
        

// @LINE:26
case securesocial_controllers_LoginPage_logout16(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:29
case securesocial_controllers_Registration_startSignUp17(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil,"GET", """ User Registration and password handling (only needed if you are using UsernamePasswordProvider)""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:30
case securesocial_controllers_Registration_handleStartSignUp18(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:31
case securesocial_controllers_Registration_signUp19(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]),"GET", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:32
case securesocial_controllers_Registration_handleSignUp20(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]),"POST", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:33
case securesocial_controllers_Registration_startResetPassword21(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil,"GET", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:34
case securesocial_controllers_Registration_handleStartResetPassword22(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil,"POST", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:35
case securesocial_controllers_Registration_resetPassword23(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:36
case securesocial_controllers_Registration_handleResetPassword24(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:37
case securesocial_controllers_PasswordChange_page25(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil,"GET", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:38
case securesocial_controllers_PasswordChange_handlePasswordChange26(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil,"POST", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:42
case securesocial_controllers_ProviderController_authenticate27(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]),"GET", """ Providers entry points""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:43
case securesocial_controllers_ProviderController_authenticateByPost28(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]),"POST", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:44
case securesocial_controllers_ProviderController_notAuthorized29(params) => {
   call { 
        invokeHandler(securesocial.controllers.ProviderController.notAuthorized, HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Nil,"GET", """""", Routes.prefix + """not-authorized"""))
   }
}
        
}

}
     