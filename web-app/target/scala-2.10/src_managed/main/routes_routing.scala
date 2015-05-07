// @SOURCE:/home/misanthropic/repos/schoolWork/proConnect/web-app/conf/routes
// @HASH:d9f2470c4d461b637ae4244db22e3f7b3fc89dbb
// @DATE:Thu May 07 00:15:31 PDT 2015


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
        

// @LINE:24
private[this] lazy val controllers_Application_index14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
        

// @LINE:26
private[this] lazy val controllers_UserController_sendMessage15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendMessage"))))
        

// @LINE:27
private[this] lazy val controllers_UserController_replyMessage16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("replyMessage"))))
        

// @LINE:28
private[this] lazy val controllers_UserController_addConnection17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addConnection"))))
        

// @LINE:29
private[this] lazy val controllers_UserController_removeConnection18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("removeConnection"))))
        

// @LINE:30
private[this] lazy val controllers_UserController_postJob19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postJob"))))
        

// @LINE:32
private[this] lazy val controllers_MessageController_message20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
        

// @LINE:33
private[this] lazy val controllers_MessageController_sentMessages21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSentMessages"))))
        

// @LINE:34
private[this] lazy val controllers_MessageController_deleteMessage22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteMessage"))))
        

// @LINE:37
private[this] lazy val controllers_SearchController_loadSearchedProfile23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadSearchedProfile"))))
        

// @LINE:38
private[this] lazy val controllers_SearchController_search24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:39
private[this] lazy val controllers_SearchController_loadProfile25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loadProfile"))))
        

// @LINE:40
private[this] lazy val controllers_SearchController_searchBySkill26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchBySkill"))))
        

// @LINE:41
private[this] lazy val controllers_SearchController_searchByProfession27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchByProfession"))))
        

// @LINE:42
private[this] lazy val controllers_SearchController_jobSearch28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobSearch"))))
        

// @LINE:43
private[this] lazy val controllers_SearchController_searchByCompany29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchByCompany"))))
        

// @LINE:44
private[this] lazy val controllers_SearchController_searchByIndustry30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchByIndustry"))))
        

// @LINE:47
private[this] lazy val controllers_Android_androidLogin31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidLogin"))))
        

// @LINE:48
private[this] lazy val controllers_Android_androidCreateAccount32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidCreateAccount"))))
        

// @LINE:49
private[this] lazy val controllers_Android_androidSaveUser33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidSaveUser"))))
        

// @LINE:50
private[this] lazy val controllers_Android_androidSearchUser34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidSearchUser"))))
        

// @LINE:51
private[this] lazy val controllers_Android_androidGetMessages35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidGetMessages"))))
        

// @LINE:52
private[this] lazy val controllers_Android_androidGetConnections36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidGetConnections"))))
        

// @LINE:53
private[this] lazy val controllers_Android_androidAddConnection37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("androidAddConnection"))))
        

// @LINE:57
private[this] lazy val controllers_Assets_at38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:58
private[this] lazy val controllers_WebJarAssets_at39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:61
private[this] lazy val securesocial_controllers_LoginPage_login40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:62
private[this] lazy val securesocial_controllers_LoginPage_logout41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:65
private[this] lazy val securesocial_controllers_Registration_startSignUp42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:66
private[this] lazy val securesocial_controllers_Registration_handleStartSignUp43 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:67
private[this] lazy val securesocial_controllers_Registration_signUp44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:68
private[this] lazy val securesocial_controllers_Registration_handleSignUp45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:69
private[this] lazy val securesocial_controllers_Registration_startResetPassword46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:70
private[this] lazy val securesocial_controllers_Registration_handleStartResetPassword47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset"))))
        

// @LINE:71
private[this] lazy val securesocial_controllers_Registration_resetPassword48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:72
private[this] lazy val securesocial_controllers_Registration_handleResetPassword49 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:73
private[this] lazy val securesocial_controllers_PasswordChange_page50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:74
private[this] lazy val securesocial_controllers_PasswordChange_handlePasswordChange51 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("password"))))
        

