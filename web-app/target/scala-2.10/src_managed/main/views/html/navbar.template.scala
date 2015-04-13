
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
      <a class="navbar-brand" href=""""),_display_(Seq[Any](/*12.38*/routes/*12.44*/.DbController.home())),format.raw/*12.64*/("""">Proconnect</a>
    </div>
  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href=""""),_display_(Seq[Any](/*17.21*/routes/*17.27*/.DbController.home())),format.raw/*17.47*/("""">Home</a></li>
      <li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.DbController.editProfile())),format.raw/*18.54*/("""">Profile</a></li>
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.Application.connections())),format.raw/*19.53*/("""">Connections</a></li>
 <li><a href=""""),_display_(Seq[Any](/*20.16*/routes/*20.22*/.Application.forum())),format.raw/*20.42*/("""">Forums</a></li>

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
          <li><a href=""""),_display_(Seq[Any](/*35.25*/routes/*35.31*/.Application.help())),format.raw/*35.50*/("""">Help</a></li>
          <li><a href=""""),_display_(Seq[Any](/*36.25*/routes/*36.31*/.Application.about())),format.raw/*36.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(Seq[Any](/*38.25*/securesocial/*38.37*/.controllers.routes.LoginPage.logout().absoluteURL())),format.raw/*38.89*/("""">Sign Out</a></li>
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
<<<<<<< HEAD
                    DATE: Sun Apr 12 10:58:06 PDT 2015
                    SOURCE: C:/Users/Roya/Desktop/proConnect/web-app/app/views/navbar.scala.html
                    HASH: fb750d8cab7b5131c2f16e1f5b1e5c3550bb93c0
                    MATRIX: 856->2|1423->533|1438->539|1480->559|1748->791|1763->797|1805->817|1878->854|1893->860|1942->887|2018->927|2033->933|2081->959|2156->998|2171->1004|2213->1024|2881->1656|2896->1662|2937->1681|3014->1722|3029->1728|3071->1748|3197->1838|3218->1850|3292->1902
                    LINES: 29->2|39->12|39->12|39->12|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|62->35|62->35|62->35|63->36|63->36|63->36|65->38|65->38|65->38
=======
                    DATE: Mon Apr 13 12:13:29 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/navbar.scala.html
                    HASH: 99be731f5d21d4072bb620f1a218b9178f595ba1
                    MATRIX: 856->1|1413->522|1428->528|1470->548|1733->775|1748->781|1790->801|1862->837|1877->843|1926->870|2001->909|2016->915|2064->941|2138->979|2153->985|2195->1005|2843->1617|2858->1623|2899->1642|2975->1682|2990->1688|3032->1708|3156->1796|3177->1808|3251->1860
                    LINES: 29->2|39->12|39->12|39->12|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|60->33|60->33|60->33|61->34|61->34|61->34|63->36|63->36|63->36
>>>>>>> e982e8c79cee97b72b05ee7de778fce31714ddfa
                    -- GENERATED --
                */
            