
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
	<div class="container-fluid">
	<nav class="navbar navbar-inverse">

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
	<div>
	<div class="col-xs-2"></div>

  """),_display_(Seq[Any](/*28.4*/form(routes.DbController.signUpUser(), 'class -> "form-login col-xs-4")/*28.75*/{_display_(Seq[Any](format.raw/*28.76*/("""
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

	"""),_display_(Seq[Any](/*57.3*/form(routes.DbController.loginUser(), 'class -> "form-login col-xs-4")/*57.73*/{_display_(Seq[Any](format.raw/*57.74*/("""
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
                    DATE: Fri Mar 27 21:31:25 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/login.scala.html
                    HASH: 027ad8dcd173317a67ec4f659058f3bdd37f2dd0
                    MATRIX: 845->2|1070->116|1099->136|1135->138|1161->156|1200->158|1884->807|1964->878|2003->879|2204->1044|2232->1063|2259->1068|2306->1079|2334->1098|2359->1101|2409->1115|2437->1134|2465->1140|2597->1236|2628->1258|2655->1263|2702->1274|2733->1296|2758->1299|2808->1313|2839->1335|2867->1341|3006->1444|3049->1478|3076->1483|3123->1494|3166->1528|3191->1531|3241->1545|3284->1579|3312->1585|3545->1787|3584->1791|3663->1861|3702->1862|3906->2030|3933->2048|3960->2053|4008->2065|4035->2083|4060->2086|4111->2101|4138->2119|4166->2125|4303->2226|4333->2247|4360->2252|4408->2264|4438->2285|4463->2288|4514->2303|4544->2324|4572->2330|4858->2580|4887->2587|4934->2603|4974->2612
                    LINES: 26->2|30->2|33->6|34->7|34->7|34->7|55->28|55->28|55->28|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|68->41|68->41|68->41|69->42|69->42|69->42|70->43|70->43|70->43|75->48|75->48|75->48|76->49|76->49|76->49|77->50|77->50|77->50|82->55|84->57|84->57|84->57|90->63|90->63|90->63|91->64|91->64|91->64|92->65|92->65|92->65|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|105->78|105->78|107->80|109->82
                    -- GENERATED --
                */
            