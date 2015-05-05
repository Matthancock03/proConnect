// @SOURCE:/home/misanthropic/repos/schoolWork/proConnect/web-app/conf/routes
// @HASH:8a6afc8f958c23714dfd9fd0a297e764badd3f59
// @DATE:Tue May 05 11:32:27 PDT 2015


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
private[this] lazy val controllers_NewsFeed_homeFeed0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginUser"))))
        

// @LINE:8
private[this] lazy val controllers_DbController_editProfile1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profileMain"))))
        

// @LINE:9
private[this] lazy val controllers_DbController_profileMain2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editProfile"))))
        

// @LINE:10
private[this] lazy val controllers_DbController_getProfilePic3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getProfilePic"))))
        

// @LINE:11
private[this] lazy val controllers_DbController_saveUser4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveUser"))))
        

// @LINE:12
private[this] lazy val controllers_DbController_getFormData5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getFormData"))))
        

// @LINE:16
private[this] lazy val controllers_Application_splashPage6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:17
private[this] lazy val controllers_Application_userAware7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userAware"))))
        

// @LINE:18
private[this] lazy val controllers_Application_forum8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum"))))
        

// @LINE:19
private[this] lazy val controllers_Application_connections9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("connections"))))
        

// @LINE:20
private[this] lazy val controllers_Application_about10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:21
private[this] lazy val controllers_Application_help11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("help"))))
        

// @LINE:22
private[this] lazy val controllers_Application_systemEntry12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("systemEntry"))))
        

// @LINE:23
private[this] lazy val controllers_Application_forumItem13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forumItem"))))
        

// @LINE:26
private[this] lazy val controllers_UserController_sendMessage14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendMessage"))))
        

// @LINE:27
private[this] lazy val controllers_UserController_replyMessage15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("replyMessage"))))
        

// @LINE:28
private[this] lazy val controllers_UserController_addConnection16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addConnection"))))
        

// @LINE:30
private[this] lazy val controllers_MessageController_message17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
        

// @LINE:31
private[this] lazy val controllers_MessageController_sentMessages18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSentMessages"))))
        

// @LINE:32
private[this] lazy val controllers_MessageController_deleteMessage19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteMessage"))))
        

// @LINE:35
private[this] lazy val controllers_SearchController_loadSearchedProfile20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadSearchedProfile"))))
        

// @LINE:36
private[this] lazy val controllers_SearchController_search21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:37
private[this] lazy val controllers_SearchController_loadProfile22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadProfile"))))
        

// @LINE:42
private[this] lazy val controllers_Android_androidLogin23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidLogin"))))
        

// @LINE:43
private[this] lazy val controllers_Android_androidCreateAccount24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidCreateAccount"))))
        

// @LINE:44
private[this] lazy val controllers_Android_androidSaveUser25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidSaveUser"))))
        

// @LINE:48
private[this] lazy val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:49
private[this] lazy val controllers_WebJarAssets_at27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:52
private[this] lazy val securesocial_controllers_LoginPage_login28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:53
private[this] lazy val securesocial_controllers_LoginPage_logout29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:56
private[this] lazy val securesocial_controllers_Registration_startSignUp30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:57
private[this] lazy val securesocial_controllers_Registration_handleStartSignUp31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:58
private[this] lazy val securesocial_controllers_Registration_signUp32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val securesocial_controllers_Registration_handleSignUp33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:60
private[this] lazy val securesocial_controllers_Registration_startResetPassword34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:61
private[this] lazy val securesocial_controllers_Registration_handleStartResetPassword35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:62
private[this] lazy val securesocial_controllers_Registration_resetPassword36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:63
private[this] lazy val securesocial_controllers_Registration_handleResetPassword37 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:64
private[this] lazy val securesocial_controllers_PasswordChange_page38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:65
private[this] lazy val securesocial_controllers_PasswordChange_handlePasswordChange39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:69
private[this] lazy val securesocial_controllers_ProviderController_authenticate40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:70
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost41 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:71
private[this] lazy val securesocial_controllers_ProviderController_notAuthorized42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-authorized"))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginUser""","""controllers.NewsFeed.homeFeed()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profileMain""","""controllers.DbController.editProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editProfile""","""controllers.DbController.profileMain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getProfilePic""","""controllers.DbController.getProfilePic(email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveUser""","""controllers.DbController.saveUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getFormData""","""controllers.DbController.getFormData()"""),("""GET""", prefix,"""controllers.Application.splashPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userAware""","""controllers.Application.userAware()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum""","""controllers.Application.forum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """connections""","""controllers.Application.connections()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """help""","""controllers.Application.help()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """systemEntry""","""controllers.Application.systemEntry()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forumItem""","""controllers.Application.forumItem()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendMessage""","""controllers.UserController.sendMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """replyMessage""","""controllers.UserController.replyMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addConnection""","""controllers.UserController.addConnection(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.MessageController.message()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSentMessages""","""controllers.MessageController.sentMessages()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteMessage""","""controllers.MessageController.deleteMessage(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadSearchedProfile""","""controllers.SearchController.loadSearchedProfile(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.SearchController.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadProfile""","""controllers.SearchController.loadProfile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidLogin""","""controllers.Android.androidLogin(email:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidCreateAccount""","""controllers.Android.androidCreateAccount(email:String, password:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidSaveUser""","""controllers.Android.androidSaveUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""securesocial.controllers.LoginPage.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.page"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-authorized""","""securesocial.controllers.ProviderController.notAuthorized""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_NewsFeed_homeFeed0(params) => {
   call { 
        invokeHandler(controllers.NewsFeed.homeFeed(), HandlerDef(this, "controllers.NewsFeed", "homeFeed", Nil,"GET", """########## Web App##################""", Routes.prefix + """loginUser"""))
   }
}
        

