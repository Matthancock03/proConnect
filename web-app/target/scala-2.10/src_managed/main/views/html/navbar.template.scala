
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
      <li><a href=""""),_display_(Seq[Any](/*19.21*/routes/*19.27*/.Application.connections())),format.raw/*19.53*/("""">Connections</a></li>
      <li><a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.Application.message())),format.raw/*20.49*/("""">Messages</a></li>
 <li><a href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Application.forum())),format.raw/*21.42*/("""">Forums</a></li>

    </ul>
    <form class="navbar-form navbar-left" role="search">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
  
          <li><a href=""""),_display_(Seq[Any](/*30.25*/routes/*30.31*/.Application.search())),format.raw/*30.52*/("""">Search</a></li>

    </form>

    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">My Account<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Settings</a></li>
          <li><a href=""""),_display_(Seq[Any](/*39.25*/routes/*39.31*/.Application.help())),format.raw/*39.50*/("""">Help</a></li>
          <li><a href=""""),_display_(Seq[Any](/*40.25*/routes/*40.31*/.Application.about())),format.raw/*40.51*/("""">About ProConnect</a></li>
          <li class="divider"></li>
          <li><a href=""""),_display_(Seq[Any](/*42.25*/securesocial/*42.37*/.controllers.routes.LoginPage.logout().absoluteURL())),format.raw/*42.89*/("""">Sign Out</a></li>
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
                    DATE: Sat May 02 15:10:05 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/navbar.scala.html
                    HASH: d58fad4979dfb3f3229a4c17884ab787effeae49
                    MATRIX: 856->2|1423->533|1438->539|1480->559|1748->791|1763->797|1805->817|1878->854|1893->860|1942->887|2018->927|2033->933|2081->959|2161->1003|2176->1009|2220->1031|2292->1067|2307->1073|2349->1093|3014->1722|3029->1728|3070->1747|3147->1788|3162->1794|3204->1814|3330->1904|3351->1916|3425->1968
=======
<<<<<<< HEAD
                    DATE: Sat May 02 15:50:34 MST 2015
                    SOURCE: C:/Users/Eya/Documents/GitHub/proConnect/web-app/app/views/navbar.scala.html
                    HASH: 6e84f0b337184a8e8f9a41ad725cfa91d5edc635
                    MATRIX: 856->2|1423->533|1438->539|1480->559|1748->791|1763->797|1805->817|1878->854|1893->860|1942->887|2018->927|2033->933|2081->959|2161->1003|2176->1009|2220->1031|2292->1067|2307->1073|2349->1093|2689->1397|2704->1403|2747->1424|3157->1798|3172->1804|3213->1823|3290->1864|3305->1870|3347->1890|3473->1980|3494->1992|3568->2044
                    LINES: 29->2|39->12|39->12|39->12|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|57->30|57->30|57->30|66->39|66->39|66->39|67->40|67->40|67->40|69->42|69->42|69->42
=======
                    DATE: Sat May 02 13:10:11 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/navbar.scala.html
                    HASH: c78f5347f9fc761fd5bc0aec9389b3efb195e9ef
                    MATRIX: 856->1|1413->522|1428->528|1470->548|1733->775|1748->781|1790->801|1862->837|1877->843|1926->870|2001->909|2016->915|2064->941|2143->984|2158->990|2202->1012|2273->1047|2288->1053|2330->1073|2980->1687|2995->1693|3036->1712|3112->1752|3127->1758|3169->1778|3293->1866|3314->1878|3388->1930
>>>>>>> b5cd3ede55911f15f7cd40c3fa35efc022e62ba8
                    LINES: 29->2|39->12|39->12|39->12|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|63->36|63->36|63->36|64->37|64->37|64->37|66->39|66->39|66->39
>>>>>>> 8f9ed6157bd56181ad0b73743b3620babe9daf06
                    -- GENERATED --
                */
            