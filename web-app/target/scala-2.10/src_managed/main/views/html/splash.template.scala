
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

  		<div class="col-xs-3 column">
  		</div>
      <div class="col-xs-6 column">
        <h1 class ="header-text text-center">ProConnect</h1>
        <h3 class="text-center top-text">A New Way To Connect</h3>

  		</div>
  		<div class="col-xs-3 column">
  		</div>
	</div>
	<div class="row clearfix bottomSplash">
  		<div class="col-xs-3 column text-div">
        <image class="logo-img " src=""""),_display_(Seq[Any](/*33.40*/routes/*33.46*/.Assets.at("images/proConnect.jpg"))),format.raw/*33.81*/("""">

  		</div>
      <div class="col-xs-6 column">
        <h3 class="text-center bottom-text">Come meet all the professionals already exploring
          what ProConnect has to offer. Take your professional network to the next level and
          get connected in a way you never thought possible.</h3>
        <a href=""""),_display_(Seq[Any](/*40.19*/securesocial/*40.31*/.controllers.routes.LoginPage.login().absoluteURL())),format.raw/*40.82*/("""">
          <button class="btn center-block connect-button btn-lg">Get Connected</button>
        </a>
  		</div>
  		<div class="col-xs-3 column">
  		</div>
	</div>
</div>
""")))})),format.raw/*48.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 31 23:11:55 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/splash.scala.html
                    HASH: 25a9785328e45b0f1eb06e9748035ae256288032
                    MATRIX: 865->1|891->19|929->20|995->51|1009->57|1070->97|2140->1131|2155->1137|2212->1172|2570->1494|2591->1506|2664->1557|2871->1733
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|61->33|61->33|61->33|68->40|68->40|68->40|76->48
                    -- GENERATED --
                */
            