// @LINE:8
case controllers_DbController_editProfile1(params) => {
   call { 
        invokeHandler(controllers.DbController.editProfile(), HandlerDef(this, "controllers.DbController", "editProfile", Nil,"GET", """""", Routes.prefix + """profileMain"""))
   }
}
        

// @LINE:9
case controllers_DbController_profileMain2(params) => {
   call { 
        invokeHandler(controllers.DbController.profileMain(), HandlerDef(this, "controllers.DbController", "profileMain", Nil,"GET", """""", Routes.prefix + """editProfile"""))
   }
}
        

// @LINE:10
case controllers_DbController_getProfilePic3(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.DbController.getProfilePic(email), HandlerDef(this, "controllers.DbController", "getProfilePic", Seq(classOf[String]),"GET", """""", Routes.prefix + """getProfilePic"""))
   }
}
        

// @LINE:11
case controllers_DbController_saveUser4(params) => {
   call { 
        invokeHandler(controllers.DbController.saveUser(), HandlerDef(this, "controllers.DbController", "saveUser", Nil,"POST", """""", Routes.prefix + """saveUser"""))
   }
}
        

// @LINE:12
case controllers_DbController_getFormData5(params) => {
   call { 
        invokeHandler(controllers.DbController.getFormData(), HandlerDef(this, "controllers.DbController", "getFormData", Nil,"POST", """""", Routes.prefix + """getFormData"""))
   }
}
        

// @LINE:16
case controllers_Application_splashPage6(params) => {
   call { 
        invokeHandler(controllers.Application.splashPage(), HandlerDef(this, "controllers.Application", "splashPage", Nil,"GET", """POST     /login                   controllers.Application.login()""", Routes.prefix + """"""))
   }
}
        

// @LINE:17
case controllers_Application_userAware7(params) => {
   call { 
        invokeHandler(controllers.Application.userAware(), HandlerDef(this, "controllers.Application", "userAware", Nil,"GET", """""", Routes.prefix + """userAware"""))
   }
}
        

// @LINE:18
case controllers_Application_forum8(params) => {
   call { 
        invokeHandler(controllers.Application.forum(), HandlerDef(this, "controllers.Application", "forum", Nil,"GET", """""", Routes.prefix + """forum"""))
   }
}
        

// @LINE:19
case controllers_Application_connections9(params) => {
   call { 
        invokeHandler(controllers.Application.connections(), HandlerDef(this, "controllers.Application", "connections", Nil,"GET", """""", Routes.prefix + """connections"""))
   }
}
        

// @LINE:20
case controllers_Application_about10(params) => {
   call { 
        invokeHandler(controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:21
case controllers_Application_help11(params) => {
   call { 
        invokeHandler(controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Nil,"GET", """""", Routes.prefix + """help"""))
   }
}
        

// @LINE:22
case controllers_Application_systemEntry12(params) => {
   call { 
        invokeHandler(controllers.Application.systemEntry(), HandlerDef(this, "controllers.Application", "systemEntry", Nil,"GET", """""", Routes.prefix + """systemEntry"""))
   }
}
        

// @LINE:23
case controllers_Application_forumItem13(params) => {
   call { 
        invokeHandler(controllers.Application.forumItem(), HandlerDef(this, "controllers.Application", "forumItem", Nil,"GET", """""", Routes.prefix + """forumItem"""))
   }
}
        

// @LINE:26
case controllers_UserController_sendMessage14(params) => {
   call { 
        invokeHandler(controllers.UserController.sendMessage(), HandlerDef(this, "controllers.UserController", "sendMessage", Nil,"GET", """""", Routes.prefix + """sendMessage"""))
   }
}
        

// @LINE:27
case controllers_UserController_replyMessage15(params) => {
   call { 
        invokeHandler(controllers.UserController.replyMessage(), HandlerDef(this, "controllers.UserController", "replyMessage", Nil,"GET", """""", Routes.prefix + """replyMessage"""))
   }
}
        

// @LINE:28
case controllers_UserController_addConnection16(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.UserController.addConnection(email), HandlerDef(this, "controllers.UserController", "addConnection", Seq(classOf[String]),"GET", """""", Routes.prefix + """addConnection"""))
   }
}
        

