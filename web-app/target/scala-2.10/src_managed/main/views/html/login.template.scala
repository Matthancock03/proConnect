
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
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
                    DATE: Sun Mar 22 14:37:44 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/login.scala.html
                    HASH: 9af4e54f8e165b7775461327f0c0506b7f5b0c3b
                    MATRIX: 627->2|852->116|881->136|917->138|943->156|982->158|1698->839|1796->928|1835->929|2036->1094|2064->1113|2091->1118|2138->1129|2166->1148|2191->1151|2241->1165|2269->1184|2297->1190|2429->1286|2460->1308|2487->1313|2534->1324|2565->1346|2590->1349|2640->1363|2671->1385|2699->1391|2838->1494|2881->1528|2908->1533|2955->1544|2998->1578|3023->1581|3073->1595|3116->1629|3144->1635|3377->1837|3416->1841|3513->1929|3552->1930|3756->2098|3783->2116|3810->2121|3858->2133|3885->2151|3910->2154|3961->2169|3988->2187|4016->2193|4153->2294|4183->2315|4210->2320|4258->2332|4288->2353|4313->2356|4364->2371|4394->2392|4422->2398|4708->2648|4737->2655|4784->2671|4824->2680
                    LINES: 19->2|23->2|26->6|27->7|27->7|27->7|48->28|48->28|48->28|54->34|54->34|54->34|55->35|55->35|55->35|56->36|56->36|56->36|61->41|61->41|61->41|62->42|62->42|62->42|63->43|63->43|63->43|68->48|68->48|68->48|69->49|69->49|69->49|70->50|70->50|70->50|75->55|77->57|77->57|77->57|83->63|83->63|83->63|84->64|84->64|84->64|85->65|85->65|85->65|90->70|90->70|90->70|91->71|91->71|91->71|92->72|92->72|92->72|98->78|98->78|100->80|102->82
                    -- GENERATED --
                */
            