// @SOURCE:/home/misanthropic/repos/schoolWork/proConnect/web-app/conf/routes
// @HASH:4806ce85d09b2ec03586d3551e77e259ae3f0c36
// @DATE:Sun Mar 22 14:46:14 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseDbController {
    

// @LINE:8
def signUpUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signUpUser")
}
                                                

// @LINE:7
def loginUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "loginUser")
}
                                                

// @LINE:9
def loginPage(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:5
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:6
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseDbController {
    

// @LINE:8
def signUpUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.signUpUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpUser"})
      }
   """
)
                        

// @LINE:7
def loginUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.loginUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser"})
      }
   """
)
                        

// @LINE:9
def loginPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DbController.loginPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:5
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseDbController {
    

// @LINE:8
def signUpUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.signUpUser(), HandlerDef(this, "controllers.DbController", "signUpUser", Seq(), "POST", """""", _prefix + """signUpUser""")
)
                      

// @LINE:7
def loginUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.loginUser(), HandlerDef(this, "controllers.DbController", "loginUser", Seq(), "POST", """""", _prefix + """loginUser""")
)
                      

// @LINE:9
def loginPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DbController.loginPage(), HandlerDef(this, "controllers.DbController", "loginPage", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:5
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    