// @LINE:78
private[this] lazy val securesocial_controllers_ProviderController_authenticate52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:79
private[this] lazy val securesocial_controllers_ProviderController_authenticateByPost53 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:80
private[this] lazy val securesocial_controllers_ProviderController_notAuthorized54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("not-authorized"))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginUser""","""controllers.NewsFeed.homeFeed()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profileMain""","""controllers.DbController.editProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editProfile""","""controllers.DbController.profileMain()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getProfilePic""","""controllers.DbController.getProfilePic(email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveUser""","""controllers.DbController.saveUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getFormData""","""controllers.DbController.getFormData()"""),("""GET""", prefix,"""controllers.Application.splashPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userAware""","""controllers.Application.userAware()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum""","""controllers.Application.forum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """connections""","""controllers.Application.connections()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """help""","""controllers.Application.help()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """systemEntry""","""controllers.Application.systemEntry()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forumItem""","""controllers.Application.forumItem(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendMessage""","""controllers.UserController.sendMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """replyMessage""","""controllers.UserController.replyMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addConnection""","""controllers.UserController.addConnection(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removeConnection""","""controllers.UserController.removeConnection(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postJob""","""controllers.UserController.postJob()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.MessageController.message()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSentMessages""","""controllers.MessageController.sentMessages()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteMessage""","""controllers.MessageController.deleteMessage(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadSearchedProfile""","""controllers.SearchController.loadSearchedProfile(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.SearchController.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loadProfile""","""controllers.SearchController.loadProfile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchBySkill""","""controllers.SearchController.searchBySkill(queryName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchByProfession""","""controllers.SearchController.searchByProfession(queryName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobSearch""","""controllers.SearchController.jobSearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchByCompany""","""controllers.SearchController.searchByCompany(queryName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchByIndustry""","""controllers.SearchController.searchByIndustry(queryName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidLogin""","""controllers.Android.androidLogin(email:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidCreateAccount""","""controllers.Android.androidCreateAccount(email:String, password:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidSaveUser""","""controllers.Android.androidSaveUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidSearchUser""","""controllers.Android.androidSearchUser(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidGetMessages""","""controllers.Android.androidGetMessages(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidGetConnections""","""controllers.Android.androidGetConnections(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """androidAddConnection""","""controllers.Android.androidAddConnection(id1:Long, id2:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""securesocial.controllers.LoginPage.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.page"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """not-authorized""","""securesocial.controllers.ProviderController.notAuthorized""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.forumItem(id), HandlerDef(this, "controllers.Application", "forumItem", Seq(classOf[Long]),"GET", """""", Routes.prefix + """forumItem"""))
   }
}
        

// @LINE:24
case controllers_Application_index14(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """index"""))
   }
}
        

// @LINE:26
case controllers_UserController_sendMessage15(params) => {
   call { 
        invokeHandler(controllers.UserController.sendMessage(), HandlerDef(this, "controllers.UserController", "sendMessage", Nil,"GET", """""", Routes.prefix + """sendMessage"""))
   }
}
        

// @LINE:27
case controllers_UserController_replyMessage16(params) => {
   call { 
        invokeHandler(controllers.UserController.replyMessage(), HandlerDef(this, "controllers.UserController", "replyMessage", Nil,"GET", """""", Routes.prefix + """replyMessage"""))
   }
}
        

// @LINE:28
case controllers_UserController_addConnection17(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.UserController.addConnection(email), HandlerDef(this, "controllers.UserController", "addConnection", Seq(classOf[String]),"GET", """""", Routes.prefix + """addConnection"""))
   }
}
        

// @LINE:29
case controllers_UserController_removeConnection18(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.UserController.removeConnection(email), HandlerDef(this, "controllers.UserController", "removeConnection", Seq(classOf[String]),"GET", """""", Routes.prefix + """removeConnection"""))
   }
}
        

// @LINE:30
case controllers_UserController_postJob19(params) => {
   call { 
        invokeHandler(controllers.UserController.postJob(), HandlerDef(this, "controllers.UserController", "postJob", Nil,"GET", """""", Routes.prefix + """postJob"""))
   }
}
        

// @LINE:32
case controllers_MessageController_message20(params) => {
   call { 
        invokeHandler(controllers.MessageController.message(), HandlerDef(this, "controllers.MessageController", "message", Nil,"GET", """""", Routes.prefix + """message"""))
   }
}
        

// @LINE:33
case controllers_MessageController_sentMessages21(params) => {
   call { 
        invokeHandler(controllers.MessageController.sentMessages(), HandlerDef(this, "controllers.MessageController", "sentMessages", Nil,"GET", """""", Routes.prefix + """getSentMessages"""))
   }
}
        

// @LINE:34
case controllers_MessageController_deleteMessage22(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.MessageController.deleteMessage(id), HandlerDef(this, "controllers.MessageController", "deleteMessage", Seq(classOf[Long]),"GET", """""", Routes.prefix + """deleteMessage"""))
   }
}
        

// @LINE:37
case controllers_SearchController_loadSearchedProfile23(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.SearchController.loadSearchedProfile(email), HandlerDef(this, "controllers.SearchController", "loadSearchedProfile", Seq(classOf[String]),"GET", """""", Routes.prefix + """loadSearchedProfile"""))
   }
}
        

