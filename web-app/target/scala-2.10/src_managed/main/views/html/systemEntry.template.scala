
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
object systemEntry extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConnect")/*6.20*/{_display_(Seq[Any](format.raw/*6.21*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*7.31*/routes/*7.37*/.Assets.at("stylesheets/splash.min.css"))),format.raw/*7.77*/("""">

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

	<div class="row clearfix ">
    <div class="col-xs-4">

    </div>
		<div class="col-xs-4 topSplash">


      """),_display_(Seq[Any](/*31.8*/helper/*31.14*/.form(action = routes.DbController.profileMain)/*31.61*/{_display_(Seq[Any](format.raw/*31.62*/("""
        <h3>Please enter a password to associate with your account.</h3>
          <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" class="form-control" id="pwd">
            <label for="pwd">Password Verification:</label>
            <input type="password" class="form-control" id="pwdVer">
          </div>
          <button type="submit" class="btn btn-default">Submit</button>
      """)))})),format.raw/*40.8*/("""
			</div>
			<div class="col-xs-4">

			</div>
</div>
""")))})),format.raw/*46.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 22:00:22 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/systemEntry.scala.html
                    HASH: e8c82e5fd156d641e050313a6d3c447cf0af928c
                    MATRIX: 783->1|909->17|937->36|974->39|1000->57|1038->58|1104->89|1118->95|1179->135|1897->818|1912->824|1968->871|2007->872|2485->1319|2572->1375
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|59->31|59->31|59->31|59->31|68->40|74->46
                    -- GENERATED --
                */
            