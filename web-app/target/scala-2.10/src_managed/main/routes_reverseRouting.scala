// @SOURCE:/home/misanthropic/repos/schoolWork/proConnect/web-app/conf/routes
// @HASH:54cb331bfdeebfa2da04acc0d145f823da68fb2f
// @DATE:Tue May 05 23:49:13 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:49
// @LINE:48
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:6
class ReverseNewsFeed {
    

// @LINE:6
def homeFeed(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginUser")
}
                                                
    
}
                          

// @LINE:48
class ReverseAssets {
    

// @LINE:48
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:49
class ReverseWebJarAssets {
    

// @LINE:49
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseUserController {
    

// @LINE:27
def replyMessage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "replyMessage")
}
                                                

// @LINE:26
def sendMessage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sendMessage")
}
                                                

// @LINE:28
def addConnection(email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addConnection" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseApplication {
    

// @LINE:23
def forumItem(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forumItem" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:21
def help(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "help")
}
                                                

// @LINE:16
def splashPage(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def userAware(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userAware")
}
                                                

// @LINE:18
def forum(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum")
}
                                                

// @LINE:19
def connections(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "connections")
}
                                                

// @LINE:20
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:22
def systemEntry(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "systemEntry")
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseDbController {
    

// @LINE:11
def saveUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "saveUser")
}
                                                

// @LINE:8
def editProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profileMain")
}
                                                

// @LINE:10
def getProfilePic(email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getProfilePic" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                

// @LINE:12
def getFormData(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "getFormData")
}
                                                

// @LINE:9
def profileMain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editProfile")
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseMessageController {
    

// @LINE:31
def sentMessages(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getSentMessages")
}
                                                

// @LINE:30
def message(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "message")
}
                                                

// @LINE:32
def deleteMessage(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteMessage" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseSearchController {
    

// @LINE:35
def loadSearchedProfile(email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadSearchedProfile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                

// @LINE:37
def loadProfile(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loadProfile" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:36
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:44
// @LINE:43
// @LINE:42
class ReverseAndroid {
    

// @LINE:43
def androidCreateAccount(email:String, password:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "androidCreateAccount" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)), Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
}
                                                

// @LINE:44
def androidSaveUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "androidSaveUser")
}
                                                

// @LINE:42
def androidLogin(email:String, password:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "androidLogin" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)), Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
}
                                                
    
}
                          
}
                  

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
package securesocial.controllers {

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
class ReverseRegistration {
    

// @LINE:56
def startSignUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:57
def handleStartSignUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:61
def handleStartResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reset")
}
                                                

// @LINE:62
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:58
def signUp(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:59
def handleSignUp(token:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:60
def startResetPassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reset")
}
                                                

// @LINE:63
def handleResetPassword(token:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                
    
}
                          

// @LINE:71
// @LINE:70
// @LINE:69
class ReverseProviderController {
    

// @LINE:71
def notAuthorized(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "not-authorized")
}
                                                

// @LINE:69
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                

// @LINE:70
def authenticateByPost(provider:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          

// @LINE:65
// @LINE:64
class ReversePasswordChange {
    

// @LINE:65
def handlePasswordChange(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "password")
}
                                                

// @LINE:64
def page(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "password")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
class ReverseLoginPage {
    

// @LINE:53
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:52
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:49
// @LINE:48
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseNewsFeed {
    

// @LINE:6
def homeFeed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewsFeed.homeFeed",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser"})
      }
   """
)
                        
    
}
              

// @LINE:48
class ReverseAssets {
    

// @LINE:48
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:49
class ReverseWebJarAssets {
    

// @LINE:49
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseUserController {
    

// @LINE:27
def replyMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.replyMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "replyMessage"})
      }
   """
)
                        

// @LINE:26
def sendMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.sendMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendMessage"})
      }
   """
)
                        

// @LINE:28
def addConnection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addConnection",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addConnection" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseApplication {
    

// @LINE:23
def forumItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.forumItem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forumItem" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:21
def help : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.help",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
      }
   """
)
                        

// @LINE:16
def splashPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.splashPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:17
def userAware : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.userAware",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAware"})
      }
   """
)
                        

// @LINE:18
def forum : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.forum",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum"})
      }
   """
)
                        

// @LINE:19
def connections : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.connections",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "connections"})
      }
   """
)
                        

// @LINE:20
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:22
def systemEntry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.systemEntry",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "systemEntry"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseDbController {
    

// @LINE:11
def saveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.saveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveUser"})
      }
   """
)
                        

