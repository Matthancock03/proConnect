
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/(loginFormData : Form[views.formData.loginFormData]))),format.raw/*2.54*/("""
"""),_display_(Seq[Any](/*3.2*/(signUpFormData : Form[views.formData.signUpFormData]))),format.raw/*3.56*/("""

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
				name=""""),_display_(Seq[Any](/*34.12*/signUpFormData("email")/*34.35*/.name)),format.raw/*34.40*/(""""
				id=""""),_display_(Seq[Any](/*35.10*/signUpFormData("email")/*35.33*/.id)),format.raw/*35.36*/(""""
				value=""""),_display_(Seq[Any](/*36.13*/signUpFormData("email")/*36.36*/.value)),format.raw/*36.42*/(""""
			/>
		<input class="form-control"
				placeholder="Password"
				type="password"
				name=""""),_display_(Seq[Any](/*41.12*/signUpFormData("password")/*41.38*/.name)),format.raw/*41.43*/(""""
				id=""""),_display_(Seq[Any](/*42.10*/signUpFormData("password")/*42.36*/.id)),format.raw/*42.39*/(""""
				value=""""),_display_(Seq[Any](/*43.13*/signUpFormData("password")/*43.39*/.value)),format.raw/*43.45*/(""""
			/>
		<input class="form-control"
				placeholder="Verify Password"
				type="password"
				name=""""),_display_(Seq[Any](/*48.12*/signUpFormData("passwordVerification")/*48.50*/.name)),format.raw/*48.55*/(""""
				id=""""),_display_(Seq[Any](/*49.10*/signUpFormData("passwordVerification")/*49.48*/.id)),format.raw/*49.51*/(""""
				value=""""),_display_(Seq[Any](/*50.13*/signUpFormData("passwordVerification")/*50.51*/.value)),format.raw/*50.57*/(""""
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
					name=""""),_display_(Seq[Any](/*63.13*/loginFormData("email")/*63.35*/.name)),format.raw/*63.40*/(""""
					id=""""),_display_(Seq[Any](/*64.11*/loginFormData("email")/*64.33*/.id)),format.raw/*64.36*/(""""
					value=""""),_display_(Seq[Any](/*65.14*/loginFormData("email")/*65.36*/.value)),format.raw/*65.42*/(""""
				/>
			<input class="form-control"
					placeholder="Password"
					type="password"
					name=""""),_display_(Seq[Any](/*70.13*/loginFormData("password")/*70.38*/.name)),format.raw/*70.43*/(""""
					id=""""),_display_(Seq[Any](/*71.11*/loginFormData("password")/*71.36*/.id)),format.raw/*71.39*/(""""
					value=""""),_display_(Seq[Any](/*72.14*/loginFormData("password")/*72.39*/.value)),format.raw/*72.45*/(""""
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
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 22 13:54:18 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/login.scala.html
                    HASH: 895539f9caa3b6b9626d9507a258c826a46eb2c3
                    MATRIX: 556->1|683->18|719->20|792->72|828->74|903->128|931->147|967->149|993->167|1032->169|1748->850|1846->939|1885->940|2086->1105|2118->1128|2145->1133|2192->1144|2224->1167|2249->1170|2299->1184|2331->1207|2359->1213|2491->1309|2526->1335|2553->1340|2600->1351|2635->1377|2660->1380|2710->1394|2745->1420|2773->1426|2912->1529|2959->1567|2986->1572|3033->1583|3080->1621|3105->1624|3155->1638|3202->1676|3230->1682|3463->1884|3502->1888|3599->1976|3638->1977|3842->2145|3873->2167|3900->2172|3948->2184|3979->2206|4004->2209|4055->2224|4086->2246|4114->2252|4251->2353|4285->2378|4312->2383|4360->2395|4394->2420|4419->2423|4470->2438|4504->2463|4532->2469|4818->2719|4847->2726|4894->2742|4934->2751
                    LINES: 19->1|23->1|24->2|24->2|25->3|25->3|27->6|28->7|28->7|28->7|49->28|49->28|49->28|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|62->41|62->41|62->41|63->42|63->42|63->42|64->43|64->43|64->43|69->48|69->48|69->48|70->49|70->49|70->49|71->50|71->50|71->50|76->55|78->57|78->57|78->57|84->63|84->63|84->63|85->64|85->64|85->64|86->65|86->65|86->65|91->70|91->70|91->70|92->71|92->71|92->71|93->72|93->72|93->72|99->78|99->78|101->80|103->82
                    -- GENERATED --
                */
            