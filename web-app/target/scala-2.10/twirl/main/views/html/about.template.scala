
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" href=""""),_display_(/*2.31*/routes/*2.37*/.Assets.at("stylesheets/splash.min.css")),format.raw/*2.77*/("""">
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
  					<a class="navbar-brand" href=""""),_display_(/*15.39*/securesocial/*15.51*/.controllers.routes.LoginPage.login().absoluteURL()),format.raw/*15.102*/("""">ProConnect</a>
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
""")))}),format.raw/*39.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 07 23:34:04 PDT 2015
                  SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/about.scala.html
                  HASH: be119c9e0183d716dc621c7358cba0adea831ca0
                  MATRIX: 798->1|824->19|862->20|889->21|945->51|959->57|1019->97|1572->623|1593->635|1666->686|2286->1276
                  LINES: 29->1|29->1|29->1|30->2|30->2|30->2|30->2|43->15|43->15|43->15|67->39
                  -- GENERATED --
              */
          