// @LINE:8
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.editProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileMain"})
      }
   """
)
                        

// @LINE:10
def getProfilePic : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.getProfilePic",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getProfilePic" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:12
def getFormData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.getFormData",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getFormData"})
      }
   """
)
                        

// @LINE:9
def profileMain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.profileMain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile"})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseMessageController {
    

// @LINE:31
def sentMessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.sentMessages",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getSentMessages"})
      }
   """
)
                        

// @LINE:30
def message : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.message",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
      }
   """
)
                        

// @LINE:32
def deleteMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.deleteMessage",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteMessage" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseSearchController {
    

// @LINE:35
def loadSearchedProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.loadSearchedProfile",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadSearchedProfile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:37
def loadProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.loadProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadProfile" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:36
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:44
// @LINE:43
// @LINE:42
class ReverseAndroid {
    

// @LINE:43
def androidCreateAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Android.androidCreateAccount",
   """
      function(email,password) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "androidCreateAccount" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
      }
   """
)
                        

// @LINE:44
def androidSaveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Android.androidSaveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "androidSaveUser"})
      }
   """
)
                        

// @LINE:42
def androidLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Android.androidLogin",
   """
      function(email,password) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "androidLogin" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
      }
   """
)
                        
    
}
              
}
        

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
package securesocial.controllers.javascript {

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
class ReverseRegistration {
    

// @LINE:56
def startSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:57
def handleStartSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:61
def handleStartResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:62
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:58
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:59
def handleSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:60
def startResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:63
def handleResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleResetPassword",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        
    
}
              

// @LINE:71
// @LINE:70
// @LINE:69
class ReverseProviderController {
    

// @LINE:71
def notAuthorized : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.notAuthorized",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "not-authorized"})
      }
   """
)
                        

// @LINE:69
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:70
def authenticateByPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        
    
}
              

