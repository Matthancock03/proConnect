
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
object navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=""""),_display_(/*12.38*/routes/*12.44*/.DbController.home()),format.raw/*12.64*/("""">Proconnect</a>
    </div>

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(/*18.21*/routes/*18.27*/.DbController.home()),format.raw/*18.47*/("""">Home</a></li>
      <li><a href=""""),_display_(/*19.21*/routes/*19.27*/.DbController.editProfile()),format.raw/*19.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(/*20.21*/routes/*20.27*/.Application.connections()),format.raw/*20.53*/("""">Connections</a></li>
      <li><a href=""""),_display_(/*21.21*/routes/*21.27*/.Application.forum()),format.raw/*21.47*/("""">Forums</a></li>
    </ul>
    <form class="navbar-form navbar-left" role="search">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Settings</a></li>
          <li><a href="#">Help</a></li>
          <li><a href=""""),_display_(/*35.25*/routes/*35.31*/.Application.about()),format.raw/*35.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(/*37.25*/securesocial/*37.37*/.controllers.routes.LoginPage.logout().absoluteURL()),format.raw/*37.89*/("""">Sign Out</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /.navbar-collapse -->
</div><!-- /.container-fluid -->
</nav>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 07 23:34:04 PDT 2015
                  SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/navbar.scala.html
                  HASH: 844dc40f2a1831e151d535795e6a8775ab1b432d
                  MATRIX: 799->1|1347->522|1362->528|1403->548|1658->776|1673->782|1714->802|1777->838|1792->844|1840->871|1906->910|1921->916|1968->942|2038->985|2053->991|2094->1011|2773->1663|2788->1669|2829->1689|2944->1777|2965->1789|3038->1841
                  LINES: 29->2|39->12|39->12|39->12|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|62->35|62->35|62->35|64->37|64->37|64->37
                  -- GENERATED --
              */
          