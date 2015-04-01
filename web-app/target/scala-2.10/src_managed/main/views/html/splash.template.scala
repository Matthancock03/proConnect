
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
object splash extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*2.31*/routes/*2.37*/.Assets.at("stylesheets/splash.min.css"))),format.raw/*2.77*/("""">
<div class="container-fluid">


	<div class="row clearfix topSplash">
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

  		<div class="col-md-3 column">
  		</div>
      <div class="col-md-6 column">
        <h1 class="header-text text-center">A New Way To Connect</h1>
  		</div>
  		<div class="col-md-3 column">
  		</div>
	</div>
	<div class="row clearfix bottomSplash">
  		<div class="col-md-3 column">
  		</div>
      <div class="col-md-6 column">

        <a href=""""),_display_(Seq[Any](/*34.19*/securesocial/*34.31*/.controllers.routes.LoginPage.login().absoluteURL())),format.raw/*34.82*/("""">
          <button class="btn center-block connect-button btn-lg">Get Connected</button>
        </a>
        <image class="logo-img" src=""""),_display_(Seq[Any](/*37.39*/routes/*37.45*/.Assets.at("images/proConnect.jpg"))),format.raw/*37.80*/("""">
  		</div>
  		<div class="col-md-3 column">
  		</div>
	</div>
</div>
""")))})),format.raw/*43.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 31 20:28:54 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/splash.scala.html
                    HASH: c3229aad8ff3cd923435e3807ab81a04881a82a2
                    MATRIX: 865->1|891->19|929->20|995->51|1009->57|1070->97|2099->1090|2120->1102|2193->1153|2371->1295|2386->1301|2443->1336|2549->1411
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|62->34|62->34|62->34|65->37|65->37|65->37|71->43
                    -- GENERATED --
                */
            