// @LINE:30
case controllers_MessageController_message17(params) => {
   call { 
        invokeHandler(controllers.MessageController.message(), HandlerDef(this, "controllers.MessageController", "message", Nil,"GET", """""", Routes.prefix + """message"""))
   }
}
        

// @LINE:31
case controllers_MessageController_sentMessages18(params) => {
   call { 
        invokeHandler(controllers.MessageController.sentMessages(), HandlerDef(this, "controllers.MessageController", "sentMessages", Nil,"GET", """""", Routes.prefix + """getSentMessages"""))
   }
}
        

// @LINE:32
case controllers_MessageController_deleteMessage19(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.MessageController.deleteMessage(id), HandlerDef(this, "controllers.MessageController", "deleteMessage", Seq(classOf[Long]),"GET", """""", Routes.prefix + """deleteMessage"""))
   }
}
        

// @LINE:35
case controllers_SearchController_loadSearchedProfile20(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.SearchController.loadSearchedProfile(email), HandlerDef(this, "controllers.SearchController", "loadSearchedProfile", Seq(classOf[String]),"GET", """""", Routes.prefix + """loadSearchedProfile"""))
   }
}
        

// @LINE:36
case controllers_SearchController_search21(params) => {
   call { 
        invokeHandler(controllers.SearchController.search(), HandlerDef(this, "controllers.SearchController", "search", Nil,"GET", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:37
case controllers_SearchController_loadProfile22(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SearchController.loadProfile(id), HandlerDef(this, "controllers.SearchController", "loadProfile", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadProfile"""))
   }
}
        

// @LINE:42
case controllers_Android_androidLogin23(params) => {
   call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        invokeHandler(controllers.Android.androidLogin(email, password), HandlerDef(this, "controllers.Android", "androidLogin", Seq(classOf[String], classOf[String]),"GET", """######### Android###################""", Routes.prefix + """androidLogin"""))
   }
}
        

// @LINE:43
case controllers_Android_androidCreateAccount24(params) => {
   call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        invokeHandler(controllers.Android.androidCreateAccount(email, password), HandlerDef(this, "controllers.Android", "androidCreateAccount", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """androidCreateAccount"""))
   }
}
        

// @LINE:44
case controllers_Android_androidSaveUser25(params) => {
   call { 
        invokeHandler(controllers.Android.androidSaveUser(), HandlerDef(this, "controllers.Android", "androidSaveUser", Nil,"POST", """""", Routes.prefix + """androidSaveUser"""))
   }
}
        

// @LINE:48
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:49
case controllers_WebJarAssets_at27(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:52
case securesocial_controllers_LoginPage_login28(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
   }
}
        

// @LINE:53
case securesocial_controllers_LoginPage_logout29(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:56
case securesocial_controllers_Registration_startSignUp30(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil,"GET", """ User Registration and password handling (only needed if you are using UsernamePasswordProvider)""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:57
case securesocial_controllers_Registration_handleStartSignUp31(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:58
case securesocial_controllers_Registration_signUp32(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]),"GET", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:59
case securesocial_controllers_Registration_handleSignUp33(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]),"POST", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:60
case securesocial_controllers_Registration_startResetPassword34(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil,"GET", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:61
case securesocial_controllers_Registration_handleStartResetPassword35(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil,"POST", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:62
case securesocial_controllers_Registration_resetPassword36(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:63
case securesocial_controllers_Registration_handleResetPassword37(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:64
case securesocial_controllers_PasswordChange_page38(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil,"GET", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:65
case securesocial_controllers_PasswordChange_handlePasswordChange39(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil,"POST", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:69
case securesocial_controllers_ProviderController_authenticate40(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]),"GET", """ Providers entry points""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:70
case securesocial_controllers_ProviderController_authenticateByPost41(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]),"POST", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:71
case securesocial_controllers_ProviderController_notAuthorized42(params) => {
   call { 
        invokeHandler(securesocial.controllers.ProviderController.notAuthorized, HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Nil,"GET", """""", Routes.prefix + """not-authorized"""))
   }
}
        
}

}
     