
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
object systemEntry extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""

"""),_display_(Seq[Any](/*4.2*/main("ProConnect")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("stylesheets/splash.min.css"))),format.raw/*5.77*/("""">

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

	<div class="row clearfix topSplash">
    <div class="col-xs-4">

    </div>
		<div class="col-xs-4">


      """),_display_(Seq[Any](/*29.8*/helper/*29.14*/.form(action = routes.DbController.profileMain)/*29.61*/{_display_(Seq[Any](format.raw/*29.62*/("""
        <h3>Please enter a password for your account</h3>
          <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" class="form-control" id="pwd">
            <label for="pwd">Password Verification:</label>
            <input type="password" class="form-control" id="pwdVer">
          </div>
          <button type="submit" class="btn btn-default">Submit</button>
      """)))})),format.raw/*38.8*/("""
			</div>
			<div class="col-xs-4">

			</div>
</div>
""")))})),format.raw/*44.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 25 17:11:58 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/web-app/app/views/systemEntry.scala.html
                    HASH: ff786514eb637eb9841b69313d17afdc8f0a0e9d
                    MATRIX: 877->17|914->20|940->38|978->39|1044->70|1058->76|1119->116|1836->798|1851->804|1907->851|1946->852|2409->1284|2496->1340
                    LINES: 30->2|32->4|32->4|32->4|33->5|33->5|33->5|57->29|57->29|57->29|57->29|66->38|72->44
                    -- GENERATED --
                */
            