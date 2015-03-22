
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[views.formData.loginFormData],Form[views.formData.signUpFormData],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(message: String,loginForm : Form[views.formData.loginFormData], signUpForm : Form[views.formData.signUpFormData]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.116*/("""


"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main("ProConnect")/*7.20*/ {_display_(Seq[Any](format.raw/*7.22*/("""

	<nav class="navbar navbar-inverse">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">ProConnect</a>
				</div>
				<div id="navbar" class="collapse navbar-collapse">
			</div>
		</nav>

	<div class="background-image"></div>
	<div class="container">
	<div class="col-lg-2 col-md-2 col-sm-2"></div>

  """),_display_(Seq[Any](/*28.4*/form(routes.DbController.signUpUser(), 'class -> "form-login col-lg-4 col-md-4 col-sm-4")/*28.93*/{_display_(Seq[Any](format.raw/*28.94*/("""
	<div class="form-group">
		<h2 class="form-login-heading">Sign Up</h2>
				<input class="form-control"
				placeholder="Email Address"
				type="email"
				name=""""),_display_(Seq[Any](/*34.12*/signUpForm("email")/*34.31*/.name)),format.raw/*34.36*/(""""
				id=""""),_display_(Seq[Any](/*35.10*/signUpForm("email")/*35.29*/.id)),format.raw/*35.32*/(""""
				value=""""),_display_(Seq[Any](/*36.13*/signUpForm("email")/*36.32*/.value)),format.raw/*36.38*/(""""
			/>
		<input class="form-control"
				placeholder="Password"
				type="password"
				name=""""),_display_(Seq[Any](/*41.12*/signUpForm("password")/*41.34*/.name)),format.raw/*41.39*/(""""
				id=""""),_display_(Seq[Any](/*42.10*/signUpForm("password")/*42.32*/.id)),format.raw/*42.35*/(""""
				value=""""),_display_(Seq[Any](/*43.13*/signUpForm("password")/*43.35*/.value)),format.raw/*43.41*/(""""
			/>
		<input class="form-control"
				placeholder="Verify Password"
				type="password"
				name=""""),_display_(Seq[Any](/*48.12*/signUpForm("passwordVerification")/*48.46*/.name)),format.raw/*48.51*/(""""
				id=""""),_display_(Seq[Any](/*49.10*/signUpForm("passwordVerification")/*49.44*/.id)),format.raw/*49.47*/(""""
				value=""""),_display_(Seq[Any](/*50.13*/signUpForm("passwordVerification")/*50.47*/.value)),format.raw/*50.53*/(""""
			/>
		<div class="checkbox"><label><input type="checkbox" value="remember-me" />Remember Me</label>
		</div><button class="btn btn-success btn-lg btn-block" type="submit">Sign Up</button>
	</div>
	""")))})),format.raw/*55.3*/("""

	"""),_display_(Seq[Any](/*57.3*/form(routes.DbController.loginUser(), 'class -> "form-login col-lg-4 col-md-4 col-sm-4")/*57.91*/{_display_(Seq[Any](format.raw/*57.92*/("""
	<div class="form-group">
		<h2 class="form-signin-heading">Welcome</h2>
			<input class="form-control"
					placeholder="Email Address"
					type="email"
					name=""""),_display_(Seq[Any](/*63.13*/loginForm("email")/*63.31*/.name)),format.raw/*63.36*/(""""
					id=""""),_display_(Seq[Any](/*64.11*/loginForm("email")/*64.29*/.id)),format.raw/*64.32*/(""""
					value=""""),_display_(Seq[Any](/*65.14*/loginForm("email")/*65.32*/.value)),format.raw/*65.38*/(""""
				/>
			<input class="form-control"
					placeholder="Password"
					type="password"
					name=""""),_display_(Seq[Any](/*70.13*/loginForm("password")/*70.34*/.name)),format.raw/*70.39*/(""""
					id=""""),_display_(Seq[Any](/*71.11*/loginForm("password")/*71.32*/.id)),format.raw/*71.35*/(""""
					value=""""),_display_(Seq[Any](/*72.14*/loginForm("password")/*72.35*/.value)),format.raw/*72.41*/(""""
				/>

		<div class="checkbox"><label>
		<input type="checkbox" value="remember-me" />Remember Me</label></div>
		<button class="btn btn-primary btn-lg btn-block" type="submit">Login In</button>
		<h5 lass="form-signin-heading" style="color:red">"""),_display_(Seq[Any](/*78.53*/message)),format.raw/*78.60*/("""</h5>
	</div>
	""")))})),format.raw/*80.3*/("""
</div>
""")))})),format.raw/*82.2*/("""
"""))}
    }
    
    def render(message:String,loginForm:Form[views.formData.loginFormData],signUpForm:Form[views.formData.signUpFormData]): play.api.templates.HtmlFormat.Appendable = apply(message,loginForm,signUpForm)
    
    def f:((String,Form[views.formData.loginFormData],Form[views.formData.signUpFormData]) => play.api.templates.HtmlFormat.Appendable) = (message,loginForm,signUpForm) => apply(message,loginForm,signUpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 22 15:10:41 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/login.scala.html
                    HASH: 0569d97200ec88492ab3e78664d3b960ab3e76da
                    MATRIX: 845->2|1070->116|1099->136|1135->138|1161->156|1200->158|1916->839|2014->928|2053->929|2254->1094|2282->1113|2309->1118|2356->1129|2384->1148|2409->1151|2459->1165|2487->1184|2515->1190|2647->1286|2678->1308|2705->1313|2752->1324|2783->1346|2808->1349|2858->1363|2889->1385|2917->1391|3056->1494|3099->1528|3126->1533|3173->1544|3216->1578|3241->1581|3291->1595|3334->1629|3362->1635|3595->1837|3634->1841|3731->1929|3770->1930|3974->2098|4001->2116|4028->2121|4076->2133|4103->2151|4128->2154|4179->2169|4206->2187|4234->2193|4371->2294|4401->2315|4428->2320|4476->2332|4506->2353|4531->2356|4582->2371|4612->2392|4640->2398|4926->2648|4955->2655|5002->2671|5042->2680
                    LINES: 26->2|30->2|33->6|34->7|34->7|34->7|55->28|55->28|55->28|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|68->41|68->41|68->41|69->42|69->42|69->42|70->43|70->43|70->43|75->48|75->48|75->48|76->49|76->49|76->49|77->50|77->50|77->50|82->55|84->57|84->57|84->57|90->63|90->63|90->63|91->64|91->64|91->64|92->65|92->65|92->65|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|105->78|105->78|107->80|109->82
                    -- GENERATED --
                */
            