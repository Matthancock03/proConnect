
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
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

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

	<form class="form-login col-lg-4 col-md-4 col-sm-4" action = """"),_display_(Seq[Any](/*24.65*/routes/*24.71*/.Application.register())),format.raw/*24.94*/("""" method ="post" role="form">
	<h2 class="form-login-heading">Sign Up</h2>
	<input class="form-control" placeholder="Email Address" type="email" name="email" />
	<input class="form-control" placeholder="Password" type="password" name="password" />
	<input class="form-control" placeholder="Verify Password" type="password" name="passwordVerification" />
	<div class="checkbox"><label><input type="checkbox" value="remember-me" />Remember Me</label>
	</div><button class="btn btn-success btn-lg btn-block" type="submit">Sign Up</button>
	</form>

	<form class="form-signin col-lg-4 col-md-4 col-sm-4" action = """"),_display_(Seq[Any](/*33.66*/routes/*33.72*/.Application.login())),format.raw/*33.92*/("""" method = "post" role="form">
	<h2 class="form-signin-heading">Welcome</h2>
	<input class="form-control" placeholder="Email Address" type="email" name="email" />
	<input class="form-control" placeholder="Password" type="password" name="password" />
	<div class="checkbox"><label>
	<input type="checkbox" value="remember-me" />Remember Me</label></div>
	<button class="btn btn-primary btn-lg btn-block" type="submit">Login In</button>
	<h5 lass="form-signin-heading" style="color:red">"""),_display_(Seq[Any](/*40.52*/message)),format.raw/*40.59*/("""</h5>
	</form></div>

""")))})),format.raw/*43.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 17 09:55:17 PST 2015
                    SOURCE: /home/misanthropic/repos/proConnect/app/views/login.scala.html
                    HASH: 0711351581878a7cc9e268329cb684156ba3def0
                    MATRIX: 556->1|667->18|704->21|730->39|769->41|1547->783|1562->789|1607->812|2254->1423|2269->1429|2311->1449|2833->1935|2862->1942|2916->1965
                    LINES: 19->1|22->1|24->3|24->3|24->3|45->24|45->24|45->24|54->33|54->33|54->33|61->40|61->40|64->43
                    -- GENERATED --
                */
            