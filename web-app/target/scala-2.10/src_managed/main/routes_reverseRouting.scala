// @SOURCE:/home/beyondprosthetics/repos/school/proConnect/web-app/conf/routes
// @HASH:bbc63cdce83ded2a388b5ca4924abf5fdd4275ce
// @DATE:Fri Apr 24 13:50:53 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:8
class ReverseNewsFeed {
    

// @LINE:8
def homeFeed(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginUser")
}
                                                
    
}
                          

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:26
class ReverseWebJarAssets {
    

// @LINE:26
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
class ReverseApplication {
    

// @LINE:15
def help(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "help")
}
                                                

// @LINE:7
def splashPage(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:9
def userAware(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userAware")
}
                                                

// @LINE:16
def message(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "message")
}
                                                

// @LINE:12
def forum(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum")
}
                                                

// @LINE:13
def connections(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "connections")
}
                                                

// @LINE:14
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:17
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
class ReverseDbController {
    

// @LINE:11
def profileMain(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profileMain")
}
                                                

// @LINE:10
def editProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editProfile")
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
class ReverseAndroid {
    

// @LINE:21
def androidCreateAccount(name:String, password:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "androidCreateAccount" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("name", name)), Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
}
                                                

// @LINE:20
def androidLogin(name:String, password:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "androidLogin" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("name", name)), Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
}
                                                
    
}
                          
}
                  

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:30
// @LINE:29
package securesocial.controllers {

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseRegistration {
    

// @LINE:33
def startSignUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:34
def handleStartSignUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:38
def handleStartResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reset")
}
                                                

// @LINE:39
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:35
def signUp(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:36
def handleSignUp(token:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:37
def startResetPassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reset")
}
                                                

// @LINE:40
def handleResetPassword(token:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                
    
}
                          

// @LINE:48
// @LINE:47
// @LINE:46
class ReverseProviderController {
    

// @LINE:48
def notAuthorized(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "not-authorized")
}
                                                

// @LINE:46
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                

// @LINE:47
def authenticateByPost(provider:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          

// @LINE:42
// @LINE:41
class ReversePasswordChange {
    

// @LINE:42
def handlePasswordChange(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "password")
}
                                                

// @LINE:41
def page(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "password")
}
                                                
    
}
                          

// @LINE:30
// @LINE:29
class ReverseLoginPage {
    

// @LINE:30
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:29
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:8
class ReverseNewsFeed {
    

// @LINE:8
def homeFeed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewsFeed.homeFeed",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser"})
      }
   """
)
                        
    
}
              

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:26
class ReverseWebJarAssets {
    

// @LINE:26
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
class ReverseApplication {
    

// @LINE:15
def help : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.help",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "help"})
      }
   """
)
                        

// @LINE:7
def splashPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.splashPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def userAware : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.userAware",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAware"})
      }
   """
)
                        

// @LINE:16
def message : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.message",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
      }
   """
)
                        

// @LINE:12
def forum : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.forum",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum"})
      }
   """
)
                        

// @LINE:13
def connections : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.connections",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "connections"})
      }
   """
)
                        

// @LINE:14
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:17
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
class ReverseDbController {
    

// @LINE:11
def profileMain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.profileMain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileMain"})
      }
   """
)
                        

// @LINE:10
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.editProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
class ReverseAndroid {
    

// @LINE:21
def androidCreateAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Android.androidCreateAccount",
   """
      function(name,password) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "androidCreateAccount" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
      }
   """
)
                        

// @LINE:20
def androidLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Android.androidLogin",
   """
      function(name,password) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "androidLogin" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
      }
   """
)
                        
    
}
              
}
        

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:30
// @LINE:29
package securesocial.controllers.javascript {

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseRegistration {
    

// @LINE:33
def startSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:34
def handleStartSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:38
def handleStartResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:39
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:35
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:36
def handleSignUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:37
def startResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
      }
   """
)
                        

// @LINE:40
def handleResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleResetPassword",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        
    
}
              

// @LINE:48
// @LINE:47
// @LINE:46
class ReverseProviderController {
    

// @LINE:48
def notAuthorized : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.notAuthorized",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "not-authorized"})
      }
   """
)
                        

// @LINE:46
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:47
def authenticateByPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        
    
}
              

// @LINE:42
// @LINE:41
class ReversePasswordChange {
    

// @LINE:42
def handlePasswordChange : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        

// @LINE:41
def page : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password"})
      }
   """
)
                        
    
}
              

