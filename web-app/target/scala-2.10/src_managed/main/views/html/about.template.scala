
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
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
  					<a class="navbar-brand" href=""""),_display_(Seq[Any](/*15.39*/securesocial/*15.51*/.controllers.routes.LoginPage.login().absoluteURL())),format.raw/*15.102*/("""">ProConnect</a>
  				</div>
  				<div id="navbar" class="collapse navbar-collapse">
  			</div>
  		</nav>

      <div class="col-xs-3 column">
  		</div>
      <div class="col-xs-6 column">
        <h1 class ="header-text text-center">ProConnect</h1>
  		</div>
  		<div class="col-xs-3 column">
  		</div>
    </div>

      <div class="row clearfix">
        <div class="col-xs-3 column">
    		</div>
        <div class="col-xs-6 column">
          <h1 class ="text-center">About Page Coming Soon</h1>
        </div>
        <div class="col-xs-3 column">
        </div>
      </div>
""")))})),format.raw/*39.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 02 09:21:14 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/about.scala.html
                    HASH: ee9bba5c708652382fdf682c5465d7b8366de14d
                    MATRIX: 864->1|890->19|928->20|994->51|1008->57|1069->97|1631->623|1652->635|1726->686|2347->1276
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|43->15|43->15|43->15|67->39
                    -- GENERATED --
                */
            