// @LINE:38
case controllers_SearchController_search24(params) => {
   call { 
        invokeHandler(controllers.SearchController.search(), HandlerDef(this, "controllers.SearchController", "search", Nil,"GET", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:39
case controllers_SearchController_loadProfile25(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SearchController.loadProfile(id), HandlerDef(this, "controllers.SearchController", "loadProfile", Seq(classOf[Long]),"GET", """""", Routes.prefix + """loadProfile"""))
   }
}
        

// @LINE:40
case controllers_SearchController_searchBySkill26(params) => {
   call(params.fromQuery[String]("queryName", None)) { (queryName) =>
        invokeHandler(controllers.SearchController.searchBySkill(queryName), HandlerDef(this, "controllers.SearchController", "searchBySkill", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchBySkill"""))
   }
}
        

// @LINE:41
case controllers_SearchController_searchByProfession27(params) => {
   call(params.fromQuery[String]("queryName", None)) { (queryName) =>
        invokeHandler(controllers.SearchController.searchByProfession(queryName), HandlerDef(this, "controllers.SearchController", "searchByProfession", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchByProfession"""))
   }
}
        

// @LINE:42
case controllers_SearchController_jobSearch28(params) => {
   call { 
        invokeHandler(controllers.SearchController.jobSearch(), HandlerDef(this, "controllers.SearchController", "jobSearch", Nil,"GET", """""", Routes.prefix + """jobSearch"""))
   }
}
        

// @LINE:43
case controllers_SearchController_searchByCompany29(params) => {
   call(params.fromQuery[String]("queryName", None)) { (queryName) =>
        invokeHandler(controllers.SearchController.searchByCompany(queryName), HandlerDef(this, "controllers.SearchController", "searchByCompany", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchByCompany"""))
   }
}
        

// @LINE:44
case controllers_SearchController_searchByIndustry30(params) => {
   call(params.fromQuery[String]("queryName", None)) { (queryName) =>
        invokeHandler(controllers.SearchController.searchByIndustry(queryName), HandlerDef(this, "controllers.SearchController", "searchByIndustry", Seq(classOf[String]),"GET", """""", Routes.prefix + """searchByIndustry"""))
   }
}
        

// @LINE:47
case controllers_Android_androidLogin31(params) => {
   call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        invokeHandler(controllers.Android.androidLogin(email, password), HandlerDef(this, "controllers.Android", "androidLogin", Seq(classOf[String], classOf[String]),"GET", """######### Android###################""", Routes.prefix + """androidLogin"""))
   }
}
        

// @LINE:48
case controllers_Android_androidCreateAccount32(params) => {
   call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        invokeHandler(controllers.Android.androidCreateAccount(email, password), HandlerDef(this, "controllers.Android", "androidCreateAccount", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """androidCreateAccount"""))
   }
}
        

// @LINE:49
case controllers_Android_androidSaveUser33(params) => {
   call { 
        invokeHandler(controllers.Android.androidSaveUser(), HandlerDef(this, "controllers.Android", "androidSaveUser", Nil,"POST", """""", Routes.prefix + """androidSaveUser"""))
   }
}
        

// @LINE:50
case controllers_Android_androidSearchUser34(params) => {
   call(params.fromQuery[String]("name", None)) { (name) =>
        invokeHandler(controllers.Android.androidSearchUser(name), HandlerDef(this, "controllers.Android", "androidSearchUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """androidSearchUser"""))
   }
}
        

// @LINE:51
case controllers_Android_androidGetMessages35(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Android.androidGetMessages(id), HandlerDef(this, "controllers.Android", "androidGetMessages", Seq(classOf[Long]),"GET", """""", Routes.prefix + """androidGetMessages"""))
   }
}
        

// @LINE:52
case controllers_Android_androidGetConnections36(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        invokeHandler(controllers.Android.androidGetConnections(email), HandlerDef(this, "controllers.Android", "androidGetConnections", Seq(classOf[String]),"GET", """""", Routes.prefix + """androidGetConnections"""))
   }
}
        

// @LINE:53
case controllers_Android_androidAddConnection37(params) => {
   call(params.fromQuery[Long]("id1", None), params.fromQuery[Long]("id2", None)) { (id1, id2) =>
        invokeHandler(controllers.Android.androidAddConnection(id1, id2), HandlerDef(this, "controllers.Android", "androidAddConnection", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """androidAddConnection"""))
   }
}
        

// @LINE:57
case controllers_Assets_at38(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:58
case controllers_WebJarAssets_at39(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:61
case securesocial_controllers_LoginPage_login40(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil,"GET", """ Login page""", Routes.prefix + """login"""))
   }
}
        

// @LINE:62
case securesocial_controllers_LoginPage_logout41(params) => {
   call { 
        invokeHandler(securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:65
case securesocial_controllers_Registration_startSignUp42(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil,"GET", """ User Registration and password handling (only needed if you are using UsernamePasswordProvider)""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:66
case securesocial_controllers_Registration_handleStartSignUp43(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:67
case securesocial_controllers_Registration_signUp44(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]),"GET", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:68
case securesocial_controllers_Registration_handleSignUp45(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]),"POST", """""", Routes.prefix + """signup/$token<[^/]+>"""))
   }
}
        

// @LINE:69
case securesocial_controllers_Registration_startResetPassword46(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil,"GET", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:70
case securesocial_controllers_Registration_handleStartResetPassword47(params) => {
   call { 
        invokeHandler(securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil,"POST", """""", Routes.prefix + """reset"""))
   }
}
        

// @LINE:71
case securesocial_controllers_Registration_resetPassword48(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:72
case securesocial_controllers_Registration_handleResetPassword49(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:73
case securesocial_controllers_PasswordChange_page50(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil,"GET", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:74
case securesocial_controllers_PasswordChange_handlePasswordChange51(params) => {
   call { 
        invokeHandler(securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil,"POST", """""", Routes.prefix + """password"""))
   }
}
        

// @LINE:78
case securesocial_controllers_ProviderController_authenticate52(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]),"GET", """ Providers entry points""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:79
case securesocial_controllers_ProviderController_authenticateByPost53(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]),"POST", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:80
case securesocial_controllers_ProviderController_notAuthorized54(params) => {
   call { 
        invokeHandler(securesocial.controllers.ProviderController.notAuthorized, HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Nil,"GET", """""", Routes.prefix + """not-authorized"""))
   }
}
        
}

}
     