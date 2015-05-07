
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
object navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
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
      <a class="navbar-brand" href=""""),_display_(Seq[Any](/*12.38*/routes/*12.44*/.NewsFeed.homeFeed())),format.raw/*12.64*/("""">Proconnect</a>
    </div>
  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(Seq[Any](/*17.21*/routes/*17.27*/.NewsFeed.homeFeed())),format.raw/*17.47*/("""">Home</a></li>
      <li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.DbController.editProfile())),format.raw/*18.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.MessageController.message())),format.raw/*19.55*/("""">Messages</a></li>
 <li><a href=""""),_display_(Seq[Any](/*20.16*/routes/*20.22*/.Application.forum())),format.raw/*20.42*/("""">Forums</a></li>

    </ul>
    <form class="navbar-form navbar-left" role="search" action=""""),_display_(Seq[Any](/*23.66*/routes/*23.72*/.SearchController.search())),format.raw/*23.98*/("""">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search For Users" name="searchParameter">
        </div>
        <button type="submit" class="btn btn-default">Search</button>
    </form>
  <ul class="nav navbar-nav">
    <li><a href=""""),_display_(Seq[Any](/*30.19*/routes/*30.25*/.SearchController.search())),format.raw/*30.51*/("""">Advanced Search</a></li>
  </ul>

    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Settings</a></li>
          <li><a href=""""),_display_(Seq[Any](/*38.25*/routes/*38.31*/.Application.help())),format.raw/*38.50*/("""">Help</a></li>
          <li><a href=""""),_display_(Seq[Any](/*39.25*/routes/*39.31*/.Application.about())),format.raw/*39.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(Seq[Any](/*41.25*/securesocial/*41.37*/.controllers.routes.LoginPage.logout().absoluteURL())),format.raw/*41.89*/("""">Sign Out</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /.navbar-collapse -->
</div><!-- /.container-fluid -->
</nav>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 23:47:44 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/navbar.scala.html
                    HASH: aae183ab88637bed2614fbf74ae42165d2c498c6
                    MATRIX: 856->1|1413->522|1428->528|1470->548|1733->775|1748->781|1790->801|1862->837|1877->843|1926->870|2001->909|2016->915|2066->943|2137->978|2152->984|2194->1004|2324->1098|2339->1104|2387->1130|2709->1416|2724->1422|2772->1448|3177->1817|3192->1823|3233->1842|3309->1882|3324->1888|3366->1908|3490->1996|3511->2008|3585->2060
                    LINES: 29->2|39->12|39->12|39->12|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|50->23|50->23|50->23|57->30|57->30|57->30|65->38|65->38|65->38|66->39|66->39|66->39|68->41|68->41|68->41
                    -- GENERATED --
                */
            