// @LINE:30
// @LINE:29
class ReverseLoginPage {
    

// @LINE:30
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:29
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
        


// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {


// @LINE:8
class ReverseNewsFeed {
    

// @LINE:8
def homeFeed(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewsFeed.homeFeed(), HandlerDef(this, "controllers.NewsFeed", "homeFeed", Seq(), "GET", """""", _prefix + """loginUser""")
)
                      
    
}
                          

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:26
class ReverseWebJarAssets {
    

// @LINE:26
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:7
class ReverseApplication {
    

// @LINE:15
def help(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.help(), HandlerDef(this, "controllers.Application", "help", Seq(), "GET", """""", _prefix + """help""")
)
                      

// @LINE:7
def splashPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.splashPage(), HandlerDef(this, "controllers.Application", "splashPage", Seq(), "GET", """########## Web App##################
POST     /login                   controllers.Application.login()""", _prefix + """""")
)
                      

// @LINE:9
def userAware(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.userAware(), HandlerDef(this, "controllers.Application", "userAware", Seq(), "GET", """""", _prefix + """userAware""")
)
                      

// @LINE:16
def message(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.message(), HandlerDef(this, "controllers.Application", "message", Seq(), "GET", """""", _prefix + """message""")
)
                      

// @LINE:12
def forum(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.forum(), HandlerDef(this, "controllers.Application", "forum", Seq(), "GET", """""", _prefix + """forum""")
)
                      

// @LINE:13
def connections(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.connections(), HandlerDef(this, "controllers.Application", "connections", Seq(), "GET", """""", _prefix + """connections""")
)
                      

// @LINE:14
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:17
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
class ReverseDbController {
    

// @LINE:11
def profileMain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.profileMain(), HandlerDef(this, "controllers.DbController", "profileMain", Seq(), "GET", """""", _prefix + """profileMain""")
)
                      

// @LINE:10
def editProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.editProfile(), HandlerDef(this, "controllers.DbController", "editProfile", Seq(), "GET", """""", _prefix + """editProfile""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
class ReverseAndroid {
    

// @LINE:21
def androidCreateAccount(name:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Android.androidCreateAccount(name, password), HandlerDef(this, "controllers.Android", "androidCreateAccount", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """androidCreateAccount""")
)
                      

// @LINE:20
def androidLogin(name:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Android.androidLogin(name, password), HandlerDef(this, "controllers.Android", "androidLogin", Seq(classOf[String], classOf[String]), "GET", """######### Android###################""", _prefix + """androidLogin""")
)
                      
    
}
                          
}
        

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:30
// @LINE:29
package securesocial.controllers.ref {


// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseRegistration {
    

// @LINE:33
def startSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Seq(), "GET", """ User Registration and password handling (only needed if you are using UsernamePasswordProvider)""", _prefix + """signup""")
)
                      

// @LINE:34
def handleStartSignUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:38
def handleStartResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Seq(), "POST", """""", _prefix + """reset""")
)
                      

// @LINE:39
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """reset/$token<[^/]+>""")
)
                      

// @LINE:35
def signUp(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]), "GET", """""", _prefix + """signup/$token<[^/]+>""")
)
                      

// @LINE:36
def handleSignUp(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]), "POST", """""", _prefix + """signup/$token<[^/]+>""")
)
                      

// @LINE:37
def startResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Seq(), "GET", """""", _prefix + """reset""")
)
                      

// @LINE:40
def handleResetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]), "POST", """""", _prefix + """reset/$token<[^/]+>""")
)
                      
    
}
                          

// @LINE:48
// @LINE:47
// @LINE:46
class ReverseProviderController {
    

// @LINE:48
def notAuthorized(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.notAuthorized(), HandlerDef(this, "securesocial.controllers.ProviderController", "notAuthorized", Seq(), "GET", """""", _prefix + """not-authorized""")
)
                      

// @LINE:46
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]), "GET", """ Providers entry points""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

// @LINE:47
def authenticateByPost(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]), "POST", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          

// @LINE:42
// @LINE:41
class ReversePasswordChange {
    

// @LINE:42
def handlePasswordChange(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.handlePasswordChange(), HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq(), "POST", """""", _prefix + """password""")
)
                      

// @LINE:41
def page(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.page(), HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Seq(), "GET", """""", _prefix + """password""")
)
                      
    
}
                          

// @LINE:30
// @LINE:29
class ReverseLoginPage {
    

// @LINE:30
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.logout(), HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:29
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.login(), HandlerDef(this, "securesocial.controllers.LoginPage", "login", Seq(), "GET", """ Login page""", _prefix + """login""")
)
                      
    
}
                          
}
        
    