// @LINE:65
// @LINE:64
class ReversePasswordChange {
    

// @LINE:65
def handlePasswordChange : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        

// @LINE:64
def page : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
class ReverseLoginPage {
    

// @LINE:53
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:52
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:49
// @LINE:48
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:6
class ReverseNewsFeed {
    

// @LINE:6
def homeFeed(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewsFeed.homeFeed(), HandlerDef(this, "controllers.NewsFeed", "homeFeed", Seq(), "GET", """########## Web App##################""", _prefix + """loginUser""")
)
                      
    
}
                          

// @LINE:48
class ReverseAssets {
    

// @LINE:48
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:49
class ReverseWebJarAssets {
    

// @LINE:49
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
class ReverseUserController {
    

// @LINE:27
def replyMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.replyMessage(), HandlerDef(this, "controllers.UserController", "replyMessage", Seq(), "GET", """""", _prefix + """replyMessage""")
)
                      

// @LINE:26
def sendMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.sendMessage(), HandlerDef(this, "controllers.UserController", "sendMessage", Seq(), "GET", """""", _prefix + """sendMessage""")
)
                      

// @LINE:28
def addConnection(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addConnection(email), HandlerDef(this, "controllers.UserController", "addConnection", Seq(classOf[String]), "GET", """""", _prefix + """addConnection""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseApplication {
    

// @LINE:23
def forumItem(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.forumItem(id), HandlerDef(this, "controllers.Application", "forumItem", Seq(classOf[Long]), "GET", """""", _prefix + """forumItem""")
)
                      

// @LINE:21
def help(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Seq(), "GET", """""", _prefix + """help""")
)
                      

// @LINE:16
def splashPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.splashPage(), HandlerDef(this, "controllers.Application", "splashPage", Seq(), "GET", """POST     /login                   controllers.Application.login()""", _prefix + """""")
)
                      

// @LINE:17
def userAware(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.userAware(), HandlerDef(this, "controllers.Application", "userAware", Seq(), "GET", """""", _prefix + """userAware""")
)
                      

// @LINE:18
def forum(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.forum(), HandlerDef(this, "controllers.Application", "forum", Seq(), "GET", """""", _prefix + """forum""")
)
                      

// @LINE:19
def connections(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.connections(), HandlerDef(this, "controllers.Application", "connections", Seq(), "GET", """""", _prefix + """connections""")
)
                      

// @LINE:20
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:22
def systemEntry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.systemEntry(), HandlerDef(this, "controllers.Application", "systemEntry", Seq(), "GET", """""", _prefix + """systemEntry""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseDbController {
    

// @LINE:11
def saveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.saveUser(), HandlerDef(this, "controllers.DbController", "saveUser", Seq(), "POST", """""", _prefix + """saveUser""")
)
                      

// @LINE:8
def editProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.editProfile(), HandlerDef(this, "controllers.DbController", "editProfile", Seq(), "GET", """""", _prefix + """profileMain""")
)
                      

// @LINE:10
def getProfilePic(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.getProfilePic(email), HandlerDef(this, "controllers.DbController", "getProfilePic", Seq(classOf[String]), "GET", """""", _prefix + """getProfilePic""")
)
                      

// @LINE:12
def getFormData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.getFormData(), HandlerDef(this, "controllers.DbController", "getFormData", Seq(), "POST", """""", _prefix + """getFormData""")
)
                      

// @LINE:9
def profileMain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.profileMain(), HandlerDef(this, "controllers.DbController", "profileMain", Seq(), "GET", """""", _prefix + """editProfile""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseMessageController {
    

// @LINE:31
def sentMessages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.sentMessages(), HandlerDef(this, "controllers.MessageController", "sentMessages", Seq(), "GET", """""", _prefix + """getSentMessages""")
)
                      

// @LINE:30
def message(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.message(), HandlerDef(this, "controllers.MessageController", "message", Seq(), "GET", """""", _prefix + """message""")
)
                      

// @LINE:32
def deleteMessage(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.deleteMessage(id), HandlerDef(this, "controllers.MessageController", "deleteMessage", Seq(classOf[Long]), "GET", """""", _prefix + """deleteMessage""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseSearchController {
    

// @LINE:35
def loadSearchedProfile(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.loadSearchedProfile(email), HandlerDef(this, "controllers.SearchController", "loadSearchedProfile", Seq(classOf[String]), "GET", """""", _prefix + """loadSearchedProfile""")
)
                      

// @LINE:37
def loadProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.loadProfile(id), HandlerDef(this, "controllers.SearchController", "loadProfile", Seq(classOf[Long]), "GET", """""", _prefix + """loadProfile""")
)
                      

// @LINE:36
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.search(), HandlerDef(this, "controllers.SearchController", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:44
// @LINE:43
// @LINE:42
class ReverseAndroid {
    

// @LINE:43
def androidCreateAccount(email:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Android.androidCreateAccount(email, password), HandlerDef(this, "controllers.Android", "androidCreateAccount", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """androidCreateAccount""")
)
                      

// @LINE:44
def androidSaveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Android.androidSaveUser(), HandlerDef(this, "controllers.Android", "androidSaveUser", Seq(), "POST", """""", _prefix + """androidSaveUser""")
)
                      

// @LINE:42
def androidLogin(email:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Android.androidLogin(email, password), HandlerDef(this, "controllers.Android", "androidLogin", Seq(classOf[String], classOf[String]), "GET", """######### Android###################""", _prefix + """androidLogin""")
)
                      
    
}
                          
}
        

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
package securesocial.controllers.ref {


// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
class ReverseRegistration {
    

// @LINE:56
def startSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Seq(), "GET", """ User Registration and password handling (only needed if you are using UsernamePasswordProvider)""", _prefix + """signup""")
)
                      

// @LINE:57
def handleStartSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:61
def handleStartResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Seq(), "POST", """""", _prefix + """reset""")
)
                      

// @LINE:62
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """reset/$token<[^/]+>""")
)
                      

// @LINE:58
def signUp(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]), "GET", """""", _prefix + """signup/$token<[^/]+>""")
)
                      

// @LINE:59
def handleSignUp(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]), "POST", """""", _prefix + """signup/$token<[^/]+>""")
)
                      

// @LINE:60
def startResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Seq(), "GET", """""", _prefix + """reset""")
)
                      

// @LINE:63
def handleResetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]), "POST", """""", _prefix + """reset/$token<[^/]+>""")
)
                      
    
}
                          

// @LINE:71
// @LINE:70
// @LINE:69
class ReverseProviderController {
    

// @LINE:71
def notAuthorized(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.notAuthorized(), HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Seq(), "GET", """""", _prefix + """not-authorized""")
)
                      

// @LINE:69
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]), "GET", """ Providers entry points""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

// @LINE:70
def authenticateByPost(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]), "POST", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          

// @LINE:65
// @LINE:64
class ReversePasswordChange {
    

// @LINE:65
def handlePasswordChange(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.handlePasswordChange(), HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq(), "POST", """""", _prefix + """password""")
)
                      

// @LINE:64
def page(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.page(), HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Seq(), "GET", """""", _prefix + """password""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
class ReverseLoginPage {
    

// @LINE:53
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.logout(), HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:52
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.login(), HandlerDef(this, "securesocial.controllers.LoginPage", "login", Seq(), "GET", """ Login page""", _prefix + """login""")
)
                      
    
}
                          
}
        
    